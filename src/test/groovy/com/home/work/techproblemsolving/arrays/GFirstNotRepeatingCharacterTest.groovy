package com.home.work.techproblemsolving.arrays

import spock.lang.Specification

/**
 * Puneethkumar ck
 */
class GFirstNotRepeatingCharacterTest extends Specification {

    def "FirstNotRepeatingCharacter"() {

        given :"input String"

        when : "find first Non repeating char"
        char output= GFirstNotRepeatingCharacter.firstNotRepeatingCharacter(inputString as String)

        then:"expected output"
        output==expectedOutput

        where:"for the given inputs"
        inputString                     | expectedOutput
        "abacabad"                      | 'c'
        "abacabaabacaba"                | '_'
        "z"                             | 'z'
        "bcb"                           | 'c'
        "bcccccccb"                     | '_'
        "abcdefghijklmnopqrstuvwxyziflskecznslkjfabe" |'d'
        "zzz"                           |'_'
        "bcccccccccccccyb"              |'y'
        "xdnxxlvupzuwgigeqjggosgljuhliybkjpibyatofcjbfxwtalc" | 'd'
        "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof"| 'g'
    }

    def "FirstNotRepeatingCharacter2"() {


        given :"input String"

        when : "find first Non repeating char"
        char output= GFirstNotRepeatingCharacter.firstNotRepeatingCharacter2(inputString as String)

        then:"expected output"
        output==expectedOutput

        where:"for the given inputs"
        inputString                     | expectedOutput
        "abacabad"                      | 'c'
        "abacabaabacaba"                | '_'
        "z"                             | 'z'
        "bcb"                           | 'c'
        "bcccccccb"                     | '_'
        "abcdefghijklmnopqrstuvwxyziflskecznslkjfabe" |'d'
        "zzz"                           |'_'
        "bcccccccccccccyb"              |'y'
        "xdnxxlvupzuwgigeqjggosgljuhliybkjpibyatofcjbfxwtalc" | 'd'
        "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof"| 'g'
    }
}
