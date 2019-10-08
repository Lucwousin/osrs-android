package androidx.lifecycle;

import androidx.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map$Entry;
import java.util.Map;

class ClassesInfoCache {
    class CallbackInfo {
        final Map mEventToHandlers;
        final Map mHandlerToEvent;

        CallbackInfo(Map arg5) {
            super();
            this.mHandlerToEvent = arg5;
            this.mEventToHandlers = new HashMap();
            Iterator v5 = arg5.entrySet().iterator();
            while(v5.hasNext()) {
                Object v0 = v5.next();
                Object v1 = ((Map$Entry)v0).getValue();
                Object v2 = this.mEventToHandlers.get(v1);
                if(v2 == null) {
                    ArrayList v2_1 = new ArrayList();
                    this.mEventToHandlers.put(v1, v2_1);
                }

                ((List)v2).add(((Map$Entry)v0).getKey());
            }
        }

        void invokeCallbacks(LifecycleOwner arg3, Event arg4, Object arg5) {
            CallbackInfo.invokeMethodsForEvent(this.mEventToHandlers.get(arg4), arg3, arg4, arg5);
            CallbackInfo.invokeMethodsForEvent(this.mEventToHandlers.get(Event.ON_ANY), arg3, arg4, arg5);
        }

        private static void invokeMethodsForEvent(List arg2, LifecycleOwner arg3, Event arg4, Object arg5) {
            if(arg2 != null) {
                int v0;
                for(v0 = arg2.size() - 1; v0 >= 0; --v0) {
                    arg2.get(v0).invokeCallback(arg3, arg4, arg5);
                }
            }
        }
    }

    class MethodReference {
        final int mCallType;
        final Method mMethod;

        MethodReference(int arg1, Method arg2) {
            super();
            this.mCallType = arg1;
            this.mMethod = arg2;
            this.mMethod.setAccessible(true);
        }

        public boolean equals(Object arg5) {
            boolean v0 = true;
            if(this == (((MethodReference)arg5))) {
                return 1;
            }

            if(arg5 != null) {
                if(this.getClass() != arg5.getClass()) {
                }
                else {
                    if(this.mCallType != ((MethodReference)arg5).mCallType || !this.mMethod.getName().equals(((MethodReference)arg5).mMethod.getName())) {
                        v0 = false;
                    }
                    else {
                    }

                    return v0;
                }
            }

            return 0;
        }

        public int hashCode() {
            return this.mCallType * 0x1F + this.mMethod.getName().hashCode();
        }

        void invokeCallback(LifecycleOwner arg5, Event arg6, Object arg7) {
            try {
                switch(this.mCallType) {
                    case 0: {
                        this.mMethod.invoke(arg7);
                        return;
                    }
                    case 1: {
                        this.mMethod.invoke(arg7, arg5);
                        return;
                        throw new RuntimeException("Failed to call observer method", v5_1.getCause());
                        throw new RuntimeException(((Throwable)v5));
                    }
                    case 2: {
                        this.mMethod.invoke(arg7, arg5, arg6);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            catch(IllegalAccessException v5) {
            }
            catch(InvocationTargetException v5_1) {
            }
        }
    }

    private static final int CALL_TYPE_NO_ARG = 0;
    private static final int CALL_TYPE_PROVIDER = 1;
    private static final int CALL_TYPE_PROVIDER_WITH_EVENT = 2;
    private final Map mCallbackMap;
    private final Map mHasLifecycleMethods;
    static ClassesInfoCache sInstance;

    static {
        ClassesInfoCache.sInstance = new ClassesInfoCache();
    }

    ClassesInfoCache() {
        super();
        this.mCallbackMap = new HashMap();
        this.mHasLifecycleMethods = new HashMap();
    }

    private CallbackInfo createInfo(Class arg12, @Nullable Method[] arg13) {
        int v8;
        Class v0 = arg12.getSuperclass();
        HashMap v1 = new HashMap();
        if(v0 != null) {
            CallbackInfo v0_1 = this.getInfo(v0);
            if(v0_1 != null) {
                ((Map)v1).putAll(v0_1.mHandlerToEvent);
            }
        }

        Class[] v0_2 = arg12.getInterfaces();
        int v2 = v0_2.length;
        int v4;
        for(v4 = 0; v4 < v2; ++v4) {
            Iterator v5 = this.getInfo(v0_2[v4]).mHandlerToEvent.entrySet().iterator();
            while(v5.hasNext()) {
                Object v6 = v5.next();
                this.verifyAndPutHandler(((Map)v1), ((Map$Entry)v6).getKey(), ((Map$Entry)v6).getValue(), arg12);
            }
        }

        if(arg13 != null) {
        }
        else {
            arg13 = this.getDeclaredMethods(arg12);
        }

        int v0_3 = arg13.length;
        v2 = 0;
        boolean v4_1 = false;
        while(true) {
            if(v2 >= v0_3) {
                goto label_86;
            }

            Method v5_1 = arg13[v2];
            Annotation v6_1 = v5_1.getAnnotation(OnLifecycleEvent.class);
            if(v6_1 == null) {
            }
            else {
                Class[] v4_2 = v5_1.getParameterTypes();
                if(v4_2.length <= 0) {
                    v8 = 0;
                }
                else if(v4_2[0].isAssignableFrom(LifecycleOwner.class)) {
                    v8 = 1;
                }
                else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }

                Event v6_2 = ((OnLifecycleEvent)v6_1).value();
                int v10 = 2;
                if(v4_2.length > 1) {
                    if(!v4_2[1].isAssignableFrom(Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    else if(v6_2 == Event.ON_ANY) {
                        v8 = 2;
                    }
                    else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }

                if(v4_2.length > v10) {
                    break;
                }

                this.verifyAndPutHandler(((Map)v1), new MethodReference(v8, v5_1), v6_2, arg12);
                v4_1 = true;
            }

            ++v2;
        }

        throw new IllegalArgumentException("cannot have more than 2 params");
    label_86:
        CallbackInfo v13 = new CallbackInfo(((Map)v1));
        this.mCallbackMap.put(arg12, v13);
        this.mHasLifecycleMethods.put(arg12, Boolean.valueOf(v4_1));
        return v13;
    }

    private Method[] getDeclaredMethods(Class arg3) {
        try {
            return arg3.getDeclaredMethods();
        }
        catch(NoClassDefFoundError v3) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", ((Throwable)v3));
        }
    }

    CallbackInfo getInfo(Class arg2) {
        Object v0 = this.mCallbackMap.get(arg2);
        if(v0 != null) {
            return ((CallbackInfo)v0);
        }

        return this.createInfo(arg2, null);
    }

    boolean hasLifecycleMethods(Class arg7) {
        if(this.mHasLifecycleMethods.containsKey(arg7)) {
            return this.mHasLifecycleMethods.get(arg7).booleanValue();
        }

        Method[] v0 = this.getDeclaredMethods(arg7);
        int v1 = v0.length;
        int v3;
        for(v3 = 0; v3 < v1; ++v3) {
            if(v0[v3].getAnnotation(OnLifecycleEvent.class) != null) {
                this.createInfo(arg7, v0);
                return 1;
            }
        }

        this.mHasLifecycleMethods.put(arg7, Boolean.valueOf(false));
        return 0;
    }

    private void verifyAndPutHandler(Map arg4, MethodReference arg5, Event arg6, Class arg7) {
        Object v0 = arg4.get(arg5);
        if(v0 != null) {
            if(arg6 == (((Event)v0))) {
            }
            else {
                Method v4 = arg5.mMethod;
                StringBuilder v1 = new StringBuilder();
                v1.append("Method ");
                v1.append(v4.getName());
                v1.append(" in ");
                v1.append(arg7.getName());
                v1.append(" already declared with different @OnLifecycleEvent value: previous");
                v1.append(" value ");
                v1.append(v0);
                v1.append(", new value ");
                v1.append(arg6);
                throw new IllegalArgumentException(v1.toString());
            }
        }

        if(v0 == null) {
            arg4.put(arg5, arg6);
        }
    }
}

