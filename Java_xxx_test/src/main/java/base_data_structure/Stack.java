package base_data_structure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack<T> {
    private Class<T> type;
    private T[] arr;
    private int length;//栈的实际大小
    private int size;//数组容量

    public Stack(Class<T> type,int size){
        this.type=type;
        this.arr=(T[]) Array.newInstance(type,size);
        this.size=size;
        length=0;
    }

    public void resize(){
        size*=2;
        T[] temp=(T[]) Array.newInstance(type,size);
        for (int i=0;i<length;i++){
            temp[i]=arr[i];
        }
        this.arr=temp;
    }

    public void push(T a){
        if(length>=size){
            resize();
        }
        arr[length++]=a;
    }

    public T pop(){
        T temp=arr[length-1];
        arr[--length]= null;
        return temp;
    }

    public void printStack(){
        if(length==0){
            System.out.println("This is a empty queue!");
        }else {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        Stack q=new Stack(Integer.class,8);
        q.push(1);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(5);
        q.push(8);
        q.push(13);
        q.push(21);
        q.printStack();
        System.out.println(q.size);

        q.pop();
        q.pop();
        q.printStack();
        System.out.println(q.size);

        q.push(34);
        q.push(54);
        q.push(88);
        q.push(142);
        q.printStack();
        System.out.println(q.size);
    }
}
