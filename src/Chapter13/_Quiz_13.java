package Chapter13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        String fileName = "saying.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)))
        {
            String[] question = {"세 살 __ 여든까지 간다","소 읽고 ___ 고친다","천 리 길도 한 __부터"};
            String[] answer = {"버릇","외양간","걸음"};
            for (int i = 0; i <3 ; i++) {
                bw.write(question[i]);
                bw.newLine();
                bw.write(answer[i]);
                bw.newLine();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
        System.out.println("--------------------------------");
        try (BufferedReader rw = new BufferedReader(new FileReader(fileName))) {
            String q;
            String a;
            Scanner sc = new Scanner(System.in);
            while ((q=rw.readLine())!=null) {
                a = rw.readLine();
                System.out.println("(문제) "+q);
                System.out.print("정답 입력 => ");
                String userAnswer=sc.next();
                if(a.equals(userAnswer)){
                    System.out.println("정답입니다!!!");
                } else {
                    System.out.println("틀렸습니다. 정답은 "+a+"입니다.");
                }
                System.out.println();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        System.out.println("--------------------------------");
        System.out.println("모든 퀴즈가 완료되었습니다.");
        System.out.println("수고 하셨습니다.^^");

    }
}
