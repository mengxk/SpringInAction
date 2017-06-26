package mxk.com.easy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 10056 on 2017/6/24.
 */
public class KnightMain {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
