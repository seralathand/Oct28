package TestZoho;
import java.util.Scanner;
public class Oct28_2 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Array Size:");
        int size=input.nextInt();
        int a[]=new int[size];
        System.out.println("Enter The Array Elements");
        for(int i=0;i<size;i++){
            a[i]=input.nextInt();
        }
        int i=0,j=1;
        while(j<a.length){
            if(a[i]>a[j]) {
                if (j == a.length - 1) {
                    System.out.print(a[i]+" ");
                    i++;
                    j = i+1;
                    continue;
                }
                j++;
            }
            else {
                i=j;
                j++;
            }
        }
        System.out.print(a[a.length-1]);
    }
}
