package Chapter08;

import Chapter08.camera.FactoryCam;
import Chapter08.detector.AdvancedFireDetector;
import Chapter08.detector.Detectable;
import Chapter08.detector.FireDetector;
import Chapter08.reporter.NormalReporter;
import Chapter08.reporter.Reportable;
import Chapter08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("--------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("--------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();


    }
}
