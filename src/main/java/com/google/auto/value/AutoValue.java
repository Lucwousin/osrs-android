package com.google.auto.value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.CLASS) @Target(value={ElementType.TYPE}) @public interface AutoValue {
    @Retention(value=RetentionPolicy.CLASS) @Target(value={ElementType.TYPE}) @public interface Builder {
    }

    @Retention(value=RetentionPolicy.CLASS) @Target(value={ElementType.TYPE, ElementType.METHOD}) @public interface CopyAnnotations {
        Class[] exclude();
    }

}

