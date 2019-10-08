package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo$RangeInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AccessibilityNodeInfoCompat {
    public class AccessibilityActionCompat {
        public static final AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS;
        public static final AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS;
        public static final AccessibilityActionCompat ACTION_CLEAR_FOCUS;
        public static final AccessibilityActionCompat ACTION_CLEAR_SELECTION;
        public static final AccessibilityActionCompat ACTION_CLICK;
        public static final AccessibilityActionCompat ACTION_COLLAPSE;
        public static final AccessibilityActionCompat ACTION_CONTEXT_CLICK;
        public static final AccessibilityActionCompat ACTION_COPY;
        public static final AccessibilityActionCompat ACTION_CUT;
        public static final AccessibilityActionCompat ACTION_DISMISS;
        public static final AccessibilityActionCompat ACTION_EXPAND;
        public static final AccessibilityActionCompat ACTION_FOCUS;
        public static final AccessibilityActionCompat ACTION_HIDE_TOOLTIP;
        public static final AccessibilityActionCompat ACTION_LONG_CLICK;
        public static final AccessibilityActionCompat ACTION_MOVE_WINDOW;
        public static final AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
        public static final AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT;
        public static final AccessibilityActionCompat ACTION_PASTE;
        public static final AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
        public static final AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT;
        public static final AccessibilityActionCompat ACTION_SCROLL_BACKWARD;
        public static final AccessibilityActionCompat ACTION_SCROLL_DOWN;
        public static final AccessibilityActionCompat ACTION_SCROLL_FORWARD;
        public static final AccessibilityActionCompat ACTION_SCROLL_LEFT;
        public static final AccessibilityActionCompat ACTION_SCROLL_RIGHT;
        public static final AccessibilityActionCompat ACTION_SCROLL_TO_POSITION;
        public static final AccessibilityActionCompat ACTION_SCROLL_UP;
        public static final AccessibilityActionCompat ACTION_SELECT;
        public static final AccessibilityActionCompat ACTION_SET_PROGRESS;
        public static final AccessibilityActionCompat ACTION_SET_SELECTION;
        public static final AccessibilityActionCompat ACTION_SET_TEXT;
        public static final AccessibilityActionCompat ACTION_SHOW_ON_SCREEN;
        public static final AccessibilityActionCompat ACTION_SHOW_TOOLTIP;
        final Object mAction;

        static {
            AccessibilityNodeInfo$AccessibilityAction v1_1;
            Object v2_1;
            AccessibilityNodeInfo$AccessibilityAction v2;
            CharSequence v1 = null;
            AccessibilityActionCompat.ACTION_FOCUS = new AccessibilityActionCompat(1, v1);
            AccessibilityActionCompat.ACTION_CLEAR_FOCUS = new AccessibilityActionCompat(2, v1);
            AccessibilityActionCompat.ACTION_SELECT = new AccessibilityActionCompat(4, v1);
            AccessibilityActionCompat.ACTION_CLEAR_SELECTION = new AccessibilityActionCompat(8, v1);
            AccessibilityActionCompat.ACTION_CLICK = new AccessibilityActionCompat(16, v1);
            AccessibilityActionCompat.ACTION_LONG_CLICK = new AccessibilityActionCompat(0x20, v1);
            AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(0x40, v1);
            AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(0x80, v1);
            AccessibilityActionCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(0x100, v1);
            AccessibilityActionCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(0x200, v1);
            AccessibilityActionCompat.ACTION_NEXT_HTML_ELEMENT = new AccessibilityActionCompat(0x400, v1);
            AccessibilityActionCompat.ACTION_PREVIOUS_HTML_ELEMENT = new AccessibilityActionCompat(0x800, v1);
            AccessibilityActionCompat.ACTION_SCROLL_FORWARD = new AccessibilityActionCompat(0x1000, v1);
            AccessibilityActionCompat.ACTION_SCROLL_BACKWARD = new AccessibilityActionCompat(0x2000, v1);
            AccessibilityActionCompat.ACTION_COPY = new AccessibilityActionCompat(0x4000, v1);
            AccessibilityActionCompat.ACTION_PASTE = new AccessibilityActionCompat(0x8000, v1);
            AccessibilityActionCompat.ACTION_CUT = new AccessibilityActionCompat(0x10000, v1);
            AccessibilityActionCompat.ACTION_SET_SELECTION = new AccessibilityActionCompat(0x20000, v1);
            AccessibilityActionCompat.ACTION_EXPAND = new AccessibilityActionCompat(0x40000, v1);
            AccessibilityActionCompat.ACTION_COLLAPSE = new AccessibilityActionCompat(0x80000, v1);
            AccessibilityActionCompat.ACTION_DISMISS = new AccessibilityActionCompat(0x100000, v1);
            AccessibilityActionCompat.ACTION_SET_TEXT = new AccessibilityActionCompat(0x200000, v1);
            int v3 = 23;
            if(Build$VERSION.SDK_INT >= v3) {
                v2 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            }
            else {
                v2_1 = v1;
            }

            AccessibilityActionCompat.ACTION_SHOW_ON_SCREEN = new AccessibilityActionCompat(v2);
            if(Build$VERSION.SDK_INT >= v3) {
                v2 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            }
            else {
                v2_1 = v1;
            }

            AccessibilityActionCompat.ACTION_SCROLL_TO_POSITION = new AccessibilityActionCompat(v2);
            if(Build$VERSION.SDK_INT >= v3) {
                v2 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_UP;
            }
            else {
                v2_1 = v1;
            }

            AccessibilityActionCompat.ACTION_SCROLL_UP = new AccessibilityActionCompat(v2);
            if(Build$VERSION.SDK_INT >= v3) {
                v2 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_LEFT;
            }
            else {
                v2_1 = v1;
            }

            AccessibilityActionCompat.ACTION_SCROLL_LEFT = new AccessibilityActionCompat(v2);
            if(Build$VERSION.SDK_INT >= v3) {
                v2 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_DOWN;
            }
            else {
                v2_1 = v1;
            }

            AccessibilityActionCompat.ACTION_SCROLL_DOWN = new AccessibilityActionCompat(v2);
            if(Build$VERSION.SDK_INT >= v3) {
                v2 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_RIGHT;
            }
            else {
                v2_1 = v1;
            }

            AccessibilityActionCompat.ACTION_SCROLL_RIGHT = new AccessibilityActionCompat(v2);
            if(Build$VERSION.SDK_INT >= v3) {
                v2 = AccessibilityNodeInfo$AccessibilityAction.ACTION_CONTEXT_CLICK;
            }
            else {
                v2_1 = v1;
            }

            AccessibilityActionCompat.ACTION_CONTEXT_CLICK = new AccessibilityActionCompat(v2);
            if(Build$VERSION.SDK_INT >= 24) {
                v2 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SET_PROGRESS;
            }
            else {
                v2_1 = v1;
            }

            AccessibilityActionCompat.ACTION_SET_PROGRESS = new AccessibilityActionCompat(v2);
            if(Build$VERSION.SDK_INT >= 26) {
                v2 = AccessibilityNodeInfo$AccessibilityAction.ACTION_MOVE_WINDOW;
            }
            else {
                v2_1 = v1;
            }

            AccessibilityActionCompat.ACTION_MOVE_WINDOW = new AccessibilityActionCompat(v2);
            v3 = 28;
            if(Build$VERSION.SDK_INT >= v3) {
                v2 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_TOOLTIP;
            }
            else {
                v2_1 = v1;
            }

            AccessibilityActionCompat.ACTION_SHOW_TOOLTIP = new AccessibilityActionCompat(v2);
            if(Build$VERSION.SDK_INT >= v3) {
                v1_1 = AccessibilityNodeInfo$AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }

            AccessibilityActionCompat.ACTION_HIDE_TOOLTIP = new AccessibilityActionCompat(v1_1);
        }

        AccessibilityActionCompat(Object arg1) {
            super();
            this.mAction = arg1;
        }

        public AccessibilityActionCompat(int arg3, CharSequence arg4) {
            Object v0_1;
            if(Build$VERSION.SDK_INT >= 21) {
                AccessibilityNodeInfo$AccessibilityAction v0 = new AccessibilityNodeInfo$AccessibilityAction(arg3, arg4);
            }
            else {
                v0_1 = null;
            }

            this(v0_1);
        }

        public int getId() {
            if(Build$VERSION.SDK_INT >= 21) {
                return this.mAction.getId();
            }

            return 0;
        }

        public CharSequence getLabel() {
            if(Build$VERSION.SDK_INT >= 21) {
                return this.mAction.getLabel();
            }

            return null;
        }
    }

    public class CollectionInfoCompat {
        public static final int SELECTION_MODE_MULTIPLE = 2;
        public static final int SELECTION_MODE_NONE = 0;
        public static final int SELECTION_MODE_SINGLE = 1;
        final Object mInfo;

        CollectionInfoCompat(Object arg1) {
            super();
            this.mInfo = arg1;
        }

        public int getColumnCount() {
            if(Build$VERSION.SDK_INT >= 19) {
                return this.mInfo.getColumnCount();
            }

            return 0;
        }

        public int getRowCount() {
            if(Build$VERSION.SDK_INT >= 19) {
                return this.mInfo.getRowCount();
            }

            return 0;
        }

        public int getSelectionMode() {
            if(Build$VERSION.SDK_INT >= 21) {
                return this.mInfo.getSelectionMode();
            }

            return 0;
        }

        public boolean isHierarchical() {
            if(Build$VERSION.SDK_INT >= 19) {
                return this.mInfo.isHierarchical();
            }

            return 0;
        }

        public static CollectionInfoCompat obtain(int arg2, int arg3, boolean arg4) {
            if(Build$VERSION.SDK_INT >= 19) {
                return new CollectionInfoCompat(AccessibilityNodeInfo$CollectionInfo.obtain(arg2, arg3, arg4));
            }

            return new CollectionInfoCompat(null);
        }

        public static CollectionInfoCompat obtain(int arg2, int arg3, boolean arg4, int arg5) {
            if(Build$VERSION.SDK_INT >= 21) {
                return new CollectionInfoCompat(AccessibilityNodeInfo$CollectionInfo.obtain(arg2, arg3, arg4, arg5));
            }

            if(Build$VERSION.SDK_INT >= 19) {
                return new CollectionInfoCompat(AccessibilityNodeInfo$CollectionInfo.obtain(arg2, arg3, arg4));
            }

            return new CollectionInfoCompat(null);
        }
    }

    public class CollectionItemInfoCompat {
        final Object mInfo;

        CollectionItemInfoCompat(Object arg1) {
            super();
            this.mInfo = arg1;
        }

        public int getColumnIndex() {
            if(Build$VERSION.SDK_INT >= 19) {
                return this.mInfo.getColumnIndex();
            }

            return 0;
        }

        public int getColumnSpan() {
            if(Build$VERSION.SDK_INT >= 19) {
                return this.mInfo.getColumnSpan();
            }

            return 0;
        }

        public int getRowIndex() {
            if(Build$VERSION.SDK_INT >= 19) {
                return this.mInfo.getRowIndex();
            }

            return 0;
        }

        public int getRowSpan() {
            if(Build$VERSION.SDK_INT >= 19) {
                return this.mInfo.getRowSpan();
            }

            return 0;
        }

        public boolean isHeading() {
            if(Build$VERSION.SDK_INT >= 19) {
                return this.mInfo.isHeading();
            }

            return 0;
        }

        public boolean isSelected() {
            if(Build$VERSION.SDK_INT >= 21) {
                return this.mInfo.isSelected();
            }

            return 0;
        }

        public static CollectionItemInfoCompat obtain(int arg2, int arg3, int arg4, int arg5, boolean arg6) {
            if(Build$VERSION.SDK_INT >= 19) {
                return new CollectionItemInfoCompat(AccessibilityNodeInfo$CollectionItemInfo.obtain(arg2, arg3, arg4, arg5, arg6));
            }

            return new CollectionItemInfoCompat(null);
        }

        public static CollectionItemInfoCompat obtain(int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
            if(Build$VERSION.SDK_INT >= 21) {
                return new CollectionItemInfoCompat(AccessibilityNodeInfo$CollectionItemInfo.obtain(arg2, arg3, arg4, arg5, arg6, arg7));
            }

            if(Build$VERSION.SDK_INT >= 19) {
                return new CollectionItemInfoCompat(AccessibilityNodeInfo$CollectionItemInfo.obtain(arg2, arg3, arg4, arg5, arg6));
            }

            return new CollectionItemInfoCompat(null);
        }
    }

    public class RangeInfoCompat {
        public static final int RANGE_TYPE_FLOAT = 1;
        public static final int RANGE_TYPE_INT = 0;
        public static final int RANGE_TYPE_PERCENT = 2;
        final Object mInfo;

        RangeInfoCompat(Object arg1) {
            super();
            this.mInfo = arg1;
        }

        public float getCurrent() {
            if(Build$VERSION.SDK_INT >= 19) {
                return this.mInfo.getCurrent();
            }

            return 0;
        }

        public float getMax() {
            if(Build$VERSION.SDK_INT >= 19) {
                return this.mInfo.getMax();
            }

            return 0;
        }

        public float getMin() {
            if(Build$VERSION.SDK_INT >= 19) {
                return this.mInfo.getMin();
            }

            return 0;
        }

        public int getType() {
            if(Build$VERSION.SDK_INT >= 19) {
                return this.mInfo.getType();
            }

            return 0;
        }

        public static RangeInfoCompat obtain(int arg2, float arg3, float arg4, float arg5) {
            if(Build$VERSION.SDK_INT >= 19) {
                return new RangeInfoCompat(AccessibilityNodeInfo$RangeInfo.obtain(arg2, arg3, arg4, arg5));
            }

            return new RangeInfoCompat(null);
        }
    }

    public static final int ACTION_ACCESSIBILITY_FOCUS = 0x40;
    public static final String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    public static final String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 0x80;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_COLLAPSE = 0x80000;
    public static final int ACTION_COPY = 0x4000;
    public static final int ACTION_CUT = 0x10000;
    public static final int ACTION_DISMISS = 0x100000;
    public static final int ACTION_EXPAND = 0x40000;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_LONG_CLICK = 0x20;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 0x100;
    public static final int ACTION_NEXT_HTML_ELEMENT = 0x400;
    public static final int ACTION_PASTE = 0x8000;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 0x200;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = 0x800;
    public static final int ACTION_SCROLL_BACKWARD = 0x2000;
    public static final int ACTION_SCROLL_FORWARD = 0x1000;
    public static final int ACTION_SELECT = 4;
    public static final int ACTION_SET_SELECTION = 0x20000;
    public static final int ACTION_SET_TEXT = 0x200000;
    private static final int BOOLEAN_PROPERTY_IS_HEADING = 2;
    private static final int BOOLEAN_PROPERTY_IS_SHOWING_HINT = 4;
    private static final String BOOLEAN_PROPERTY_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
    private static final int BOOLEAN_PROPERTY_SCREEN_READER_FOCUSABLE = 1;
    public static final int FOCUS_ACCESSIBILITY = 2;
    public static final int FOCUS_INPUT = 1;
    private static final String HINT_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
    public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
    public static final int MOVEMENT_GRANULARITY_LINE = 4;
    public static final int MOVEMENT_GRANULARITY_PAGE = 16;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
    public static final int MOVEMENT_GRANULARITY_WORD = 2;
    private static final String PANE_TITLE_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
    private static final String ROLE_DESCRIPTION_KEY = "AccessibilityNodeInfo.roleDescription";
    private static final String TOOLTIP_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
    private final AccessibilityNodeInfo mInfo;
    @RestrictTo(value={Scope.LIBRARY_GROUP}) public int mParentVirtualDescendantId;

    private AccessibilityNodeInfoCompat(AccessibilityNodeInfo arg2) {
        super();
        this.mParentVirtualDescendantId = -1;
        this.mInfo = arg2;
    }

    @Deprecated public AccessibilityNodeInfoCompat(Object arg2) {
        super();
        this.mParentVirtualDescendantId = -1;
        this.mInfo = ((AccessibilityNodeInfo)arg2);
    }

    public void addAction(int arg2) {
        this.mInfo.addAction(arg2);
    }

    public void addAction(AccessibilityActionCompat arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            this.mInfo.addAction(arg3.mAction);
        }
    }

    public void addChild(View arg2) {
        this.mInfo.addChild(arg2);
    }

    public void addChild(View arg3, int arg4) {
        if(Build$VERSION.SDK_INT >= 16) {
            this.mInfo.addChild(arg3, arg4);
        }
    }

    public boolean canOpenPopup() {
        if(Build$VERSION.SDK_INT >= 19) {
            return this.mInfo.canOpenPopup();
        }

        return 0;
    }

    public boolean equals(Object arg5) {
        if(this == (((AccessibilityNodeInfoCompat)arg5))) {
            return 1;
        }

        if(arg5 == null) {
            return 0;
        }

        if(this.getClass() != arg5.getClass()) {
            return 0;
        }

        if(this.mInfo == null) {
            if(((AccessibilityNodeInfoCompat)arg5).mInfo != null) {
                return 0;
            }
        }
        else if(!this.mInfo.equals(((AccessibilityNodeInfoCompat)arg5).mInfo)) {
            return 0;
        }

        return 1;
    }

    public List findAccessibilityNodeInfosByText(String arg5) {
        ArrayList v0 = new ArrayList();
        List v5 = this.mInfo.findAccessibilityNodeInfosByText(arg5);
        int v1 = v5.size();
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            ((List)v0).add(AccessibilityNodeInfoCompat.wrap(v5.get(v2)));
        }

        return ((List)v0);
    }

    public List findAccessibilityNodeInfosByViewId(String arg3) {
        if(Build$VERSION.SDK_INT >= 18) {
            List v3 = this.mInfo.findAccessibilityNodeInfosByViewId(arg3);
            ArrayList v0 = new ArrayList();
            Iterator v3_1 = v3.iterator();
            while(v3_1.hasNext()) {
                ((List)v0).add(AccessibilityNodeInfoCompat.wrap(v3_1.next()));
            }

            return ((List)v0);
        }

        return Collections.emptyList();
    }

    public AccessibilityNodeInfoCompat findFocus(int arg3) {
        if(Build$VERSION.SDK_INT >= 16) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(this.mInfo.findFocus(arg3));
        }

        return null;
    }

    public AccessibilityNodeInfoCompat focusSearch(int arg3) {
        if(Build$VERSION.SDK_INT >= 16) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(this.mInfo.focusSearch(arg3));
        }

        return null;
    }

    public List getActionList() {
        List v0 = Build$VERSION.SDK_INT >= 21 ? this.mInfo.getActionList() : null;
        if(v0 != null) {
            ArrayList v1 = new ArrayList();
            int v2 = v0.size();
            int v3;
            for(v3 = 0; v3 < v2; ++v3) {
                ((List)v1).add(new AccessibilityActionCompat(v0.get(v3)));
            }

            return ((List)v1);
        }

        return Collections.emptyList();
    }

    private static String getActionSymbolicName(int arg0) {
        switch(arg0) {
            case 1: {
                return "ACTION_FOCUS";
            }
            case 2: {
                return "ACTION_CLEAR_FOCUS";
            }
            case 4: {
                return "ACTION_SELECT";
            }
            case 8: {
                return "ACTION_CLEAR_SELECTION";
            }
            case 16: {
                return "ACTION_CLICK";
            }
            case 32: {
                return "ACTION_LONG_CLICK";
            }
            case 64: {
                return "ACTION_ACCESSIBILITY_FOCUS";
            }
            case 128: {
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            }
            case 256: {
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            }
            case 512: {
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            }
            case 1024: {
                return "ACTION_NEXT_HTML_ELEMENT";
            }
            case 2048: {
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            }
            case 4096: {
                return "ACTION_SCROLL_FORWARD";
            }
            case 8192: {
                return "ACTION_SCROLL_BACKWARD";
            }
            case 16384: {
                return "ACTION_COPY";
            }
            case 32768: {
                return "ACTION_PASTE";
            }
            case 65536: {
                return "ACTION_CUT";
            }
            case 131072: {
                return "ACTION_SET_SELECTION";
            }
        }

        return "ACTION_UNKNOWN";
    }

    public int getActions() {
        return this.mInfo.getActions();
    }

    private boolean getBooleanProperty(int arg4) {
        Bundle v0 = this.getExtras();
        boolean v1 = false;
        if(v0 == null) {
            return 0;
        }

        if((v0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & arg4) == arg4) {
            v1 = true;
        }

        return v1;
    }

    public void getBoundsInParent(Rect arg2) {
        this.mInfo.getBoundsInParent(arg2);
    }

    public void getBoundsInScreen(Rect arg2) {
        this.mInfo.getBoundsInScreen(arg2);
    }

    public AccessibilityNodeInfoCompat getChild(int arg2) {
        return AccessibilityNodeInfoCompat.wrapNonNullInstance(this.mInfo.getChild(arg2));
    }

    public int getChildCount() {
        return this.mInfo.getChildCount();
    }

    public CharSequence getClassName() {
        return this.mInfo.getClassName();
    }

    public CollectionInfoCompat getCollectionInfo() {
        if(Build$VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo$CollectionInfo v0 = this.mInfo.getCollectionInfo();
            if(v0 != null) {
                return new CollectionInfoCompat(v0);
            }
        }

        return null;
    }

    public CollectionItemInfoCompat getCollectionItemInfo() {
        if(Build$VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo$CollectionItemInfo v0 = this.mInfo.getCollectionItemInfo();
            if(v0 != null) {
                return new CollectionItemInfoCompat(v0);
            }
        }

        return null;
    }

    public CharSequence getContentDescription() {
        return this.mInfo.getContentDescription();
    }

    public int getDrawingOrder() {
        if(Build$VERSION.SDK_INT >= 24) {
            return this.mInfo.getDrawingOrder();
        }

        return 0;
    }

    public CharSequence getError() {
        if(Build$VERSION.SDK_INT >= 21) {
            return this.mInfo.getError();
        }

        return null;
    }

    public Bundle getExtras() {
        if(Build$VERSION.SDK_INT >= 19) {
            return this.mInfo.getExtras();
        }

        return new Bundle();
    }

    @Nullable public CharSequence getHintText() {
        if(Build$VERSION.SDK_INT >= 26) {
            return this.mInfo.getHintText();
        }

        if(Build$VERSION.SDK_INT >= 19) {
            return this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
        }

        return null;
    }

    @Deprecated public Object getInfo() {
        return this.mInfo;
    }

    public int getInputType() {
        if(Build$VERSION.SDK_INT >= 19) {
            return this.mInfo.getInputType();
        }

        return 0;
    }

    public AccessibilityNodeInfoCompat getLabelFor() {
        if(Build$VERSION.SDK_INT >= 17) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(this.mInfo.getLabelFor());
        }

        return null;
    }

    public AccessibilityNodeInfoCompat getLabeledBy() {
        if(Build$VERSION.SDK_INT >= 17) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(this.mInfo.getLabeledBy());
        }

        return null;
    }

    public int getLiveRegion() {
        if(Build$VERSION.SDK_INT >= 19) {
            return this.mInfo.getLiveRegion();
        }

        return 0;
    }

    public int getMaxTextLength() {
        if(Build$VERSION.SDK_INT >= 21) {
            return this.mInfo.getMaxTextLength();
        }

        return -1;
    }

    public int getMovementGranularities() {
        if(Build$VERSION.SDK_INT >= 16) {
            return this.mInfo.getMovementGranularities();
        }

        return 0;
    }

    public CharSequence getPackageName() {
        return this.mInfo.getPackageName();
    }

    @Nullable public CharSequence getPaneTitle() {
        if(Build$VERSION.SDK_INT >= 28) {
            return this.mInfo.getPaneTitle();
        }

        if(Build$VERSION.SDK_INT >= 19) {
            return this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY");
        }

        return null;
    }

    public AccessibilityNodeInfoCompat getParent() {
        return AccessibilityNodeInfoCompat.wrapNonNullInstance(this.mInfo.getParent());
    }

    public RangeInfoCompat getRangeInfo() {
        if(Build$VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo$RangeInfo v0 = this.mInfo.getRangeInfo();
            if(v0 != null) {
                return new RangeInfoCompat(v0);
            }
        }

        return null;
    }

    @Nullable public CharSequence getRoleDescription() {
        if(Build$VERSION.SDK_INT >= 19) {
            return this.mInfo.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
        }

        return null;
    }

    public CharSequence getText() {
        return this.mInfo.getText();
    }

    public int getTextSelectionEnd() {
        if(Build$VERSION.SDK_INT >= 18) {
            return this.mInfo.getTextSelectionEnd();
        }

        return -1;
    }

    public int getTextSelectionStart() {
        if(Build$VERSION.SDK_INT >= 18) {
            return this.mInfo.getTextSelectionStart();
        }

        return -1;
    }

    @Nullable public CharSequence getTooltipText() {
        if(Build$VERSION.SDK_INT >= 28) {
            return this.mInfo.getTooltipText();
        }

        if(Build$VERSION.SDK_INT >= 19) {
            return this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }

        return null;
    }

    public AccessibilityNodeInfoCompat getTraversalAfter() {
        if(Build$VERSION.SDK_INT >= 22) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(this.mInfo.getTraversalAfter());
        }

        return null;
    }

    public AccessibilityNodeInfoCompat getTraversalBefore() {
        if(Build$VERSION.SDK_INT >= 22) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(this.mInfo.getTraversalBefore());
        }

        return null;
    }

    public String getViewIdResourceName() {
        if(Build$VERSION.SDK_INT >= 18) {
            return this.mInfo.getViewIdResourceName();
        }

        return null;
    }

    public AccessibilityWindowInfoCompat getWindow() {
        if(Build$VERSION.SDK_INT >= 21) {
            return AccessibilityWindowInfoCompat.wrapNonNullInstance(this.mInfo.getWindow());
        }

        return null;
    }

    public int getWindowId() {
        return this.mInfo.getWindowId();
    }

    public int hashCode() {
        int v0 = this.mInfo == null ? 0 : this.mInfo.hashCode();
        return v0;
    }

    public boolean isAccessibilityFocused() {
        if(Build$VERSION.SDK_INT >= 16) {
            return this.mInfo.isAccessibilityFocused();
        }

        return 0;
    }

    public boolean isCheckable() {
        return this.mInfo.isCheckable();
    }

    public boolean isChecked() {
        return this.mInfo.isChecked();
    }

    public boolean isClickable() {
        return this.mInfo.isClickable();
    }

    public boolean isContentInvalid() {
        if(Build$VERSION.SDK_INT >= 19) {
            return this.mInfo.isContentInvalid();
        }

        return 0;
    }

    public boolean isContextClickable() {
        if(Build$VERSION.SDK_INT >= 23) {
            return this.mInfo.isContextClickable();
        }

        return 0;
    }

    public boolean isDismissable() {
        if(Build$VERSION.SDK_INT >= 19) {
            return this.mInfo.isDismissable();
        }

        return 0;
    }

    public boolean isEditable() {
        if(Build$VERSION.SDK_INT >= 18) {
            return this.mInfo.isEditable();
        }

        return 0;
    }

    public boolean isEnabled() {
        return this.mInfo.isEnabled();
    }

    public boolean isFocusable() {
        return this.mInfo.isFocusable();
    }

    public boolean isFocused() {
        return this.mInfo.isFocused();
    }

    public boolean isHeading() {
        if(Build$VERSION.SDK_INT >= 28) {
            return this.mInfo.isHeading();
        }

        boolean v1 = true;
        if(this.getBooleanProperty(2)) {
            return 1;
        }

        CollectionItemInfoCompat v0 = this.getCollectionItemInfo();
        if(v0 == null || !v0.isHeading()) {
            v1 = false;
        }
        else {
        }

        return v1;
    }

    public boolean isImportantForAccessibility() {
        if(Build$VERSION.SDK_INT >= 24) {
            return this.mInfo.isImportantForAccessibility();
        }

        return 1;
    }

    public boolean isLongClickable() {
        return this.mInfo.isLongClickable();
    }

    public boolean isMultiLine() {
        if(Build$VERSION.SDK_INT >= 19) {
            return this.mInfo.isMultiLine();
        }

        return 0;
    }

    public boolean isPassword() {
        return this.mInfo.isPassword();
    }

    public boolean isScreenReaderFocusable() {
        if(Build$VERSION.SDK_INT >= 28) {
            return this.mInfo.isScreenReaderFocusable();
        }

        return this.getBooleanProperty(1);
    }

    public boolean isScrollable() {
        return this.mInfo.isScrollable();
    }

    public boolean isSelected() {
        return this.mInfo.isSelected();
    }

    public boolean isShowingHintText() {
        if(Build$VERSION.SDK_INT >= 26) {
            return this.mInfo.isShowingHintText();
        }

        return this.getBooleanProperty(4);
    }

    public boolean isVisibleToUser() {
        if(Build$VERSION.SDK_INT >= 16) {
            return this.mInfo.isVisibleToUser();
        }

        return 0;
    }

    public static AccessibilityNodeInfoCompat obtain() {
        return AccessibilityNodeInfoCompat.wrap(AccessibilityNodeInfo.obtain());
    }

    public static AccessibilityNodeInfoCompat obtain(View arg0) {
        return AccessibilityNodeInfoCompat.wrap(AccessibilityNodeInfo.obtain(arg0));
    }

    public static AccessibilityNodeInfoCompat obtain(View arg2, int arg3) {
        if(Build$VERSION.SDK_INT >= 16) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(AccessibilityNodeInfo.obtain(arg2, arg3));
        }

        return null;
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat arg0) {
        return AccessibilityNodeInfoCompat.wrap(AccessibilityNodeInfo.obtain(arg0.mInfo));
    }

    public boolean performAction(int arg2) {
        return this.mInfo.performAction(arg2);
    }

    public boolean performAction(int arg3, Bundle arg4) {
        if(Build$VERSION.SDK_INT >= 16) {
            return this.mInfo.performAction(arg3, arg4);
        }

        return 0;
    }

    public void recycle() {
        this.mInfo.recycle();
    }

    public boolean refresh() {
        if(Build$VERSION.SDK_INT >= 18) {
            return this.mInfo.refresh();
        }

        return 0;
    }

    public boolean removeAction(AccessibilityActionCompat arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            return this.mInfo.removeAction(arg3.mAction);
        }

        return 0;
    }

    public boolean removeChild(View arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            return this.mInfo.removeChild(arg3);
        }

        return 0;
    }

    public boolean removeChild(View arg3, int arg4) {
        if(Build$VERSION.SDK_INT >= 21) {
            return this.mInfo.removeChild(arg3, arg4);
        }

        return 0;
    }

    public void setAccessibilityFocused(boolean arg3) {
        if(Build$VERSION.SDK_INT >= 16) {
            this.mInfo.setAccessibilityFocused(arg3);
        }
    }

    private void setBooleanProperty(int arg5, boolean arg6) {
        Bundle v0 = this.getExtras();
        if(v0 != null) {
            v0.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0 | v0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & ~arg5);
        }
    }

    public void setBoundsInParent(Rect arg2) {
        this.mInfo.setBoundsInParent(arg2);
    }

    public void setBoundsInScreen(Rect arg2) {
        this.mInfo.setBoundsInScreen(arg2);
    }

    public void setCanOpenPopup(boolean arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            this.mInfo.setCanOpenPopup(arg3);
        }
    }

    public void setCheckable(boolean arg2) {
        this.mInfo.setCheckable(arg2);
    }

    public void setChecked(boolean arg2) {
        this.mInfo.setChecked(arg2);
    }

    public void setClassName(CharSequence arg2) {
        this.mInfo.setClassName(arg2);
    }

    public void setClickable(boolean arg2) {
        this.mInfo.setClickable(arg2);
    }

    public void setCollectionInfo(Object arg3) {
        AccessibilityNodeInfo$CollectionInfo v3;
        if(Build$VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo v0 = this.mInfo;
            if(arg3 == null) {
                v3 = null;
            }
            else {
                arg3 = ((CollectionInfoCompat)arg3).mInfo;
            }

            v0.setCollectionInfo(v3);
        }
    }

    public void setCollectionItemInfo(Object arg3) {
        AccessibilityNodeInfo$CollectionItemInfo v3;
        if(Build$VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo v0 = this.mInfo;
            if(arg3 == null) {
                v3 = null;
            }
            else {
                arg3 = ((CollectionItemInfoCompat)arg3).mInfo;
            }

            v0.setCollectionItemInfo(v3);
        }
    }

    public void setContentDescription(CharSequence arg2) {
        this.mInfo.setContentDescription(arg2);
    }

    public void setContentInvalid(boolean arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            this.mInfo.setContentInvalid(arg3);
        }
    }

    public void setContextClickable(boolean arg3) {
        if(Build$VERSION.SDK_INT >= 23) {
            this.mInfo.setContextClickable(arg3);
        }
    }

    public void setDismissable(boolean arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            this.mInfo.setDismissable(arg3);
        }
    }

    public void setDrawingOrder(int arg3) {
        if(Build$VERSION.SDK_INT >= 24) {
            this.mInfo.setDrawingOrder(arg3);
        }
    }

    public void setEditable(boolean arg3) {
        if(Build$VERSION.SDK_INT >= 18) {
            this.mInfo.setEditable(arg3);
        }
    }

    public void setEnabled(boolean arg2) {
        this.mInfo.setEnabled(arg2);
    }

    public void setError(CharSequence arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            this.mInfo.setError(arg3);
        }
    }

    public void setFocusable(boolean arg2) {
        this.mInfo.setFocusable(arg2);
    }

    public void setFocused(boolean arg2) {
        this.mInfo.setFocused(arg2);
    }

    public void setHeading(boolean arg3) {
        if(Build$VERSION.SDK_INT >= 28) {
            this.mInfo.setHeading(arg3);
        }
        else {
            this.setBooleanProperty(2, arg3);
        }
    }

    public void setHintText(@Nullable CharSequence arg3) {
        if(Build$VERSION.SDK_INT >= 26) {
            this.mInfo.setHintText(arg3);
        }
        else if(Build$VERSION.SDK_INT >= 19) {
            this.mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", arg3);
        }
    }

    public void setImportantForAccessibility(boolean arg3) {
        if(Build$VERSION.SDK_INT >= 24) {
            this.mInfo.setImportantForAccessibility(arg3);
        }
    }

    public void setInputType(int arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            this.mInfo.setInputType(arg3);
        }
    }

    public void setLabelFor(View arg3) {
        if(Build$VERSION.SDK_INT >= 17) {
            this.mInfo.setLabelFor(arg3);
        }
    }

    public void setLabelFor(View arg3, int arg4) {
        if(Build$VERSION.SDK_INT >= 17) {
            this.mInfo.setLabelFor(arg3, arg4);
        }
    }

    public void setLabeledBy(View arg3) {
        if(Build$VERSION.SDK_INT >= 17) {
            this.mInfo.setLabeledBy(arg3);
        }
    }

    public void setLabeledBy(View arg3, int arg4) {
        if(Build$VERSION.SDK_INT >= 17) {
            this.mInfo.setLabeledBy(arg3, arg4);
        }
    }

    public void setLiveRegion(int arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            this.mInfo.setLiveRegion(arg3);
        }
    }

    public void setLongClickable(boolean arg2) {
        this.mInfo.setLongClickable(arg2);
    }

    public void setMaxTextLength(int arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            this.mInfo.setMaxTextLength(arg3);
        }
    }

    public void setMovementGranularities(int arg3) {
        if(Build$VERSION.SDK_INT >= 16) {
            this.mInfo.setMovementGranularities(arg3);
        }
    }

    public void setMultiLine(boolean arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            this.mInfo.setMultiLine(arg3);
        }
    }

    public void setPackageName(CharSequence arg2) {
        this.mInfo.setPackageName(arg2);
    }

    public void setPaneTitle(@Nullable CharSequence arg3) {
        if(Build$VERSION.SDK_INT >= 28) {
            this.mInfo.setPaneTitle(arg3);
        }
        else if(Build$VERSION.SDK_INT >= 19) {
            this.mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", arg3);
        }
    }

    public void setParent(View arg2) {
        this.mInfo.setParent(arg2);
    }

    public void setParent(View arg3, int arg4) {
        this.mParentVirtualDescendantId = arg4;
        if(Build$VERSION.SDK_INT >= 16) {
            this.mInfo.setParent(arg3, arg4);
        }
    }

    public void setPassword(boolean arg2) {
        this.mInfo.setPassword(arg2);
    }

    public void setRangeInfo(RangeInfoCompat arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            this.mInfo.setRangeInfo(arg3.mInfo);
        }
    }

    public void setRoleDescription(@Nullable CharSequence arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            this.mInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", arg3);
        }
    }

    public void setScreenReaderFocusable(boolean arg3) {
        if(Build$VERSION.SDK_INT >= 28) {
            this.mInfo.setScreenReaderFocusable(arg3);
        }
        else {
            this.setBooleanProperty(1, arg3);
        }
    }

    public void setScrollable(boolean arg2) {
        this.mInfo.setScrollable(arg2);
    }

    public void setSelected(boolean arg2) {
        this.mInfo.setSelected(arg2);
    }

    public void setShowingHintText(boolean arg3) {
        if(Build$VERSION.SDK_INT >= 26) {
            this.mInfo.setShowingHintText(arg3);
        }
        else {
            this.setBooleanProperty(4, arg3);
        }
    }

    public void setSource(View arg2) {
        this.mInfo.setSource(arg2);
    }

    public void setSource(View arg3, int arg4) {
        if(Build$VERSION.SDK_INT >= 16) {
            this.mInfo.setSource(arg3, arg4);
        }
    }

    public void setText(CharSequence arg2) {
        this.mInfo.setText(arg2);
    }

    public void setTextSelection(int arg3, int arg4) {
        if(Build$VERSION.SDK_INT >= 18) {
            this.mInfo.setTextSelection(arg3, arg4);
        }
    }

    public void setTooltipText(@Nullable CharSequence arg3) {
        if(Build$VERSION.SDK_INT >= 28) {
            this.mInfo.setTooltipText(arg3);
        }
        else if(Build$VERSION.SDK_INT >= 19) {
            this.mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", arg3);
        }
    }

    public void setTraversalAfter(View arg3) {
        if(Build$VERSION.SDK_INT >= 22) {
            this.mInfo.setTraversalAfter(arg3);
        }
    }

    public void setTraversalAfter(View arg3, int arg4) {
        if(Build$VERSION.SDK_INT >= 22) {
            this.mInfo.setTraversalAfter(arg3, arg4);
        }
    }

    public void setTraversalBefore(View arg3) {
        if(Build$VERSION.SDK_INT >= 22) {
            this.mInfo.setTraversalBefore(arg3);
        }
    }

    public void setTraversalBefore(View arg3, int arg4) {
        if(Build$VERSION.SDK_INT >= 22) {
            this.mInfo.setTraversalBefore(arg3, arg4);
        }
    }

    public void setViewIdResourceName(String arg3) {
        if(Build$VERSION.SDK_INT >= 18) {
            this.mInfo.setViewIdResourceName(arg3);
        }
    }

    public void setVisibleToUser(boolean arg3) {
        if(Build$VERSION.SDK_INT >= 16) {
            this.mInfo.setVisibleToUser(arg3);
        }
    }

    public String toString() {
        StringBuilder v0 = new StringBuilder();
        v0.append(super.toString());
        Rect v1 = new Rect();
        this.getBoundsInParent(v1);
        v0.append("; boundsInParent: " + v1);
        this.getBoundsInScreen(v1);
        v0.append("; boundsInScreen: " + v1);
        v0.append("; packageName: ");
        v0.append(this.getPackageName());
        v0.append("; className: ");
        v0.append(this.getClassName());
        v0.append("; text: ");
        v0.append(this.getText());
        v0.append("; contentDescription: ");
        v0.append(this.getContentDescription());
        v0.append("; viewId: ");
        v0.append(this.getViewIdResourceName());
        v0.append("; checkable: ");
        v0.append(this.isCheckable());
        v0.append("; checked: ");
        v0.append(this.isChecked());
        v0.append("; focusable: ");
        v0.append(this.isFocusable());
        v0.append("; focused: ");
        v0.append(this.isFocused());
        v0.append("; selected: ");
        v0.append(this.isSelected());
        v0.append("; clickable: ");
        v0.append(this.isClickable());
        v0.append("; longClickable: ");
        v0.append(this.isLongClickable());
        v0.append("; enabled: ");
        v0.append(this.isEnabled());
        v0.append("; password: ");
        v0.append(this.isPassword());
        v0.append("; scrollable: " + this.isScrollable());
        v0.append("; [");
        int v1_2 = this.getActions();
        while(v1_2 != 0) {
            int v2_1 = 1 << Integer.numberOfTrailingZeros(v1_2);
            v1_2 &= ~v2_1;
            v0.append(AccessibilityNodeInfoCompat.getActionSymbolicName(v2_1));
            if(v1_2 == 0) {
                continue;
            }

            v0.append(", ");
        }

        v0.append("]");
        return v0.toString();
    }

    public AccessibilityNodeInfo unwrap() {
        return this.mInfo;
    }

    public static AccessibilityNodeInfoCompat wrap(@NonNull AccessibilityNodeInfo arg1) {
        return new AccessibilityNodeInfoCompat(arg1);
    }

    static AccessibilityNodeInfoCompat wrapNonNullInstance(Object arg1) {
        if(arg1 != null) {
            return new AccessibilityNodeInfoCompat(arg1);
        }

        return null;
    }
}

