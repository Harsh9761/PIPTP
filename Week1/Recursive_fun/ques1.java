// package Recursive_fun;

public class ques1 {
    public static void main(String[] args) {
        int n = 555;
        System.out.println(fun(n));
        
    }
    public static int fun(int n){
        if(n<=1){
            return n;
        }
        if(n%2==0){
            return n+fun(n/2);
        }
        return fun((n+1)/2)+fun((n-1)/2);
    }
}
