package com.home.work.techproblemsolving.codeflights.arrays

import spock.lang.Specification

/**
 *  Puneethkumar CK
 *
 */
class GFirstDuplicateMinIndexTest extends Specification {

    def "FirstDuplicate"() {

        given :"input array of integers"
        inputArray

        when : "find first duplicate number"
        int output= GFirstDuplicateMinIndex.firstDuplicate(inputArray)

        then:"expected output"
        output==expectedOutput

        where:"for the given inputs"
        inputArray                      | expectedOutput
        [2,4,3,5,1]                     | -1
        [2, 3, 3, 1, 5, 2]              | 3
        [1]                             |-1
        [2, 2]                          |2
        [2,1]                           |-1
        [2, 1, 3]                       |-1
        [2, 3, 3]                       |3
        [3, 3, 3]                       |3
        [8, 4, 6, 2, 6, 4, 7, 9, 5, 8]  | 6
        [10, 6, 8, 4, 9, 1, 7, 2, 5, 3] | -1
        [1, 1, 2, 2, 1]                 | 1
    }

    def "FirstDuplicate2"() {

        given :"input array of integers"
        inputArray

        when : "find first duplicate number"
        int output= GFirstDuplicateMinIndex.firstDuplicate2(inputArray)

        then:"expected output"
        output==expectedOutput

        where:"for the given inputs"
        inputArray                      | expectedOutput
        [2,4,3,5,1]                     | -1
        [2, 3, 3, 1, 5, 2]              | 3
        [1]                             |-1
        [2, 2]                          |2
        [2,1]                           |-1
        [2, 1, 3]                       |-1
        [2, 3, 3]                       |3
        [3, 3, 3]                       |3
        [8, 4, 6, 2, 6, 4, 7, 9, 5, 8]  | 6
        [10, 6, 8, 4, 9, 1, 7, 2, 5, 3] | -1
        [1, 1, 2, 2, 1]                 | 1
    }
}
