
using System;

public class Solution
{
    private static readonly int LEFT_SHIFT = 0;
    private static readonly int RIGHT_SHIFT = 1;

    public string StringShift(string input, int[][] shift)
    {
        int totalShifts = 0;
        foreach (int[] current in shift)
        {
            int direction = current[0];
            int numberOfShifts = current[1];
            totalShifts += (direction == LEFT_SHIFT) ? -numberOfShifts : numberOfShifts;
        }

        if (totalShifts == 0)
        {
            return input;
        }

        totalShifts %= input.Length;
        int splitIndex = (input.Length - totalShifts) % input.Length;

        return input.Substring(splitIndex, input.Length - splitIndex) + input.Substring(0, splitIndex);
    }
}
