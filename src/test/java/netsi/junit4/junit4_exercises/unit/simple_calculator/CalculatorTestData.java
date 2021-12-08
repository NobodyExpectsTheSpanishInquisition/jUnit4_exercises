package netsi.junit4.junit4_exercises.unit.simple_calculator;

import java.util.List;

public class CalculatorTestData {
    public List<List<Integer>> getDataToAdd() {
        return List.of(
                List.of(1, 1, 2),
                List.of(0, 0, 0),
                List.of(-1, -1, -2),
                List.of(-1, -2, -3)
        );
    }

    public List<List<Integer>> getDataToSubtract() {
        return List.of(
                List.of(1, 1, 0),
                List.of(0, 0, 0),
                List.of(-1, -1, 0)
        );
    }

    public List<List<Integer>> getDataToMultiply() {
        return List.of(
                List.of(1, 1, 1),
                List.of(0, 0, 0),
                List.of(-1, -1, 1),
                List.of(1, 0, 0)
        );
    }

    public List<List<Integer>> getDataToDivide() {
        return List.of(
                List.of(2, 2, 1),
                List.of(3, 1, 3)
        );
    }
}
