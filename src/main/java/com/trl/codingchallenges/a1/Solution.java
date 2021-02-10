package com.trl.codingchallenges.a1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int[] arg) {
        List<Integer> list = Arrays.stream(arg).boxed().collect(Collectors.toList());

        Integer max = Collections.max(list);

        Integer min = Collections.min(list);

        if (min >= 0) {
            for (int i = min; i <= max; i++) {
                if (!list.contains(i)) {
                    return i;
                }
            }

            return max + 1;
        } else {
            return 1;
        }
    }

}


/*

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example:
Given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

*/
