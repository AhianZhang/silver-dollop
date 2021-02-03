package algorihtm.leetcode;


/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-09-09 11:13
 * <p>
 * * Input: "aba"
 * * Output: True
 * *
 * * Input: "abca"
 * * Output: True
 * * Explanation: You could delete the character 'c'.
 *
 *
 *  palindrome
 *
 *  特点：头部的值等于尾部的值
 *
 *
 *  Suppose we want to know whether s[i], s[i+1], ..., s[j] form a palindrome. If i >= j then we are done. If s[i] == s[j] then we may take i++; j--.
 *  Otherwise, the palindrome must be either s[i+1], s[i+2], ..., s[j] or s[i], s[i+1], ..., s[j-1], and we should check both cases.
 *
 *
 *
 **/
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        if (s.length() > 50000) {
            throw new IllegalArgumentException("illegal args");
        }

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {

                int needToCheck = s.length() - 1 - i;

                return (isPalindrome(s, i + 1, needToCheck) || isPalindrome(s, i, needToCheck - 1));
            }
        }
        return true;

    }

    public boolean isPalindrome(String s, int i, int needToCheck) {

        for (int j = i; j <= i + (needToCheck - i) / 2; j++) {
            if (s.charAt(j) != s.charAt(needToCheck - j + i))  {
                return false;
            }
        }
        return true;
    }


}
