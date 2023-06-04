import java.util.Scanner;
public class bus {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner read=new Scanner(System.in);
        int len=read.nextInt();
        int temp;
        int[] arr=new int[20];
        for(int i=0;i<len;i++)
        {
            System.out.println("enter the element"+(i));
            arr[i]=read.nextInt();
        }
        int d=len;
        while(d!=0){
        for(int i=0;i<len;i++)
        {
            temp=arr[i+1];
            if((arr[i])>(arr[i+1]))
            {
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }
        d--;
    }
        for(int i=0;i<=len;i++)
        {
            System.out.println(arr[i]);
        }
        
    }}
