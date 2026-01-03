import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencySorter {
    public static int[] sortByFrequency(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return Arrays.stream(nums)
                .boxed()
                .sorted((a, b) -> {
                    int freqCompare = Integer.compare(frequencyMap.get(a), frequencyMap.get(b));
                    return freqCompare != 0 ? freqCompare : Integer.compare(b, a);
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 4, 3, 1, 2, 2, 4};
        int[] sorted = sortByFrequency(nums);
        System.out.println(Arrays.toString(sorted));
    }
}
