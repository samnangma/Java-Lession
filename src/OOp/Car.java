package OOp;

public class Car {
    // data member
    private String model;
    private double price;
    private int years;
    private String brand;

    public double getPrice(){
        return price;
    }

    public void  setPrice( double price){
        this.price =price;
    }
    public int getYears(){
        return years;
    }
    public void setYears(int years){
        this.years = years;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }

    public void setModel (String model){
        this.model = model;
    }
    public  Car() {

    }

    public Car(String model, double price, int years ,String brand){

            this.model = model;
            this.price = price;
            this.years = years;
            this.brand = brand;


    }
}

