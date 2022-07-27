import java.util.*;
class recursion{

    //print n to 1 using recursion
    static Scanner sc= new Scanner(System.in);
    static void rec1(int n)
    {
        if(n==0) return;
        System.out.print(n+" ");
        rec1(n-1);
    }
    static void print_n_to_1()
    {
        int n= sc.nextInt();
        rec1(n);
        System.out.println("\n");
    }

    //print 1 to n using recursion
    static void rec2(int n)
    {
        if(n==0) return;
        rec2(n-1);
        System.out.print(n+" ");
    }
    static void print_1_to_n()
    {
        int n= sc.nextInt();
        rec2(n);
        System.out.println("\n");
    }
    
    //prints the binary representaion on a decimal value.
    static String binary_conversion(int n)
    {
        //This code prints the binary converstion in right order
        //as the modification in the return statement.
        //We are adding the last value to the first in the string
        //check the commented code for actual scenario what is happening 
        //here without modification.
        /*
         * if(n==0) return;
         * binary_conversion(n/2);
         * System.out.println(n%2)
         * 
         * for example: input -> 8
         * fun(8)
         * |  ->fun(4)
         * |      ->fun(2)
         * |          ->fun(1)
         * |               ->fun(0) no calls further more. return nothing.
         * 
         * in this the control will go till fun(0) first as the recursion is happneing first
         * then at 0 it will not return a thing control goes to fun(1) it will print 1%2 fun(1) finished control 
         * goes back to fun(2) and so on. This will print the binary representation in reverse order.
         */
        String s="";
        if(n==0) return "";
        String temp=binary_conversion(n/2);
        int x=n%2;
        return temp+s+(char)(x+'0');
    }
    static void binary_representation()
    {
        int n=sc.nextInt();
        //the function below will return the binary representation in reverse order 
        //so you have to reverse it first.
        String s= binary_conversion(n);
        System.out.println(s);

    }

    //prints the nth fibonachi number.
    static int fib(int n)
    {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
    static void nth_fibonacchi()
    {
        int n= sc.nextInt();
        int res= fib(n);
        System.out.println(res);
    }

    //sum of n natural numbers using recursion.
    //for sum of n natural no.s the formula is n*(n-1)/2 
    static int sum(int n)
    {
        if(n==0) return 0;
        return n + sum(n-1);
    }
    static void natural_Sum()
    {
        int n= sc.nextInt();
        System.out.println(sum(n));
    }

    //String palindrone using recursion.
    static boolean palindrone_check(String str, int start, int end)
    {
        if(start>=end) return true; 
        return str.charAt(start)==str.charAt(end) && palindrone_check(str, start+1, end-1);
    }
    static void palindrone()
    {
        System.out.print("Enter the string : ");
        sc.nextLine();
        String str= sc.nextLine();
        System.out.println(palindrone_check(str,0,str.length()-1));
    }

    //
    public static void main(String[] args)
    {
        //recursion basic programs
        System.out.println("1 -> For print n to 1.");
        System.out.println("2 -> For print 1 to n.");
        System.out.println("3 -> For print binary representation of a number using recursion.");
        System.out.println("4 -> Nth term in fibonacchi series.");
        System.out.println("5 -> Sum of N natural numbers.");
        System.out.println("6 -> String palindrone checker.");

        System.out.print("Enter choice : ");
        int choice=sc.nextInt();


        switch(choice)
        {
            case 1: print_n_to_1();
                    break;
            case 2: print_1_to_n();
                    break;
            case 3: binary_representation();
                    break;
            case 4: nth_fibonacchi();
                    break;
            case 5: natural_Sum();
                    break;
            case 6: palindrone();
                    break;
            case 7:
            default: break;
        }
    }
}