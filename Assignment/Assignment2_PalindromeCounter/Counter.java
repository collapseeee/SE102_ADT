/**
 * author: Nattikorn Sae-sue, 672115014
 * nattikorn_s@cmu.ac.th
 * package files: Main.java & Counter.java.
 */

import java.util.ArrayList;
public class Counter {
    private int totalChar = 0;
    private int totalEmoticon = 0;
    private int totalLine = 0;
    private int totalPalindrome = 0;
    private int totalToken = 0;
    private String longestString = "";
    private ArrayList<String> emoticonList = new ArrayList<>();
    private ArrayList<String> stringList = new ArrayList<>();
    private ArrayList<String> palindromeList = new ArrayList<>();

    public void addString(String string) {
        this.stringList.add(string);
        totalChar = totalChar+string.length();
        CheckAndAddPalindrome(string);
        CheckAndAddLongestToken(string);
        CheckAndAddEmoticon(string);
    }

    public int totalString() {
        return stringList.size();
    }

    public int totalChar() {
        return totalChar;
    }

    public String getLongestToken() {
        return longestString;
    }

    public int getLongestTokenLength() {
        return longestString.length();
    }

    public double getAverageTokenLength() {
        return (double) totalChar / totalToken;
    }

    public void addTotalLine(int num) {
        totalLine+=num;
    }

    public void addTotalToken(int num) {
        totalToken+=num;
    }

    public void CheckAndAddEmoticon(String string) {
        if (string.charAt(0) == ':') {
            if (string.charAt(1)=='D' || string.charAt(1)=='O' || string.charAt(1)=='P' || string.charAt(1)==')' || string.charAt(1)=='(') {
                totalEmoticon++;
                emoticonList.add(string);
            }
        }
    }

    public void CheckAndAddLongestToken(String string) {
        if (longestString.length()<string.length()) {
            longestString = string;
        }
    }

    public void CheckAndAddPalindrome(String string) {
        CheckAndAddPalindrome(string, 0, string.length()-1);
    }

    public void CheckAndAddPalindrome(String string, int start, int end) {
        if (start>=end) {
            palindromeList.add(string);
            totalPalindrome++;
            return;
        }
        if (string.toLowerCase().charAt(start) == string.toLowerCase().charAt(end)) {
            CheckAndAddPalindrome(string, ++start, --end);
        }
    }

    public void display() {
        System.out.println("Total # Character count: " + totalChar);
        System.out.println("Total # palindrome found: " + totalPalindrome);
        System.out.println("Total # token: " + stringList.size());
        System.out.println("Total # emoticon: " + totalEmoticon);
        System.out.println("The longest token size: " + getLongestTokenLength() + " (The token: `" + getLongestToken() + "`)" );
        System.out.println("The average token size: " + getAverageTokenLength());
    }
    /**
     // for correcting:
    public void debugDisplayAllToken() {
        for (String s : stringList) {
            System.out.println(s);
        }
    }
    public void debugDisplayAllPalindrome() {
        for (String s : palindromeList) {
            System.out.println(s);
        }
    }
    public void debugDisplayEmoticon() {
        for (String s : emoticonList) {
            System.out.println(s);
        }
    }
    **/
}
