package my.day07;

public class IntegerArray {
    public static void main(String[] args) {
        int [][] scores = new int[2][3];
        scores[0][0] = 30;
        scores[0][1] = 50;
        scores[0][2] = 80;
        scores[1][0] = 100;
        scores[1][1] = 80;
        scores[1][2] = 70;

        for(int i = 0 ; i<scores.length;i++){
            for(int j = 0 ; j<scores[0].length;j++){
                System.out.println(scores[i][j]);
            }
        }


    }
}
