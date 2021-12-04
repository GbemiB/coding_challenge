package codewarjunitests;

import com.codingchallenge.codewar.withjunit.CalculateBmi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateBmiTest {
    @Test
    public void testUnderWeightBMI(){
        assertEquals("Underweight", CalculateBmi.bmi(49, 1.8 ));
    }

    @Test
    public void testNormalBMI(){
        assertEquals("Normal", CalculateBmi.bmi(80.45, 1.8 ));
    }

    @Test
    public void testOverWeightBMI(){
        assertEquals("Overweight", CalculateBmi.bmi(90.8, 1.9 ));
    }

    @Test
    public void testObeseBMI(){
        assertEquals("Obese", CalculateBmi.bmi(250.6, 1.9 ));
    }

}
