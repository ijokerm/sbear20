public class Solution_1 {
public boolean isPalindrome(int x) {
    if (x < 0) {
        return false;
    }
    String s = Integer.toString(x);
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        } else {
            i++;
            j--;
        }

    }
    return true;
}

    public static void main (String[]args){
        int n = 1234321;
        Solution_1 so = new Solution_1();
        System.out.println(so.isPalindrome(n));
    }

}