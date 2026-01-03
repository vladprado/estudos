public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        char[] charPath = path.toCharArray();
        int level = 0;
        int valleys = 0;
        for(char step : charPath) {
            System.out.println("Level: " + level);
            System.out.println("Step: " + step);
            if(level == 0 && String.valueOf(step).equals("D")) {
                valleys++;
                level--;
            } else {
                if(String.valueOf(step).equals("U")) {
                    level++;
                }
                if(String.valueOf(step).equals("D")) {
                    level--;
                }
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }
}
