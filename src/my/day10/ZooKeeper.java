package my.day10;

// 4. 사육사 클래스
public class ZooKeeper {

    // 호랑이에게 먹이를 주다..

    public void feed(Tiger tiger) { // 메소드 오버로딩1
        System.out.println("feed tiger");
    }

    // 사자에게 먹이를 주다...
    public void feed(Lion lion) {  // 메소드 오버로딩2
        System.out.println("feed lion");
    }

    // 악어, 표범 육식동물에게 먹이를 주려면?.....
    public void feed(Crocodile crocodile) { // 메소드 오버로딩3
        System.out.println("feed crocodile");
    }

    public void feed(Leopard leopard) { // 메소드 오버로딩4
        System.out.println("feed leopard");
    }


    // 문제 해결1. 하나의 타입(동물타입)으로 매개변수 변경(업캐스팅), 다운캐스팅(instanceof)활용
    public void feed(Animal animal) {

        if (animal instanceof Tiger) {
            System.out.println("feed tiger");
        } else if (animal instanceof Lion) {
            System.out.println("feed lion");
        } else if (animal instanceof Crocodile) {

        }
    }


    // 문제 해결2. 하나의 타입(인터페이스)로 매개변수 변경
    public void feed(Predator predator){
            System.out.println("feed " + predator.getName());
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.setName("tiger");
        Lion lion = new Lion();
        lion.setName("lion");
        Crocodile crocodile = new Crocodile();
        crocodile.setName("crocodile");
        Leopard leopard = new Leopard();
        leopard.setName("leopard");

        ZooKeeper zooKeeper = new ZooKeeper();

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
        zooKeeper.feed(crocodile);
        zooKeeper.feed(leopard);
    }


}
