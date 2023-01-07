package Chapter12;

public class _Quiz_12 {
    public static void main(String[] args) {
        Product product = new Product();
        Runnable aProduct = () -> {
            System.out.println(" -- A 상품 준비 시작 --");
            for (int i = 1; i <=5 ; i++) {
                product.ready("A",i);
            }
            System.out.println(" -- A 상품 준비 완료 --");
            product.A=true;
        };
        Runnable bProduct = () -> {
            System.out.println(" -- B 상품 준비 시작 --");
            for (int i = 1; i <=5 ; i++) {
                product.ready("B",i);
            }
            System.out.println(" -- B 상품 준비 완료 --");
            product.B=true;
        };
        Runnable wrapping = () -> {
            System.out.println("== 세트 상품 포장 시작 ==");
            for (int i = 1; i <=5 ; i++) {
                product.wrapping(i);
            }
            System.out.println("== 세트 상품 포장 완료 ==");
        };
        Thread aThread = new Thread(aProduct);
        Thread bThread = new Thread(bProduct);
        aThread.start();
        bThread.start();
        while (aThread.isAlive() || bThread.isAlive());
//        try {
//            aThread.join();
//            bThread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        Thread setThread = new Thread(wrapping);
        setThread.start();
    }
}
class Product {
    public boolean A=false;
    public boolean B = false;
    public void ready(String name,int i){
        System.out.println(name + " 상품 준비 "+i + "/5");
    }
    public void wrapping(int i){
        System.out.println("세트 상품 포장 "+i+"/5");
    }
}
