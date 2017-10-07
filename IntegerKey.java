package Seminari;

public class IntegerKey implements Key {
    private int key; // the integer key

    /**
     * Constructor IntegerKey constructs the key
     *
     * @param i - the integer that uniquely defines the key
     */
    public IntegerKey(int i) {
        key = i;
    }

    /**
     * equals compares this Key to another for equality
     *
     * @param anotherKey- the other key
     * @return true, if this key equals k's; return false, otherwise
     */
    public boolean equals(Key anotherKey) {
        return (key == ((IntegerKey) anotherKey).getInt());
    }

    /**
     * getInt returns the integer value held within this key
     */
    public int getInt() {
        return key;
    }

    public boolean lessthan(Key anotherKey) {
        int m = ((IntegerKey) anotherKey).getInt();
        return (key < m);
    }
}
