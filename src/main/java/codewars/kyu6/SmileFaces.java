package codewars.kyu6;

import java.util.List;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String s : arr) {
            if (isSmileFace(s)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isSmileFace(String face) {
        char[] faceArray = face.toCharArray();
        if (faceArray.length == 3) {
            if (faceArray[0] == ':' || faceArray[0] == ';')
                if (faceArray[1] == '-' || faceArray[1] == '~')
                    return faceArray[2] == ')' || faceArray[2] == 'D';
        } else {
            if (faceArray[0] == ':' || faceArray[0] == ';')
                return faceArray[1] == ')' || faceArray[1] == 'D';
        }
        return false;
    }
}
