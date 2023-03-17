public class DemoObj {

    public static void main(String[] args) {
        // Create Obj
        // Syntax;
        // ClassType objName = new ClassConstructor()


        person objPerson1 =new person();
        objPerson1.name ="Samnang";
        objPerson1.gender="male";
        objPerson1.dob="02-02-02";
        objPerson1.isSingle =true;

        objPerson1.speak();
        System.out.println(objPerson1);

    }
}
