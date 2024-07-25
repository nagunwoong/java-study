package oop1;

public class MusicPlayer {

    int volume = 0;
    boolean ison = false;


     void on() {
        ison = true;
        System.out.println("음악을 재생합니다");
    }

     void off() {
        ison = false;
        System.out.println("음악을 끕니다");
    }

     void volumeUp() {
        volume++;
        System.out.println("볼륨은 : " + volume);

    }

     void volumeDown() {
        volume--;
        System.out.println("볼륨은 : " + volume);
    }

     void state() {
         System.out.println("플레이어의 상태");
        if (ison) {
            System.out.println("플레이어 상태 : " + volume);
        } else {
            System.out.println("프레이어를 종료합니다");
        }

    }
}
