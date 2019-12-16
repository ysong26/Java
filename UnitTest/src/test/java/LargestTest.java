import junit.framework.TestCase;

	public class LargestTest extends TestCase {
		public LargestTest(String name) {
				super(name);
		}
		public void testSimple() {
			assertEquals(9, Largest.largest(new int[] {7, 8, 9}));
		}
		public void testOrder() {
			assertEquals(9, Largest.largest(new int[] {9, 8, 7}));
			assertEquals(9, Largest.largest(new int[] {7, 9, 8}));
			assertEquals(9, Largest.largest(new int[] {9, 7, 9, 8}));
			assertEquals(1, Largest.largest(new int[] {1}));
			assertEquals(-7, Largest.largest(new int[] {-9, -8, -7}));
			assertEquals(0, Largest.largest(new int[] {}));
		}
		public void testEmpty() {
			try {
					Largest.largest( new int[] {} );
					fail("Should have throw an exception");
		} catch (RuntimeException e) {
					assertTrue(true);
			}
		}
}