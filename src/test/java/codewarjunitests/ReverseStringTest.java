package codewarjunitests;

import com.codingchallenge.codewar.withjunit.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {
        @Test
        public void sampleTests() {
            assertEquals("dlrow", ReverseString.solution("world"));
    }
}
