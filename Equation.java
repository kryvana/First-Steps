public class Equation // the program solves all the types of equations second grade
{
    public static void main(String[] args)
    {
        double a, b, c, re, im;//a,b,c are the coefficients of the equation second grade; re and im are the real and imaginary parts
        a = 1;
        b = 4;
        c = 7;
        double discr = b * b - 4 * a * c;
        re = -b / (2 * a);
        im = Math.sqrt(Math.abs(discr)) / (2 * a);
        double x;
        System.out.println("Equation:\n "+a+"x^2+"+b+"x+"+c+"=0");
        if (discr == 0)
        {
            x = re;
            System.out.printf("One solution: %.2f\n",x);
        }//two digits after comma and a new line
        else if (discr > 0)
         {
                double x1 = re - im;
                double x2 = re + im;
                System.out.printf("Two solutions:\n %.2f and %.2f",x1,x2);
         }
             else
             {
                //String x3 = re ±i* im;
                System.out.printf("Two solutions: \n %.2f \u00B1 i*%.2f ",re,im);
             }
        }
    }
