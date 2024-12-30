
package main

import "fmt"

const LEFT_SHIFT = 0
const RIGHT_SHIFT = 1

func stringShift(input string, shift [][]int) string {
    totalShifts := 0

    for _, current := range shift {
        direction := current[0]
        numberOfShifts := current[1]

        if direction == LEFT_SHIFT {
            totalShifts -= numberOfShifts
        } else {
            totalShifts += numberOfShifts
        }
    }

    if totalShifts == 0 {
        return input
    }

    totalShifts %= len(input)
    splitIndex := (len(input) - totalShifts) % len(input)

    return input[splitIndex:] + input[0:splitIndex]
}
