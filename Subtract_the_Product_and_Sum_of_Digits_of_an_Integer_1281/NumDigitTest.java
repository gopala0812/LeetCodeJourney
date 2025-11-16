package Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281;

class NumDigitTest {
    public int subtractProductAndSum(int n) {
        int prod=1;
        int sum=0;

        while(n!=0){
            int digit=n%10;
            sum+=digit;
            prod*=digit;
            n/=10;
        }
        return prod-sum;
        
    }
    public static void main(String[] args) {
    	int number=1268;
    	NumDigitTest n= new NumDigitTest();
    	System.out.println(n.subtractProductAndSum(number));
    }
}