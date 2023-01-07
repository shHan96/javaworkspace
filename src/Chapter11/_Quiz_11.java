package Chapter11;

public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 0;
        try {
            if(errorCode ==1) {
                throw new SaleTimeException("상품 구매 가능 시간이 아닙니다.");
            } else if(errorCode ==2){
                throw new SoldOutException("해당 삼품은 매진되었습니다.");
            } else{
                System.out.println("(상품 구매를 완료하였습니다)");
            }


        }catch (SoldOutException e){
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이요해주세요.");
        } catch (SaleTimeException e){
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        }

    }
}

class SoldOutException extends Exception {
    public SoldOutException(String message) {
        super(message);
    }
}
class SaleTimeException extends Exception {
    public SaleTimeException(String message) {
        super(message);
    }
}
