public class person {
    String name;
    String gender;
    String dob;
    boolean isSingle ;

    person() {


    }
    void speak() {
        System.out.println(name + " can speak");

    }
    void  walk() {
        System.out.println("Person can walk");
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", isSingle=" + isSingle +
                '}';
    }
}
