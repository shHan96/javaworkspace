package Chapter02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int c = 120;
        int a = 115;
        int b = 121;
        String message = (a >= c) ? "가능합니다" : "불가능합니다";
        System.out.println("키가 "+ a +"cm 이므로 답승 " + message);
        message = (b >= c) ? "가능합니다" : "불가능합니다";
        System.out.println("키가 "+ b +"cm 이므로 답승 " + message);

    }
}
