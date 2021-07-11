package tdd;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import org.testng.annotations.Test;



public class HarmcrestExample {
	
	@Test
    public void testcase() {
        
          List<Integer> list = Arrays.asList(5, 2, 4);
          
          assertThat(list, hasSize(4));
          
          // ensure the order is correct
          assertThat(list, contains(5, 2, 4));
          
          assertThat(list, everyItem(greaterThan(1)));
        
    }

}
