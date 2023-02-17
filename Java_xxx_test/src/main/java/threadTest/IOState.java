package threadTest;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

import static java.lang.Thread.sleep;

/**
 * @Description:$
 * @Author:xuexiaoxian
 * @Date:$
 */
@Slf4j
public class IOState {

/*
13:56:30.512 [IO线程] INFO threadTest.IOState - 开始读文件------
13:56:30.605 [监控线程] INFO threadTest.IOState - t1状态：RUNNABLE
13:56:30.714 [监控线程] INFO threadTest.IOState - t1状态：RUNNABLE
13:56:30.824 [监控线程] INFO threadTest.IOState - t1状态：RUNNABLE

在读取文件期间线程状态一直是runnable
*/

    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            File fl=new File("E:\\file_test.txt");

            byte[] temp=new byte[(int)fl.length()];

            try {
                FileInputStream in=new FileInputStream(fl);
                log.info("开始读文件------");
                in.read(temp);
                in.close();
                log.info("结束读文件------");
            } catch (IOException e) {
                e.printStackTrace();
            }

        },"IO线程");

        Thread t2=new Thread(()->{
            while (true) {
                log.info("t1状态："+t1.getState());
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"监控线程");


        t2.start();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
    }
}


