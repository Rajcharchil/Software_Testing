package javaEclipse;
import java.util.*;

//public class FirstDay {
//	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the first number: ");
//        int number1 = scanner.nextInt();
//
//        System.out.print("Enter the second number: ");
//        int number2 = scanner.nextInt();
//
//        int sum = number1 + number2;
//
//        System.out.println("The sum is: " + sum);
//
//
//    }
//}

////=============================================================


//
//public class FirstDay {
//  public static void main(String[] args) {
//    Scanner myObj = new Scanner(System.in);  
//    System.out.print("enter the first number:");
//    int number1 = myObj.nextInt();  
//    
//    System.out.print("enter the second number:");
//    int number2 = myObj.nextInt();
//    
//    
//    
//    int add = number1 + number2;
//    int sub = number1 - number2;
//    int mul = number1 * number2;
//    int div = number1 / number2;
//    
//    
//    
//    System.out.println(" Addition of two numbers is : " + add); 
//    System.out.println(" subtraction of two numbers is : " + sub); 
//    System.out.println(" multiplication of two numbers is : " + mul); 
//    System.out.println(" division of two numbers is : " + div); 
//  }
//}


////=======================================================================



//public class FirstDay {
//
//    public static void main(String[] args) {
//
//        Scanner evenOrodd = new Scanner(System.in);
//
//        System.out.print("Enter any number: ");
//        int num = evenOrodd.nextInt();
//
//        if(num % 2 == 0)
//            System.out.println(num + " is even");
//        else
//            System.out.println(num + " is odd");
//        evenOrodd.close();
//    }
//}
////=============================

//public class FirstDay{
//	public static void main(String[] args) {
//		for(int i=1; i<=10; i++) 
//			System.out.print(i);
//		
//	}
//}

//// =================================================================

//public class FirstDay {bj8
//
//	public static void main(String[] args) {
//	
//		String str1 = "Computer-";
//		String str2 = "-Science";
//		
//		String result = str1+str2;
//		
//		System.out.println(result);
//
//		
//	}
//}

////================================================================================

//crate a calculator

//
//public class FirstDay {
//    public static void main(String[] args) {
//        
//        Scanner scanner = new Scanner(System.in);
//
//        
//        System.out.print("Enter first number: ");
//        double num1 = scanner.nextDouble();
//
//        
//        System.out.print("Enter second number: ");
//        double num2 = scanner.nextDouble();
//
//      
//        System.out.print("Enter an operator (+, -, *, /): ");
//        char operator = scanner.next().charAt(0);
//
//        double result;
//
//        
//        switch (operator) {
//            case '+':
//                result = num1 + num2;
//                break;
//            case '-':
//                result = num1 - num2;
//                break;
//            case '*':
//                result = num1 * num2;
//                break;
//            case '/':
//                if (num2 != 0) {
//                    result = num1 / num2;
//                } else {
//                    System.out.println("Error: Division by zero is not allowed.");
//                    return;
//                }
//                break;
//            default:
//                System.out.println("Error: Invalid operator. Please use one of +, -, *, /.");
//                return;
//        }
//
//       
//        System.out.println("The result of the operation is: " + result);
//    }
//}


//// write the java largest number
import java.util.Scanner;

public class FirstDay {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print(" first number:");
        int num1 = scanner.nextInt();

        System.out.print(" second number:");
        int num2 = scanner.nextInt();

        System.out.print("third number:");
        int num3 = scanner.nextInt();

        
        int largest = Math.max(num1, Math.max(num2, num3));

        
        System.out.println("The largest number is: " + largest);
    }
}





















