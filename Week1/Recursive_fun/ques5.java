package Recursive_fun;

public class ques5 {
    public static void main(String[] args) {
        int n = 3;
        String result = f(n);
        System.out.println(result);  // Output: 1213121
    }

    public static String f(int n) {
        if (n == 1) {
            return "1";
        }
        String prev = f(n - 1);
        return prev + n + prev;
    }
}
