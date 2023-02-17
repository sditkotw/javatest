package fatherson;

/**
 * @Description:$
 * @Author:xuexiaoxian
 * @Date:$
 */
public class maintest {
    public static void main(String[] args) {
        Ifs son = new Son();
        son.setConf("mainConf");
        if(son instanceof Son){
            Son son1 = (Son) son;
            son1.test();
        }

    }
}
