package fatherson;

/**
 * @Description:$
 * @Author:xuexiaoxian
 * @Date:$
 */
public class Son extends Fanther implements Ifs{
    private String conf;

    @Override
    public String getConf() {
        return conf;
    }

    @Override
    public void setConf(String conf) {
        this.conf = conf;
    }
}
