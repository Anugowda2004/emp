import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import org.junit.jupiter.api.Test;

public class AssertD {
	@Test
	public void checkassertequal() {
		int res=1;
		int exp=1;
		assertEquals(res,exp);

		
	}
	@Test
	public void check() {
		assertTrue("Hello".contains("H"));
	}
	@Test
	public void another() {
		String s="hello";
		assertNull(s);
	}
@Test
public void testassumption() {
	int a=5, s = 35;
	Assumptions.assumeFalse(s==a*a);
	System.out.println("hi");
}
	
}
