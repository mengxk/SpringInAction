package mxk.com.easy;

import java.io.PrintStream;

/**
 * Created by 10056 on 2017/6/24.
 */
public class Minstrel {
    private PrintStream stream;
    private Minstrel(PrintStream stream){
        this.stream = stream;
    }
    public void singBeforeQuest(){
        stream.println("Fa la la, the knight is so breve!");
    }
    public void singAfterQuest(){
        stream.println("Tee hee hee, the breave knight did embark on a quest!");
    }
}
