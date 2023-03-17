package Execption;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestExecption {

    public static void main(String[] args) {
        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("src/Execption/text.txt"));

            System.out.println(br.readLine());
            br.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found exception .....");
        }catch (IOException e) {
            System.out.println("IO Execption .....");
        }
    }
}
