import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testmain {
    private static Main st;
    @BeforeClass
    public static void setup(){
        st= new Main();
    }
    @Test
    public void test_power_two(){assertEquals(4, st.power_two(2));}
    @Test
    public void test_power_three(){assertEquals(8,st.power_three(2));}
}
