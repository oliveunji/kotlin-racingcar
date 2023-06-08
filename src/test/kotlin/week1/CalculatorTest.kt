package week1

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class CalculatorTest{
    @Test
    fun `덧샘 테스트`(){
        val calculator = Calculator()
        val result = calculator.plus(3F,5F)
        assertEquals(8F, result)
    }

    @Test
    fun `뺄샘 테스트`(){
        val calculator = Calculator()
        val result = calculator.minus(3F,5F)
        assertEquals(-2F, result)
    }

    @Test
    fun `곱셈 테스트`(){
        val calculator = Calculator()
        val result = calculator.multiply(3F,5F)
        assertEquals(15F, result)
    }

    @Test
    fun `나눗셈 테스트`(){
        val calculator = Calculator()
        val result = calculator.divide(3F,5F)
        assertEquals(0.6F, result)
    }

}