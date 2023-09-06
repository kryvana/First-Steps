public class Binary
{
    public static void main(String[] args)
    {
        int number = 76;
        int i = 0;
        int j;
        int[] b = new int[20];
        while (number != 0)
        {
            b[i] = number % 2;
            number = number / 2;
            ++i;
        }
        for ( j = i-1 ; j>=0; j-- )
        {
            System.out.print(b[j]);
        }


    }
}
