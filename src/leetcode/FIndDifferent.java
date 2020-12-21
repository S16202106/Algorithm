package leetcode;

public class FIndDifferent {
    public void getSt(String s, String t) {
        //剪枝回溯

    }

    public static char findTheDifference(String s, String t) {
        if (s.length() == 0) {
            return t.charAt(0);
        }
        for (int i = 0; i < s.length(); i++)
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    return findTheDifference(s.substring(0, i) + s.substring(i + 1),
                            t.substring(0, j) + t.substring(j + 1));
                }
            }
        return 0;
    }

    public static void main(String[] args) {
//        String s="abc";
//        System.out.println(s.substring(0,0));
        System.out.println(findTheDifference("abce", "abcde"));
    }
}
