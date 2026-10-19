import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        // arrange
        String password = "hello";

        // act
        String actual = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("short", actual);
    }

    @Test 
    void testDescribePasswordLengthExactly12Chars() {
        // arrange
        String password = "************";

        // act
        String actual = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("long", actual);
    }

    @Test 
    void testDescribePasswordLengthExtraLongPassword() {
        // arrange
        String password = "aosdlaskalskdjlaksdakjsdasldadfnalksjdadihfsdjgnksjdfhoaisdkasd";

        // act
        String actual = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("extra long", actual);
    }

    /**
    * Checks whether a password has a character that is repeated at least three
    * times in a row.
    *
    * For example, "paaasword" has the letter 'a' three times in a row.
    *
    * @param password the password to check
    * @return true if password has a character repeated three times in a row, false otherwise
    */
    @Test 
    public static boolean containsTriple(String password) {
        // TODO: Make tests FIRST, then implement the method
        // Please have your tests in a separate commit from the implementation
        return false;
    }

    /**
    * Returns the number of special characters in the password.
    *
    * A special character is any non-alphanumeric (not letter or digit) character.
    *
    *
    * @param password the password to check
    * @return the count of special characters
    */
    @Test 
    public static int countSpecialCharacters(String password) {
        // TODO: Make tests FIRST, then implement the method
        // Please have your tests in a separate commit from the implementation
        return 0;
    }

    /**
    * Checks whether a password has at least a minimum number of special characters.
    *
    * A special character is any non-alphanumeric (not letter or digit) character.
    *
    * @param password the password to check
    * @param minimum the minimum number of special characters (inclusive)
    * @return true has the minimum number of special charcters or more, false otherwise
    */
    @Test
    public static boolean hasSufficientSpecialCharacters(String password, int minimum) {
        // TODO: Make tests FIRST, then implement the method
        // Please have your tests in a separate commit from the implementation
        // Required: please use countSpecialCharacters as a helper method.
        // Don't just copy/paste the logic!
        return false;
    }
}
