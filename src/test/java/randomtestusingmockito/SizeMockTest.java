package randomtestusingmockito;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//@ExtendWith(MockitoJunitRunner.class)
public class SizeMockTest {

    List<String> values = mock(List.class);


    @Test
    public void sizeBasic(){
        when(values.size()).thenReturn(5);
        assertEquals(5, values.size());
    }

    @Test
    public void returnsDifferentValues(){
        when(values.size()).thenReturn(5).thenReturn(10).thenReturn(15);
        assertEquals(5, values.size());
        assertEquals(5, values.size());
        assertEquals(5, values.size());
    }
//    @Test
//    public void returnsWithParameter(){
//        when(values.get(0)).thenReturn("love");
//        assertEquals("love", values.get(0));
//    }
//
//    @Test
//    public void returnsWithGenericParameter(){
//        // Note anyInt is argument marcher
//        when(values.get(anyInt())).thenReturn(2);
//        assertEquals("2", values.get(0));
//        assertEquals(2, values.get(1));
//        assertEquals(2,values.get(3));
//    }

}
