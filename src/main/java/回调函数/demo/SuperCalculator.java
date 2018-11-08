package 回调函数.demo;

import java.math.BigDecimal;

/**
 * @author james
 * @date 2018/11/7
 */
public class SuperCalculator {

    public void add(int a, int b, DoJob customer) {

        int result = a + b;

        customer.fillBlank(a, b, result);
    }

    public void multiply(int a, int b, DoJob customer) {

        int result = a * b;

        customer.fillBlank(a, b, result);

    }

}
