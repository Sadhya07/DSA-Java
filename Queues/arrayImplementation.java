package Queues;

public class arrayImplementation {
    public static class queueA{
        int f =-1; //front pointer
        int r = -1; //rear pointer
        
        int size =0;
        int[] arr = new int[100];
        public void add(int val){
            if(r == arr.length -1){
                System.out.println("Queue is full!");
                return;
            }
            if(f==-1) f = r =0; //Base case
            else{
                arr[++r] = val; //ek aage badhaya r ko aur value daal diya
                
            }
            size++;
        }
        public int remove(){
            if(size  ==0){
                System.out.println("Queue is empty !");
                return -1;
            }
            f++;
            size--;
            return arr[f-1]; 
            
        }
        public int peek(){
             if(size  ==0){
                System.out.println("Queue is empty !");
                return -1;
             }
            return arr[f];
        }
        public boolean isEmpty(){
            if(size ==0) return true;
            else return false;
        }
        public void display(){
            if(size ==0) System.out.println("Queue is empty!");
            for(int i=f; i<=r; i++){
                System.out.println(arr[i] +" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        queueA q =new queueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
        
    }
    
}
