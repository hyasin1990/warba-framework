package testing;

import java.util.List;

public class myTestClass {

    public static void main(String[] args) {
       compute(4);
    }


    public static void compute (int number)
    {
        try {
            for (int i=0;i<number;i++)
            {
                System.out.println(number);
            }
        } catch (ArithmeticException ignored)
        {
            System.out.println("Exception is caught");
        }
    }

}
