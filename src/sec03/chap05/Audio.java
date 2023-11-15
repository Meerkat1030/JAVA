package sec03.chap05;

public class Audio implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Audio ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio OFF");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else{
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + volume);
    }

    private int memoryVolume; // 필드추가선언
//  디폴트 매소드를 재정의 해서 사용할 수 있다.
    public void setMute(boolean mute){
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음 처리 합니다.");
            setVolume(RemoteControl.MIN_VOLUME);
        }else {
            System.out.println("무음 해제 합니다.");
            setVolume(this.memoryVolume); // 무음상태에서 > 기존의 설정된 볼륨으로 돌아가는 코드
        }
    }
}
