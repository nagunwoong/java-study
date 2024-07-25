package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        on(data);

        volumeUp(data);
        volumeUp(data);
        volumeDown(data);

        state(data);


        off(data);

    }

    static void on(MusicPlayerData data) {
        data.ison = true;
        System.out.println("음악을 재생합니다");
    }

    static void off(MusicPlayerData data) {
        data.ison = false;
        System.out.println("음악을 끕니다");
    }

    static void volumeUp(MusicPlayerData data) {
    data.volume++;
        System.out.println("볼륨은 : " + data.volume);

    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨은 : " + data.volume);
    }

    static void state(MusicPlayerData data) {
        if (data.ison) {
            System.out.println("플레이어 상태 : " + data.volume);
        } else {
            System.out.println("프레이어를 종료합니다");
        }
    }
}

