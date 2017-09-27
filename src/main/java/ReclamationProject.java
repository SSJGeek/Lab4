/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * A class that does something.
 *
 */
public class ReclamationProject {

/**
* A class that does something.
* @param word1 is a String
* @param word2 is a String
* @return a String that contains every letter common to both words starting from the beginning.
*         ex. "Aardvark" and "Avocado" returns "A"
*             "Aardvark" and "Aardvark" returns "Aarvar" [last character is omitted]
*/
public static String dictionaryCompare(final String  word1, final String  word2) {
String delta = word1; //just a temporary reference
String gamma = word2; //just a temporary reference

//this is used to swap the order of the inputs based on

    if (delta.length() > gamma.length()) {
            String c = delta;
            delta = gamma;
            gamma = c;
            }
        String result = "";

        for (int posInDelta = 0; posInDelta < delta.length(); posInDelta++) {
            for (int oppositeSideOfDelta = delta.length() - posInDelta;
                    oppositeSideOfDelta > 0; oppositeSideOfDelta--) {
                for (int posInGamma = 0; posInGamma < gamma.length() - oppositeSideOfDelta;
                        posInGamma++) {
                    if ((delta.regionMatches(posInDelta, gamma, posInGamma, oppositeSideOfDelta)
                            &&
                         oppositeSideOfDelta > result.length())) {
                        result = delta.substring(posInDelta, posInDelta + oppositeSideOfDelta);
                    }
                        }
                }
        } return result; }
}
