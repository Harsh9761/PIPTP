package Recursive_fun.Recursive_fun;

public class ques2 {
    public static void main(String[] args) {
        int n = 555;
        System.out.println(fun(n));
    }
    public static int fun(int n){
        if(n==0){
            return 0;
        }
        return n%10 + fun(n/10);
    }
}
