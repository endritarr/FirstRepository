package Seminari;

public class SalesMan implements Record {
    private int numOfSoldChocolates;
    private Key id;
    private String name;
    private String surname;

    public SalesMan(Key id) {
        this.id = id;
    }

    public SalesMan(int initialSales, Key id) {
        numOfSoldChocolates = initialSales;
        this.id = id;
    }

    public SalesMan(int numOfSoldChocolates, Key id, String name, String surname) {
        this.numOfSoldChocolates = numOfSoldChocolates;
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public Key getKey() {
        return id;
    }

    public int getNumOfSoldCholcolats() {
        return numOfSoldChocolates;
    }

    public void setNumOfSoldCholcolats(int numOfSoldCholcolats) {
        this.numOfSoldChocolates = numOfSoldChocolates;
    }

    public void setId(Key id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void sellChocolate() {
        numOfSoldChocolates++;
    }

    public void sellNChocolates(int n) {
        numOfSoldChocolates = numOfSoldChocolates + n;
    }
}
