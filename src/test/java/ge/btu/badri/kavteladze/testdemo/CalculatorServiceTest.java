package ge.btu.badri.kavteladze.testdemo;

import ge.btu.badri.kavteladze.testdemo.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    CalculatorService calculatorService;

    @Test
    void multiplicationTest() {
        int expectedResult = 20;
        int actualResult = calculatorService.multiplication(10, 2);
        assertEquals(expectedResult, actualResult);
    }
}
