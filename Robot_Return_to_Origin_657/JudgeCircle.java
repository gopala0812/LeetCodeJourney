package Robot_Return_to_Origin_657;

import java.util.*;

class JudgeCircle {

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for(int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i) == 'U') {
                y++;
            } else if(moves.charAt(i) == 'D') {
                y--;
            } else if(moves.charAt(i) == 'R') {
                x++;
            } else if(moves.charAt(i) == 'L') {
                x--;
            }
        }

        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        JudgeCircle obj = new JudgeCircle();
        System.out.println(obj.judgeCircle("UD"));   // true
        System.out.println(obj.judgeCircle("LL"));   // false
    }
}
