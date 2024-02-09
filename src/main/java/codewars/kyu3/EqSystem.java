package codewars.kyu3;

import java.util.ArrayList;
import java.util.List;

public class EqSystem {
    public static String simplify(String[] examples, String formula) {
        // Your code here!
        return null;
    }
}

class Variable {
    private final char var;
    private int coeff;

    public Variable(char var, int coeff) {
        this.var = var;
        this.coeff = coeff;
    }

    public char getVar() {
        return var;
    }

    public int getCoeff() {
        return coeff;
    }

    public void add(Variable variable) {
        if (variable.getVar() == this.var) {
            this.coeff += variable.getCoeff();
        }
    }

    public void multCoeff(int mult) {
        this.coeff *= mult;
    }

    public static Variable parseVar(String s) {
        s = s.trim().replaceAll(" ", "");
        if (s.length() > 1) {
            int coeff = Integer.parseInt(s.substring(0, s.length() - 1));
            char var = s.charAt(s.length() - 1);
            return new Variable(var, coeff);
        } else return new Variable(s.charAt(0), 1);
    }
}

class Formula {
    private List<Variable> vars;
    private char equals = 0;

    public List<Variable> getVars() {
        return vars;
    }

    public char getEquals() {
        return equals;
    }

    public void setEquals(char equals) {
        this.equals = equals;
    }

    public Formula() {
        this.vars = new ArrayList<>();
    }

    public void addVars(Variable... vars) {
        for (Variable var : vars) {
            addVar(var);
        }
    }

    private void merge(Formula f) {
        for (Variable v : f.getVars()) {
            for (Variable var : vars) {
                var.add(v);
            }
        }
    }

    private void addVar(Variable var) {
        for (Variable variable : vars) {
            if (variable.getVar() == var.getVar()) {
                variable.add(var);
                break;
            }
        }
    }

    public static Formula parseFormula(String f) {
        Formula result = new Formula();
        String s = f.replaceAll(" ", "");

        char equals = '\n';
        if (f.contains("=")) {
            equals = s.charAt(s.indexOf("=") + 1);
            s = s.replaceAll("=[a-z]", "");
        }

        while (s.contains("(")) {
            //String brackets = s.substring(getFirstBracketCoefIndex(s), getFirst+1);
            //s=s.replaceFirst(brackets,"");
            //result.merge(openBrackets(brackets, 1));

        }


        if (equals != '\n') result.setEquals(equals);
        return result;
    }

    private static Formula parseFormulaWithoutBrackets(String s) {
        Formula result = new Formula();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] == '-' && i != 0) || charArray[i] == '+' || charArray[i] == '=') {
                StringBuilder sb = new StringBuilder();
                boolean flag = false;
                for (int j = i - 1; j > 0; j--) {
                    if (charArray[j] != '-' || charArray[j] != '+') {
                        sb.append(charArray[j]);
                    } else {
                        flag = true;
                        sb.append(charArray[j]);
                        result.addVar(Variable.parseVar(sb.reverse().toString()));
                        break;
                    }
                }
                if (!flag)
                    result.addVar(Variable.parseVar(sb.reverse().toString()));
                if (charArray[i] == '=') {
                    result.setEquals(charArray[i + 1]);
                    break;
                }
            }
        }
        return result;
    }

    private static Formula openBrackets(String orig, int mult) {
        if (!orig.contains("(")) return parseFormula(orig);
        int start, end;
        start = orig.indexOf('(');
        end = orig.lastIndexOf(')');

        return null;
        /*
        while (true) {
            if (start != 0) {
                if (Character.isDigit(orig.charAt(start - 1)))
                    start -= 1;
                //else
            }
        }
        //String toReplace, Replacement;
        //toReplace = orig.substring(start, end + 1);
        //if (toReplace.contains("(")) {
        //}

*/
    }

    private static int getFirstBracketCoefIndex(String s) {
        return 0;
    }

}
