package pack_test2;

import java.util.HashMap;
import java.util.Map;

public class BooleanTest {
    public static void main(String[] args) {
        Map<String,Object> param=new HashMap<>();
        param.put("flag1",0);
        param.put("flag2",1);
        boolean flag1=Boolean.valueOf(param.get("flag1").toString());
        boolean flag2=Boolean.valueOf(param.get("flag2").toString());


        System.out.println("flag1-"+flag1);
        System.out.println("flag2-"+flag2);
        System.out.println(Boolean.valueOf("1"));


    }
}
