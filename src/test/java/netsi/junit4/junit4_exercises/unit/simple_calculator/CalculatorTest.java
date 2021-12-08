package netsi.junit4.junit4_exercises.unit.simple_calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    private final Calculator calculator = new Calculator();
    private final CalculatorTestData testData = new CalculatorTestData();

    @Test
    void sum() {
        var data = testData.getDataToAdd();

        data.forEach(numbersToAddAndResultList -> assertThat(calculator.sum(numbersToAddAndResultList.get(0),
                numbersToAddAndResultList.get(1)))
                .isEqualTo(numbersToAddAndResultList.get(2)));
    }

    @Test
    void subtract() {
        var data = testData.getDataToSubtract();

        data.forEach(numbersToSubtractAndResultList -> assertThat(calculator.subtract(
                numbersToSubtractAndResultList.get(0),
                numbersToSubtractAndResultList.get(1)))
                .isEqualTo(numbersToSubtractAndResultList.get(2))
        );
    }

    @Test
    void multiply() {
        var data = testData.getDataToMultiply();

        data.forEach(numbersToMultiplyAndResultList -> assertThat(calculator.multiply(
                numbersToMultiplyAndResultList.get(0),
                numbersToMultiplyAndResultList.get(1)))
                .isEqualTo(numbersToMultiplyAndResultList.get(2))
        );
    }

    @Test
    void divide() {
        var data = testData.getDataToDivide();

        data.forEach(numbersToDivideAndResultList -> assertThat(calculator.divide(
                numbersToDivideAndResultList.get(0),
                numbersToDivideAndResultList.get(1)))
                .isEqualTo(numbersToDivideAndResultList.get(2))
        );
    }
}