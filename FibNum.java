public class FibNum {

    public static void main(String[] args)
    {
    if(args.length!=1)
    {
        System.out.println("This program accepts command line arguments from the user to compute the Fibonacci numbers that corresponds");
        System.exit(1);
    }

    int n = Integer.parseInt(args[0]);

    if(n<0)
    {
        System.out.println("Please enter a number that is not negative");
        System.exit(1);
    }

    System.out.print(Fib(n));
}

private static int Fib(int n)
{
    if (n<= 1)
    {
        return n;
    }
    return Fib(n-1)+Fib(n-2);
}

}