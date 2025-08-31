import java.util.*;
import java.io.*;

public class BucketList{
  public static void main(String [] args){
    
    Scanner read = new Scanner(System.in);//for user input 
    
    Scanner read2 = null;//for file 
    System.out.println("Enter the name of the categories file:");
    String lwazi = read.nextLine();
    
    
    try{read2 = new Scanner(new FileInputStream(lwazi));}
    catch(FileNotFoundException e){System.out.println("could not read you file!");
    }
    
    ArrayList<String> list = new ArrayList<String>();
    while(read2.hasNextLine()){
      list.add(read2.nextLine());
      }
    LinkedList<String> [] categorized = new LinkedList[list.size()];
    for(int i = 0;i<categorized.length;i++)
    {
      categorized[i] = new LinkedList<String>();
    }
    ArrayList<String> uncategorized = new ArrayList<String>();
    
    System.out.println("Enter a comma-separated list of words:");
    lwazi = read.nextLine();
    String [] splitted = lwazi.split(",");
    for(int n=0;n<splitted.length; n++)
    {
      splitted[n] = splitted[n].trim();
    }
    
    
    for(String element : splitted){
    int len = 0;
    String update= "";
      for(String category : list){
        if((element.startsWith(category))&&(category.length()>len)){
            update = category;
            len = category.length();
            }
          }
          if(update.isEmpty())
          {
            uncategorized.add(element);
          }
          else{
             int index = list.indexOf(update);
             categorized[index].add(element);
             }
          }
      
      System.out.println("Categorised:");
      for(String category :list){
        System.out.print(category+": ");
        int index = list.indexOf(category);
        if(!(categorized[index].isEmpty())){
        System.out.println(String.join(", ",categorized[index])+".");
            }
        else{System.out.println("");}
       }
       
       if (!(uncategorized.size()==0)){
       System.out.println("Uncategorised:");
       System.out.println(String.join(", ",uncategorized )+".");
       }System.out.println("Done");
      
    }}
        