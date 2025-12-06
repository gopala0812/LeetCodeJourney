package Final_Value_of_Variable_2011;

import java.util.*;

class FinalValueOperation {

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0; i < operations.length; i++) {
            if(operations[i].equals("--X")) {
                --x;
            } else if(operations[i].equals("X++")) {
                x++;
            } else if(operations[i].equals("++X")) {
                ++x;
            } else {
                x--;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        FinalValueOperation obj = new FinalValueOperation();
        String[] operations = {"--X","X++","X++"};
        System.out.println(obj.finalValueAfterOperations(operations)); // 1
    }
}
