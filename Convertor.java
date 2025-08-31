import java.util.Scanner;

public class Convertor{
  public static void main(String[] args)
  {
    Scanner scanner =  new Scanner(System.in);
    System.out.println("Enter a time or 'quit':");
    String string = scanner.nextLine();
    
         
    while(!(string.equalsIgnoreCase("quit"))){
      String[] stringer  = string.split(":");
      int minutes = Integer.parseInt(stringer[1]);
      int hour  = Integer.parseInt(stringer[0]);
      
      time(minutes,hour);
      //System.out.println(oclock);
      System.out.println("Enter a time or 'quit':");
      string = scanner.nextLine();
        
    }System.out.println("Done");
    }
    
    
    
    
    public static boolean isAccurate(int minutes){
      if((minutes%5)!=0){return false;}
      return true;
      
     }
     
    public static String hourMethod(int hour){
    
    String[] string = {"twelve","one","two","three","four","five","six","seven","eight","nine","ten","eleven"};
    return string[hour%12];
    }
    
    
    public static String minuteMethod(int minutes){
      String[] string  = {"o'clock","five past","ten past","quarter past","twenty past","twenty five past","half past","twenty five to","twenty to","quarter to","ten to","five to"};
      if(minutes%5 == 0){
      return string[minutes/5];}
      else{
        int rem = minutes%5;
        if((rem==1)||(rem==2))
        {
          return "about " + string[(minutes - rem) / 5];

        }
        else if ((rem==3)||(rem==4)){
        int approximate = minutes +(5-rem);
        if(approximate == 60)
        {
          minuteMethod(0);
        }
        return "about "+string[ (approximate)/5];
        }
    }return "there is an error";
    }
  
      
      public static void time(int mins,int hour){
        if((mins>=33)&&(mins<=57)){
         System.out.println(minuteMethod(mins)+" " + hourMethod(hour+1));}
        if (mins>57){System.out.println("about "+hourMethod(hour+1)+" o'clock");}
        if(mins==0){System.out.println(hourMethod(hour)+" "+minuteMethod(mins));}
        if((mins<33)&&(mins>=3)){
          System.out.println(minuteMethod(mins)+" " + hourMethod(hour));}
        else if((mins<3)&&!(mins==0)){System.out.println("about "+hourMethod(hour)+" o'clock");}
          
          }
         
      
    
    
   }
   

    