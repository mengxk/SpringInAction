package mxk.com.easy;
import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 * Created by mengxk on 2017/6/14.
 */
public class BreaveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);
        //SlayDragonQuest mockQuest = mock(SlayDragonQuest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
