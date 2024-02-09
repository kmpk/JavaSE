package codewars.kyu5;

public class EncodeResistorColors {
    public static String encodeResistorColors(String ohmsString) {
        StringBuilder sb = new StringBuilder();
        String ohms;
        double value;
        if (ohmsString.contains("M")) {
            ohms = ohmsString.replaceAll("M ohms", "");
            value = Double.valueOf(ohms) * 1000000;
            sb.append(getColor(ohmsString.charAt(0)));
            if (Character.isDigit(ohmsString.charAt(1))) sb.append(" ").append(getColor(ohmsString.charAt(1)));
            else if (ohmsString.charAt(1) != 'M') sb.append(" ").append(getColor(ohmsString.charAt(2)));
            else sb.append(" ").append("black");
            sb.append(" ").append(getMultiplier(value));
        } else if (ohmsString.contains("k")) {
            ohms = ohmsString.replaceAll("k ohms", "");
            value = Double.valueOf(ohms) * 1000;
            sb.append(getColor(ohmsString.charAt(0)));
            if (Character.isDigit(ohmsString.charAt(1))) sb.append(" ").append(getColor(ohmsString.charAt(1)));
            else if (ohmsString.charAt(1) != 'k') sb.append(" ").append(getColor(ohmsString.charAt(2)));
            else sb.append(" ").append("black");
            sb.append(" ").append(getMultiplier(value));
        } else {
            ohms = ohmsString.replaceAll(" ohms", "");
            value = Double.valueOf(ohms);
            sb.append(getColor(ohmsString.charAt(0)));
            if (Character.isDigit(ohmsString.charAt(1))) sb.append(" ").append(getColor(ohmsString.charAt(1)));
            sb.append(" ").append(getMultiplier(value));
        }
        return sb.append(" ").append("gold").toString();
    }

    private static String getMultiplier(double value) {
        if (value < 100d) return "black";
        else if (value < 1000d) return "brown";
        else if (value < 10000d) return "red";
        else if (value < 100000d) return "orange";
        else if (value < 1000000d) return "yellow";
        else if (value < 10000000d) return "green";
        else if (value < 100000000d) return "blue";
        else if (value < 1000000000d) return "violet";
        else if (value < 10000000000d) return "gray";
        else if (value < 100000000000d) return "white";
        else throw new IllegalArgumentException();
    }

    private static String getColor(char digit) {
        switch (digit) {
            case '0': {
                return "black";
            }
            case '1': {
                return "brown";
            }
            case '2': {
                return "red";
            }
            case '3': {
                return "orange";
            }
            case '4': {
                return "yellow";
            }
            case '5': {
                return "green";
            }
            case '6': {
                return "blue";
            }
            case '7': {
                return "violet";
            }
            case '8': {
                return "gray";
            }
            case '9': {
                return "white";
            }
        }
        throw new IllegalArgumentException();
    }
}
