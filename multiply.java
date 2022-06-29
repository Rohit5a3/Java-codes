package coding;

import java.sql.SQLOutput;
import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        int mul;
        Scanner sc=new Scanner(System.in);
        System.out.println("---------");
        System.out.print("Enter the value of mul:");
        mul=sc.nextInt();
        for (int x = 1; x < 11; x++) {
            System.out.println(mul+"*"+x+"="+mul*x);
        }
    }
}

