package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

final class zzea {
    private final zzgn zzacv;
    private String zzaez;
    private String zzafa;
    private String zzafb;
    private String zzafc;
    private long zzafd;
    private long zzafe;
    private long zzaff;
    private long zzafg;
    private String zzafh;
    private long zzafi;
    private long zzafj;
    private boolean zzafk;
    private long zzafl;
    private boolean zzafm;
    private boolean zzafn;
    private long zzafo;
    private long zzafp;
    private long zzafq;
    private long zzafr;
    private long zzafs;
    private long zzaft;
    private String zzafu;
    private boolean zzafv;
    private long zzafw;
    private long zzafx;
    private String zztg;
    private final String zzth;

    @WorkerThread zzea(zzgn arg1, String arg2) {
        super();
        Preconditions.checkNotNull(arg1);
        Preconditions.checkNotEmpty(arg2);
        this.zzacv = arg1;
        this.zzth = arg2;
        this.zzacv.zzgh().zzab();
    }

    @WorkerThread public final String getAppInstanceId() {
        this.zzacv.zzgh().zzab();
        return this.zzaez;
    }

    @WorkerThread public final String getGmpAppId() {
        this.zzacv.zzgh().zzab();
        return this.zzafa;
    }

    @WorkerThread public final boolean isMeasurementEnabled() {
        this.zzacv.zzgh().zzab();
        return this.zzafk;
    }

    @WorkerThread public final void setAppVersion(String arg3) {
        this.zzacv.zzgh().zzab();
        this.zzafv |= zzkd.zzs(this.zztg, arg3) ^ 1;
        this.zztg = arg3;
    }

    @WorkerThread public final void setMeasurementEnabled(boolean arg3) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzafk != arg3 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzafk = arg3;
    }

    @WorkerThread public final void zzaa(long arg4) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzafp != arg4 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzafp = arg4;
    }

    @WorkerThread public final void zzab(long arg4) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzafq != arg4 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzafq = arg4;
    }

    @WorkerThread public final void zzac(long arg4) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzafr != arg4 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzafr = arg4;
    }

    @WorkerThread public final void zzad(long arg4) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzaft != arg4 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzaft = arg4;
    }

    @WorkerThread public final void zzae(long arg4) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzafs != arg4 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzafs = arg4;
    }

    @WorkerThread public final void zzaf(long arg4) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzafl != arg4 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzafl = arg4;
    }

    @WorkerThread public final String zzag() {
        this.zzacv.zzgh().zzab();
        return this.zztg;
    }

    @WorkerThread public final String zzah() {
        this.zzacv.zzgh().zzab();
        return this.zzth;
    }

    @WorkerThread public final void zzam(String arg3) {
        this.zzacv.zzgh().zzab();
        this.zzafv |= zzkd.zzs(this.zzaez, arg3) ^ 1;
        this.zzaez = arg3;
    }

    @WorkerThread public final void zzan(String arg3) {
        this.zzacv.zzgh().zzab();
        if(TextUtils.isEmpty(((CharSequence)arg3))) {
            arg3 = null;
        }

        this.zzafv |= zzkd.zzs(this.zzafa, arg3) ^ 1;
        this.zzafa = arg3;
    }

    @WorkerThread public final void zzao(String arg3) {
        this.zzacv.zzgh().zzab();
        this.zzafv |= zzkd.zzs(this.zzafb, arg3) ^ 1;
        this.zzafb = arg3;
    }

    @WorkerThread public final void zzap(String arg3) {
        this.zzacv.zzgh().zzab();
        this.zzafv |= zzkd.zzs(this.zzafc, arg3) ^ 1;
        this.zzafc = arg3;
    }

    @WorkerThread public final void zzaq(String arg3) {
        this.zzacv.zzgh().zzab();
        this.zzafv |= zzkd.zzs(this.zzafh, arg3) ^ 1;
        this.zzafh = arg3;
    }

    @WorkerThread public final void zzar(String arg3) {
        this.zzacv.zzgh().zzab();
        this.zzafv |= zzkd.zzs(this.zzafu, arg3) ^ 1;
        this.zzafu = arg3;
    }

    @WorkerThread public final void zzd(boolean arg2) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafm != arg2 ? true : false;
        this.zzafv = v0;
        this.zzafm = arg2;
    }

    @WorkerThread public final void zze(boolean arg2) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafn != arg2 ? true : false;
        this.zzafv = v0;
        this.zzafn = arg2;
    }

    @WorkerThread public final void zzgp() {
        this.zzacv.zzgh().zzab();
        this.zzafv = false;
    }

    @WorkerThread public final String zzgq() {
        this.zzacv.zzgh().zzab();
        return this.zzafb;
    }

    @WorkerThread public final String zzgr() {
        this.zzacv.zzgh().zzab();
        return this.zzafc;
    }

    @WorkerThread public final long zzgs() {
        this.zzacv.zzgh().zzab();
        return this.zzafe;
    }

    @WorkerThread public final long zzgt() {
        this.zzacv.zzgh().zzab();
        return this.zzaff;
    }

    @WorkerThread public final long zzgu() {
        this.zzacv.zzgh().zzab();
        return this.zzafg;
    }

    @WorkerThread public final String zzgv() {
        this.zzacv.zzgh().zzab();
        return this.zzafh;
    }

    @WorkerThread public final long zzgw() {
        this.zzacv.zzgh().zzab();
        return this.zzafi;
    }

    @WorkerThread public final long zzgx() {
        this.zzacv.zzgh().zzab();
        return this.zzafj;
    }

    @WorkerThread public final long zzgy() {
        this.zzacv.zzgh().zzab();
        return this.zzafd;
    }

    @WorkerThread public final long zzgz() {
        this.zzacv.zzgh().zzab();
        return this.zzafw;
    }

    @WorkerThread public final long zzha() {
        this.zzacv.zzgh().zzab();
        return this.zzafx;
    }

    @WorkerThread public final void zzhb() {
        this.zzacv.zzgh().zzab();
        long v0 = this.zzafd + 1;
        if(v0 > 0x7FFFFFFF) {
            this.zzacv.zzgi().zziy().zzg("Bundle index overflow. appId", zzfi.zzbp(this.zzth));
            v0 = 0;
        }

        this.zzafv = true;
        this.zzafd = v0;
    }

    @WorkerThread public final long zzhc() {
        this.zzacv.zzgh().zzab();
        return this.zzafo;
    }

    @WorkerThread public final long zzhd() {
        this.zzacv.zzgh().zzab();
        return this.zzafp;
    }

    @WorkerThread public final long zzhe() {
        this.zzacv.zzgh().zzab();
        return this.zzafq;
    }

    @WorkerThread public final long zzhf() {
        this.zzacv.zzgh().zzab();
        return this.zzafr;
    }

    @WorkerThread public final long zzhg() {
        this.zzacv.zzgh().zzab();
        return this.zzaft;
    }

    @WorkerThread public final long zzhh() {
        this.zzacv.zzgh().zzab();
        return this.zzafs;
    }

    @WorkerThread public final String zzhi() {
        this.zzacv.zzgh().zzab();
        return this.zzafu;
    }

    @WorkerThread public final String zzhj() {
        this.zzacv.zzgh().zzab();
        String v0 = this.zzafu;
        this.zzar(null);
        return v0;
    }

    @WorkerThread public final long zzhk() {
        this.zzacv.zzgh().zzab();
        return this.zzafl;
    }

    @WorkerThread public final boolean zzhl() {
        this.zzacv.zzgh().zzab();
        return this.zzafm;
    }

    @WorkerThread public final boolean zzhm() {
        this.zzacv.zzgh().zzab();
        return this.zzafn;
    }

    @WorkerThread public final void zzr(long arg4) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzafe != arg4 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzafe = arg4;
    }

    @WorkerThread public final void zzs(long arg4) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzaff != arg4 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzaff = arg4;
    }

    @WorkerThread public final void zzt(long arg4) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzafg != arg4 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzafg = arg4;
    }

    @WorkerThread public final void zzu(long arg4) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzafi != arg4 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzafi = arg4;
    }

    @WorkerThread public final void zzv(long arg4) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzafj != arg4 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzafj = arg4;
    }

    @WorkerThread public final void zzw(long arg6) {
        int v0 = 0;
        boolean v2 = arg6 >= 0 ? true : false;
        Preconditions.checkArgument(v2);
        this.zzacv.zzgh().zzab();
        v2 = this.zzafv;
        if(this.zzafd != arg6) {
            v0 = 1;
        }

        this.zzafv = v0 | (((int)v2));
        this.zzafd = arg6;
    }

    @WorkerThread public final void zzx(long arg4) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzafw != arg4 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzafw = arg4;
    }

    @WorkerThread public final void zzy(long arg4) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzafx != arg4 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzafx = arg4;
    }

    @WorkerThread public final void zzz(long arg4) {
        this.zzacv.zzgh().zzab();
        boolean v0 = this.zzafv;
        int v1 = this.zzafo != arg4 ? 1 : 0;
        this.zzafv = (((int)v0)) | v1;
        this.zzafo = arg4;
    }
}

