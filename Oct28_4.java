package TestZoho;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Oct28_4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Array Size: ");
        int size=input.nextInt();
        int A[]=new int[size];
        int B[]=new int[size];
        System.out.println("Enter The First Array:");
        for(int index=0;index<size;index++){
            A[index]=input.nextInt();
        }
        System.out.println("Enter the Second Array:");
        for(int index=0;index<size;index++){
            B[index]=input.nextInt();
        }
        Map<Integer,Integer>  map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<A.length;i++){
            map1.put(A[i], map1.getOrDefault(map1.get(A[i]),0)+1);
            map2.put(B[i],map2.getOrDefault(map2.get(B[i]),0)+1);
        }
        if(map1.equals(map2))
            System.out.println("true");
        else System.out.println("false");
    }
}
