import java.util.Scanner;
public class  calculations
{
    public static void main(String [] args)
    {
        System.out.println("Find sum of tow numbers");
        System.out.println("Enter any two numbers");
        Scanner s= new Scanner(System.in);
        System.out.print("Enter first number:");
        // boolean b7=s.hasNextInt();
        //System.out.println(b7);
        int x= s.nextInt();
        System.out.print("Enter second number:");
        //boolean b8 =s.hasNextInt();
        //System.out.println(b8);
        int y= s.nextInt();
        int sum=x+y;
        System.out.println("Sum of these two numbers is:");
        System.out.println(sum);


        // sum ok now find substration


        System.out.println("Find the substration of two numbers");
        System.out.println("Enter any two numbers");
        System.out.print("Enter the first number:");
        Scanner a= new Scanner(System.in);
        boolean b5=a.hasNextInt();
        System.out.println(b5);
        int ab=a.nextInt();
        System.out.print("Enter second number:");
        boolean b6=a.hasNextInt();
        System.out.println(b6);
        int bc=a.nextInt();
        int substration=ab-bc;
        System.out.println("Substration of thers tow number is:");
        System.out.println(substration);


        // Substration ok now find product


        System.out.println("Find the product of two numbers:");
        System.out.println("Enter any two numbers");
        System.out.print("Enter the first number:");
        Scanner q=new Scanner(System.in);
        boolean b3=q.hasNextInt();
        System.out.println(b3);
        int as=q.nextInt();
        System.out.print("Enter the second number:");
        boolean b4=q.hasNextInt();
        System.out.println(b4);
        int qw=q.nextInt();
        int product=as*qw;
        System.out.println("Product of these two numbers is:");
        System.out.println(product);


        //product ok now division


        System.out.println("Find the division of two numbers");
        System.out.println("Enter any two numbers");
        System.out.println("Enter the first number:");
        Scanner ty= new Scanner(System.in);
        boolean b1=ty.hasNextFloat();
        System.out.println(b1);
        float op=ty.nextInt();
        System.out.println("Enter the second number:");
        boolean b2=ty.hasNextFloat();
        System.out.println(b2);
        float kl=ty.nextFloat();
        float division=op/kl;
        System.out.println("Division of two numbers is:");
        System.out.println(division);
    }
}