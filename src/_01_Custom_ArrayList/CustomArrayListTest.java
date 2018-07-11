package _01_Custom_ArrayList;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

//Complete the ArrayList class using the template to make the tests pass.

public class CustomArrayListTest {

	@Test
	public void testAddAndGet() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(206);
	
		if(list.get(0) != 0) fail("list.get(0) returning improper value.");
		if(list.get(1) != 1) fail("list.get(1) returning improper value.");
		if(list.get(2) != 206) fail("list.get(2) returning improper value.");
	}
	
	@Test
	public void testSet() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("TESTER");
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		
		list.set(2, "PICKLES");
		
		if(!list.get(0).equals("TESTER")) fail("list.get(0) returning improper value.");
		if(!list.get(1).equals("ONE"))  fail("list.get(1) returning improper value.");
		if(!list.get(2).equals("PICKLES"))  fail("list.get(2) returning improper value.");
		if(!list.get(3).equals("THREE"))  fail("list.get(3) returning improper value.");
	}
	
	@Test
	public void testAddAt() {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('D');
		list.add('I');
		list.add('G');
		list.add('O');
		
		list.insert(2, 'E');
		
		if(list.get(0) != 'D') fail("list.get(0) returning improper value.");
		if(list.get(1) != 'I') fail("list.get(1) returning improper value.");
		if(list.get(2) != 'E') fail("list.get(2) returning improper value.");
		if(list.get(3) != 'G') fail("list.get(3) returning improper value.");
		if(list.get(4) != 'O') fail("list.get(4) returning improper value.");
	}
	
	@Test
	public void testRemove() {
		class Student { 
			public String name; 
			public Student(String s) {
				name = s;
			}
		}
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Tim"));
		list.add(new Student("Sara"));
		list.add(new Student("Kamara"));
		list.add(new Student("Devaugn"));
		
		list.remove(0);
		
		if(!list.get(0).name.equals("Sara")) {
			fail("list.get(0) returning improper value.");
		}
		if(!list.get(1).name.equals("Kamara")) {
			fail("list.get(1) returning improper value.");
		}
		if(!list.get(2).name.equals("Devaugn")) {
			fail("list.get(2) returning improper value.");
		}
		
		list.remove(2);
		if(!list.get(0).name.equals("Sara")) {
			fail("list.get(0) returning improper value.");
		}
		if(!list.get(1).name.equals("Kamara")) {
			fail("list.get(1) returning improper value.");
		}
	}
	
	@Test
	public void testContains() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("This");
		list.add("is");
		list.add("only");
		list.add("a");
		list.add("test");
		
		assertTrue(list.contains("This"));
		assertTrue(list.contains("is"));
		assertTrue(list.contains("only"));
		assertFalse(list.contains("the"));
		assertFalse(list.contains("best"));
	}
}
