package my.day09;




public class InterfaceTest {
    public static void main(String[] args) {


        SmartPhone sp = new SmartPhone("010-1234-5678");
        Alam alam = sp;
        Phone phone = sp;
        Messenger messenger = sp;

        sp.playMusic("상어송");
        sp.call("010-456-7897");
        sp.sendMsg("010-456-7897","자니?");

    }
}
