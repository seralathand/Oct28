package TestZoho;

import java.util.Arrays;
import java.util.Scanner;

public class Oct28_3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Array Size:");
        int size=input.nextInt();
        int a[]=new int[size];
        System.out.println("Enter The Array Elements");
        for(int i=0;i<size;i++){
            a[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(a));
        int max=0;
        int window=1;
       while(window<a.length){
           int start=0,end=window;
           while(end<a.length){
               if(sum(a,start,end)==true) {
                   max = Math.max((end - start) + 1, max);
                   start=0;
                   break;
               }
               else{
                   start++;
                   end++;
               }
           }
           window++;
       }
        System.out.println(max);
    }

    public static boolean sum(int a[],int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=a[i];
        }
        if(sum==0)
            return true;
        return false;
    }
}
