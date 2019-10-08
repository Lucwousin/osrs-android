package com.appsflyer;

public class AFVersionDeclaration {
    private static String googleSdkIdentifier;

    private AFVersionDeclaration() {
        super();
    }

    public static void init() {
        AFVersionDeclaration.googleSdkIdentifier = "!SDK-VERSION-STRING!:com.appsflyer:af-android-sdk:4.9.0";
    }
}

