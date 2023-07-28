import java.util.Scanner;
// number1 ii)
public class Average {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter first number");
        int number1=number.nextInt();
         System.out.println("Enter second number");
        int number2=number.nextInt();
         System.out.println("Enter third number");
        int number3=number.nextInt();
         System.out.println("Enter fourth number");
        int number4=number.nextInt(); 
          System.out.println("Enter fifth number");
        int number5=number.nextInt();
        int sum=number1+number2+number3+number4+number5;
        float average=sum/5;
        System.out.println("average :"+average);

    }
}
