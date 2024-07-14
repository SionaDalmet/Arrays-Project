import java.util.Scanner;

public class reverseArray {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array:");
        int leng=sc.nextInt();
        int[] a=new int[leng];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < leng; i++) {
            a[i]=sc.nextInt();
        }
        int[] temp=new int[leng];
        System.out.println("Reverse of the given array:");
        for (int i =0; i < leng; i++) {
                temp[leng-i-1]=a[i];
        }

       // System.out.println("Reverse of the given array:");
       for (int i = 0; i < leng; i++) {
          System.out.println(temp[i]);
       }
        }
    }

