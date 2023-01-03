package Chapter05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ASCII)
        // 알파벳 대문자 (A)는 65 부터
        // 앞파벳 소문자 (a)는 97 부터
        // 숫자(0)는 48부터 시작.
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        for (int i = 0; i < seats3.length; i++) { // 세로기준
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
