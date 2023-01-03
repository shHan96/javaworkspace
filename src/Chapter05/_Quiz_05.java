package Chapter05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] shoes = new int[10];

        for (int i = 0; i < shoes.length; i++) {
            shoes[i] = 250 + i*5;
        }
        for (int shoe :
                shoes) {
            System.out.println("사이즈 "+shoe+" (재고 있음)");
        }

    }
}
