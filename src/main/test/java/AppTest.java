import com.example.Application;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    public void testApp() {

        @Test
        Application myApp=new Application();

        String result=myApp.getStatus();
        
        assertEquals("OK", result)
    }
}