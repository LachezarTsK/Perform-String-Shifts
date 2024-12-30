
/**
 * @param {string} input
 * @param {number[][]} shift
 * @return {string}
 */
var stringShift = function (input, shift) {
    const LEFT_SHIFT = 0;
    const RIGHT_SHIFT = 1;

    let totalShifts = 0;
    for (let [direction, numberOfShifts] of shift) {
        totalShifts += (direction === LEFT_SHIFT) ? -numberOfShifts : numberOfShifts;
    }

    if (totalShifts === 0) {
        return input;
    }

    totalShifts %= input.length;
    const splitIndex = (input.length - totalShifts) % input.length;

    return input.substring(splitIndex, input.length) + input.substring(0, splitIndex);
};
