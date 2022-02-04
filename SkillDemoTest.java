import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    //add lib files to configure the JUnit tests
    @Test
    public void addition(){
        assertEquals(2, SkillDemo.simpleAdd(1,2)); //fail at first 
    }

}
