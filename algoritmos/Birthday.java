import java.util.ArrayList;
import java.util.List;

public class Birthday {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        if(s.size() < m) {
            return 0;
        }
        int init = 0;
        int qty = 0;
        while(init + m <= s.size()) {
            int sum = 0;
            for(int i = init; i < init + m; i++){
                sum += s.get(i);
            }
            if(sum == d) {
                qty++;
            }
            init++;
        }

        return qty;
    }

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);

        System.out.println(birthday(s, 3, 2));
    }

}
