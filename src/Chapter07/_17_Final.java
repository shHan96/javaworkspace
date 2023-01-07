package Chapter07;

import Chapter07.camera.ActionCam;
import Chapter07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final

        // public (final) class ...
        // public (final) void ....
        // public > abstract > static > final > ...

        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        SlowActionCam slowActionCam = new SlowActionCam();

        slowActionCam.makeVideo();

    }
}
