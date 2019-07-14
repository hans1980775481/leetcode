func nextGreatestLetter(letters []byte, target byte) byte {
    var min byte = target
    var max byte = target
    for _, letter := range letters {
        if letter < min {
            min = letter
        } else if letter > target {
            if max == target {
                max = letter
            } else if max > letter {
                max = letter
            }
        }
    }
    if max == target {
        return min
    } else {
        return max
    }
}
