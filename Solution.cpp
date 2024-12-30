
#include <string>
#include <vector>
using namespace std;

class Solution {

    static const int LEFT_SHIFT = 0;
    static const int RIGHT_SHIFT = 1;

public:
    string stringShift(string input, const vector<vector<int>>& shift) const {
        int totalShifts = 0;

        for (const auto& current : shift) {
            int direction = current[0];
            int numberOfShifts = current[1];
            totalShifts += (direction == LEFT_SHIFT) ? -numberOfShifts : numberOfShifts;
        }

        if (totalShifts == 0) {
            return input;
        }

        totalShifts = totalShifts % static_cast<int>(input.length());
        int splitIndex = (input.length() - totalShifts) % input.length();

        return input.substr(splitIndex, input.length() - splitIndex) + input.substr(0, splitIndex);
    }
};
