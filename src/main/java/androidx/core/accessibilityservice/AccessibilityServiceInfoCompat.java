package androidx.core.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class AccessibilityServiceInfoCompat {
    public static final int CAPABILITY_CAN_FILTER_KEY_EVENTS = 8;
    public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
    public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
    public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
    public static final int FEEDBACK_ALL_MASK = -1;
    public static final int FEEDBACK_BRAILLE = 0x20;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
    public static final int FLAG_REPORT_VIEW_IDS = 16;
    public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
    public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 0x20;
    public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;

    private AccessibilityServiceInfoCompat() {
        super();
    }

    @NonNull public static String capabilityToString(int arg1) {
        if(arg1 == 4) {
            return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }

        if(arg1 == 8) {
            return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
        }

        switch(arg1) {
            case 1: {
                return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
            }
            case 2: {
                return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
            }
        }

        return "UNKNOWN";
    }

    @NonNull public static String feedbackTypeToString(int arg4) {
        StringBuilder v0 = new StringBuilder();
        v0.append("[");
        while(arg4 > 0) {
            int v1 = 1 << Integer.numberOfTrailingZeros(arg4);
            arg4 &= ~v1;
            if(v0.length() > 1) {
                v0.append(", ");
            }

            if(v1 != 4) {
                if(v1 != 8) {
                    if(v1 != 16) {
                        switch(v1) {
                            case 1: {
                                goto label_25;
                            }
                            case 2: {
                                goto label_22;
                            }
                        }

                        continue;
                    label_22:
                        v0.append("FEEDBACK_HAPTIC");
                        continue;
                    label_25:
                        v0.append("FEEDBACK_SPOKEN");
                        continue;
                    }

                    v0.append("FEEDBACK_GENERIC");
                    continue;
                }

                v0.append("FEEDBACK_VISUAL");
                continue;
            }

            v0.append("FEEDBACK_AUDIBLE");
        }

        v0.append("]");
        return v0.toString();
    }

    @Nullable public static String flagToString(int arg1) {
        if(arg1 == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }

        if(arg1 == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }

        if(arg1 == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }

        if(arg1 == 0x20) {
            return "FLAG_REQUEST_FILTER_KEY_EVENTS";
        }

        switch(arg1) {
            case 1: {
                return "DEFAULT";
            }
            case 2: {
                return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
            }
        }

        return null;
    }

    public static int getCapabilities(@NonNull AccessibilityServiceInfo arg2) {
        if(Build$VERSION.SDK_INT >= 18) {
            return arg2.getCapabilities();
        }

        if(arg2.getCanRetrieveWindowContent()) {
            return 1;
        }

        return 0;
    }

    @Nullable public static String loadDescription(@NonNull AccessibilityServiceInfo arg2, @NonNull PackageManager arg3) {
        if(Build$VERSION.SDK_INT >= 16) {
            return arg2.loadDescription(arg3);
        }

        return arg2.getDescription();
    }
}

