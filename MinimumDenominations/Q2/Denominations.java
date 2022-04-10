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
    //Assuming that the denominations are in such a way that any amount can be paid.
    public void minDenominations(){
        //Using Recursion instead of loops
        if(amount>0){
            if(index<0){
                System.out.println("Not payable");
            }
            else {

                while (denominations[index] > amount) {
                    //If the remaining amount is less than the next higher denomination
                    // find next lesser denomination
                    index--;
                }
                System.out.println(denominations[index] + ":" + amount / denominations[index]);
                amount = amount - denominations[index] * (amount / denominations[index]);
                index--;
                minDenominations();
            }
        }
       // System.out.println("index after calling:"+ index);
    }
}
