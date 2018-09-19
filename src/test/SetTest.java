package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cap2.lists.Sett;

public class SetTest {

	@Test
	public void listTest() {
		Sett testedSet = new Sett();
		testedSet.add("Juan1");
		testedSet.add("Juan2");
		testedSet.add("Juan3");
		testedSet.add("Juan1");
		testedSet.add("Juan2");
		testedSet.add("Juan3");
		// String actualValues
		String expectedValue = testedSet.list();

		assertEquals(expectedValue, " ");

	}

}
