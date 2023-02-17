package pack_test2;

import java.util.HashSet;
import java.util.Set;

//HashSet（底层实现是HashMap，如果存的是整形(Interger/Byte/Short)类型其实是有序的，没有经过扩容；经过扩容不能保证有序）
public class HashSetTest {
    public static void main(String[] args) {
        Set<Long> s=new HashSet<>();//不指定大小，初始化是16
        s.add(1L);
        s.add(15L);
        s.add(10L);
        s.add(17L);//如果不指定大小，17L无序
        s.add(7L);
        for(Long l:s){
            System.out.print(l+",");
        }
    }
}
