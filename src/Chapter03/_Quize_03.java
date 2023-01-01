package Chapter03;

public class _Quize_03 {
    public static void main(String[] args) {
        String p1 = "901231-1234567";
        String p2 = "030708-4567890";

        System.out.println(p1.substring(0,8)); // 0위치부터 8 위치 직전까지
        System.out.println(p2.substring(0,p2.indexOf("-")+2));
    }
}
