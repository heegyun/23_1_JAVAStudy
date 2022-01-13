package my.day09;

public class SmartPhone implements Alam, Phone, Messenger {

    private String phoneNumber;

    public SmartPhone(){

    }
    public SmartPhone(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void beep() {
        System.out.println("[비프음] 이 재생됩니다. 삐빕~~삐빔!(*10");
    }

    @Override
    public void playMusic(String music) {
        System.out.println("["+ music +"] 이 재생 됩니다.");
    }

    @Override
    public void sendMsg(String phonNumber, String msg) {
        System.out.printf("[%s]로 메시지 전송: %s\n", phonNumber, msg);
    }

    @Override
    public void receiveMsg() {
        System.out.println("메시지가 도착했습니다.");
    }

    @Override
    public void call(String phonNumber) {
        System.out.printf("[%s] 로 전화를 겁니다.,rrrrr\n", phonNumber);
    }

    @Override
    public void receive() {
        System.out.println("전화를 받습니다.");
    }
}
