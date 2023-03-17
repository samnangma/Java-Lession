package StockManagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;


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
    void displayProducts(List<Stock>  stockList){
        for ( int i = 0; i < stockList.size(); i++) {
            Stock stock = stockList.get(i);
            System.out.printf("Id = %d Product_name = %s Amount = %.2f Purchased_date = %s Price_in = %.2f Price_out = %.2f Type = %s" ,
                    stock.getId(), stock.getName(), stock.getAmount(),stock.getPurchased_date(),stock.getPrice_in(),stock.getPrice_out(),stock.getType());

            System.out.println();
        }
    }

    void displayProductsByType(Connection connection, Main main){

       // String query = "SELECT * FROM products WHERE type='accessories'";

        List<Stock> stocktList = new ArrayList<>();
        try {
            Scanner sc = new Scanner(System.in);
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products WHERE type = ?");

            System.out.print("Enter the type of product: ");
            String type= sc.next();
            preparedStatement.setString(1,type);

            ResultSet resultSet = statement.executeQuery(preparedStatement.toString());

            while (resultSet.next()){

                Stock stock  = new Stock();
                stock.setId(resultSet.getInt("id"));
                stock.setName(resultSet.getString("Product_name"));
                stock.setAmount(resultSet.getDouble("Amount"));
                stock.setPurchased_date(resultSet.getString("Purchased_Date"));
                stock.setPrice_in(resultSet.getDouble("Price_in"));
                stock.setPrice_out(resultSet.getDouble("Price_out"));
                stock.setType(resultSet.getString("Type"));

                // add student object to student's list
                stocktList.add(stock);
            }
            main.displayProducts(stocktList);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    void updateoldProduct(Connection connection, Main main){
        try {
            Scanner sc =new Scanner(System.in);
            int oldAmount = 0;
            int id = 0;

            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products WHERE product_name = ?");
            preparedStatement.setString(1,sc.next());
            List<Stock> stocktList = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery(preparedStatement.toString());
            while (resultSet.next()){

                Stock stock  = new Stock();
                stock.setId(resultSet.getInt("id"));
                stock.setName(resultSet.getString("Product_name"));
                stock.setAmount(resultSet.getDouble("Amount"));
                stock.setPurchased_date(resultSet.getString("Purchased_Date"));
                stock.setPrice_in(resultSet.getDouble("Price_in"));
                stock.setPrice_out(resultSet.getDouble("Price_out"));
                stock.setType(resultSet.getString("Type"));
                oldAmount=resultSet.getInt("amount");
                id=resultSet.getInt("id");

                stocktList.add(stock);
            }
            main.displayProducts(stocktList);
            System.out.print("Enter the new Amount : ");
            int newAmount=sc.nextInt();
            PreparedStatement statement1 = connection.prepareStatement("UPDATE products SET amount=? WHERE id = ?  ");
            statement1.setInt(1,newAmount+oldAmount);
            statement1.setInt(2,id);
            statement1.execute();
            preparedStatement.execute();
            System.out.println("update Successfully ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    void insertNewProducts(Connection connection, Main main){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the new Name : ");
            String name = sc.next();
            System.out.print("Enter the new Amount : ");
            int amount = sc.nextInt();
            System.out.print("Enter the new Price_in : ");
            int price_in = sc.nextInt();
            System.out.print("Enter the new Price_out : ");
            int price_out = sc.nextInt();
            System.out.print("Enter the new Type : ");
            String type = sc.next();
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT INTO products (product_name , amount , price_in , price_out , type ) VALUES (?,?,?,?,?)");
            preparedStatement.setString(1,name);
            preparedStatement.setDouble(2,amount);
            preparedStatement.setInt(3,price_in);
            preparedStatement.setInt(4,price_out);
            preparedStatement.setString(5,type);
            preparedStatement.executeUpdate();
            System.out.println("insert Successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    void deleteProductstById (Connection connection, Main main){
        try {
            Scanner sc = new Scanner(System.in);
            PreparedStatement stock = connection.prepareStatement("DELETE FROM products WHERE id = ?");
            System.out.print("Enter ID : ");
            int id = sc.nextInt();
            stock.setInt(1,id);
            stock.executeUpdate();
            System.out.println("Delete Successfully");

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    void alertProducts(Connection connection, Main main) {
        try{

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Amount : ");
            int amount = sc.nextInt();
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products WHERE amount < ? ");
            preparedStatement.setInt(1,amount);
            List<Stock> stocktList = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery(preparedStatement.toString());
            while (resultSet.next()){

                Stock stock  = new Stock();
                stock.setId(resultSet.getInt("id"));
                stock.setName(resultSet.getString("Product_name"));
                stock.setAmount(resultSet.getDouble("Amount"));
                stock.setPrice_in(resultSet.getDouble("Price_in"));
                stock.setPrice_out(resultSet.getDouble("Price_out"));
                stock.setType(resultSet.getString("Type"));

                stocktList.add(stock);
            }
            main.displayProducts(stocktList);


            preparedStatement.execute();
            System.out.println("Stock Alert Successfully");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }

    void fetchProductData(Connection connection, Main main){
        String query = "SELECT * FROM products ORDER BY id DESC ";

        List<Stock> stocktList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){

                Stock stock  = new Stock();
                stock.setId(resultSet.getInt("id"));
                stock.setName(resultSet.getString("Product_name"));
                stock.setAmount(resultSet.getDouble("Amount"));
                stock.setPurchased_date(resultSet.getString("Purchased_Date"));
                stock.setPrice_in(resultSet.getDouble("Price_in"));
                stock.setPrice_out(resultSet.getDouble("Price_out"));
                stock.setType(resultSet.getString("Type"));
                // add student object to student's list
                stocktList.add(stock);
            }
            main.displayProducts(stocktList);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        Main main = new Main();
        Connection connection = main.getConnection();
        Scanner scanner = new Scanner(System.in);
        int ch;
        do{
            System.out.println("Welcome to Stock Management System ");
            System.out.println("1.DISPLAY All Products");
            System.out.println("2.INSERT New Products");
            System.out.println("3.Update Old Stock");
            System.out.println("4.DISPLAY Products By Type");
            System.out.println("5.Stock Alert");
            System.out.println("6.DELETE");
            System.out.print("Enter your Choice: ");
            ch = scanner.nextInt();

            switch (ch){
                case 1:
                    main.fetchProductData(connection,main);
                    break;
                case 2:
                    main.insertNewProducts(connection,main);
                    break;
                case 3:
                    main.updateoldProduct(connection,main);
                    break;
                case 4:
                    main.displayProductsByType(connection,main);
                    break;
                case 5:
                    main.alertProducts(connection,main);
                    break;
                case 6:
                    main.deleteProductstById(connection,main);
                    break;

            }
        }while(ch!=0);


    }
}
