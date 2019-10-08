package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

public final class zzfe extends zzdz {
    private final zzff zzakf;
    private boolean zzakg;

    zzfe(zzgn arg3) {
        super(arg3);
        this.zzakf = new zzff(this, ((zzhi)this).getContext(), "google_app_measurement_local.db");
    }

    public final Context getContext() {
        return super.getContext();
    }

    @WorkerThread @VisibleForTesting private final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        SQLiteDatabase v1 = null;
        if(this.zzakg) {
            return v1;
        }

        SQLiteDatabase v0 = this.zzakf.getWritableDatabase();
        if(v0 == null) {
            this.zzakg = true;
            return v1;
        }

        return v0;
    }

    @WorkerThread public final void resetAnalyticsData() {
        ((zzhi)this).zzfv();
        ((zzhi)this).zzab();
        try {
            int v0_1 = this.getWritableDatabase().delete("messages", null, null);
            if(v0_1 > 0) {
                ((zzhi)this).zzgi().zzjc().zzg("Reset local analytics data. records", Integer.valueOf(v0_1));
            }
        }
        catch(SQLiteException v0) {
            ((zzhi)this).zzgi().zziv().zzg("Error resetting local analytics data. error", v0);
            return;
        }
    }

    @WorkerThread private final boolean zza(int arg18, byte[] arg19) {
        Cursor v12;
        long v10;
        SQLiteDatabase v9;
        zzfe v1 = this;
        ((zzhi)this).zzfv();
        ((zzhi)this).zzab();
        boolean v2 = false;
        if(v1.zzakg) {
            return 0;
        }

        ContentValues v3 = new ContentValues();
        v3.put("type", Integer.valueOf(arg18));
        v3.put("entry", arg19);
        int v4 = 5;
        int v5 = 0;
        int v6 = 5;
    label_18:
        if(v5 >= v4) {
            goto label_142;
        }

        String[] v7 = null;
        try {
            v9 = this.getWritableDatabase();
            if(v9 != null) {
                goto label_33;
            }
        }
        catch(SQLiteDatabaseLockedException ) {
            goto label_111;
        }
        catch(Throwable v0) {
            goto label_88;
        }
        catch(SQLiteFullException v0_1) {
            goto label_121;
        }
        catch(SQLiteException v0_2) {
            goto label_92;
        }

        try {
            v1.zzakg = true;
            if(v9 != null) {
                goto label_25;
            }

            return v2;
        }
        catch(Throwable v0) {
            goto label_136;
        }
        catch(SQLiteDatabaseLockedException ) {
            goto label_112;
        }
        catch(SQLiteException v0_2) {
            goto label_28;
        }
        catch(SQLiteFullException v0_1) {
            goto label_32;
        }

    label_25:
        v9.close();
        return v2;
        try {
        label_33:
            v9.beginTransaction();
            v10 = 0;
            v12 = v9.rawQuery("select count(1) from messages", v7);
            if(v12 != null) {
                goto label_38;
            }

            goto label_49;
        }
        catch(Throwable v0) {
            goto label_136;
        }
        catch(SQLiteDatabaseLockedException ) {
            goto label_112;
        }
        catch(SQLiteException v0_2) {
            goto label_28;
        }
        catch(SQLiteFullException v0_1) {
            goto label_32;
        }

        try {
        label_38:
            if(v12.moveToFirst()) {
                v10 = v12.getLong(((int)v2));
            }

        label_49:
            long v13 = 100000;
            if(v10 >= v13) {
                ((zzhi)this).zzgi().zziv().log("Data loss, local db full");
                v13 = v13 - v10 + 1;
                String[] v11 = new String[1];
                v11[((int)v2)] = Long.toString(v13);
                v10 = ((long)v9.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", v11));
                if(v10 != v13) {
                    ((zzhi)this).zzgi().zziv().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(v13), Long.valueOf(v10), Long.valueOf(v13 - v10));
                }
            }

            v9.insertOrThrow("messages", ((String)v7), v3);
            v9.setTransactionSuccessful();
            v9.endTransaction();
            if(v12 != null) {
                goto label_81;
            }

            goto label_82;
        }
        catch(Throwable v0) {
            goto label_43;
        }
        catch(SQLiteException v0_2) {
            goto label_45;
        }
        catch(SQLiteFullException v0_1) {
            goto label_47;
        }
        catch(SQLiteDatabaseLockedException ) {
            goto label_85;
        }

    label_81:
        v12.close();
    label_82:
        if(v9 != null) {
            v9.close();
        }

        return 1;
    label_88:
        v9 = ((SQLiteDatabase)v7);
        v12 = ((Cursor)v9);
        goto label_137;
    label_92:
        v12 = ((Cursor)v7);
        goto label_93;
    label_111:
        v9 = ((SQLiteDatabase)v7);
        goto label_112;
    label_121:
        v9 = ((SQLiteDatabase)v7);
        goto label_122;
    label_142:
        ((zzhi)this).zzgi().zziy().log("Failed to write entry to local database");
        return 0;
    label_28:
        v12 = ((Cursor)v7);
        goto label_29;
    label_32:
        goto label_122;
    label_29:
        SQLiteDatabase v7_1 = v9;
        goto label_93;
    label_43:
        goto label_137;
    label_45:
        goto label_29;
    label_47:
        Cursor v7_2 = v12;
        goto label_122;
    label_85:
        v7_2 = v12;
        goto label_112;
    label_93:
        if((((SQLiteDatabase)v7)) != null) {
            try {
                if(((SQLiteDatabase)v7).inTransaction()) {
                    ((SQLiteDatabase)v7).endTransaction();
                }

            label_101:
                ((zzhi)this).zzgi().zziv().zzg("Error writing entry to local database", v0_2);
                v1.zzakg = true;
                if(v12 != null) {
                    goto label_107;
                }

                goto label_108;
            }
            catch(Throwable v0) {
                goto label_99;
            }
        }

        goto label_101;
    label_107:
        v12.close();
    label_108:
        if((((SQLiteDatabase)v7)) == null) {
        }
        else {
            ((SQLiteDatabase)v7).close();
            goto label_131;
        label_99:
            v9 = ((SQLiteDatabase)v7);
            goto label_137;
        }

    label_131:
        ++v5;
        v2 = false;
        v4 = 5;
        goto label_18;
    label_112:
        v10 = ((long)v6);
        try {
            SystemClock.sleep(v10);
            v6 += 20;
            if((((Cursor)v7)) != null) {
                goto label_116;
            }

            goto label_117;
        }
        catch(Throwable v0) {
            goto label_136;
        }

    label_116:
        ((Cursor)v7).close();
    label_117:
        if(v9 == null) {
            goto label_131;
        }

    label_118:
        v9.close();
        goto label_131;
        try {
        label_122:
            ((zzhi)this).zzgi().zziv().zzg("Error writing entry to local database", v0_1);
            v1.zzakg = true;
            if((((Cursor)v7)) != null) {
                goto label_128;
            }

            goto label_129;
        }
        catch(Throwable v0) {
            goto label_136;
        }

    label_128:
        ((Cursor)v7).close();
    label_129:
        if(v9 == null) {
            goto label_131;
        }

        goto label_118;
    label_136:
        v12 = ((Cursor)v7);
    label_137:
        if(v12 != null) {
            v12.close();
        }

        if(v9 != null) {
            v9.close();
        }

        throw v0;
    }

    public final boolean zza(zzex arg4) {
        Parcel v0 = Parcel.obtain();
        arg4.writeToParcel(v0, 0);
        byte[] v4 = v0.marshall();
        v0.recycle();
        if(v4.length > 0x20000) {
            ((zzhi)this).zzgi().zziy().log("Event is too long for local database. Sending event directly to service");
            return 0;
        }

        return this.zza(0, v4);
    }

    public final boolean zza(zzka arg4) {
        Parcel v0 = Parcel.obtain();
        arg4.writeToParcel(v0, 0);
        byte[] v4 = v0.marshall();
        v0.recycle();
        if(v4.length > 0x20000) {
            ((zzhi)this).zzgi().zziy().log("User property too long for local database. Sending directly to service");
            return 0;
        }

        return this.zza(1, v4);
    }

    public final void zzab() {
        super.zzab();
    }

    public final Clock zzbt() {
        return super.zzbt();
    }

    public final boolean zzc(zzef arg3) {
        ((zzhi)this).zzgg();
        byte[] v3 = zzkd.zza(((Parcelable)arg3));
        if(v3.length > 0x20000) {
            ((zzhi)this).zzgi().zziy().log("Conditional user property too long for local database. Sending directly to service");
            return 0;
        }

        return this.zza(2, v3);
    }

    public final void zzfu() {
        super.zzfu();
    }

    public final void zzfv() {
        super.zzfv();
    }

    public final void zzfw() {
        super.zzfw();
    }

    public final zzdu zzfx() {
        return super.zzfx();
    }

    public final zzhm zzfy() {
        return super.zzfy();
    }

    public final zzfd zzfz() {
        return super.zzfz();
    }

    public final zzik zzga() {
        return super.zzga();
    }

    public final zzih zzgb() {
        return super.zzgb();
    }

    public final zzfe zzgc() {
        return super.zzgc();
    }

    public final zzjj zzgd() {
        return super.zzgd();
    }

    public final zzer zzge() {
        return super.zzge();
    }

    public final zzfg zzgf() {
        return super.zzgf();
    }

    public final zzkd zzgg() {
        return super.zzgg();
    }

    public final zzgi zzgh() {
        return super.zzgh();
    }

    public final zzfi zzgi() {
        return super.zzgi();
    }

    public final zzft zzgj() {
        return super.zzgj();
    }

    public final zzeh zzgk() {
        return super.zzgk();
    }

    public final zzee zzgl() {
        return super.zzgl();
    }

    protected final boolean zzgn() {
        return 0;
    }

    public final List zzp(int arg19) {
        Object v0_4;
        Parcel v12_2;
        byte[] v13_1;
        long v10_1;
        SQLiteDatabase v9_1;
        String v17;
        String v16;
        String v14;
        String[] v13;
        String v12;
        String[] v11;
        String v10;
        Cursor v9;
        SQLiteDatabase v4_1;
        SQLiteDatabase v15;
        zzfe v1 = this;
        ((zzhi)this).zzab();
        ((zzhi)this).zzfv();
        List v2 = null;
        if(v1.zzakg) {
            return v2;
        }

        ArrayList v3 = new ArrayList();
        if(!((zzhi)this).getContext().getDatabasePath("google_app_measurement_local.db").exists()) {
            return ((List)v3);
        }

        int v4 = 5;
        int v6 = 0;
        int v7 = 5;
        while(true) {
            if(v6 >= v4) {
                goto label_227;
            }

            try {
                v15 = this.getWritableDatabase();
                if(v15 != null) {
                    goto label_41;
                }
            }
            catch(Throwable v0) {
                v4_1 = ((SQLiteDatabase)v2);
                v9 = ((Cursor)v4_1);
                break;
            }
            catch(SQLiteException v0_1) {
                v4_1 = ((SQLiteDatabase)v2);
                v9 = ((Cursor)v4_1);
                goto label_183;
            }
            catch(SQLiteDatabaseLockedException ) {
                v4_1 = ((SQLiteDatabase)v2);
                v9 = ((Cursor)v4_1);
                goto label_198;
            }
            catch(SQLiteFullException v0_2) {
                v4_1 = ((SQLiteDatabase)v2);
                v9 = ((Cursor)v4_1);
                goto label_209;
            }

            try {
                v1.zzakg = true;
                if(v15 == null) {
                    return v2;
                }

                goto label_25;
            }
            catch(SQLiteDatabaseLockedException ) {
            }
            catch(Throwable v0) {
                v9 = ((Cursor)v2);
                v4_1 = v15;
                break;
            label_25:
                v15.close();
                return v2;
                try {
                label_41:
                    v15.beginTransaction();
                    v10 = "messages";
                    v11 = new String[]{"rowid", "type", "entry"};
                    v12 = null;
                    v13 = null;
                    v14 = null;
                    v16 = "rowid asc";
                    v17 = Integer.toString(100);
                    v9_1 = v15;
                    v4_1 = v15;
                    v15 = null;
                }
                catch(Throwable v0) {
                    v4_1 = v15;
                    goto label_164;
                }
                catch(SQLiteException v0_1) {
                    v4_1 = v15;
                    goto label_168;
                }
                catch(SQLiteDatabaseLockedException ) {
                    v4_1 = v15;
                    goto label_170;
                }
                catch(SQLiteFullException v0_2) {
                    v4_1 = v15;
                    goto label_174;
                }
            }
            catch(SQLiteException v0_1) {
                v9 = ((Cursor)v2);
                v4_1 = v15;
                goto label_183;
            }
            catch(SQLiteFullException v0_2) {
                v9 = ((Cursor)v2);
                v4_1 = v15;
                goto label_209;
            }

            try {
                v9 = v9_1.query(v10, v11, v12, v13, v14, ((String)v15), v16, v17);
                v10_1 = -1;
                goto label_59;
            }
            catch(Throwable v0) {
            }
            catch(SQLiteException v0_1) {
            label_168:
                v9 = ((Cursor)v2);
                goto label_183;
            }
            catch(SQLiteDatabaseLockedException ) {
            label_170:
                v9 = ((Cursor)v2);
                goto label_198;
            }
            catch(SQLiteFullException v0_2) {
            label_174:
                v9 = ((Cursor)v2);
                goto label_209;
            }

        label_164:
            v9 = ((Cursor)v2);
            break;
            try {
                while(true) {
                label_59:
                    if(!v9.moveToNext()) {
                        goto label_133;
                    }

                    v10_1 = v9.getLong(0);
                    int v0_3 = v9.getInt(1);
                    int v12_1 = 2;
                    v13_1 = v9.getBlob(v12_1);
                    if(v0_3 != 0) {
                        goto label_86;
                    }

                    v12_2 = Parcel.obtain();
                    break;
                }
            }
            catch(SQLiteFullException v0_2) {
                goto label_155;
            }
            catch(SQLiteDatabaseLockedException ) {
                goto label_198;
            }
            catch(SQLiteException v0_1) {
                goto label_153;
            }
            catch(Throwable v0) {
                break;
            }

            try {
                v12_2.unmarshall(v13_1, 0, v13_1.length);
                v12_2.setDataPosition(0);
                v0_4 = zzex.CREATOR.createFromParcel(v12_2);
            }
            catch(ParseException ) {
                goto label_78;
            }
            catch(Throwable v0) {
                goto label_77;
            }

            try {
                v12_2.recycle();
                goto label_73;
            }
            catch(Throwable v0) {
            }
            catch(SQLiteDatabaseLockedException ) {
            }
            catch(SQLiteException v0_1) {
            }
            catch(SQLiteFullException v0_2) {
            }
            catch(Throwable v0) {
            label_77:
                try {
                    v12_2.recycle();
                    throw v0;
                label_73:
                    if(v0_4 == null) {
                        goto label_59;
                    }

                    goto label_74;
                label_86:
                    if(v0_3 != 1) {
                        goto label_107;
                    }

                    v12_2 = Parcel.obtain();
                }
                catch(SQLiteFullException v0_2) {
                    goto label_155;
                }
                catch(SQLiteDatabaseLockedException ) {
                    goto label_198;
                }
                catch(SQLiteException v0_1) {
                    goto label_153;
                }
                catch(Throwable v0) {
                    break;
                }

                try {
                    v12_2.unmarshall(v13_1, 0, v13_1.length);
                    v12_2.setDataPosition(0);
                    v0_4 = zzka.CREATOR.createFromParcel(v12_2);
                }
                catch(ParseException ) {
                    goto label_97;
                }
                catch(Throwable v0) {
                    goto label_96;
                }

                try {
                    v12_2.recycle();
                    goto label_103;
                }
                catch(Throwable v0) {
                }
                catch(SQLiteDatabaseLockedException ) {
                }
                catch(SQLiteException v0_1) {
                }
                catch(SQLiteFullException v0_2) {
                }
                catch(Throwable v0) {
                label_96:
                    try {
                        v12_2.recycle();
                        throw v0;
                    label_103:
                        if(v0_4 == null) {
                            goto label_59;
                        }

                        goto label_74;
                    label_107:
                        if(v0_3 != v12_1) {
                            goto label_128;
                        }

                        v12_2 = Parcel.obtain();
                    }
                    catch(SQLiteFullException v0_2) {
                        goto label_155;
                    }
                    catch(SQLiteDatabaseLockedException ) {
                        goto label_198;
                    }
                    catch(SQLiteException v0_1) {
                        goto label_153;
                    }
                    catch(Throwable v0) {
                        break;
                    }

                    try {
                        v12_2.unmarshall(v13_1, 0, v13_1.length);
                        v12_2.setDataPosition(0);
                        v0_4 = zzef.CREATOR.createFromParcel(v12_2);
                    }
                    catch(ParseException ) {
                        goto label_118;
                    }
                    catch(Throwable v0) {
                        goto label_117;
                    }

                    try {
                        v12_2.recycle();
                        goto label_124;
                    }
                    catch(Throwable v0) {
                    }
                    catch(SQLiteDatabaseLockedException ) {
                    }
                    catch(SQLiteException v0_1) {
                    }
                    catch(SQLiteFullException v0_2) {
                    }
                    catch(Throwable v0) {
                    label_117:
                        try {
                            v12_2.recycle();
                            throw v0;
                        label_124:
                            if(v0_4 == null) {
                                goto label_59;
                            }

                        label_74:
                            ((List)v3).add(v0_4);
                            goto label_59;
                        label_128:
                            ((zzhi)this).zzgi().zziv().log("Unknown record type in local database");
                            goto label_59;
                        label_133:
                            if(v4_1.delete("messages", "rowid <= ?", new String[]{Long.toString(v10_1)}) < ((List)v3).size()) {
                                ((zzhi)this).zzgi().zziv().log("Fewer entries removed from local database than expected");
                            }

                            v4_1.setTransactionSuccessful();
                            v4_1.endTransaction();
                            if(v9 == null) {
                                goto label_149;
                            }

                            goto label_148;
                        }
                        catch(Throwable v0) {
                            break;
                        }
                        catch(SQLiteDatabaseLockedException ) {
                        label_198:
                            v10_1 = ((long)v7);
                            try {
                                SystemClock.sleep(v10_1);
                                v7 += 20;
                                if(v9 != null) {
                                    goto label_202;
                                }

                                goto label_203;
                            }
                            catch(Throwable v0) {
                                break;
                            }

                        label_202:
                            v9.close();
                        label_203:
                            if(v4_1 != null) {
                            label_204:
                                v4_1.close();
                            }

                        label_218:
                            ++v6;
                            v4 = 5;
                            continue;
                        }
                        catch(SQLiteException v0_1) {
                        label_153:
                            goto label_183;
                        label_148:
                            v9.close();
                        label_149:
                            if(v4_1 != null) {
                                v4_1.close();
                            }

                            return ((List)v3);
                            try {
                            label_209:
                                ((zzhi)this).zzgi().zziv().zzg("Error reading entries from local database", v0_2);
                                v1.zzakg = true;
                                if(v9 != null) {
                                    goto label_215;
                                }

                                goto label_216;
                            }
                            catch(Throwable v0) {
                                break;
                            }

                        label_215:
                            v9.close();
                        label_216:
                            if(v4_1 == null) {
                                goto label_218;
                            }

                            goto label_204;
                        label_183:
                            if(v4_1 != null) {
                                try {
                                    if(v4_1.inTransaction()) {
                                        v4_1.endTransaction();
                                    }

                                label_187:
                                    ((zzhi)this).zzgi().zziv().zzg("Error reading entries from local database", v0_1);
                                    v1.zzakg = true;
                                    if(v9 != null) {
                                        goto label_193;
                                    }

                                    goto label_194;
                                }
                                catch(Throwable v0) {
                                    break;
                                }
                            }

                            goto label_187;
                        label_193:
                            v9.close();
                        label_194:
                            if(v4_1 == null) {
                                goto label_218;
                            }

                            goto label_204;
                        }
                        catch(SQLiteFullException v0_2) {
                        label_155:
                            goto label_209;
                        }
                    }
                    catch(ParseException ) {
                        try {
                        label_118:
                            ((zzhi)this).zzgi().zziv().log("Failed to load user property from local database");
                        }
                        catch(Throwable v0) {
                            goto label_117;
                        }

                        try {
                            v12_2.recycle();
                            v0_4 = v2;
                            goto label_124;
                        }
                        catch(SQLiteFullException v0_2) {
                            goto label_155;
                        }
                        catch(SQLiteDatabaseLockedException ) {
                            goto label_198;
                        }
                        catch(SQLiteException v0_1) {
                            goto label_153;
                        }
                        catch(Throwable v0) {
                            break;
                        }
                    }
                }
                catch(ParseException ) {
                    try {
                    label_97:
                        ((zzhi)this).zzgi().zziv().log("Failed to load user property from local database");
                    }
                    catch(Throwable v0) {
                        goto label_96;
                    }

                    try {
                        v12_2.recycle();
                        v0_4 = v2;
                        goto label_103;
                    }
                    catch(SQLiteFullException v0_2) {
                        goto label_155;
                    }
                    catch(SQLiteDatabaseLockedException ) {
                        goto label_198;
                    }
                    catch(SQLiteException v0_1) {
                        goto label_153;
                    }
                    catch(Throwable v0) {
                        break;
                    }
                }
            }
            catch(ParseException ) {
                try {
                label_78:
                    ((zzhi)this).zzgi().zziv().log("Failed to load event from local database");
                }
                catch(Throwable v0) {
                    goto label_77;
                }

                try {
                    v12_2.recycle();
                    goto label_59;
                }
                catch(SQLiteFullException v0_2) {
                    goto label_155;
                }
                catch(SQLiteDatabaseLockedException ) {
                    goto label_198;
                }
                catch(SQLiteException v0_1) {
                    goto label_153;
                }
                catch(Throwable v0) {
                    break;
                }
            }
        }

        if(v9 != null) {
            v9.close();
        }

        if(v4_1 != null) {
            v4_1.close();
        }

        throw v0;
    label_227:
        ((zzhi)this).zzgi().zziy().log("Failed to read events from database in reasonable time");
        return v2;
    }
}

