package Seminari;

public class Manager implements Record {
    private SalesMan[] salesPeople;
    private int totalSales;
    private Key key;
    private String name;
    private String surname;

    public Manager() {
    }

    public Manager(Key key) {
        this.key = key;
    }

    public Manager(String name) {
        this.name = name;
    }

    public Manager(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Manager(Key id, String name, String surname){
        this.key = id;
        this.name = name;
        this.surname = surname;
    }

    public Manager(int initialSales) {
        totalSales = initialSales;
    }

    public Manager(SalesMan[] salesPeople) {
        this.salesPeople = salesPeople;
    }

    public Manager(SalesMan[] salesPeople, int initalSales, Key key, String name, String surname) {
        this.salesPeople = salesPeople;
        totalSales = initalSales;
        this.key = key;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public Key getKey() {
        return key;
    }

    public SalesMan[] getSalesPeople() {
        return salesPeople;
    }

    public void setSalesPeople(SalesMan[] salesPeople) {
        this.salesPeople = salesPeople;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surname;
    }

    public void setSurName(String surname) {
        this.surname = surname;
    }

    public int calculateTotalSales(){
        for (int i = 0; i < salesPeople.length; i++){
            totalSales = totalSales + salesPeople[i].getNumOfSoldCholcolats();
        }
        return totalSales;
    }

    public int salesReportOfSalesMan(int salesManKey){
        return salesPeople[salesManKey].getNumOfSoldCholcolats();
    }
}
