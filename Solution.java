
public class Solution {

    private static final int LEFT_SHIFT = 0;
    private static final int RIGHT_SHIFT = 1;

    public String stringShift(String input, int[][] shift) {

        int totalShifts = 0;
        for (int[] current : shift) {
            int direction = current[0];
            int numberOfShifts = current[1];
            totalShifts += (direction == LEFT_SHIFT) ? -numberOfShifts : numberOfShifts;
        }

        if (totalShifts == 0) {
            return input;
        }

        totalShifts %= input.length();
        int splitIndex = (input.length() - totalShifts) % input.length();

        return input.substring(splitIndex, input.length()) + input.substring(0, splitIndex);
    }
}
