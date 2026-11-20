// string is unmutable in java 

public class string_immutability {
    public static void main(String[] args) {
        String s="arpit";
        s.concat("yadav"); // arpit yadav new object but not assing in any varible so it's print arpit
        System.out.println(s);
        String a="swati";
        String b=a.concat(" sonawane");
        System.out.println(b);
    }
}
