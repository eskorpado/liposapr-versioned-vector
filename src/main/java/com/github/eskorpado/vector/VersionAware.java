package com.github.eskorpado.vector;

/**
 * @author Boris Krutov 22.12.2018
 */
public interface VersionAware {

    default void logInstanceCreated() {
        System.out.println(String.format("%s (v%s) is used to create some instance", getClassName(), getVersion()));
    }

    String getVersion();

    String getClassName();
}
