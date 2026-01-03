import java.util.ArrayList;
import java.util.List;

public class Scores {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int minScore = scores.get(0);
        int maxScore = scores.get(0);
        int qtyMin = 0;
        int qtyMax = 0;
        for(int score : scores){
            System.out.println(score);
            System.out.println(qtyMax);
            System.out.println(qtyMin);

            if(score < minScore) {
                qtyMin++;
            } else {
                if(score > maxScore) {
                    qtyMax++;
                }
            }
        }
        List<Integer> output = new ArrayList<>();
        output.add(qtyMax);
        output.add(qtyMin);
        return output;
    }

    public static void main(String[] args) {
        List<Integer> pontos = new ArrayList<>();
        pontos.add(10);
        pontos.add(5);
        pontos.add(20);
        pontos.add(20);
        pontos.add(4);
        pontos.add(5);
        pontos.add(2);
        pontos.add(25);
        pontos.add(1);

        System.out.println(breakingRecords(pontos));
    }

}
