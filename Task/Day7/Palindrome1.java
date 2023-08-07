package Day7;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameters;

 

import java.util.Arrays;

import java.util.Collection;

 

import static org.junit.Assert.assertEquals;

 

@RunWith(Parameterized.class)

public class Palindrome1 {

 

    private final String input;

    private final boolean expectedOutput;

 

    public Palindrome1(String input, boolean expectedOutput) {

        this.input = input;

        this.expectedOutput = expectedOutput;

    }

 

    // Define the test data using @Parameters

    @Parameters

    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{

                {"eye", true},

                {"java", false},

                {"malayalam", true},

                {"madam", true},

                {"techzenure", false}

        });

    }

 

    // Test the checkPalindrome method with the parameterized data

    @Test

    public void testCheckPalindrome() {

        Palindrome palindrome = new Palindrome();

        assertEquals(expectedOutput, palindrome.checkPalindrome(input));

    }

}
