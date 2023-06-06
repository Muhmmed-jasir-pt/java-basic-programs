import java.util.Scanner;

import java.util.Scanner;
public class sel_srt {
    public static void main(String[] args ){
        Scanner read = new Scanner(System.in);
int[] arr=new int[20];
int l,i,j,temp;
System.out.println("Enter the size of array");
l=read.nextInt();
for (i=0;i<l;i++) {
    System.out.println("Enter the element "+i); 
    arr[i]=read.nextInt(); 
}

for(int k=0;k<l;k++){
for (i=0;i<l;i++) {
    for(j=i+1;j<l;j++){

        if(arr[i]>arr[j])
        {
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    }}}
    for (i=0;i<l;i++) {
    System.out.println(arr[i]); }
    

    }
}
