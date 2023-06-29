package se.codewars.kyu4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class MachineLearning {
    static List<Function<Integer, Integer>> _actions = Arrays.asList(x -> x + 1, x -> 0, x -> x % 2, x -> x / 2, x -> x * 100);

    private Map<Integer, byte[]> commandResponsesMap = new HashMap<>();
    private int lastCommand;
    private int lastAction;

    private int useAction(int action, int num) {
        return _actions.get(action).apply(num);
    }

    public int command(int cmd, int num) {
        lastCommand = cmd;
        byte[] actionResponses = commandResponsesMap.computeIfAbsent(cmd, k -> new byte[_actions.size()]);
        int action = 0;
        //0 - not tried, 1 - false, 2 - true
        for (int i = 0; i < actionResponses.length; i++) {
            if (actionResponses[i] == 2) {
                action = i;
                break;
            }
            if (actionResponses[i] == 0) {
                action = i;
            }
        }
        lastAction = action;
        return useAction(action, num);
    }

    public void response(boolean result) {
        byte[] actionResponses = commandResponsesMap.get(lastCommand);
        actionResponses[lastAction] = (byte) (result ? 2 : 1);
    }
}
