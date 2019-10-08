package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build$VERSION;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting final class zzff extends SQLiteOpenHelper {
    zzff(zzfe arg2, Context arg3, String arg4) {
        this.zzakh = arg2;
        super(arg3, arg4, null, 1);
    }

    @WorkerThread public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        }
        catch(SQLiteException ) {
            this.zzakh.zzgi().zziv().log("Opening the local database failed, dropping and recreating it");
            String v0_1 = "google_app_measurement_local.db";
            if(!this.zzakh.getContext().getDatabasePath(v0_1).delete()) {
                this.zzakh.zzgi().zziv().zzg("Failed to delete corrupted local db file", v0_1);
            }

            try {
                return super.getWritableDatabase();
            }
            catch(SQLiteException v0_2) {
                this.zzakh.zzgi().zziv().zzg("Failed to open local database. Events will bypass local storage", v0_2);
                return null;
            }
        }
        catch(SQLiteDatabaseLockedException v0) {
            throw v0;
        }
    }

    @WorkerThread public final void onCreate(SQLiteDatabase arg2) {
        zzeo.zza(this.zzakh.zzgi(), arg2);
    }

    @WorkerThread public final void onDowngrade(SQLiteDatabase arg1, int arg2, int arg3) {
    }

    @WorkerThread public final void onOpen(SQLiteDatabase arg8) {
        Cursor v0_1;
        Cursor v1;
        if(Build$VERSION.SDK_INT < 15) {
            String[] v0 = null;
            try {
                v1 = arg8.rawQuery("PRAGMA journal_mode=memory", v0);
            }
            catch(Throwable v8) {
                goto label_14;
            }

            try {
                v1.moveToFirst();
                if(v1 == null) {
                    goto label_17;
                }

                goto label_8;
            }
            catch(Throwable v8) {
                v0_1 = v1;
            }

        label_14:
            if(v0_1 != null) {
                v0_1.close();
            }

            throw v8;
        label_8:
            v1.close();
        }

    label_17:
        zzeo.zza(this.zzakh.zzgi(), arg8, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @WorkerThread public final void onUpgrade(SQLiteDatabase arg1, int arg2, int arg3) {
    }
}

