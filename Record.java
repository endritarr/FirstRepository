package Seminari;

/**
 * Record is a data item that can be stored in a database
 */
public interface Record {
    /**
     * getKey returns the key that uniquely identifies the record
     *
     * @return the key
     */
    public Key getKey();
}

