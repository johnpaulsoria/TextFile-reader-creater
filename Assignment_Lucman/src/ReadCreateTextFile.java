//Shahani D. Lucman
//Module Assignment

//Dito nagsisimula ang Code
//import all the libraries needed for this assignment
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadCreateTextFile {
    public static void main(String[] args) {
        //create a String Variable that will name the txt file
        String Filename_Input = "userList.txt";
        String Filename_username = "username.txt";
        String Filename_password = "password.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(Filename_Input));
            BufferedWriter userWriter = new BufferedWriter(new FileWriter(Filename_username));
            BufferedWriter passWriter = new BufferedWriter(new FileWriter(Filename_password));
            String line = reader.readLine();
            int lineNumber = 1;
            while (line != null) {
                if (lineNumber % 2 == 1) {
                    // odd numbered line from userList will write to username.txt file
                    userWriter.write(line);
                    userWriter.newLine();
                } else {
                    // even numbered line from userList will write to password.txt file
                    passWriter.write(line);
                    passWriter.newLine();
                }
                lineNumber++;
                line = reader.readLine();
            }
            reader.close();
            userWriter.close();
            passWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
//Dito nagtatapos ang Code