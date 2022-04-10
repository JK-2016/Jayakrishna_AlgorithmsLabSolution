package MinimumDenominations.Q2;
import java.util.Arrays;
public class Denominations {
    int [] denominations;
    int amount;
    int index;
    public void sortDenominations(){
        //Sort in Ascending order
        Arrays.sort(denominations);
    }
    public void minDenominations(){
        //Using Recursion instead of loops
        if(amount>0){
            while(denominations[index]>amount){
                index--;
            }
            System.out.println(denominations[index]+":"+amount/denominations[index]);
            amount = amount-denominations[index]*(amount/denominations[index]);
            index--;
            minDenominations();
        }
       // System.out.println("index after calling:"+ index);
    }
}
