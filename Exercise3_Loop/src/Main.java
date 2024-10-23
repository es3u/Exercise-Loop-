import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ////// System.out.println("Hello world!");


        Scanner input = new Scanner(System.in);



//1.Write a program that prints the numbers from 1 to 100 such that:
//If the number is a multiple of 3, you need to print "Fizz" instead of that number.
//If the number is a multiple of 5, you need to print "Buzz" instead of that number.
//If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.





        for (int i = 1; i <=100 ; i++) {


            if(i%3 == 0 && i% 5 == 0 ) {
                System.out.println("FizzBuzz");
                continue;
            }
            if(i%3 == 0) {
                System.out.println("Fizz");
                continue;
                }

            if(i%5 == 0) {
                System.out.println("Buzz");
                continue;
                }

            System.out.println(i);
        }

        /////////////////////////////////////////end

//        2.Write a Java program to reverse a string.
//        Test Data: Input a string: The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT


        int j=0;

        do{
            System.out.println("pleas enter your sentence ");
            String i = input.nextLine();
             j = i.length()-1;

            //i.charAt(i.length()-j + );

           System.out.println( i.charAt(j) + i.substring(j));
           System.out.println(j);
            j--;

        }while(j != 0);

/////////////////////////////////////////end
//
//        3.Write a program to find the factorial value of any number entered through the keyboard.
            int fac= 1;
            System.out.println("enter your number");
        for (int i = input.nextInt(); i >= 1 ; i--) {


            fac = fac *i;

        }

        System.out.print(fac);

/////////////////////////////////////////end

//        4.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
//        (Do not use Java built-in method)
        System.out.println("pleas enter two your number");
        int pwr = input.nextInt();
        int pwr1 = input.nextInt();

        while (pwr1>1){




            pwr = pwr * pwr;
            System.out.println(pwr);
            pwr1--;
        }

/////////////////////////////////////////end
//        5.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        int even = 0;
        int odd = 0 ;
        int i2;
             do{
         System.out.println("enter your number or 0 to exit");
                i2 = input.nextInt();
         if(i2 % 2 == 0) {
             even = even +i2;


         }else
             odd =odd +i2;



     }while(i2 != 0);

     System.out.println("even is "+ even);
     System.out.println("odd is " + odd);
/////////////////////////////////////////end


//   6.Write a program that prompts the user to input a positive integer.
//   It should then output a message indicating whether the number is a prime number.
//
//
        int i1;
       do{
           System.out.println(" please enter prime number or 0 to exit");
           i1 = input.nextInt();
           if(i1==2) {
               System.out.println(" prim number");
               break;

           }else if(!(i1%2==0)){
                   System.out.println(" prim number");
           break;
           }

       }while(i1!= 0);
        /////////////////////////////////////////end

//        7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.
//        Expected Output:
//        Week 1 Day1 Day2 Day3 Day4 Day5 Day6 Day7 Week 2 Day1 Day2
//...


//        for (int i = 1; i <= 4 ; i++) {
//            System.out.println("week "+ i);
//            for (int j = 1; j <=7 ; j++) {
//                System.out.println("Day "+ j);
//
//
//            }
//
//        }

        /////////////////////////////////////////end


//        8.Write a program thats check if the word is a palindrome or not.
//        hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.
//
            String word ;
            String word1 = "palindrome";
            String word2 = "emordnilap";

        do{
            System.out.println("enter your word or out ");
             word = input.nextLine();
            //boolean a = word.matches(word);


            if(word.equals(word1) || word.equals(word2)){

                System.out.println("true");
                    break;
            }

        }while(!(word.equals("out")));
        /////////////////////////////////////////end














    }}
