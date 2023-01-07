package Chapter08.detector;

public class AccidentDetector implements Detectable{
    @Override
    public void detect() {
        System.out.println("교동 사고를 감지합니다.");
    }
}
