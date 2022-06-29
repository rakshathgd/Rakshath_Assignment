package corejava.assignments.exception;


import java.util.Scanner;
public class UnsupportedExcep {

    

    static void divide(int a,int b) throws UnsupportedOperationException
    {
        if(b==0)
        {
            throw new UnsupportedOperationException("can't divide");
        }
        else
            System.out.println(a/b);

    }

public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("n1");
            int n1=sc.nextInt();
            System.out.println("n2");
            int n2=sc.nextInt();
            try
            {
                divide(n1,n2);
            }catch(UnsupportedOperationException e)
            {
                System.out.println("Please enter n2 greater than zero");
            }

        }

    }
class UnsupportedOperationException extends Exception{
public UnsupportedOperationException(String string) {
    super(string);
}
}