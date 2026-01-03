import java.util.Arrays;

public class EletronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int max = 0;
        System.out.println(keyboards.length);
        for(int i = keyboards.length - 1; i >= 0; i--) {
            System.out.println("oi");
            for(int j = drives.length - 1; j >= 0; j--) {
                System.out.println(keyboards[i] + drives[j]);
                System.out.println(b);
                System.out.println(max);
                if((keyboards[i] + drives[j]) <= b && (keyboards[i] + drives[j]) > max) {
                    max = keyboards[i] + drives[j];
                }
            }
        }
        return (max != 0 ? max : -1);

    }

    public static void main(String[] args) {
        int[] keyb = {5, 2, 8};
        int[] drives = {3, 1};

        System.out.println(getMoneySpent(keyb, drives, 10));
    }

}
