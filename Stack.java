import java.util.*;
public class Stack{
    int max;
    int top;
    int[] a;
    Stack(int size){
        top=-1;
        max=size;
        a=new int[max];
    }
    void push(int ele){
        if(top==max-1){
            System.out.println("stack is overflow");
            return;
        }
        top++;
        a[top]=ele;
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack is underflow");
            return;
        }
        System.out.println("deleted element is "+a[top]);
        top--;
        }
        void printList()
        {
            if(top==-1)
        {
            System.out.println("stack is underflow");
            return;
        }
        for(int i=top;i>=0;i--)
            System.out.print(a[i]+" ");
        
        }
        void peek(){
            System.out.println("peek element of stack is "+a[top]);
        }
        public static void main(String[] args) {
        Stack list=new Stack(10);
	    list.push(1);
	    list.push(2);
	    list.printList();
	    list.pop();
	    list.printList();
    
	}
}
