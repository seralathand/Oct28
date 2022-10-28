package TestZoho;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Oct28_5 {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the K value: ");
//        int kValue=input.nextInt();
//        System.out.println("Enter The Array Size:");
//        int size=input.nextInt();
//        int a[]=new int[size];
//        System.out.println("Enter The Array Elements");
//        for(int i=0;i<size;i++) {
//            a[i] = input.nextInt();
//        }

        int a[]={1,7,4,3,3,3,4,8,7};
        int kValue=3;
        Map<Integer,Integer> map=new HashMap<>();
        for(int index=0;index<a.length;index++){
            if(map.containsKey(a[index])){
                map.put(a[index],map.get(a[index])+1);
                if(map.get(a[index])==kValue) {
                    System.out.println(a[index]);
                    System.exit(0);
                    break;
                }
            }
            else
                map.put(a[index],1);
        }
        System.out.println("No Elements Grater than K.");
    }
}
