public class PseudoCode3 {
    public static void main(String[] args) {
        int a = 8;
        int b = 8;
        System.out.println(fun(a,b));
    }
    public static int fun(int a,int b){
        if(a > 0 && b > 0 && a+b>0){
            return a+ fun(a-2,b-2)+b;
        }
        return a ^ b;
    }
}
