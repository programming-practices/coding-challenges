package com.trl.codingchallenges.a1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void test_1() {
        int[] array = {1, 3, 6, 4, 1, 2};
        int expected = 5;

        int result = this.solution.solution(array);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test_2() {
        int[] array = {1, 2, 3};
        int expected = 4;

        int result = this.solution.solution(array);

        assertThat(result).isEqualTo(expected);
    }


    @Test
    void test_3() {
        int[] array = {-1, -3};
        int expected = 1;

        int result = this.solution.solution(array);

        assertThat(result).isEqualTo(expected);
    }

}
