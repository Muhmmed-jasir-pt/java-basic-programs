import java.util.Scanner;
public class ssort {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner read=new Scanner(System.in);
        int len=read.nextInt();
        String temp;
        String[] arr=new String[20];
        for(int i=0;i<len;i++)
        {
            System.out.println("enter the element"+(i));
            arr[i]=read.next();
        }
        int d=len;
        while(d!=0){
        for(int i=0;i<len-1;i++)
        {
            temp=arr[i+1];
            if(((arr[i].compareTo(arr[i+1]))<0))
            {
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }
        d--;
    }
        for(int i=0;i<=len-1;i++)
        {
            System.out.println(arr[i]);
        }
        
    }}
