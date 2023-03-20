package Lab5;

public class Strings {
    public static void main(String[] args) {
        String testStr1 = "This is a test string";
        String testStr2 = "Hannah";
        String testStr3 = "Eve";
        String testStr4 = "Я понял, что это был бяка. Он знал то, что мог знать только бяка.";
        System.out.println(longest((testStr1)));
        System.out.println(palindromeWord(testStr1));
        System.out.println(palindromeWord(testStr2));
        System.out.println(palindromeWord(testStr3));
        System.out.println(censored(testStr4, "бяка", "[вырезано цензурой]"));
        System.out.println(countMatches(testStr4, "бяка"));
        System.out.println(countMatches("AAAABBBBAAACCAACDDD", "AA"));
        System.out.println(reverse(testStr1));
    }

    public static String longest(String urString) {
        String[] words = urString.split("\\s");
        String result = "";
        for (String subStr : words) {
            if (subStr.length() > result.length()) {
                result = subStr;
            }
        }
        return result;
    }
    public static String reverseWord(String urString){
        char[] strToArray = urString.toCharArray();
        char[] newStrToArray = new char[strToArray.length];
        for (int i = 1; i <= strToArray.length; i++)
        {
            newStrToArray[newStrToArray.length-i] = strToArray[i-1];

        }
        String newStr = "";
        for (char c:newStrToArray
        ) {
            newStr += c;

        }
        return newStr;

    }
    public static boolean palindromeWord(String urString)
    {
        boolean isPalindrome = false;
        String newStr = reverseWord(urString);
        if (newStr.equalsIgnoreCase(urString)){
            isPalindrome = true;

        }
        return isPalindrome;
    }
    public static String censored(String urString, String wrongWord, String censoreString){
        String censored = urString.replaceAll(wrongWord, censoreString);
        return censored;
    }
    public static Integer countMatches(String text, String subStr){
        int index = 0;
        int count = 0;
        while (true)
        {
            index = text.indexOf(subStr, index);
            if (index != -1)
            {
                count ++;
                index += subStr.length();
            }
            else {
                break;
            }
        }

        return count;

    }
    public static String reverse(String urString){
        String[] words = urString.split("\\s");
        String result = "";
        for (String word: words
             ) {
            result += reverseWord(word) + " ";

        }
        return result;
    }
}
