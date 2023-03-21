public class TesteFatorial {
    public static void main(String[] args){
        int fat = 1;
        for(int n=1; n <= 10; n++){
            fat *= n;
            System.out.println(n + "! = " + fat);
        }
    }
}
