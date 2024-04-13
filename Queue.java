public class Queue {
    int front,rear,max;
    int que[];
    Queue(int size){
        front=-1;
        rear=-1;
        max=size;
        que=new int[max];
    }
    void insert(int d){
        if(rear==max-1){
            System.out.println("full");
            return;
        }
        if(front==-1&&rear==-1){
            front=rear=0;
            que[rear]=d;
            return;
            
        }
        rear++;
        que[rear]=d;
    }
    void delete(){
        if(front==-1){
            System.out.println("empty");
            return;
        }
        int ele=que[front];
        if(rear==front){
            front=rear=-1;
        }
        front++;
    }
    void printList(){
        if(front==-1){
            System.out.print("empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.println(que[i]+" ");
        }
    }
    public static void main(String[]args){
        Queue qq=new Queue(5);
        qq.insert(10);
        qq.insert(20);
        qq.insert(30);
        qq.insert(40);
        qq.insert(50);
        qq.printList();
        System.out.println();
        qq.delete();
        qq.delete();
        qq.delete();
        qq.printList();
        qq.insert(60);
    }
}

