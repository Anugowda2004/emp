import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyTest {
	@DisplayName("Testing")
	@Test
	@Disabled
	void display()
	{System.out.println("my pgm");
	
	}
	@RepeatedTest(2)
	@DisplayName("2 test")
	@Test
	void another()
	{System.out.println("my pgm2");
	}
}
