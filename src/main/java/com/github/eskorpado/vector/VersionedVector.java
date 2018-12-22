package com.github.eskorpado.vector;

import java.util.Vector;

public class VersionedVector<T> extends Vector<T> implements VersionAware {

    private static final String CLASS_NAME = VersionedVector.class.getSimpleName();

    private static final String VERSION = "2.0";

    public VersionedVector() {
        super();
        logInstanceCreated();
	}

    @Override
    public String getVersion() {
        return VERSION;
    }

    @Override
    public String getClassName() {
        return VersionAware.class.getSimpleName();
    }
}
