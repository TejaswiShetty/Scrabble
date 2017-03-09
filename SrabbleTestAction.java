package org.test.scrabbleTesting.Action;

public class SrabbleTestAction {

	// Validate Tiles
	public static boolean isValidWord(String w) {
		return w.matches("[A-Za-z?]*");
	}

	public static boolean scrabble(char[] charArray, String s) {
		// boolean flag = true;

		char[] tiles = charArray;
		String word = s;
		int blankTilesCount = 0;
		int unmatchedCount = 0;
		int c = 0;
		boolean flag1 = false;
		boolean flag2 = false;

		StringBuilder s1;

		// converting the character array to a String of reduce looping
		String tilesString = new String(tiles);
		System.out.println("Tiles String is: " + tilesString);
		System.out.println("Word is : " + word);
		
		flag1 = isValidWord(tilesString);
		flag2 = isValidWord(word);

		// Condition to check Word/Tiles does'nt contain special character or
		// numbers
		if (flag1 == false || flag2 == false) {
			System.out.println("Word/Tiles might contain special character(s)/Numbers, excluding '?'.");
			return false;
		}

		tilesString = tilesString.toUpperCase();
		word = word.toUpperCase();

		// Condition to check if the Tiles or character count in word exceeds
		// max limit
		if (tilesString.length() > 28 || word.length() > 28) {
			System.out.println("Word/Tiles might contain more than 28 characters.Pls provide a shorter input.");
			return false;
		}

		// Checking if the word or tiles array is not empty or null
		if (tilesString != null && word != null && word != "" && tilesString != "") {

			// Check word length is greater than of Tiles Elements
			if (word.length() > tilesString.length()) {
				System.out.println("Word has more letters than available Tiles.");
				return false;
			}

			// Finding Blank Tiles
			for (int i = 0; i < tilesString.length(); i++) {

				if (tilesString.charAt(i) == '?') {
					blankTilesCount++;
					// more than two blank tiles
					if (blankTilesCount > 2) {
						System.out.println("More than 2 blank Tiles.");
						return false;
					}
				}

			}

			System.out.println("Blank Tiles Count: " + blankTilesCount);

			// Finding unmatched character count of word
			for (int i = 0; i < word.length(); i++) {
				if (tilesString.indexOf(word.charAt(i)) == -1) {
					unmatchedCount++;
					blankTilesCount--;
					// no more blank tiles left for replacement
					if (blankTilesCount < 0) {
						System.out.println("Word cant be formed using available Tiles. ");
						return false;
					}
				} else {
					c = tilesString.indexOf(word.charAt(i));
					s1 = new StringBuilder(tilesString);
					s1.deleteCharAt(c);
					tilesString = s1.toString();
					// System.out.println("String after trim: " +
					// tilesString);
				}
			}

			System.out.println("Unmatched character count in the given word: " + unmatchedCount);

			// if (unmatchedCount <= 2) {
			// if (unmatchedCount <= blankTilesCount) {
			// System.out.println("Perfect!!! Word can be formed using
			// available
			// Tiles.");
			// return true;
			// }
			// } else {
			// System.out.println("Word cant be formed using available
			// Tiles.
			// ");
			// return false;
			// }

			if (blankTilesCount < 0) {
				System.out.println("Word cant be formed using available Tiles. ");
				return false;
			} else {
				System.out.println("Perfect!!! Word can be formed using available Tiles. ");
				return true;
			}

		} else {
			System.out.println("Either no tiles are present or word is empty.");
			return false;
		}
	}
}
