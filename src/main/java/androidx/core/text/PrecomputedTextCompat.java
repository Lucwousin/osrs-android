package androidx.core.text;

import android.os.Build$VERSION;
import android.text.Layout$Alignment;
import android.text.PrecomputedText$Params$Builder;
import android.text.PrecomputedText$Params;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout$Builder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.os.TraceCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class PrecomputedTextCompat implements Spannable {
    public final class Params {
        public class Builder {
            private int mBreakStrategy;
            private int mHyphenationFrequency;
            @NonNull private final TextPaint mPaint;
            private TextDirectionHeuristic mTextDir;

            public Builder(@NonNull TextPaint arg2) {
                super();
                this.mPaint = arg2;
                if(Build$VERSION.SDK_INT >= 23) {
                    this.mBreakStrategy = 1;
                    this.mHyphenationFrequency = 1;
                }
                else {
                    this.mHyphenationFrequency = 0;
                    this.mBreakStrategy = 0;
                }

                this.mTextDir = Build$VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            @NonNull public Params build() {
                return new Params(this.mPaint, this.mTextDir, this.mBreakStrategy, this.mHyphenationFrequency);
            }

            @RequiresApi(value=23) public Builder setBreakStrategy(int arg1) {
                this.mBreakStrategy = arg1;
                return this;
            }

            @RequiresApi(value=23) public Builder setHyphenationFrequency(int arg1) {
                this.mHyphenationFrequency = arg1;
                return this;
            }

            @RequiresApi(value=18) public Builder setTextDirection(@NonNull TextDirectionHeuristic arg1) {
                this.mTextDir = arg1;
                return this;
            }
        }

        private final int mBreakStrategy;
        private final int mHyphenationFrequency;
        @NonNull private final TextPaint mPaint;
        @Nullable private final TextDirectionHeuristic mTextDir;
        final PrecomputedText$Params mWrapped;

        @RequiresApi(value=28) public Params(@NonNull PrecomputedText$Params arg2) {
            super();
            this.mPaint = arg2.getTextPaint();
            this.mTextDir = arg2.getTextDirection();
            this.mBreakStrategy = arg2.getBreakStrategy();
            this.mHyphenationFrequency = arg2.getHyphenationFrequency();
            this.mWrapped = arg2;
        }

        Params(@NonNull TextPaint arg3, @NonNull TextDirectionHeuristic arg4, int arg5, int arg6) {
            super();
            this.mWrapped = Build$VERSION.SDK_INT >= 28 ? new PrecomputedText$Params$Builder(arg3).setBreakStrategy(arg5).setHyphenationFrequency(arg6).setTextDirection(arg4).build() : null;
            this.mPaint = arg3;
            this.mTextDir = arg4;
            this.mBreakStrategy = arg5;
            this.mHyphenationFrequency = arg6;
        }

        public boolean equals(@Nullable Object arg5) {
            if((((Params)arg5)) == this) {
                return 1;
            }

            if(arg5 != null) {
                if(!(arg5 instanceof Params)) {
                }
                else if(this.mWrapped != null) {
                    return this.mWrapped.equals(((Params)arg5).mWrapped);
                }
                else {
                    if(Build$VERSION.SDK_INT >= 23) {
                        if(this.mBreakStrategy != ((Params)arg5).getBreakStrategy()) {
                            return 0;
                        }
                        else if(this.mHyphenationFrequency != ((Params)arg5).getHyphenationFrequency()) {
                            return 0;
                        }
                    }

                    if(Build$VERSION.SDK_INT >= 18 && this.mTextDir != ((Params)arg5).getTextDirection()) {
                        return 0;
                    }

                    if(this.mPaint.getTextSize() != ((Params)arg5).getTextPaint().getTextSize()) {
                        return 0;
                    }

                    if(this.mPaint.getTextScaleX() != ((Params)arg5).getTextPaint().getTextScaleX()) {
                        return 0;
                    }

                    if(this.mPaint.getTextSkewX() != ((Params)arg5).getTextPaint().getTextSkewX()) {
                        return 0;
                    }

                    if(Build$VERSION.SDK_INT >= 21) {
                        if(this.mPaint.getLetterSpacing() != ((Params)arg5).getTextPaint().getLetterSpacing()) {
                            return 0;
                        }
                        else if(!TextUtils.equals(this.mPaint.getFontFeatureSettings(), ((Params)arg5).getTextPaint().getFontFeatureSettings())) {
                            return 0;
                        }
                    }

                    if(this.mPaint.getFlags() != ((Params)arg5).getTextPaint().getFlags()) {
                        return 0;
                    }

                    if(Build$VERSION.SDK_INT >= 24) {
                        if(!this.mPaint.getTextLocales().equals(((Params)arg5).getTextPaint().getTextLocales())) {
                            return 0;
                        }
                    }
                    else if(Build$VERSION.SDK_INT >= 17 && !this.mPaint.getTextLocale().equals(((Params)arg5).getTextPaint().getTextLocale())) {
                        return 0;
                    }

                    if(this.mPaint.getTypeface() == null) {
                        if(((Params)arg5).getTextPaint().getTypeface() != null) {
                            return 0;
                        }
                    }
                    else if(!this.mPaint.getTypeface().equals(((Params)arg5).getTextPaint().getTypeface())) {
                        return 0;
                    }

                    return 1;
                }
            }

            return 0;
        }

        @RequiresApi(value=23) public int getBreakStrategy() {
            return this.mBreakStrategy;
        }

        @RequiresApi(value=23) public int getHyphenationFrequency() {
            return this.mHyphenationFrequency;
        }

        @Nullable @RequiresApi(value=18) public TextDirectionHeuristic getTextDirection() {
            return this.mTextDir;
        }

        @NonNull public TextPaint getTextPaint() {
            return this.mPaint;
        }

        public int hashCode() {
            Object[] v0;
            int v1 = 10;
            int v2 = 11;
            int v3 = 9;
            int v4 = 8;
            int v5 = 7;
            int v6 = 6;
            int v7 = 5;
            int v8 = 4;
            int v9 = 3;
            int v10 = 2;
            if(Build$VERSION.SDK_INT >= 24) {
                v0 = new Object[v2];
                v0[0] = Float.valueOf(this.mPaint.getTextSize());
                v0[1] = Float.valueOf(this.mPaint.getTextScaleX());
                v0[v10] = Float.valueOf(this.mPaint.getTextSkewX());
                v0[v9] = Float.valueOf(this.mPaint.getLetterSpacing());
                v0[v8] = Integer.valueOf(this.mPaint.getFlags());
                v0[v7] = this.mPaint.getTextLocales();
                v0[v6] = this.mPaint.getTypeface();
                v0[v5] = Boolean.valueOf(this.mPaint.isElegantTextHeight());
                v0[v4] = this.mTextDir;
                v0[v3] = Integer.valueOf(this.mBreakStrategy);
                v0[v1] = Integer.valueOf(this.mHyphenationFrequency);
                return ObjectsCompat.hash(v0);
            }

            if(Build$VERSION.SDK_INT >= 21) {
                v0 = new Object[v2];
                v0[0] = Float.valueOf(this.mPaint.getTextSize());
                v0[1] = Float.valueOf(this.mPaint.getTextScaleX());
                v0[v10] = Float.valueOf(this.mPaint.getTextSkewX());
                v0[v9] = Float.valueOf(this.mPaint.getLetterSpacing());
                v0[v8] = Integer.valueOf(this.mPaint.getFlags());
                v0[v7] = this.mPaint.getTextLocale();
                v0[v6] = this.mPaint.getTypeface();
                v0[v5] = Boolean.valueOf(this.mPaint.isElegantTextHeight());
                v0[v4] = this.mTextDir;
                v0[v3] = Integer.valueOf(this.mBreakStrategy);
                v0[v1] = Integer.valueOf(this.mHyphenationFrequency);
                return ObjectsCompat.hash(v0);
            }

            if(Build$VERSION.SDK_INT >= 18) {
                v0 = new Object[v3];
                v0[0] = Float.valueOf(this.mPaint.getTextSize());
                v0[1] = Float.valueOf(this.mPaint.getTextScaleX());
                v0[v10] = Float.valueOf(this.mPaint.getTextSkewX());
                v0[v9] = Integer.valueOf(this.mPaint.getFlags());
                v0[v8] = this.mPaint.getTextLocale();
                v0[v7] = this.mPaint.getTypeface();
                v0[v6] = this.mTextDir;
                v0[v5] = Integer.valueOf(this.mBreakStrategy);
                v0[v4] = Integer.valueOf(this.mHyphenationFrequency);
                return ObjectsCompat.hash(v0);
            }

            if(Build$VERSION.SDK_INT >= 17) {
                v0 = new Object[v3];
                v0[0] = Float.valueOf(this.mPaint.getTextSize());
                v0[1] = Float.valueOf(this.mPaint.getTextScaleX());
                v0[v10] = Float.valueOf(this.mPaint.getTextSkewX());
                v0[v9] = Integer.valueOf(this.mPaint.getFlags());
                v0[v8] = this.mPaint.getTextLocale();
                v0[v7] = this.mPaint.getTypeface();
                v0[v6] = this.mTextDir;
                v0[v5] = Integer.valueOf(this.mBreakStrategy);
                v0[v4] = Integer.valueOf(this.mHyphenationFrequency);
                return ObjectsCompat.hash(v0);
            }

            v0 = new Object[v4];
            v0[0] = Float.valueOf(this.mPaint.getTextSize());
            v0[1] = Float.valueOf(this.mPaint.getTextScaleX());
            v0[v10] = Float.valueOf(this.mPaint.getTextSkewX());
            v0[v9] = Integer.valueOf(this.mPaint.getFlags());
            v0[v8] = this.mPaint.getTypeface();
            v0[v7] = this.mTextDir;
            v0[v6] = Integer.valueOf(this.mBreakStrategy);
            v0[v5] = Integer.valueOf(this.mHyphenationFrequency);
            return ObjectsCompat.hash(v0);
        }

        public String toString() {
            StringBuilder v0 = new StringBuilder("{");
            v0.append("textSize=" + this.mPaint.getTextSize());
            v0.append(", textScaleX=" + this.mPaint.getTextScaleX());
            v0.append(", textSkewX=" + this.mPaint.getTextSkewX());
            if(Build$VERSION.SDK_INT >= 21) {
                v0.append(", letterSpacing=" + this.mPaint.getLetterSpacing());
                v0.append(", elegantTextHeight=" + this.mPaint.isElegantTextHeight());
            }

            if(Build$VERSION.SDK_INT >= 24) {
                v0.append(", textLocale=" + this.mPaint.getTextLocales());
            }
            else if(Build$VERSION.SDK_INT >= 17) {
                v0.append(", textLocale=" + this.mPaint.getTextLocale());
            }

            v0.append(", typeface=" + this.mPaint.getTypeface());
            if(Build$VERSION.SDK_INT >= 26) {
                v0.append(", variationSettings=" + this.mPaint.getFontVariationSettings());
            }

            v0.append(", textDir=" + this.mTextDir);
            v0.append(", breakStrategy=" + this.mBreakStrategy);
            v0.append(", hyphenationFrequency=" + this.mHyphenationFrequency);
            v0.append("}");
            return v0.toString();
        }
    }

    class PrecomputedTextFutureTask extends FutureTask {
        class PrecomputedTextCallback implements Callable {
            private Params mParams;
            private CharSequence mText;

            PrecomputedTextCallback(@NonNull Params arg1, @NonNull CharSequence arg2) {
                super();
                this.mParams = arg1;
                this.mText = arg2;
            }

            public PrecomputedTextCompat call() throws Exception {
                return PrecomputedTextCompat.create(this.mText, this.mParams);
            }

            public Object call() throws Exception {
                return this.call();
            }
        }

        PrecomputedTextFutureTask(@NonNull Params arg2, @NonNull CharSequence arg3) {
            super(new PrecomputedTextCallback(arg2, arg3));
        }
    }

    private static final char LINE_FEED = '\n';
    @NonNull private final int[] mParagraphEnds;
    @NonNull private final Params mParams;
    @NonNull private final Spannable mText;
    @Nullable private final PrecomputedText mWrapped;
    @GuardedBy(value="sLock") @NonNull private static Executor sExecutor;
    private static final Object sLock;

    static {
        PrecomputedTextCompat.sLock = new Object();
        PrecomputedTextCompat.sExecutor = null;
    }

    @RequiresApi(value=28) private PrecomputedTextCompat(@NonNull PrecomputedText arg1, @NonNull Params arg2) {
        super();
        this.mText = ((Spannable)arg1);
        this.mParams = arg2;
        this.mParagraphEnds = null;
        this.mWrapped = arg1;
    }

    private PrecomputedTextCompat(@NonNull CharSequence arg2, @NonNull Params arg3, @NonNull int[] arg4) {
        super();
        this.mText = new SpannableString(arg2);
        this.mParams = arg3;
        this.mParagraphEnds = arg4;
        this.mWrapped = null;
    }

    public char charAt(int arg2) {
        return this.mText.charAt(arg2);
    }

    public static PrecomputedTextCompat create(@NonNull CharSequence arg11, @NonNull Params arg12) {
        PrecomputedTextCompat v0;
        Preconditions.checkNotNull(arg11);
        Preconditions.checkNotNull(arg12);
        try {
            TraceCompat.beginSection("PrecomputedText");
            if(Build$VERSION.SDK_INT >= 28 && arg12.mWrapped != null) {
                v0 = new PrecomputedTextCompat(PrecomputedText.create(arg11, arg12.mWrapped), arg12);
                goto label_13;
            }

            goto label_15;
        }
        catch(Throwable v11) {
            goto label_72;
        }

    label_13:
        TraceCompat.endSection();
        return v0;
        try {
        label_15:
            ArrayList v0_1 = new ArrayList();
            int v1 = arg11.length();
            int v3 = 0;
            while(v3 < v1) {
                v3 = TextUtils.indexOf(arg11, '\n', v3, v1);
                if(v3 < 0) {
                    v3 = v1;
                }
                else {
                    ++v3;
                }

                v0_1.add(Integer.valueOf(v3));
            }

            int[] v1_1 = new int[v0_1.size()];
            for(v3 = 0; v3 < v0_1.size(); ++v3) {
                v1_1[v3] = v0_1.get(v3).intValue();
            }

            if(Build$VERSION.SDK_INT >= 23) {
                StaticLayout$Builder.obtain(arg11, 0, arg11.length(), arg12.getTextPaint(), 0x7FFFFFFF).setBreakStrategy(arg12.getBreakStrategy()).setHyphenationFrequency(arg12.getHyphenationFrequency()).setTextDirection(arg12.getTextDirection()).build();
            }
            else if(Build$VERSION.SDK_INT >= 21) {
                new StaticLayout(arg11, arg12.getTextPaint(), 0x7FFFFFFF, Layout$Alignment.ALIGN_NORMAL, 1f, 0f, false);
            }

            v0 = new PrecomputedTextCompat(arg11, arg12, v1_1);
        }
        catch(Throwable v11) {
            goto label_72;
        }

        TraceCompat.endSection();
        return v0;
    label_72:
        TraceCompat.endSection();
        throw v11;
    }

    private int findParaIndex(@IntRange(from=0) int arg5) {
        int v0;
        for(v0 = 0; v0 < this.mParagraphEnds.length; ++v0) {
            if(arg5 < this.mParagraphEnds[v0]) {
                return v0;
            }
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("pos must be less than ");
        v1.append(this.mParagraphEnds[this.mParagraphEnds.length - 1]);
        v1.append(", gave ");
        v1.append(arg5);
        throw new IndexOutOfBoundsException(v1.toString());
    }

    @IntRange(from=0) public int getParagraphCount() {
        if(Build$VERSION.SDK_INT >= 28) {
            return this.mWrapped.getParagraphCount();
        }

        return this.mParagraphEnds.length;
    }

    @IntRange(from=0) public int getParagraphEnd(@IntRange(from=0) int arg4) {
        Preconditions.checkArgumentInRange(arg4, 0, this.getParagraphCount(), "paraIndex");
        if(Build$VERSION.SDK_INT >= 28) {
            return this.mWrapped.getParagraphEnd(arg4);
        }

        return this.mParagraphEnds[arg4];
    }

    @IntRange(from=0) public int getParagraphStart(@IntRange(from=0) int arg4) {
        int v2 = 0;
        Preconditions.checkArgumentInRange(arg4, 0, this.getParagraphCount(), "paraIndex");
        if(Build$VERSION.SDK_INT >= 28) {
            return this.mWrapped.getParagraphStart(arg4);
        }

        if(arg4 == 0) {
        }
        else {
            v2 = this.mParagraphEnds[arg4 - 1];
        }

        return v2;
    }

    @NonNull public Params getParams() {
        return this.mParams;
    }

    @Nullable @RequiresApi(value=28) @RestrictTo(value={Scope.LIBRARY_GROUP}) public PrecomputedText getPrecomputedText() {
        if((this.mText instanceof PrecomputedText)) {
            return this.mText;
        }

        return null;
    }

    public int getSpanEnd(Object arg2) {
        return this.mText.getSpanEnd(arg2);
    }

    public int getSpanFlags(Object arg2) {
        return this.mText.getSpanFlags(arg2);
    }

    public int getSpanStart(Object arg2) {
        return this.mText.getSpanStart(arg2);
    }

    public Object[] getSpans(int arg3, int arg4, Class arg5) {
        if(Build$VERSION.SDK_INT >= 28) {
            return this.mWrapped.getSpans(arg3, arg4, arg5);
        }

        return this.mText.getSpans(arg3, arg4, arg5);
    }

    @UiThread public static Future getTextFuture(@NonNull CharSequence arg1, @NonNull Params arg2, @Nullable Executor arg3) {
        PrecomputedTextFutureTask v0 = new PrecomputedTextFutureTask(arg2, arg1);
        if(arg3 == null) {
            Object v1 = PrecomputedTextCompat.sLock;
            __monitor_enter(v1);
            try {
                if(PrecomputedTextCompat.sExecutor == null) {
                    PrecomputedTextCompat.sExecutor = Executors.newFixedThreadPool(1);
                }

                arg3 = PrecomputedTextCompat.sExecutor;
                __monitor_exit(v1);
                goto label_16;
            label_14:
                __monitor_exit(v1);
            }
            catch(Throwable v2) {
                goto label_14;
            }

            throw v2;
        }

    label_16:
        arg3.execute(((Runnable)v0));
        return ((Future)v0);
    }

    public int length() {
        return this.mText.length();
    }

    public int nextSpanTransition(int arg2, int arg3, Class arg4) {
        return this.mText.nextSpanTransition(arg2, arg3, arg4);
    }

    public void removeSpan(Object arg3) {
        if(!(arg3 instanceof MetricAffectingSpan)) {
            if(Build$VERSION.SDK_INT >= 28) {
                this.mWrapped.removeSpan(arg3);
            }
            else {
                this.mText.removeSpan(arg3);
            }

            return;
        }

        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public void setSpan(Object arg3, int arg4, int arg5, int arg6) {
        if(!(arg3 instanceof MetricAffectingSpan)) {
            if(Build$VERSION.SDK_INT >= 28) {
                this.mWrapped.setSpan(arg3, arg4, arg5, arg6);
            }
            else {
                this.mText.setSpan(arg3, arg4, arg5, arg6);
            }

            return;
        }

        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int arg2, int arg3) {
        return this.mText.subSequence(arg2, arg3);
    }

    public String toString() {
        return this.mText.toString();
    }
}

