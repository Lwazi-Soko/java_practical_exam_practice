import java.util.*;
import java.io.*;

public class Order {
  public static void main(String [] args){
      System.out.println("Enter the name of the word lists text file:");
      Scanner scanner =  new Scanner(System.in);
      Scanner file = null;
      try {
         file =  new Scanner(new FileInputStream(scanner.nextLine()));}
      catch (FileNotFoundException e)
      {System.out.println("could not read in file!");
      }
      
      while (file.hasNextLine()){
         int noOfsolutions = 1 ,max =1 ,length = 1;
         String [] string = file.nextLine().split("\\s+");
         ArrayList<String> lines =  new ArrayList<>();
         for (int n=0 ; n<string.length;n++){
                lines.add(string[n]);
              }
         if (lines.size()==1){System.out.println("Longest is 1.");}
         
         else{
              while(lines.size()>1){
                  if((lines.get(0).compareToIgnoreCase(lines.get(1))) <=0){
                        length++;
                        lines.remove(0);}
                  else{
                        lines.remove(0);
                        if (length>max){max = length;
                            noOfsolutions = 1;}
                        else if(length==max){noOfsolutions++;}length =1;
                        }
                      }
              if (length>max){max = length;
                            noOfsolutions = 1;}
                        else if(length==max){noOfsolutions++;}
              if(noOfsolutions > 1){System.out.println("Multiple solutions length "+max+".");}
              else{System.out.println("Longest is "+max+".");}
              
            }
          }System.out.println("Done");
        }
      }
                          
                        
                        
      
      
      
      