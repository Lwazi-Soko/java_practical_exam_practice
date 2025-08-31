import java.time.*;
import java.util.*;
import java.io.*;

public class Oddities{

  public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the name of the text file of dates:");
      String line = scan.nextLine();
      Scanner reader = null;
      
      try {
           reader = new Scanner(new FileInputStream(line));
          }catch(FileNotFoundException e){System.out.println("File not available!");}
      
      line = reader.nextLine();
      //int n=0;
      
      String [] string = line.split("/");
      int [] numbers = new int [string.length];
      for(int n = 0;n<string.length; n++){
        numbers[n] = Integer.parseInt(string[n].trim());
        }
       LocalDate date1 = LocalDate.of(numbers[2], numbers[1],numbers[0]);
       
       