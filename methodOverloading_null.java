public class methodOverloading_null {
    public  void testing(Object obj){
        System.out.println("i am inside object method");
    }
    public void testing(String s){
        System.out.println("i am inside string method");
    }
    public static void main(String[] args) {
        methodOverloading_null m=new methodOverloading_null();
        m.testing(null);
    }
}
