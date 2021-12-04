package codewarjunitests;
import com.codingchallenge.codewar.withjunit.BooleanToWord;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BooleanToWordTest {
        @Test
        public void testBoolToWord() {
            assertEquals(BooleanToWord.boolToWord(true),"Yes");
            assertEquals(BooleanToWord.boolToWord(false),"No");
    }
}
