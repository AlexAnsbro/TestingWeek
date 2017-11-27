package alex.consulting.com.testing;
import org.junit.*;


public class testing {
	
	@BeforeClass
	public static void init() {
		System.out.println("Init");
	}
	@Before
	public void setUp() {
		System.out.println("Set Up");
	}
	@Test
	public void test1() {
		System.out.println("Test");
	}
	@After
	public void tearDown() {
		System.out.println("Tear Down");
	}
	@AfterClass
	public static void destroy() {
		System.out.println("Destroy");
	}
}
