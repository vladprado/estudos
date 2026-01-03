import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPair {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int qty = 0;
        for(int i = 0; i < ar.size() - 1; i++) {
            for(int j = i + 1; j < ar.size(); j++) {
                System.out.print("i: " + ar.get(i));
                System.out.println(" j: " + ar.get(j));
                if((ar.get(i) + ar.get(j)) % k == 0) {
                    System.out.println("added");
                    qty++;
                }
            }
        }
        return qty;
    }

    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2);

        System.out.println(divisibleSumPairs(6, 3, ar));

    }
}
