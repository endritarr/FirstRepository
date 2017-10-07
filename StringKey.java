package Seminari;

/**
 * StringKey models a key that is a string
 */
public class StringKey implements Key {
    private String s;

    public StringKey(String j) {
        s = j;
    }

    public String getString() {
        return s;
    }

    @Override
    public boolean equals(Key m) {
        if (this == m) return true;
        if (!(m instanceof StringKey)) return false;

        StringKey stringKey = (StringKey) m;

        return s.equals(stringKey.s);
    }
}
