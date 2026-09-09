package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<String> history;

    public Calculator() {
        history = new ArrayList<>();
    }

    public int add(int a, int b) {
        int result = a + b;
        history.add(a + "+"+b+"="+result); // a=1 b=2 result=3 history.add("1+2=3")
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        history.add(a + "-"+b+"="+result); // a=1 b=2 result=-1 history.add("1-2=-1")
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        history.add(a + "*"+b+"="+result); // a=1 b=2 result=2 history.add("1*2=2")
        return result;
    }

    public double divide(int a, int b) {
        double result = (double) a / b;
        history.add(a + "/"+b+"="+result); // a=1 b=2 result=0.5 history.add("1/2=0.5")
        return result;
    }

    public List<String> getHistory(){
        return history;
    }

    public void clearHistory(){
        System.out.println("Clean History records");
        history.clear();
    }

}
