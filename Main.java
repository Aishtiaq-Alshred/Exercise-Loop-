import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


//        //sol-1 عن طريق اختيار المستخدم لكن كذا لازم يختبر كل الارقام وبياخذ وقت طويل بطبعها كلها افضل
//        System.out.println("Enter the number from 1 -100");
//        int number;
//        for(int i=1;i<=100;i++){
//            number=input.nextInt();
//
//            if(number % 3==0 && number % 5==0){
//                System.out.println("FizzBuzz  ");
//
//            }else if(number% 3==0){
//                System.out.println("Fizz ");
//
//            } else if( number % 5==0){
//                System.out.println("Buzz ");
//
//            }
//            else System.out.println("the number: "+ number);
//        }

        //sol-1 افضل هذه الطريقه اسرع لطباعه كافه الارقام

        System.out.println(" the number from 1 -100");

        for(int i=1;i<=100;i++){


            if(i % 3==0 && i % 5==0){
                System.out.println("FizzBuzz  ");

            }else if(i% 3==0){
                System.out.println("Fizz ");

            } else if( i % 5==0){
                System.out.println("Buzz ");

            }
            else System.out.println("the number: "+ i);
        }

     // sol-2
        System.out.println("Enter the string");
        String word= input.nextLine();
        StringBuilder reversed = new StringBuilder(word).reverse();
        System.out.println("Reversed string: " + reversed.toString());

     //sol-3
        System.out.println("Enter the number");
        int num = input.nextInt();
        int factorial = 1;

        while (num >= 1) {
            factorial = factorial * num;
            num--;
        }
        System.out.println("The factorial value is: " + factorial);

        //sol-4
        System.out.print("Enter the base: ");
        int base = input.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();


        int result = 1;


        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        System.out.println(base + " ^ " + exponent + " is: " + result);


        //sol-5
        int sumEven = 0;
        int sumOdd = 0;

        for(int i=1;i<=10;i++){
            System.out.println(i);
            if(i %2==0){
                sumEven =sumEven +i;

            }else
                sumOdd=sumOdd+i;
        }
        System.out.println("The number is even"+ sumEven );
        System.out.println("The number is odd"+ sumOdd );

        //sol-6
        System.out.println( " plase enter the number.");
        int num3 = input.nextInt();
        if (num3 < 2) {
            System.out.println(num3 + " is not a prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num3); i++) {
                if (num3 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num3 + " is a prime number.");
            } else {
                System.out.println(num3 + " is not a prime number.");
            }
        }



        input.nextLine();
        //sol-7
        for(int i=1;i<=4;i++){
            System.out.println("Weeks "+i);
            for(int a=1;a<=7;a++){
                System.out.println("Day  "+a);
            }
        }




        //sol-8
        System.out.println("Enter a word: ");
        String word2 = input.nextLine();
        word2 = word2.toLowerCase();
        String reversedWord = new StringBuilder(word2).reverse().toString();
        if (word2.equals(reversedWord)) {
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is not a palindrome.");
        }





    }
}