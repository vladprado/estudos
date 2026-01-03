import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int answer = 0;
        int total = 0;
        int max = 0;
        int current = 0;
        Collections.sort(arr);
        for(int type : arr) {
            if(type != current) {
                System.out.println("Total " + total);
                System.out.println("Max " + max);
                System.out.println("Current: " + current);
                System.out.println("Type " + type);
                if(total > max) {
                    answer = current;
                    max = total;
                }
                current = type;
                total = 1;
            } else {
                total += 1;
            }
        }
        if(total > max) {
            answer = current;
        }

        return answer;

    }


    public static void main(String[] args) throws IOException {
        String file = "73966";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "")
                .split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = MigratoryBirds.migratoryBirds(arr);

        System.out.println("Resultado: " + result);
    }
}
