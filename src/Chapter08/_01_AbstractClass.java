package Chapter08;

import Chapter08.camera.Camera;
import Chapter08.camera.FactoryCam;
import Chapter08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 글래스 (아직 완성돠지 않은 클래스)
        // 추상 메소드 (추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드)

        //Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

    }
}
