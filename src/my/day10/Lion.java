package my.day10;

// 2. 동물 클래스의 자식 클래스 (상속관계)
public class Lion  extends Animal implements Predator {
    @Override
    public String getName() {
        return name;
    }
}
