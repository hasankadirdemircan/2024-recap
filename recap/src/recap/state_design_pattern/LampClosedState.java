package recap.state_design_pattern;

public class LampClosedState implements LampState {

    @Override
    public void onOpen() {
        System.out.println("Lamba kapalı fakat şuan açılıyor..");
    }

    @Override
    public void onClose() {
        System.out.println("Lambayı kapatmaya çalışıyorsun fakat zaten kapalı..");
    }

}