import java.util.*;
public class level3_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float num1, num2;
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        float temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The swapped numbers are "+num1+" and "+num2);
    }
}
