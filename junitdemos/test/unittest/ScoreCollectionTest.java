package unittest;

import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ScoreCollectionTest {

	
//	public void testAdd() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testAm() {
//		fail("Not yet implemented");
//	}
	@Test
   public void test(){
		ScoreCollection sc = new ScoreCollection();
		sc.add(()->5);
		sc.add(()->10);
		
		//act
		int res = sc.am();
		//assert
		//assertThat(res,equalTo(15));
		
	}
}
