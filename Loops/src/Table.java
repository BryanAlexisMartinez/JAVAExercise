import java.util.Scanner;

    public class Table
    {
        public static void main(String[] args)
        {
            Scanner console = new Scanner(System.in);
            int num;
            
            System.out.print("Enter any positive integer: ");
            num = console.nextInt();
                    
            System.out.println("Multiplication Table of " + num);
            
           //TODO implement While loop to get print result
            int mult = 1;
            while (mult <= 10) {
                int result = num * mult;
                System.out.println(num + " x " + mult + " = " + result);
                mult++;
            }
        }
    }