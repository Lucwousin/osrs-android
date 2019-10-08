package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.reflect.ReflectionAccessor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
    public final class Adapter extends TypeAdapter {
        private final Map boundFields;
        private final ObjectConstructor constructor;

        Adapter(ObjectConstructor arg1, Map arg2) {
            super();
            this.constructor = arg1;
            this.boundFields = arg2;
        }

        public Object read(JsonReader arg4) throws IOException {
            if(arg4.peek() == JsonToken.NULL) {
                arg4.nextNull();
                return null;
            }

            Object v0 = this.constructor.construct();
            try {
                arg4.beginObject();
                while(arg4.hasNext()) {
                    Object v1 = this.boundFields.get(arg4.nextName());
                    if(v1 != null) {
                        if(!((BoundField)v1).deserialized) {
                        }
                        else {
                            ((BoundField)v1).read(arg4, v0);
                            continue;
                        }
                    }

                    arg4.skipValue();
                }
            }
            catch(IllegalAccessException v4) {
                goto label_27;
            }
            catch(IllegalStateException v4_1) {
                goto label_31;
            }

            arg4.endObject();
            return v0;
        label_31:
            throw new JsonSyntaxException(((Throwable)v4_1));
        label_27:
            throw new AssertionError(v4);
        }

        public void write(JsonWriter arg4, Object arg5) throws IOException {
            if(arg5 == null) {
                arg4.nullValue();
                return;
            }

            arg4.beginObject();
            try {
                Iterator v0 = this.boundFields.values().iterator();
                while(v0.hasNext()) {
                    Object v1 = v0.next();
                    if(!((BoundField)v1).writeField(arg5)) {
                        continue;
                    }

                    arg4.name(((BoundField)v1).name);
                    ((BoundField)v1).write(arg4, arg5);
                }
            }
            catch(IllegalAccessException v4) {
                goto label_21;
            }

            arg4.endObject();
            return;
        label_21:
            throw new AssertionError(v4);
        }
    }

    abstract class BoundField {
        final boolean deserialized;
        final String name;
        final boolean serialized;

        protected BoundField(String arg1, boolean arg2, boolean arg3) {
            super();
            this.name = arg1;
            this.serialized = arg2;
            this.deserialized = arg3;
        }

        abstract void read(JsonReader arg1, Object arg2) throws IOException, IllegalAccessException;

        abstract void write(JsonWriter arg1, Object arg2) throws IOException, IllegalAccessException;

        abstract boolean writeField(Object arg1) throws IOException, IllegalAccessException;
    }

    private final ReflectionAccessor accessor;
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final FieldNamingStrategy fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;

    public ReflectiveTypeAdapterFactory(ConstructorConstructor arg2, FieldNamingStrategy arg3, Excluder arg4, JsonAdapterAnnotationTypeAdapterFactory arg5) {
        super();
        this.accessor = ReflectionAccessor.getInstance();
        this.constructorConstructor = arg2;
        this.fieldNamingPolicy = arg3;
        this.excluder = arg4;
        this.jsonAdapterFactory = arg5;
    }

    public TypeAdapter create(Gson arg4, TypeToken arg5) {
        Class v0 = arg5.getRawType();
        if(!Object.class.isAssignableFrom(v0)) {
            return null;
        }

        return new Adapter(this.constructorConstructor.get(arg5), this.getBoundFields(arg4, arg5, v0));
    }

    private BoundField createBoundField(Gson arg14, Field arg15, String arg16, TypeToken arg17, boolean arg18, boolean arg19) {
        ReflectiveTypeAdapterFactory v11 = this;
        TypeToken v9 = arg17;
        boolean v10 = Primitives.isPrimitive(arg17.getRawType());
        Annotation v0 = arg15.getAnnotation(JsonAdapter.class);
        TypeAdapter v0_1 = v0 != null ? v11.jsonAdapterFactory.getTypeAdapter(v11.constructorConstructor, arg14, v9, ((JsonAdapter)v0)) : null;
        boolean v6 = v0_1 != null ? true : false;
        if(v0_1 == null) {
            v0_1 = arg14.getAdapter(v9);
        }

        return new BoundField(arg16, arg18, arg19, arg15, v6, v0_1, arg14, arg17, v10) {
            void read(JsonReader arg2, Object arg3) throws IOException, IllegalAccessException {
                Object v2 = this.val$typeAdapter.read(arg2);
                if(v2 != null || !this.val$isPrimitive) {
                    this.val$field.set(arg3, v2);
                }
            }

            void write(JsonWriter arg5, Object arg6) throws IOException, IllegalAccessException {
                TypeAdapter v0;
                arg6 = this.val$field.get(arg6);
                if(this.val$jsonAdapterPresent) {
                    v0 = this.val$typeAdapter;
                }
                else {
                    TypeAdapterRuntimeTypeWrapper v0_1 = new TypeAdapterRuntimeTypeWrapper(this.val$context, this.val$typeAdapter, this.val$fieldType.getType());
                }

                v0.write(arg5, arg6);
            }

            public boolean writeField(Object arg3) throws IOException, IllegalAccessException {
                boolean v1 = false;
                if(!this.serialized) {
                    return 0;
                }

                if(this.val$field.get(arg3) != arg3) {
                    v1 = true;
                }

                return v1;
            }
        };
    }

    static boolean excludeField(Field arg1, boolean arg2, Excluder arg3) {
        boolean v1 = (arg3.excludeClass(arg1.getType(), arg2)) || (arg3.excludeField(arg1, arg2)) ? false : true;
        return v1;
    }

    public boolean excludeField(Field arg2, boolean arg3) {
        return ReflectiveTypeAdapterFactory.excludeField(arg2, arg3, this.excluder);
    }

    private Map getBoundFields(Gson arg25, TypeToken arg26, Class arg27) {
        Object v14_1;
        ReflectiveTypeAdapterFactory v7 = this;
        LinkedHashMap v8 = new LinkedHashMap();
        if(arg27.isInterface()) {
            return ((Map)v8);
        }

        Type v9 = arg26.getType();
        TypeToken v11 = arg26;
        Class v10;
        for(v10 = arg27; v10 != Object.class; v10 = v11.getRawType()) {
            Field[] v12 = v10.getDeclaredFields();
            int v13 = v12.length;
            boolean v14 = false;
            int v15 = 0;
            while(v15 < v13) {
                Field v6 = v12[v15];
                boolean v0 = v7.excludeField(v6, true);
                boolean v16 = v7.excludeField(v6, v14);
                if((v0) || (v16)) {
                    v7.accessor.makeAccessible(((AccessibleObject)v6));
                    Type v17 = $Gson$Types.resolve(v11.getType(), v10, v6.getGenericType());
                    List v5 = v7.getFieldNames(v6);
                    int v4 = v5.size();
                    Object v2 = null;
                    int v3 = 0;
                    while(v3 < v4) {
                        Object v1 = v5.get(v3);
                        boolean v18 = v3 != 0 ? false : v0;
                        v14_1 = v2;
                        int v21 = v3;
                        int v22 = v4;
                        List v19 = v5;
                        Field v23 = v6;
                        Object v0_1 = ((Map)v8).put(v1, this.createBoundField(arg25, v6, v1, TypeToken.get(v17), v18, v16));
                        v2 = v14_1 == null ? v0_1 : v14_1;
                        v3 = v21 + 1;
                        v0 = v18;
                        v5 = v19;
                        v4 = v22;
                        v6 = v23;
                    }

                    v14_1 = v2;
                    if(v14_1 == null) {
                        goto label_69;
                    }

                    StringBuilder v1_1 = new StringBuilder();
                    v1_1.append(v9);
                    v1_1.append(" declares multiple JSON fields named ");
                    v1_1.append(((BoundField)v14_1).name);
                    throw new IllegalArgumentException(v1_1.toString());
                }
                else {
                }

            label_69:
                ++v15;
                v14 = false;
            }

            v11 = TypeToken.get($Gson$Types.resolve(v11.getType(), v10, v10.getGenericSuperclass()));
        }

        return ((Map)v8);
    }

    private List getFieldNames(Field arg5) {
        Annotation v0 = arg5.getAnnotation(SerializedName.class);
        if(v0 == null) {
            return Collections.singletonList(this.fieldNamingPolicy.translateName(arg5));
        }

        String v5 = ((SerializedName)v0).value();
        String[] v0_1 = ((SerializedName)v0).alternate();
        if(v0_1.length == 0) {
            return Collections.singletonList(v5);
        }

        ArrayList v1 = new ArrayList(v0_1.length + 1);
        ((List)v1).add(v5);
        int v5_1 = v0_1.length;
        int v2;
        for(v2 = 0; v2 < v5_1; ++v2) {
            ((List)v1).add(v0_1[v2]);
        }

        return ((List)v1);
    }
}

