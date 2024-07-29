package access;

public class Speaker {
    int volume;
    // private int volume; * 접근제어자

    Speaker(int volume) {
        this.volume = volume;

    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("볼륨을 더이상 키울수 없습니다");
        } else {
            volume += 10;
            System.out.println("볼륨을 10씩 증가합니다");
        }
    }

    void volumeDown() {
        if (volume <= 0) {
            System.out.println("더이상 볼륨을 낮출수 없어요");
        } else {
            volume -= 10;
            System.out.println("볼륨을 10 줄입니다");
        }
    }

    void showVolum() {
        System.out.println("현재 볼륨은 : " + volume);
    }
}
