package fatherson;

/**
 * @Description:$
 * @Author:xuexiaoxian
 * @Date:$
 */
public class Fanther implements Ifs{
    private String conf;

    public String getConf() {
        return conf;
    }

    public void setConf(String conf) {
        this.conf = conf;
    }

    public void test(){
        System.out.println("父类test中打印getConf="+getConf());
        System.out.println("父类test中打印conf="+conf);
    }
}
