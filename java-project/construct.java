public class construct
{
    public static void main(String args[])
    {
        Math func = new Math();

        func.nine();

        // System.out.println(calc(1, 2, 3));
    }

    public static int calc(int num1, int num2, int num3)
    {
        int result = num1 + num2 + num3;

        return result;
    }
}

class Math
{
    public void nine()
    {
        String sign = " * ";

        for( int i = 0; i <= 9; i++ ) 
        {
            for( int j = 0; j <= i; j++)
            {
                System.out.print( i + sign + j + " = " + (i * j) + "   " );
            }
            System.out.println("");
        }

    }
}