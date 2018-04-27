import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestCompanyProject {
	String title9,title11,email;
	int pid;
	Boolean test;

	@Before
	public void setVar()
	{
		title9 = "TestTitle";
		title11 = "TestTitle11";
		pid = 0;
		email = "asad@gmail.com";
	}
	
	@Ignore
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void test1() // Tests to see if the pid increments correctly
	{
		for(int i=0; i<4; i++)
		{
			CompanyProject project = new CompanyProject();
			pid = project.getPID();
			
			System.out.println(pid);
		}	
		assertEquals(4,pid);
	}
	
	@Test
	public void test2() // Checks if the project Name is correctly set 
	{
		CompanyProject project = new CompanyProject(title9);
		
		assertEquals(title9, project.getPTitle());
	}
	
	@Test
	public void test3() // Checks if titles of insufficient lengths are correctly rejected 
	{
		CompanyProject project1 = new CompanyProject();
		project1.setPTitle(title9);
		assertEquals("New Project", project1.getPTitle());
	}
	
	@Test
	public void test4() // Checks if the project Title is correctly set
	{
		CompanyProject project1 = new CompanyProject();
		project1.setPTitle(title11);
		assertEquals(title11, project1.getPTitle());
	}
	
	@Test
	public void testAddContact() // Checks if new contact can be added
	{
		CompanyProject project = new CompanyProject();
		project.addContact(email);
		assertEquals(true, project.isContact(email));
	}
	
	@Test
	public void testIsNotContact()
	{
		CompanyProject project = new CompanyProject();
		assertEquals(false, project.isContact("aa"));
	}
	//3
	@Test
	public void testNextPhaseOver()
	{
		CompanyProject project = new CompanyProject();
		for(int i=0; i<7; i++)
		{
			test = project.nextPhase();
		}
		assertEquals(false, test);
	}
	
	@Test
	public void testNextPhase()
	{
		CompanyProject project = new CompanyProject();
		for(int i=0; i<5; i++)
		{
			test = project.nextPhase();
		}
		assertEquals(true, test);
	}
	
	@Test
	public void testGetPhaseID()
	{
		CompanyProject project = new CompanyProject();
		assertEquals(1,project.getPhaseByID());
	}
	
	@Test
	public void testGetPhaseName()
	{
		CompanyProject project = new CompanyProject();
		assertEquals("Design",project.getPhaseByName());
	}
}
