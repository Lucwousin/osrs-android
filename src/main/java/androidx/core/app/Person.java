package androidx.core.app;

import android.app.Person$Builder;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;

public class Person {
    public class Builder {
        @Nullable IconCompat mIcon;
        boolean mIsBot;
        boolean mIsImportant;
        @Nullable String mKey;
        @Nullable CharSequence mName;
        @Nullable String mUri;

        public Builder() {
            super();
        }

        Builder(Person arg2) {
            super();
            this.mName = arg2.mName;
            this.mIcon = arg2.mIcon;
            this.mUri = arg2.mUri;
            this.mKey = arg2.mKey;
            this.mIsBot = arg2.mIsBot;
            this.mIsImportant = arg2.mIsImportant;
        }

        @NonNull public Person build() {
            return new Person(this);
        }

        @NonNull public Builder setBot(boolean arg1) {
            this.mIsBot = arg1;
            return this;
        }

        @NonNull public Builder setIcon(@Nullable IconCompat arg1) {
            this.mIcon = arg1;
            return this;
        }

        @NonNull public Builder setImportant(boolean arg1) {
            this.mIsImportant = arg1;
            return this;
        }

        @NonNull public Builder setKey(@Nullable String arg1) {
            this.mKey = arg1;
            return this;
        }

        @NonNull public Builder setName(@Nullable CharSequence arg1) {
            this.mName = arg1;
            return this;
        }

        @NonNull public Builder setUri(@Nullable String arg1) {
            this.mUri = arg1;
            return this;
        }
    }

    private static final String ICON_KEY = "icon";
    private static final String IS_BOT_KEY = "isBot";
    private static final String IS_IMPORTANT_KEY = "isImportant";
    private static final String KEY_KEY = "key";
    private static final String NAME_KEY = "name";
    private static final String URI_KEY = "uri";
    @Nullable IconCompat mIcon;
    boolean mIsBot;
    boolean mIsImportant;
    @Nullable String mKey;
    @Nullable CharSequence mName;
    @Nullable String mUri;

    Person(Builder arg2) {
        super();
        this.mName = arg2.mName;
        this.mIcon = arg2.mIcon;
        this.mUri = arg2.mUri;
        this.mKey = arg2.mKey;
        this.mIsBot = arg2.mIsBot;
        this.mIsImportant = arg2.mIsImportant;
    }

    @NonNull @RequiresApi(value=28) @RestrictTo(value={Scope.LIBRARY_GROUP}) public static Person fromAndroidPerson(@NonNull android.app.Person arg2) {
        Builder v0 = new Builder().setName(arg2.getName());
        IconCompat v1 = arg2.getIcon() != null ? IconCompat.createFromIcon(arg2.getIcon()) : null;
        return v0.setIcon(v1).setUri(arg2.getUri()).setKey(arg2.getKey()).setBot(arg2.isBot()).setImportant(arg2.isImportant()).build();
    }

    @NonNull public static Person fromBundle(@NonNull Bundle arg3) {
        Bundle v0 = arg3.getBundle("icon");
        Builder v1 = new Builder().setName(arg3.getCharSequence("name"));
        IconCompat v0_1 = v0 != null ? IconCompat.createFromBundle(v0) : null;
        return v1.setIcon(v0_1).setUri(arg3.getString("uri")).setKey(arg3.getString("key")).setBot(arg3.getBoolean("isBot")).setImportant(arg3.getBoolean("isImportant")).build();
    }

    @Nullable public IconCompat getIcon() {
        return this.mIcon;
    }

    @Nullable public String getKey() {
        return this.mKey;
    }

    @Nullable public CharSequence getName() {
        return this.mName;
    }

    @Nullable public String getUri() {
        return this.mUri;
    }

    public boolean isBot() {
        return this.mIsBot;
    }

    public boolean isImportant() {
        return this.mIsImportant;
    }

    @NonNull @RequiresApi(value=28) @RestrictTo(value={Scope.LIBRARY_GROUP}) public android.app.Person toAndroidPerson() {
        Person$Builder v0 = new Person$Builder().setName(this.getName());
        Icon v1 = this.getIcon() != null ? this.getIcon().toIcon() : null;
        return v0.setIcon(v1).setUri(this.getUri()).setKey(this.getKey()).setBot(this.isBot()).setImportant(this.isImportant()).build();
    }

    @NonNull public Builder toBuilder() {
        return new Builder(this);
    }

    @NonNull public Bundle toBundle() {
        Bundle v0 = new Bundle();
        v0.putCharSequence("name", this.mName);
        String v1 = "icon";
        Bundle v2 = this.mIcon != null ? this.mIcon.toBundle() : null;
        v0.putBundle(v1, v2);
        v0.putString("uri", this.mUri);
        v0.putString("key", this.mKey);
        v0.putBoolean("isBot", this.mIsBot);
        v0.putBoolean("isImportant", this.mIsImportant);
        return v0;
    }
}

