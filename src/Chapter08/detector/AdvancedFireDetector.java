package Chapter08.detector;

public class AdvancedFireDetector implements Detectable{
    @Override
    public void detect() {
        System.out.println("향상된 선능으로 화재를 감지합니다.");
    }
}
