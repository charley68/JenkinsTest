
import junit.framework.TestCase;

public class MyUnitTest extends TestCase {
  public void testTrue() {
    
        String base = "one";
        String result = base.concat("two");


        assertEquals("onetwo", result);

  }
}
