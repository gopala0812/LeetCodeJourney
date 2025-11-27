package Defanging_an_IP_Address_1108;

import java.util.*;

class DefangingAnIPAddress {

    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (char ch : address.toCharArray()) {
            if (ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        DefangingAnIPAddress obj = new DefangingAnIPAddress();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP Address: ");
        String ip = sc.nextLine();

        String result = obj.defangIPaddr(ip);
        System.out.println("Defanged IP: " + result);
    }
}
