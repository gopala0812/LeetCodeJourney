package Sqrt_69;

public class SquareRoot {
    public int mySqrt(int x) {
        double res= Math.sqrt(x);
        double Final=Math.floor(res);
        int fin =(int)Final;
        return fin;
    }
    public static void main(String[] args) {
    	SquareRoot r=new SquareRoot();
    	
    	System.out.println(r.mySqrt(8));
    }
}


