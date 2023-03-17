package relationship;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.setModel("A16");
        bmw.setDescription("latest version");
        bmw.setBrand("BMW");
        bmw.setPrice(50000);
        Engine engine = new Engine();
        engine.setPower("v6 power");
        bmw.setEngine(engine);

        System.out.println(bmw.getEngine().getPower());

    }


}
