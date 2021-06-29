package ge.btu.badri.kavteladze.testdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class PrintAnnotationAspect {

    @Before("@annotation(Println)")
    public void multiplication(JoinPoint joinPoint) {
        System.out.println("გადაცემული არგუმენტები" + Arrays.toString(joinPoint.getArgs()));
    }
}

