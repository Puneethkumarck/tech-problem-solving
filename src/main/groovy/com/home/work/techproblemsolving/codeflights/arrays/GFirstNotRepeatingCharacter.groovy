package com.home.work.techproblemsolving.codeflights.arrays

/**
 * Puneethkumar ck
 *
 *
 * Note: Write a solution that only iterates over the string once and uses O(1) additional memory, since this is what you would be asked to do during a real interview.

 Given a string s, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.

 Example

 For s = "abacabad", the output should be
 firstNotRepeatingCharacter(s) = 'c'.

 There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

 For s = "abacabaabacaba", the output should be
 firstNotRepeatingCharacter(s) = '_'.

 There are no characters in this string that do not repeat.

 Input/Output

 [execution time limit] 6 seconds (groovy)

 [input] string s

 A string that contains only lowercase English letters.

 Guaranteed constraints:
 1 ≤ s.length ≤ 105.

 [output] char

 The first non-repeating character in s, or '_' if there are no characters that do not repeat.

 */
class GFirstNotRepeatingCharacter {

    static char firstNotRepeatingCharacter(String s) {

        Map<Character,Integer> hashMap=[:]

        char result=' '

        LinkedHashSet<Character> resultSet=[]

        LinkedHashSet<Character> repeated=[]

        s.toCharArray().each {
            c ->
                if(hashMap.containsKey(c)){
                    hashMap.put(c,hashMap.get(c)+1)
                    repeated.add(c)
                }else{
                    hashMap.put(c,1)
                    resultSet.add(c)
                }

        }

        resultSet.removeAll(repeated)

        !resultSet.empty?resultSet[0]:'_'
    }


    static char firstNotRepeatingCharacter2(String s) {

        for (int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i) as String)==s.lastIndexOf(s.charAt(i) as String)){
                return s.charAt(i)
            }
        }

        '_'

    }

    static void main(String[] args){
        println(firstNotRepeatingCharacter("abacabad"))

        println(firstNotRepeatingCharacter2("abacabad"))
    }

}

