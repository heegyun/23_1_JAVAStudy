package my.day03;
/*
 5층 건물이 있습니다. 1층 약국, 2층 정형외과, 3층 피부과,4층 치과, 5층 헬스클럽입니다.
 층을 입력 받아 해당 층이 어떤 곳인지를 알려주는 코드를 작성하세요.
 */
public class SwitchTest {
    public static void main(String[] args) {
        String medal = "Gold";

        switch (medal){
            case "Gold":
                System.out.println("금메달입니다.");
                break;
            case "Silver":
                System.out.println("은메달입니다.");
                break;
            case "Bronze":
                System.out.println("동메달입니다.");
                break;
            default:
                System.out.println("메달이 없네요..수고하셨습니다. ");
                break;
        }
    }
}
