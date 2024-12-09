public class queue {
    private int size, start, end;
    private int[] array;

    public queue() {
        array = new int[16];
        start = -1;
        end = -1;
    }

    public queue(int maxSize) {
        this.size = maxSize;
        array = new int[maxSize];
        start = -1;
        end = -1;
    }

    void push(int data){
        if(end == size - 1){
            System.out.println("Full");
            System.exit(1);
        }
        if(end == -1){
            start = 0;
            end = 0;
        }
        else{
            end = (end + 1) % size;
        }
        array[end] = data;
    }

    int pop(){
        if(start == -1){
            System.out.println("Empty");
            System.exit(1);
        }
        if(end - start + 1 == 0){
            end = -1;
            start = -1;
        }else{
            start = (start + 1) % size;
        }
        return array[start - 1];
    }

    int peek(){
        if(start == -1){
            System.out.println("Empty");
            System.exit(1);
        }
        return array[start];
    }

    int size(){
        if(start == -1){
            System.out.println("Empty");
            System.exit(1);
        }
        return end-start+1;
    }

    public static void main(String[] args) {
        queue q = new queue(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.peek());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.peek());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}
