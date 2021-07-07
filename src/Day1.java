import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Day1 {

    public static void findNum(int[] numList) {
        for(int i = 0; i < numList.length; i++) {
            for(int j = i; j < numList.length; j++) {
                for(int k = j + 1; k < numList.length; k++) {
                    if (numList[i] + numList[j] + numList[k] == 2020) {
                        System.out.println(numList[i] * numList[j] * numList[k]);
                        break;
                    }
                }
            }
        }
    }


    public static void main(String args[]) {
        try {
            BufferedReader inputList = new BufferedReader(new FileReader("reportrepair.txt"));

            List<String> input = new ArrayList<>();
            String list;
            while((list = inputList.readLine()) != null) {
                input.add(list);
            }

            int[] numList = new int[input.size()];

            int i = 0;
            for(String s: input) {
                numList[i] = Integer.valueOf(s);
                i++;
            }

            findNum(numList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}