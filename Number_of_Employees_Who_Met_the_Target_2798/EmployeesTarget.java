package Number_of_Employees_Who_Met_the_Target_2798;

import java.util.*;

class EmployeesTarget {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int total = 0;
        for(int n : hours) {
            if(n >= target) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        EmployeesTarget obj = new EmployeesTarget();
        int[] hours = {0, 1, 2, 3, 4};
        int target = 2;
        System.out.println(obj.numberOfEmployeesWhoMetTarget(hours, target)); // 3
    }
}
