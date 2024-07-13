import java.util.Scanner;
import java.lang.*;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int len= sc.nextInt();
        int [] a =new int[len];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < len; i++) {
            a[i]= sc.nextInt();
        }
        // Bubble Sorting
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i-1; j++){
              if(a[j]<a[j+1]){
                  int temp=a[j+1];
                  a[j+1]=a[j];
                  a[j]=temp;
              }
            }
        }
        // Normal Sorting
       /*/ for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++){
                if(a[j]<a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        */
        System.out.println("Sorted Array:");
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);
        }

    }
}
