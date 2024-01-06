/** String processing exercise 2. */
public class uniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == 32 || ans.indexOf(c) == -1) {
                ans += c;
            }
        }
        return ans;
    }
}
