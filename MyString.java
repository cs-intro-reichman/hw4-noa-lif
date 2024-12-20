
public class MyString {

    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /**
     * Returns the lowercase version of the given string.
     */
    public static String lowerCase(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                char lowerChar = (char) (str.charAt(i) + 32);
                newStr += lowerChar;
            } else {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    /**
     * If str1 contains str2, returns true; otherwise returns false.
     */
    public static boolean contains(String str1, String str2) {
        int str2Length = str2.length();
        if (str2Length == 0) {
            return true;
        }
        if (str2Length > str1.length()) {
            return false;
        }
        char firstChar = str2.charAt(0);

        for (int i = 0; i <= str1.length() - str2Length; i++) {
            int k = 0;
            int j = i;
            if (str1.charAt(i) == firstChar) {
                while (k < str2Length && str1.charAt(j) == str2.charAt(k)) {
                    j++;
                    k++;
                }
            }
            if (k == str2Length) {
                return true;
            }
        }
        return false;
    }
}
