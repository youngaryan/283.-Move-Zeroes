import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] l = new int[]{0,1,0,3,12};
        Solution solution = new Solution();
        solution.moveZeroes(l);
        System.out.println(Arrays.toString(l));
    }
}
