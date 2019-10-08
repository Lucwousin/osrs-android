package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;

@KeepForSdk public abstract class EntityBuffer extends AbstractDataBuffer {
    private boolean zamd;
    private ArrayList zame;

    @KeepForSdk protected EntityBuffer(DataHolder arg1) {
        super(arg1);
        this.zamd = false;
    }

    @KeepForSdk public final Object get(int arg7) {
        this.zacb();
        int v0 = this.zah(arg7);
        int v1 = 0;
        if(arg7 >= 0) {
            if(arg7 == this.zame.size()) {
            }
            else {
                int v2 = arg7 == this.zame.size() - 1 ? this.mDataHolder.getCount() - this.zame.get(arg7).intValue() : this.zame.get(arg7 + 1).intValue() - this.zame.get(arg7).intValue();
                if(v2 == 1) {
                    arg7 = this.zah(arg7);
                    int v3 = this.mDataHolder.getWindowIndex(arg7);
                    String v4 = this.getChildDataMarkerColumn();
                    if(v4 != null && this.mDataHolder.getString(v4, arg7, v3) == null) {
                        goto label_39;
                    }
                }

                v1 = v2;
            }
        }

    label_39:
        return this.getEntry(v0, v1);
    }

    @KeepForSdk protected String getChildDataMarkerColumn() {
        return null;
    }

    @KeepForSdk public int getCount() {
        this.zacb();
        return this.zame.size();
    }

    @KeepForSdk protected abstract Object getEntry(int arg1, int arg2);

    @KeepForSdk protected abstract String getPrimaryDataMarkerColumn();

    private final void zacb() {
        int v5;
        __monitor_enter(this);
        try {
            if(!this.zamd) {
                int v0_1 = this.mDataHolder.getCount();
                this.zame = new ArrayList();
                if(v0_1 > 0) {
                    this.zame.add(Integer.valueOf(0));
                    String v2 = this.getPrimaryDataMarkerColumn();
                    String v4 = this.mDataHolder.getString(v2, 0, this.mDataHolder.getWindowIndex(0));
                    int v3 = 1;
                    while(true) {
                        if(v3 < v0_1) {
                            v5 = this.mDataHolder.getWindowIndex(v3);
                            String v6 = this.mDataHolder.getString(v2, v3, v5);
                            if(v6 != null) {
                                if(!v6.equals(v4)) {
                                    this.zame.add(Integer.valueOf(v3));
                                    v4 = v6;
                                }

                                ++v3;
                                continue;
                            }
                            else {
                                break;
                            }
                        }

                        goto label_53;
                    }

                    StringBuilder v4_1 = new StringBuilder(String.valueOf(v2).length() + 78);
                    v4_1.append("Missing value for markerColumn: ");
                    v4_1.append(v2);
                    v4_1.append(", at row: ");
                    v4_1.append(v3);
                    v4_1.append(", for window: ");
                    v4_1.append(v5);
                    throw new NullPointerException(v4_1.toString());
                }

            label_53:
                this.zamd = true;
            }

            __monitor_exit(this);
            return;
        label_57:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_57;
        }

        throw v0;
    }

    private final int zah(int arg4) {
        if(arg4 >= 0 && arg4 < this.zame.size()) {
            return this.zame.get(arg4).intValue();
        }

        StringBuilder v2 = new StringBuilder(53);
        v2.append("Position ");
        v2.append(arg4);
        v2.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(v2.toString());
    }
}

