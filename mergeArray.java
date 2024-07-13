import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of 1st array:");
        int len = sc.nextInt();
        int[] a = new int[len];
        System.out.println("Enter the 1st array: ");
        for (int i = 0; i < len; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the length of 2nd array:");
        int leng = sc.nextInt();
        int[] b = new int[leng];
        System.out.println("Enter the 2nd array:");
        for (int i = 0; i < leng; i++) {
            b[i] = sc.nextInt();
        }
        int length = len + leng;
        int[] c = new int[length];

        for (int i = 0; i < len; i++) {
                c[i]=a[i];
        }
        for (int i = 0; i < leng; i++) {
            c[len + i] = b[i];
        }
        System.out.println("Merged Array:");
        for(int i=0;i<length;i++){
            System.out.print(c[i]+" ");
        }




     //   System.out.println("Addition of all the elements of Merged array:");
        int sum=0;
        for (int i = 0; i < length; i++) {
              sum+=c[i];

        }
        System.out.println("Addition of all the elements of Merged array:"+sum);

    }
}
