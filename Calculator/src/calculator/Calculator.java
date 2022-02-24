package calculator;
import java.util.*;
import java.math.*;

public class Calculator {
    public static void main(String[] arsg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("select the Operation :");
        System.out.println("+ --> Addition");
        System.out.println("- --> Subtraction");
        System.out.println("* --> Multiplication");
        System.out.println("/ --> Division");
        System.out.println("sin --> Sin value");
        System.out.println("cos --> Cos value");
        System.out.println("tan --> Tan value");
        System.out.println("cot --> Cot value");
        String operator = sc.nextLine();
        System.out.println("Enter the values:");
        double n1;//= sc.nextDouble();
        double n2;//=sc.nextDouble();


        Calculator obj = new Calculator();
        Addition obj1 = new Addition();
        Subtraction obj2 = new Subtraction();
        Multiplication obj3 = new Multiplication();
        Division obj4 = new Division();
        Modulus obj5 = new Modulus();
        Trigonometry obj6 = new Trigonometry();


        switch (operator) {
            case ("+"): {
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                System.out.println("Addition : " + obj1.add(n1, n2));
                break;
            }
            case ("-"): {
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                System.out.println("Subtraction :" + obj2.subtraction(n1, n2));
                break;
            }
            case ("*"): {
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();

                System.out.println(("Multiplication :" + obj3.multiplication(n1, n2)));
                break;
            }
            case ("/"): {
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                System.out.println("Division :" + obj4.Division(n1, n2));
                break;
            }
            case ("%"): {
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                System.out.println("Modulus :" + obj5.modulus(n1, n2));
                break;
            }





    case("sin"):{
                double v1= sc.nextDouble();
                System.out.println("Sin value :"+obj6.sin(v1));
                break;
            } case("cos"):{
                double v1=sc.nextDouble();
                System.out.println("Cos value: "+obj6.cos(v1));
                break;
            } case("tan"):{
                double v1=sc.nextDouble();
                System.out.println("Tan value: "+obj6.tan(v1));
                break;
            } case("cot"):{
                double v1=sc.nextDouble();
                System.out.println("Cot value"+obj6.cot(v1));
                break;
            } default:{

                System.out.println("Complete!");
                break;
            }

        }
    }

}
