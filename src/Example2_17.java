//This program illustrates how to read strings and numeric data
import java.util.*;


public class Example2_17{
    static scanner console = new scanner(System.in);

    public static  void main(string[] args)
    {
        string firstName;
        string lastName;

      Object weight;
      System.out.println("Enter first name,age,and weight seperated "
                          + "by spaces:");
                             

        firstName =console.next();
        lastName =console.next();
        Object age = console.nextInt();
        weight = console.nextDouble();
      System.out.println("Name:" + firstName + "" + lastName);
      System.out.println("Age:" + age);
      System.out.println("Weight:" + weight);



    }

}