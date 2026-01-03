import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class casasDecimais {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double positives = 0;
        double negatives = 0;
        double zeroes = 0;
        DecimalFormat df = new DecimalFormat("0.000000");
        for(int num: arr) {
            if(num > 0) {
                positives++;
            }
            if(num < 0) {
                negatives++;
            }
            if(num == 0) {
                zeroes++;
            }
        }
        String formatpos = df.format(positives / arr.size());
        String formatneg = df.format(negatives / arr.size());
        String formatzer = df.format(zeroes / arr.size());
        System.out.println(formatpos);
        System.out.println(formatneg);
        System.out.println(formatzer);
    }

    public static void main(String[] args) {
        List<Integer> dados = new ArrayList<>();
        dados.add(-4);
        dados.add(3);
        dados.add(-9);
        dados.add(0);
        dados.add(4);
        dados.add(1);

        plusMinus(dados);
    }
}
