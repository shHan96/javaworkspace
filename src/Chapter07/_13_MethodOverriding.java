package Chapter07;

import Chapter07.camera.Camera;
import Chapter07.camera.FactoryCam;
import Chapter07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 덮어쓰기 (재정의)
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();;
        speedCam.showMainFeature();
    }
}
