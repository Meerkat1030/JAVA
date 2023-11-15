package sec03.chap05;

public class RemoteControlEx {
    public static void main(String[] args) {
//        RemoteControl rc = new Television();
//
//        rc.turnOn();
//
//        rc = new Audio();
//        rc.turnOn();
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);

        RemoteControl rc;
        rc = new Television();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);
        rc.setVolume(50);
        rc.turnOff();

    }
}
