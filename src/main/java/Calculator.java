import static java.lang.Integer.valueOf;

public class Calculator
{
    public static void main(String[] args)
    {
        int arg1 = valueOf(args[0]);
        int arg2 = valueOf(args[1]);
        System.out.println(arg1+arg2);
    }
}
