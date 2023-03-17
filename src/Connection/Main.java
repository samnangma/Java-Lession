package Connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {

    Connection getConnection(){
        String connectionUrl = "jdbc:postgresql://localhost:5432/postgres";
        Properties properties = new Properties();
        properties.put("user", "postgres");
        properties.put("password","12345");
        try {
            Connection connection = DriverManager.getConnection(connectionUrl, properties);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

//    public static void main(String[] args) {
//        Main main = new Main();
//        Connection connection = main.getConnection();
//        String query = "SELECT * FROM student";
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()){
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                int age = resultSet.getInt("age");
//                String gender = resultSet.getString("gender");
//
//
//                System.out.printf("Id : " + id);
//                System.out.printf("Name : " + name);
//                System.out.printf("Age : " + age);
//                System.out.printf("Gender : " + gender);
//                System.out.println(" ");
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

//    }

    void displayStudents(List<Student> studentList){
        for ( int i = 0; i < studentList.size(); i++) {
            Student stu = studentList.get(i);
            System.out.printf("Id = %d Name = %s Age = %d Gender = %s" ,
                    stu.getId(), stu.getName(), stu.getAge(), stu.getGender());

            System.out.println();
        }
    }
    void fetchStudentData(Connection connection, Main main){
        String query = "SELECT * FROM student";

        List<Student> studentList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){

                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setAge(resultSet.getInt("age"));
                student.setGender(resultSet.getString("gender"));
                // add student object to student's list
                studentList.add(student);
            }
            main.displayStudents(studentList);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    void  updateStudent(Connection connection, Main main){
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE student SET name = ? WHERE id = ?");
            ps.setString(1,"KAKA");
            ps.setInt(2,7);
            ps.executeUpdate();

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    void deleteStudentById(Connection connection, Main main){
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM student WHERE id = ?");
            ps.setInt(1,2);
            ps.executeUpdate();

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    void insertNewStudent(Connection connection, Main main){
        String insertSQL = "INSERT INTO student VALUES(20,'Tara',25,'Male')";

        try {
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT INTO student VALUES (?,?,?,?)");
            preparedStatement.setInt(1,21);
            preparedStatement.setString(2,"New Name");
            preparedStatement.setInt(3,26);
            preparedStatement.setString(4,"Female");
            preparedStatement.executeUpdate();
            System.out.println("insert Successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Connection connection = main .getConnection();

        //insert new Student
//        main.insertNewStudent(connection,main);\

        // update new Student
//       main.updateStudent(connection,main);

        main.deleteStudentById(connection,main);

        // fetch data from students table
        main.fetchStudentData(connection,main);
    }

//    public static void main(String[] args) {
//        Main main   = new Main();
//
//        Connection connection = main.getConnection();
//        List<Student> studentList = new ArrayList<>();
//        String query = "SELECT * FROM student";
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()) {
//                Student student = new Student();
//
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                int age = resultSet.getInt("age");
//                String gender = resultSet.getString("gender");
//
//                student.setId(id);
//                student.setAge(age);
//                student.setName(name);
//                student.setGender(gender);
//                studentList.add(student);
//            }
//            main.displayStudents (studentList);
//        }
//        catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
