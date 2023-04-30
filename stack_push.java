import java.util.Scanner;
class stack{

    int max=10;
    char stk[]= new char[max];

    int top=-1;
void push( char a)
{
    if (top==max-1)
    {
        System.out.println("Stack Overflow");
        top++;
for(int i=0;i<10;i++)
{
    System.out.println(stk[i]);
}
    }
    else {
        top++;
        stk[top]=a;
        System.out.println("Value inserted @ "+top);
    }
}


}
public class Main {
    public static void main(String[] args) {
stack s1= new stack();
while(s1.top < s1.max) {
    System.out.println("Enter the character to push");
    Scanner myobj=new Scanner(System.in);
    char ch=myobj.next().charAt(0);
    s1.push(ch);
}

    }
}
