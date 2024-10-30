import java.util.InputMismatchException;
import java.util.MissingFormatWidthException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        /*Ex1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
          two numbers , takes two numbers as input */
//        int number1 = 0;
//        int number2 = 0;
//        try {
//            System.out.print("Please enter the first number: ");
//            number1 = input.nextInt();
//
//            System.out.print("Please enter the second number: ");
//            number2 = input.nextInt();
//
//            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
//            System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
//            System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
//
//            if (number2 == 0) {
//                throw new ArithmeticException("Divide by zero.");
//            }
//            System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
//            System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
//
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a valid integer.");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


        /*Ex2. Write a Java program that takes a number as input and prints its multiplication table up to 10. */
//        try {
//            System.out.println("Please enter a number to calculate the multiplication table :  ");
//            int number =input.nextInt();
//            System.out.println("Multiplication table for " + number);
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(number + " x " + i + " = " + (number * i));
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a valid integer.");
//        }


        /*Ex3. Write a Java program to print the area and perimeter of a circle.*/
//        try {
//            double radius = getRadius(input);
//            double pi = 3.142857142857143;
//            double perimeter = 2 * pi * radius;
//            double area = pi * (radius * radius);
//            System.out.println("Perimeter is = " + perimeter);
//            System.out.println("Area is = " + area);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a valid number.");
//        }


        /*Ex4.  Java program to find out the average of a set of integers */
//        try {
//            int count = getCount(input);
//            int sumNumber = getSum(input, count);
//            double average = sumNumber / count;
//            System.out.println("The average is: " + average);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a valid integer.");
//        }

        /*Ex5. Write a Java program that accepts three integers as input, adds the first two integers
          together, and then determines whether the sum is equal to the third integer. */
//        try {
//            System.out.print("Please Input the first number: ");
//            int number1 = getValidatedInput(input);
//
//            System.out.print("Please Input the second number: ");
//            int number2 = getValidatedInput(input);
//
//            System.out.print("Please Input the third number: ");
//            int number3 = getValidatedInput(input);
//
//            if (number1 + number2 == number3) {
//                System.out.println("The result is: true");
//            } else {
//                System.out.println("The result is: false");
//            }
//        } catch (Exception e) {
//            System.out.println( e.getMessage());
//        }


        /*Ex6. Write a Java program to reverse a word.*/
//        try {
//            System.out.print("Please write a word to reverse: ");
//            String word = input.nextLine();
//            if (word.isEmpty()) {
//                throw new IllegalArgumentException("Input cannot be empty.");
//            }
//            String revWord = "";
//            for (int i = word.length() - 1; i >= 0; i--) {
//                revWord += word.charAt(i);
//            }
//            System.out.println("Reversed word: " + revWord);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        /*Ex7 -  Java program to check whether the given number is even or odd*/
//        try {
//            System.out.print("Please enter a number to check if it is even or odd: ");
//            int number = input.nextInt();
//            if (number % 2 == 0) {
//                System.out.println("The number is Even.");
//            } else {
//                System.out.println("The number is Odd.");
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a valid integer.");
//        }

        /*Ex8 - Java program to convert the temperature in Centigrade to Fahrenheit */
//        try {
//            System.out.print("Please enter temperature in Centigrade: ");
//            int centigrade = input.nextInt();
//            double fahrenheit = centigrade * 1.8 + 32;
//            System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter an integer value for temperature.");
//        } catch (Exception e) {
//            System.out.println( e.getMessage());
//        }
        /*Ex9.Write a Java program that takes a string and a number from the user,then prints the
character in the given index. */
//        try {
//            System.out.print("Please input a String: ");
//            String aString = input.nextLine();
//            System.out.print("Please input an index number: ");
//            int numIndex = input.nextInt();
//            if (numIndex < 0 || numIndex >= aString.length()) {
//                throw new IndexOutOfBoundsException("Index out of range.");
//            }
//            System.out.println("The character at index " + numIndex + " is " + aString.charAt(numIndex));
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter an integer for the index.");
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }


        /*Ex10. Write a Java program to print the area and perimeter of a rectangle.*/
//        try {
//            System.out.print("Please enter Width of Rectangle: ");
//            double width = input.nextDouble();
//            System.out.print("Please enter Height of Rectangle: ");
//            double height = input.nextDouble();
//
//            if (width <= 0 || height <= 0) {
//                throw new IllegalArgumentException("Width and height must be positive numbers.");
//            }
//            double area = width * height;
//            double perimeter = 2 * (width + height);
//            System.out.println("Area is " + width + " * " + height + " = " + area);
//            System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a valid number.");
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        /*Ex11. Write a Java program to compare two numbers. */
//
//        try {
//            System.out.println("Please Input the first number: ");
//            int number1 = input.nextInt();
//            System.out.println("Please Input the second number: ");
//            int number2 = input.nextInt();
//
//            if (number1 == number2) {
//                System.out.println(number1 + " == " + number2);
//            } else {
//                System.out.println(number1 + " != " + number2);
//            }
//            if (number1 > number2) {
//                System.out.println(number1 + " > " + number2);
//            } else {
//                System.out.println(number1 + " < " + number2);
//            }
//            if (number1 >= number2) {
//                System.out.println(number1 + " >= " + number2);
//            } else {
//                System.out.println(number1 + " <= " + number2);
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter valid integers.");
//        }


        /*Ex12. Write a Java program to convert seconds to hours, minutes and seconds. */

//       try {
//           System.out.println("Please input seconds:");
//           int inputSecond = input.nextInt();
//           countSeconds(inputSecond);
//       }catch (IllegalArgumentException e) {
//           System.out.println(e.getMessage());
//       }

        /*Ex13. Write a Java program that accepts four integers from the user and prints equal if all
four are equal, and not equal otherwise. */

//        try {
//            System.out.println("Please enter four integers:");
//            System.out.print("Enter first number: ");
//            int number1 = input.nextInt();
//            System.out.print("Enter second number: ");
//            int number2 = input.nextInt();
//            System.out.print("Enter third number: ");
//            int number3 = input.nextInt();
//            System.out.print("Enter fourth number: ");
//            int number4 = input.nextInt();
//
//            if (number1 == number2 && number2 == number3 && number3 == number4) {
//                System.out.println("Numbers are equal.");
//            } else {
//                System.out.println("Numbers are not equal!");
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter valid integers.");
//        }
        /*Ex14. Write a Java program that reads an integer and check whether it is negative, zero, or
          positive.*/
//        try {
//            System.out.println("Please enter a number: ");
//            int number = input.nextInt();
//
//            if (number > 0) {
//                System.out.println("Number is positive.");
//            } else if (number < 0) {
//                System.out.println("Number is negative.");
//            } else {
//                System.out.println("Number is zero.");
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a valid integer.");
//        }


        /*Ex15.Write a program to enter the numbers till the user wants and at the end it
           should display the count of positive, negative and zeros entered  (End loop use -1 ,
           Don’t count -1).*/
//        int countPositive = 0;
//        int countNegative = 0;
//        int countZero = 0;
//
//        while (true) {
//            try {
//                System.out.println("Please enter a number: ");
//                String userInput = input.next();
//                int number = Integer.parseInt(userInput);
//                if (number == -1) {
//                    break;
//                }
//                if (number > 0) {
//                    countPositive++;
//                } else if (number < 0) {
//                    countNegative++;
//                } else {
//                    countZero++;
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input. Please enter an integer.");
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        System.out.println(countPositive +" positive \n"+countNegative+" negative \n"+countZero+" zero");


        /*Ex16 - Write a program that prompts the user to input an integer and then outputs the
          number with the digits reversed. */
//        try {
//            System.out.println("Please enter an integer number: ");
//            int number = input.nextInt();
//            int revNumber = 0;
//            while (number != 0) {
//                int n = number % 10;
//                revNumber = revNumber * 10 + n;
//                number /= 10;
//            }
//            System.out.println("Reversed number: " + revNumber);
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a valid integer.");
//        }

        /*Ex17 - Write a program to enter the numbers till the user wants and at the end the
          program should display the largest and smallest numbers entered. */
//        int large = Integer.MIN_VALUE;
//        int small = Integer.MAX_VALUE;
//        int number;
//
//        System.out.println("Please enter numbers or -1 to stop");
//
//        while (true) {
//            try {
//                System.out.print("Enter number: ");
//                number = input.nextInt();
//                if (number == -1) {
//                    break;
//                }
//                if (number > large) {
//                    large = number;
//                }
//                if (number < small) {
//                    small = number;
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid input. Please enter an integer.");
//                break;
//            } catch (Exception e) {
//                break;
//            }
//        }
//        System.out.println("The largest number: " + large);
//        System.out.println("The smallest number: " + small);

        /*Ex18 - Determine and print the number of times the character ‘a’ appears in the input
          entered by the user. */
//        try {
//            System.out.println("Please Enter String: ");
//            String inputString = input.nextLine();
//
//            if (inputString == null || inputString.isEmpty()) {
//                throw new NullPointerException("Input string cannot be null or empty");
//            }
//
//            int count = 0;
//            for (int i = 0; i < inputString.length(); i++) {
//                if (inputString.charAt(i) == 'a') {
//                    count++;
//                }
//            }
//            System.out.println("Number of a's: " + count);
//        } catch (Exception e) {
//            System.out.println( e.getMessage());
//        }


    }

    //3
    public static double getRadius(Scanner input) throws IllegalArgumentException {
        System.out.print("Please enter the Radius of the circle: ");
        double radius = input.nextDouble();
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        return radius;
    }

    //4
    public static int getCount(Scanner input) throws IllegalArgumentException {
        System.out.print("Please enter the count of numbers to find out the average: ");
        int count = input.nextInt();
        if (count <= 0) {
            throw new IllegalArgumentException("Count must be positive integer.");
        }
        return count;
    }
    public static int getSum(Scanner input, int count) {
        int sumNumber = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter an integer: ");
            while (true) {
                try {
                    int number = input.nextInt();
                    sumNumber += number;
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Invalid input. Please enter an integer: ");
                    input.next();
                }
            }
        }
        return sumNumber;
    }

    //5
    public static int getValidatedInput(Scanner input) {
        while (true) {
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a valid integer: ");
                input.next();
            }
        }
    }

    //12
    public static void countSeconds(int inputSecond) throws IllegalArgumentException {
        if (inputSecond < 0) {
            throw new IllegalArgumentException("Input cannot be negative.");
        }

        int hours = 0;
        int minutes = 0;
        int seconds = inputSecond;

        while (seconds >= 3600) {
            hours++;
            seconds -= 3600;
        }
        while (seconds >= 60) {
            minutes++;
            seconds -= 60;
        }

        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }

}