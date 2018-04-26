import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class Tests {

	@Ignore
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void setup() {
		int pid = 0;
		for(int i=0; i< 4; i++) {
			CompanyProject project = new CompanyProject();
			pid = project.getPID();
			System.out.println(pid);
		}
		assertEquals(4,pid);
	}

	/*This is to see if there was a change*/
}
