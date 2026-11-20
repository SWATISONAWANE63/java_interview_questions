
//finally always execute after try and catch
public class try_finally {
    public int test(){
        try{
            return 10;
        }finally{
            return 20; // bad pratice to return value
        }
    }
    public static void main(String[] args) {
        try_finally obj = new try_finally();
        System.out.println(obj.test());
    }
}
