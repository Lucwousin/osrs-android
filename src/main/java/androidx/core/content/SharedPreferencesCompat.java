package androidx.core.content;

import android.content.SharedPreferences$Editor;
import androidx.annotation.NonNull;

@Deprecated public final class SharedPreferencesCompat {
    @Deprecated public final class EditorCompat {
        class Helper {
            Helper() {
                super();
            }

            public void apply(@NonNull SharedPreferences$Editor arg1) {
                try {
                    arg1.apply();
                }
                catch(AbstractMethodError ) {
                    arg1.commit();
                }
            }
        }

        private final Helper mHelper;
        private static EditorCompat sInstance;

        private EditorCompat() {
            super();
            this.mHelper = new Helper();
        }

        @Deprecated public void apply(@NonNull SharedPreferences$Editor arg2) {
            this.mHelper.apply(arg2);
        }

        @Deprecated public static EditorCompat getInstance() {
            if(EditorCompat.sInstance == null) {
                EditorCompat.sInstance = new EditorCompat();
            }

            return EditorCompat.sInstance;
        }
    }

    private SharedPreferencesCompat() {
        super();
    }
}

