public class stack {
    private int size = 1000;
    private int[] array = new int[size];
    private int top = -1;

    stack(){
        top = 0;
    }

    void push(int data){
        array[top+1] = data;
        top = top + 1;
    }

    int pop(){
        if(top == -1){
            System.out.println("Empty");
            System.exit(1);
        }
        top = top - 1;
        return array[top+1];
    }

    int peek(){
        if(top == -1){
            System.out.println("Empty");
            System.exit(1);
        }
        return array[top];
    }

    int size(){
        return top+1;
    }
}


