package relationship;

public class Car {
    private String model;
    private int year;
    private double price;
    private String brand;

    public String getModel() {
        return model;
    }

    public void setModel(String model){
        this.model=model;
    }

    public int getYear(){
        return year;
    }

    public  void  setYear(int year){
        this.year=year;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public  String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }

//    public Car(String model, double price, int year , String brand){
//
//        this.model = model;
//        this.price=price;
//        this.year=year;
//        this.brand =brand;
//    }
}
