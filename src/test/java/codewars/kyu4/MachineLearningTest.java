package codewars.kyu4;

import codewars.kyu4.MachineLearning;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

import static org.junit.Assert.*;

public class MachineLearningTest {
    static List<Function<Integer, Integer>> _actions = Arrays.asList(x->x+1, x->0, x->x%2, x->x/2, x->x*100);

    class MyTest {

        public int cmd;
        public int num;
        public int result;
        public String description;
        public Function<Integer,Integer> fun;

        public MyTest (int cmd, int num, int result, String description, Function<Integer,Integer> fun) {
            this.cmd = cmd;
            this.num = num;
            this.result = result;
            this.description = description;
            this.fun = fun;
        }
    }



    @Test
    public void testCommand0ShouldReturn0() {
        MachineLearning machineLearning = new MachineLearning();
        final Random rnd = new Random();
        for (int i=0;i<20;i++) {

            int r = machineLearning.command(0,rnd.nextInt(101));
            machineLearning.response(r==0);

        }

        assertEquals(machineLearning.command(0,rnd.nextInt(101)), 0);
    }

    @Test
    public void testCorrectFunctionsForAllCommands() {
        MachineLearning machineLearning = new MachineLearning();
        final Random rnd = new Random();
        MyTest[] tests={new MyTest(0, 100, 101, "Should apply the num + 1 action to the command 0",null),
                new MyTest(1, 100, 0,"Should apply the num * 0 action to the command 1",null),
                new MyTest(2, 100, 50,"Should apply the num / 2 action to the command 2",null),
                new MyTest(3, 1, 100,"Should apply the num * 100 action to the command 3",null),
                new MyTest(4, 100, 0,"Should apply the num % 2 action to the command 4",null)};

        for (int i=0;i<200;i++) {

            int number = rnd.nextInt(101);
            int num = machineLearning.command(i%5, number);
            machineLearning.response(_actions.get(i%5).apply(number) == num);
        }

        for (MyTest test : tests) {
            int num = machineLearning.command(test.cmd,test.num);
            assertEquals((int)_actions.get(test.cmd).apply(test.num), num);

        }

    }
}