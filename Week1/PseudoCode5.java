public class PseudoCode5 {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        System.out.println(fun(a,b));
    }
    public static int fun(int a,int b){
        for(int c = 2;c<=4;c++){
            if((a%2)<(b%3)){
                a = 4%3;
            }
           
            if((5%3>b)){
                a = b;
            }
            b = 1;
            
        }
        return a+b;
    }
}
