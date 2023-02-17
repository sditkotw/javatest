package pack_test2;


import java.util.Date;

class AObj implements Cloneable{
    private int aInt=0;
    private String ss="默认值";
    private Date date=new Date();
    public int getaInt() {
        return aInt;
    }
    public void setaInt(int a){
        aInt=a;
    }
    public void changeInt(){
        aInt=1;
    }

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public void changeSs(){
        ss="change后的值";
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void changeDate(){
        date.setTime(1290847566);
    }

    public Object clone(){
        AObj o=null;
        try {
            //浅复制就写这个就够了
            o=(AObj)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //深复制要调用每个引用类型变量的clone（）方法
        o.date=(Date) this.getDate().clone();
        return o;
    }
}
public class CloneTest {
    public static void main(String[] args) {
        AObj oldObjt =new AObj();
        AObj newObjt=(AObj) oldObjt.clone();

        //基本类型，浅复制不会改变原来的值
        newObjt.changeInt();
        System.out.println("old:int:"+oldObjt.getaInt());//0
        System.out.println("new:int:"+newObjt.getaInt());//1

        //String虽然是引用类型，浅复制相当于new了一个String，不会改变原来的值
        newObjt.changeSs();
        System.out.println("old:ss:"+oldObjt.getSs());//默认值
        System.out.println("new:ss:"+newObjt.getSs());//change后的值

        //引用类型，浅复制相当于引用原来的地址,改变原来的值
        newObjt.changeDate();
        System.out.println("old:date:"+oldObjt.getDate());//浅复制：Fri Jan 16 06:34:07 CST 1970；深复制：Fri Mar 27 17:03:17 CST 2020
        System.out.println("new:date:"+newObjt.getDate());//Fri Jan 16 06:34:07 CST 1970
    }




}
