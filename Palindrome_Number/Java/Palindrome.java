public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int a = x;
        int i = 0;
        while (x > 0) {
            i *= 10;
            i += (x % 10);
            x /= 10;
        }
        return (a == i);
    }
}