package org.test.scrabbleTesting;

import org.test.scrabbleTesting.Action.SrabbleTestAction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrabbleTest {

	@Test(priority = 0)
	public void Scrabble_TestCase1() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 1 : Straight forward" + "\n");
		// Input Data
		char[] a = { 'r', 'g', 'o', 'y', 'c', 'e', 'r' };
		String s = "grocery";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, true);
	}

	@Test(priority = 1)
	public void Scrabble_TestCase2() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 2 : Straight forward" + "\n");
		// Input Data
		char[] a = { 'r', 'g', 'o', 'y', 'c', 'e', 'r' };
		String s = "go";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, true);
	}

	@Test(priority = 2)
	public void Scrabble_TestCase3() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 3 : Straight forward" + "\n");
		// Input Data
		char[] a = { 'r', 'g', 'o', '?', 'c', 'e', 'r' };
		String s = "got";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, true);
	}

	@Test(priority = 3)
	public void Scrabble_TestCase4() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 4 : Straight forward" + "\n");
		// Input Data
		char[] a = { 'r', 'g', 'o', '?', 'c', 'e', 'r' };
		String s = "agog";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, false);
	}

	@Test(priority = 4)
	public void Scrabble_TestCase5() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 5 : Word length longer than the available tiles" + "\n");
		// Input Data
		char[] a = { 'r', 'g', 'o', '?', 'c', 'e', 'r' };
		String s = "agogoofssd";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, false);
	}

	@Test(priority = 5)
	public void Scrabble_TestCase6() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 6 : Empty word" + "\n");
		// Input Data
		char[] a = { 'r', 'g', 'o', '?', 'c', 'e', 'r' };
		String s = "";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, false);
	}

	@Test(priority = 6)
	public void Scrabble_TestCase7() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 7 : No Tiles Available" + "\n");
		// Input Data
		char[] a = {};
		String s = "agog";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, false);
	}

	@Test(priority = 7)
	public void Scrabble_TestCase8() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 8 : No word and No Tiles" + "\n");
		// Input Data
		char[] a = {};
		String s = "";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, false);
	}

	@Test(priority = 8)
	public void Scrabble_TestCase9() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 9 : More than 2 Blank Tiles" + "\n");
		// Input Data
		char[] a = { 'r', '?', 'o', '?', '?', 'e', 'r' };
		String s = "agog";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, false);
	}

	@Test(priority = 9)
	public void Scrabble_TestCase10() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 10 : Special characters/numbers in Tiles" + "\n");
		// Input Data
		char[] a = { 'r', 'g', 'o', '?', '#', '"', '7' };
		String s = "agog";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, false);
	}

	@Test(priority = 10)
	public void Scrabble_TestCase11() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 11 : a white-space in the word" + "\n");
		// Input Data
		char[] a = { 'r', 'g', 'o', '?', 'c', 'e', 'r' };
		String s = "a gog   ";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, false);
	}

	@Test(priority = 11)
	public void Scrabble_TestCase12() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 12 : Word containing special character/numbers" + "\n");
		// Input Data
		char[] a = { 'r', 'g', 'o', '?', 'c', 'e', 'r' };
		String s = "agog1234!!!";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, false);
	}

	@Test(priority = 12)
	public void Scrabble_TestCase13() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 13 : Single character in Tile & Word" + "\n");
		// Input Data
		char[] a = { 'a' };
		String s = "A";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, true);
	}

	@Test(priority = 13)
	public void Scrabble_TestCase14() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 14 : Case Difference" + "\n");
		// Input Data
		char[] a = { 'R', 'G', 'a', '?', 'r', 'e', 'r' };
		String s = "rRog";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, true);
	}

	@Test(priority = 14)
	public void Scrabble_TestCase15() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 15 : Special characters & numbers in the input with right match" + "\n");
		// Input Data
		char[] a = { '#', '!', '1', '?', 'c', 'e', 'r' };
		String s = "#!cerg";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, false);
	}

	@Test(priority = 15)
	public void Scrabble_TestCase16() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 16 : Tiles count exceeding limit" + "\n");
		// Input Data
		char[] a = { 'r', 'g', 'o', 'Z', 'c', 'e', 'r', 'r', 'g', 'o', 'Z', 'c', 'e', 'r', 'r', 'g', 'o', 'Z', 'c', 'e',
				'r', 'r', 'g', 'o', 'Z', 'c', 'e', 'r', 'r', 'g', 'o', 'Z', 'c', 'e', 'r' };
		String s = "agog";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, false);
	}

	@Test(priority = 16)
	public void Scrabble_TestCase17() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 17 : Word length exceeding limit" + "\n");
		// Input Data
		char[] a = { 'r', 'g', 'o', 'Z', 'c', 'e' };
		String s = "agogsfdsgsdgwefwefwewggweggwgweccwdgwerggwefweefwegewrgwfw";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, false);
	}

	@Test(priority = 17)
	public void Scrabble_TestCase18() {
		boolean validationflag = false;
		System.out.println("\n" + "Test Case 17 : Both Tiles count and Word length exceeding limit" + "\n");
		// Input Data
		char[] a = { 'r', 'g', 'o', 'Z', 'c', 'e','r', 'g', 'o', 'Z', 'c', 'e','r', 'g', 'o', 'Z', 'c', 'e','r', 'g', 'o', 'Z', 'c', 'e','r', 'g', 'o', 'Z', 'c', 'e','r', 'g', 'o', 'Z', 'c', 'e','r', 'g', 'o', 'Z', 'c', 'e' };
		String s = "agogsfdsgsdgwefwefwewggweggwgweccwdgwerggwefweefwegewrgwfw";

		// Action Function Invoke
		try {
			validationflag = SrabbleTestAction.scrabble(a, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Test Case:11->Exception occured while execution" + e.getMessage());
		}

		// Validation
		if (validationflag == true) {
			System.out.println("True.");
		} else {

			System.out.println("False.");
		}
		Assert.assertEquals(validationflag, false);
	}

}
