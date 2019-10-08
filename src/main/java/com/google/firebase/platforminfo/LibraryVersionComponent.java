package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;

public class LibraryVersionComponent {
    private LibraryVersionComponent() {
        super();
    }

    public static Component create(String arg0, String arg1) {
        return Component.intoSet(LibraryVersion.create(arg0, arg1), LibraryVersion.class);
    }
}

