import java.util.Scanner;

public class arraySorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of 1st array:");
        int le=sc.nextInt();
        int[] a= new int[le];
        System.out.print("Enter the elements of 1st array:");
        for (int i = 0; i < le; i++) {
            a[i]=sc.nextInt();
        }

        System.out.print("Enter the length of 2nd array:");
        int len=sc.nextInt();
        int[] b= new int[len];
        System.out.print("Enter the elements of 2nd array:");
        for (int i = 0; i < len; i++) {
            b[i]=sc.nextInt();
        }

        System.out.print("Enter the length of 3rd array:");
        int leng=sc.nextInt();
        int[] c=new int[leng];
        System.out.print("Enter the elements of the 3rd array:");
        for (int i = 0; i < leng; i++) {
            c[i]=sc.nextInt();
        }

        int length=le+len+leng;
        int[] arr=new int[length];
        for (int i = 0; i < le; i++) {
           arr[i]=a[i];
        }
        for (int j = 0; j < len; j++) {
            arr[le+j]=b[j];
        }
        for (int k = 0; k < leng; k++) {
            arr[le + len + k] = c[k];
        }

        System.out.println("Merged array:");
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]+" ");
        }


        for (int i = 0; i <length ; i++) {
            for (int j = 0; j <length-i-1; j++) {
               if (arr[j]<arr[j+1]){
                   int temp= arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=temp;
               }
            }
        }
        System.out.println("The Sorted Array=");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
