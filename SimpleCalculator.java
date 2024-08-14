import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] Operators = {"(1) Addition","(2) Subtraction","(3) Multiplication","(4) Division"};
        for(String x:Operators){
            System.out.println(x);
        }

        int num1 = sc.nextInt();
        
        System.out.print("Enter the operator no");
        int operator = sc.nextInt();
        int num2 = sc.nextInt();
        switch(operator){
            case 1:
            System.out.print(num1+" + "+num2+" = "+(num1+num2));
            break;
            case 2:
            System.out.print(num1+" - "+num2+" = "+(num1-num2));
            break;
            case 3:
            System.out.print(num1+" x "+num2+" = "+(num1/num2));
            break;
            case 4:
            System.out.print(num1+" / "+num2+" = "+(num1+num2));
            break;
        }
        
        
    }
}
