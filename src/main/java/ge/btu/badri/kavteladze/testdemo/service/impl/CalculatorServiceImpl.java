package ge.btu.badri.kavteladze.testdemo.service.impl;

import ge.btu.badri.kavteladze.testdemo.aspect.Println;
import ge.btu.badri.kavteladze.testdemo.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Println
    @Override
    public int multiplication(int x, int y) {
        return x * y;
    }

}
