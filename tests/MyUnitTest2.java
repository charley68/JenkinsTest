
import junit.framework.TestCase;

public class MyUnitTest2 extends TestCase {

  public void test1() {
    
        assertEquals("hello", "hello");
  }

  public void testTrue() {
    
        String base = "one";
        String result = base.concat("two");

        assertEquals("one", result);
  }
}
