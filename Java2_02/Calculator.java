package Java2_02;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        double sum=0;
        System.out.print("Enter size: ");
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int array[]=new int[n];

        System.out.println("Enter "+n+" integer:");
        for (int i=0;i<n;i++){
            Scanner y=new Scanner(System.in);
            array[i]=y.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println("Element "+i+",typed value was"+array[i]);
            sum+=array[i];
        }
        System.out.printf("Average is %f",sum/n);
    }
}
