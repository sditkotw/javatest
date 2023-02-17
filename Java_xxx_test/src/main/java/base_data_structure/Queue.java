package base_data_structure;

import java.lang.reflect.Array;

public class Queue<T> {
    private Class<T> type;
    private T[] arr;
    private int length;//队列的当前长度
    private int size;//数组容量
    private int start;//队列的起始下标

    public Queue(Class<T> type,int size){
        this.arr = (T[]) Array.newInstance(type,size);
        this.size=size;
        this.type=type;
        length=0;
        //Arrays.toString(arr);
    }

    public void resize(){
        //存满3/4，扩容移位;未存满3/4，直接移位
        if(length>size*3/4){
            size*=2;
        }

        T[] temp=(T[]) Array.newInstance(type,size);;

        for (int i=0;i<length;i++){
            temp[i]=arr[i+start];
        }
        this.arr=temp;
        this.start=0;
    }

    public int getSize(){
        return this.length;
    }
    public void push(T a){
        //第一次push定位start
        if(length==0)start=0;

        //需要扩容的情况
        if(start+length>=size){
            resize();
        }

        arr[start+length]=a;
        length++;
    }

    public T pop(){
        if(length==0){
            return null;
        }
        length--;
        return arr[start++];
    }

    public void printQueue(){
        if(length==0){
            System.out.println("This is a empty queue!");
        }else {
            for (int i=0;i<length;i++){
                System.out.print(arr[i+start]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Queue<Integer> q=new Queue(Integer.class,8);
        q.push(1);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(5);
        q.push(8);
        q.push(13);
        q.push(21);
        q.printQueue();
        System.out.println(q.size);

        q.pop();
        q.pop();
        q.printQueue();
        System.out.println(q.size);

        q.push(34);
        q.push(54);
        q.push(88);
        q.push(142);
        q.printQueue();
        System.out.println(q.size);
    }
}
