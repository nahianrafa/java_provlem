
package com.mycompany.productfile;
     import java.util.Scanner;


public class LargestNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your 2nd number: ");
        int num2 = input.nextInt();
        System.out.print("Enter your 3rd number: ");
        int num3 = input.nextInt();
        
        int largest;
        
        if(num1>=num2 && num1<=num3){
            largest=num1;        
        }
        else if(num2>=num1 && num2<=num3){
            largest=num2;        
        }
        else{
            largest = num3;
        }
        System.out.println("The largest num = "+largest);
        
    }
}
   
