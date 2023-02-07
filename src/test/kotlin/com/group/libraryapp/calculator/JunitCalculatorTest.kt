package com.group.libraryapp.calculator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class JunitCalculatorTest {

    @Test
    fun addTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.add(3)

        // then
        assertEquals(8, calculator.number)
    }

    @Test
    fun minusTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.minus(3)

        // then
        assertEquals(2, calculator.number)
    }

    @Test
    fun multiplyTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.multiply(3)

        // then
        assertEquals(15, calculator.number)
    }

    @Test
    fun divideTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.divide(2)

        // then
        assertEquals(2, calculator.number)
    }

    @Test
    fun divideExceptionTest() {
        // given
        val calculator = Calculator(5)

        // when & then
        assertThrows<IllegalArgumentException> {
            calculator.divide(0)
        }.apply {
            assertEquals("0으로 나눌 수 없습니다.", message)
        }

    }
}