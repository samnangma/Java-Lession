package relationship;

public class BMW extends Car {

    private String description;
    private Engine engine;

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public Engine getEngine(){
        return engine;
    }

    public void setEngine(Engine engine){
        this.engine= engine;
    }

}
