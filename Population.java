import java.util.*;
import java.io.*;

public class Population{
  public static void main(String[] args){
    Scanner file =null;
    
    Scanner read = new Scanner(System.in);
    System.out.println("Enter the file name:");
    
    try{
      file = new Scanner(new FileInputStream(read.nextLine()));
      }
    catch(FileNotFoundException e){System.out.println("nuh bruh ");return;}
    
    ArrayList<String> critters = new ArrayList<>();
    int size  = Integer.parseInt(file.nextLine());
    critters.add("dud");
    for(int n=0;n<size;n++){
      critters.add(file.nextLine());
      }
    int mating = Integer.parseInt(file.nextLine());
    
    while(file.hasNextLine()){
      String [] mates = file.nextLine().split("\\s+");
      int father_index = Integer.parseInt(mates[0]);
      int mother_index = Integer.parseInt(mates[1]);
      
      String father = critters.get(father_index);
      String mother = critters.get(mother_index);
      
      int difference =  father.length() - mother.length();
      int iterator = 0;
      String append = "";
      if(difference>0){
        append = father.substring(mother.length());
        iterator = mother.length();
        }
      else if(difference<0){append = mother.substring(father.length());
            iterator = father.length();}
      else{iterator = father.length();}
      
      String child ="";
      
      for(int n=0; n<iterator ; n++){
        child = child +String.valueOf(father.charAt(n)) + String.valueOf(mother.charAt(n));
        }
        child = child +append;
        if(child.length()>10){
        String temp="";
            for(int m=0; m<10;m++)
            {temp =temp + String.valueOf(child.charAt(m));
            }child = temp;
            }critters.add(child);
     }
     for (int i=1;i<critters.size(); i++){
       System.out.println("["+critters.get(i)+"]");
       }
   }
  }
       
      
    