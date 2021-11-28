package model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Serializable;
import java.util.Objects;
import java.util.StringJoiner;

public abstract class BaseObject implements Serializable {

    public abstract String toString();
    public abstract boolean equals(Object o);
    public abstract int hashCode() ;
    protected static final Logger log = LogManager.getLogger();
    private static final long serialVersionUID = 6562191742274042053L;

}
