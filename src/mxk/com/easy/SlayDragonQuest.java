package mxk.com.easy;

import java.io.PrintStream;

/**
 * Created by mengxk on 2017/6/23.
 */
public class SlayDragonQuest implements  Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    public void embark(){
        stream.println("Embarking on quest to slay the dragon!");
    }
}
