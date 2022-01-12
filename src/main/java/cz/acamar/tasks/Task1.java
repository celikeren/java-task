package cz.acamar.tasks;

import org.apache.commons.lang3.StringUtils;

public class Task1 {

    private static char SPACE = ' ';

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {
        int length = 0;
        if (StringUtils.isNotBlank(str)) {
            str = str.trim();
            int indexOfLastSpace = str.lastIndexOf(SPACE);
            length = str.substring(indexOfLastSpace + 1).length();
        }
        return length;
    }
}
