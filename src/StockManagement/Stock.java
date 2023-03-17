package StockManagement;

public class Stock {

    private int id;
    private String name;
    private double amount;
    private String purchased_date;
    private double price_in;
    private double price_out;
    private String type;

    public Stock(){

    }


    public Stock(int id, String name, double amount, String purchased_date, double price_in, double price_out, String type) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.purchased_date = purchased_date;
        this.price_in = price_in;
        this.price_out = price_out;
        this.type = type;
    }

    //getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPurchased_date() {
        return purchased_date;
    }

    public void setPurchased_date(String purchased_date) {
        this.purchased_date = purchased_date;
    }

    public double getPrice_in() {
        return price_in;
    }

    public void setPrice_in(double price_in) {
        this.price_in = price_in;
    }

    public double getPrice_out() {
        return price_out;
    }

    public void setPrice_out(double price_out) {
        this.price_out = price_out;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
