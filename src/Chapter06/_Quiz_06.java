package Chapter06;

public class _Quiz_06 {
    public static String getHiddenData(String s, int start) {
        StringBuffer result = new StringBuffer(s);
        for (int i = start; i < result.length(); i++) {
            result.replace(i,i+1,"*");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String name = "나코딩"; // 이름
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : "+getHiddenData(name,1));
        System.out.println("이름 : "+getHiddenData(id,8));
        System.out.println("이름 : "+getHiddenData(phone,9));
    }
}
