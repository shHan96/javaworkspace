package Chapter04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int parkTime =5; // 주차 시간
        final int maxCost = 30000; // 하루 최대 비용
        final int timePerCost = 4000; //시간당 시간비용
        boolean isSmallCar = false; // 경차여부
        boolean withDisabledPerson = false; // 장애여부
        int totalCost = parkTime*timePerCost;

        if(totalCost>maxCost){
            totalCost=maxCost;
        }
        if(isSmallCar||withDisabledPerson){
            totalCost /=2;
        }
        System.out.println("주차 요금은 "+ totalCost + " 원 입니다.");
    }
}
