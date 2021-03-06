/**
 * Benjamin Estrada
 * 04/29/2020
 * The programs job is to convert a given temperature value into Fahrenheit, Celsius, or Kelvin..
 */
import java.util.Scanner;

public class TempConvert {
    public static void main(String args[]){
       // call the method processData();
       processData();
   }


   // processData method
   public static void processData()
   {
       // create object for scanner class
       Scanner scan = new Scanner(System.in);

       // iterate the loop until user wants to quit
       while(true)
       {
           // ask user to enter temperature
           System.out.println("Enter the temperature to convert:");

           // read temperature from user
           double temp = scan.nextDouble();
      
           // ask user to enter current scale of the temperature
           System.out.println("Enter the current scale of the temperature:");

           // read current scale of the temperature from user
           String current = scan.next();
  
           // ask user to enter scale that user wants to convert the temperature to
           System.out.println("Enter the scale you want to convert the temperature to:");

           // read the scale that user wants to convert the temperature to
           String destination = scan.next();
      
           // call the method checkValidity() by passing temperature and current scale of the temperature
           if(checkValidity(temp,current))
           {
               // declare a variable result to store result
               double result = temp;

               // if the current scale is Fahrenheit
               if(current.compareTo("Fahrenheit")==0)
               {
                   // if the destination scale is celsius
                   if(destination.compareTo("Celsius")==0)
                   {
                       // call the method convertFahtoCel() by passing temperature to convert and store the value returned into result variable
                       result = convertFahtoCel(temp);
                   }
                   else if(destination.compareTo("Kelvin")==0)
                   {
                       // call the method convertFahtoKel() by passing temperature to convert and store the value returned into result variable
                       result = convertFahtoKel(temp);
                   }
              
               }
               // if current scale is celsius
               else if(current.compareTo("Celsius")==0) 
               {
                   // if the destination scale is Fahrenheit
                   if(destination.compareTo("Fahrenheit")==0)
                   {
                       // call the method convertCeltoFah() by passing temperature to convert and store the value returned into result variable
                       result = convertCeltoFah(temp);
                   }
                   // if the destination scale is kelvin
                   else if(destination.compareTo("Kelvin")==0)
                   {
                       // call the method convertCeltoKel() by passing temperature to convert and store the value returned into result variable
                       result = convertCeltoKel(temp);
                   }
              
               }
               if(current.compareTo("Kelvin")==0)
               {
                   // if the destination scale is celsius
                   if(destination.compareTo("Celsius")==0)
                   {
                       // call the method convertKeltoCel() by passing temperature to convert and store the value returned into result variable
                       result = convertKeltoCel(temp);
                   }
                   // if the destination scale is Fahrenheit
                   else if(destination.compareTo("Fahrenheit")==0)
                   {
                       // call the method convertKeltoFah() by passing temperature to convert and store the value returned into result variable
                       result = convertKeltoFah(temp);
                   }
              
               }
               // print the result
               System.out.printf("%.2f degrees %s is %.2f degrees %s\n", temp, current, result, destination);
           }
           else
           {
               // print the error message
               System.out.printf("%.2f degrees %s is not a valid temperature\n", temp, current);
           }
          
           // ask user want to continue
           System.out.println("Would you like to convert another temperature? Enter quit to exit.");

           // read the user opinion
           String opinion = scan.next();

           // check if the user opinion is quit
           if(opinion.compareTo("quit")==0)
           {
               // break the loop and stop program
               break;
           }

       }

      
   }
  
   // checkValidity method
   public static boolean checkValidity(double temp, String scale)
   {
       // declare a boolean variable to store the status
       boolean flag = false;

       // if the current scale is Fahrenheit
       if(scale.compareTo("Fahrenheit")==0)
       {
           // assign true to flag if the temperature is between -459.40 and 1000 inclusive
           if(temp>=(-459.40) && temp<=1000)
           {
               flag = true;
           }
       }
       else if(scale.compareTo("Celsius")==0)
       {
           // assign true to flag if the temperature is between -273.40 and 1000 inclusive
           if(temp>=(-273) && temp<=1000)
           {
               flag = true;
           }
       }
       else if(scale.compareTo("Kelvin")==0)
       {
           // assign true to flag if the temperature is between 0 and 1000 inclusive
           if(temp>=0 && temp<=1000)
           {
               flag = true;
           }
       }
       // return status
       return flag;
   }

   // method to convert Fahrenheit to Celsius
   public static double convertFahtoCel(double temp){
       return (temp - 32) * (5/9.0);
   }

   // method to convert Fahrenheit to Kelvin
   public static double convertFahtoKel(double temp){
       return ((temp - 32) * (5/9.0))+(273.15);
   }

   // method to convert Celsius to Fahrenheit
   public static double convertCeltoFah(double temp){
       return (temp * 9/5.0) + 32;
   }
  
   // method to convert Celsius to Kelvin
   public static double convertCeltoKel(double temp){
       return temp+(273.15);
   }

   // method to convert Kelvin to Celsius
   public static double convertKeltoCel(double temp){
       return temp-(273.15);
   }
  
   // method to convert Kelvin to Fahrenheit
   public static double convertKeltoFah(double temp){
       temp = temp - (273.15);
       return (temp * 9/5.0) + 32; 
   }
}