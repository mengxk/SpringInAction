package mxk.com;

/**
 * Created by mengxk on 2017/6/14.
 */
public class BraveKnight implements Knight{
    private Quest quest;
    public BraveKnight(Quest quest){
        this.quest = quest;
    }
    public void embarkOnQuest(){
        quest.embark();
    }
}
