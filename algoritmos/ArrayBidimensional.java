import java.util.ArrayList;
import java.util.List;

public class ArrayBidimensional {
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int interSum = 0;
        int maxSum = -64;
        int rowPos = 0;
        int columnPos = 0;

        while(rowPos + 2 <= 5){
            while(columnPos + 2 <= 5) {
                interSum = arr.get(rowPos).get(columnPos) +
                        arr.get(rowPos).get(columnPos + 1) +
                        arr.get(rowPos).get(columnPos + 2) +
                        arr.get(rowPos + 1).get(columnPos + 1) +
                        arr.get(rowPos + 2).get(columnPos) +
                        arr.get(rowPos + 2).get(columnPos + 1) +
                        arr.get(rowPos + 2).get(columnPos + 2);
                columnPos++;
                if(interSum > maxSum) {maxSum = interSum;}
            }
            columnPos = 0;
            rowPos++;
        }
        return maxSum;

    }

    public static void main(String[] args) {
        List<List<Integer>> array = new ArrayList<>();
        List<Integer> row0 = new ArrayList<>();
        row0.add(1);
        row0.add(1);
        row0.add(1);
        row0.add(0);
        row0.add(0);
        row0.add(0);
        List<Integer> row1 = new ArrayList<>();
        row1.add(0);
        row1.add(1);
        row1.add(0);
        row1.add(0);
        row1.add(0);
        row1.add(0);
        List<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        row2.add(1);
        row2.add(0);
        row2.add(0);
        row2.add(0);
        List<Integer> row3 = new ArrayList<>();
        row3.add(0);
        row3.add(0);
        row3.add(2);
        row3.add(4);
        row3.add(4);
        row3.add(0);
        List<Integer> row4 = new ArrayList<>();
        row4.add(0);
        row4.add(0);
        row4.add(0);
        row4.add(2);
        row4.add(0);
        row4.add(0);
        List<Integer> row5 = new ArrayList<>();
        row5.add(0);
        row5.add(0);
        row5.add(1);
        row5.add(2);
        row5.add(4);
        row5.add(0);
        array.add(row0);
        array.add(row1);
        array.add(row2);
        array.add(row3);
        array.add(row4);
        array.add(row5);

        int retorno = hourglassSum(array);

        System.out.println(retorno);
    }
}
