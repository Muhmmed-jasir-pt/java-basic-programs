import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[50];
        int k;
        System.out.println("Enter the number of elements you want to insert");
        k=sc.nextInt();
        for(int i=0;i<k;i++) {
            System.out.println("Enter the element"+i);
            arr[i]=sc.nextInt();
            //System.out.println("Hello world!");
        }

        System.out.println("Enter the position at which you want to insert data ....");
        int pos=sc.nextInt();
        System.out.println("Enter the element you want to insert @ position "+pos);
        int data=sc.nextInt();
        for(int i=k;i>=pos;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[pos]=data;
        for(int i=0;i<k+1;i++) {
            System.out.println(arr[i]);

            //System.out.println("Hello world!");
        }
    }
}
