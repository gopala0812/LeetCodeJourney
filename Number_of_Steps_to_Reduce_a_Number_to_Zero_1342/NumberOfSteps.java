package Number_of_Steps_to_Reduce_a_Number_to_Zero_1342;

public class NumberOfSteps {
    public int numberOfSteps(int num) {
        int step=0;
        while(num!=0){
            if(num%2==0){
                num/=2;
                step++;
                continue;
            }else{
                num-=1;
                step++;
                continue;
            }
        }
        return step;
    }
    public static void main(String[] args){
    	NumberOfSteps n=new NumberOfSteps();
    	System.out.println(n.numberOfSteps(27));
    }
}