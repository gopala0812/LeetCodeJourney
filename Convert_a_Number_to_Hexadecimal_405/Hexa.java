package Convert_a_Number_to_Hexadecimal_405;

class Hexa {
    public String toHex(int num) {
        return Integer.toHexString(num);
    }
    public static void main(String[] args) {
    	int num=14;
    	Hexa h=new Hexa();
    	System.out.println(h.toHex(num));
    }
}