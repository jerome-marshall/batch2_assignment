import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    }

    //    Activity 1
    public static String replaceCharacters(String str) {
        int length = str.length();
        char[] charStr = str.toCharArray();

        if (length <= 4) {
            System.out.println(str);
            return "Enter a valid String";
        }

        for (int i = 0; i < 4; i++) {
            charStr[i] = 'X';
        }

        return new String(charStr);
    }

    //    Activity 2
    public static String replaceCharactersWithStringBuilder(String str) {
        StringBuilder builderStr = new StringBuilder();

        if (builderStr.length() <= 4) {
            System.out.println(builderStr);
            return "Enter a valid String";
        }
        builderStr.append(str);

        builderStr.replace(0, 4, "XXXX");

        return builderStr.toString();
    }

    //    Activity 3
    public static String stringConcat(String[] str) {
        String res = "";

        for (String st : str) {
            if (st.equals(null))
                continue;

            res = res.concat(st);
        }

        return res;
    }

    //    Activity 4
    public static String enhancedFor(int[] arr) {
        boolean flag = true;
        String str = "";

        for (int element : arr) {
            if (flag)
                str = str.concat(String.valueOf(element) + " ");
            flag = !flag;
        }

        return str;
    }

    public static String revEnhancedFor(int[] arr) {
        String str = "";

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.reverse(list);

        for (Integer e : list)
            str = str.concat(e.toString() + " ");

        return str;
    }

    //  Activity 5
    public static String accessModifiers() {
        return "public > protected > default > private";
    }

    //    Activity 6
    public static String checkVowels(char[] ch) throws xException {
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                count++;
            } else if (ch[i] == 'x') {
                xException exp = new xException("Found x at " + i + 1 + " position");
                throw exp;
            }
        }
        return String.valueOf(count);
    }

    //    Activity 7
    public static String fileIO() throws IOException {
        List<String> arrData = new ArrayList<String>();
        arrData.add("This");
        arrData.add("is");
        arrData.add("some");
        arrData.add("random");
        arrData.add("text");

        FileWriter writer = new FileWriter("output.txt");
        for (String str : arrData) {
            writer.write(str + " ");
        }
        writer.close();

        return "File created successfully";
    }

//    Activity 8 is at src/Activity 8.txt

//    Activity 9 is at src/Activity 9.txt

//   Activity 10 is at src/Activity 10.txt

}

class xException extends Exception {
    xException(String msg){
        super(msg);
    }
}
