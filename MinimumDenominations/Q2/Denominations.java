package MinimumDenominations.Q2;
import java.util.Arrays;
public class Denominations {
    int [] denominations;
    int [] counter;
    int amount;
    int index;
    public void sortDenominations(){
        //Sort in Ascending order
        Arrays.sort(denominations);
        counter = new int[denominations.length];
    }

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
                // System.out.println(denominations[index] + ":" + amount / denominations[index]);
                counter[index] = amount/denominations[index];
                amount = amount - denominations[index] * (amount / denominations[index]);
                index--;
                minDenominations();
            }
        }
       // System.out.println("index after calling:"+ index);
    }
    public void printDenominations(){
        minDenominations();
        if(amount==0) {
            for (int i = 0; i < denominations.length; i++) {
                if (counter[i] > 0) {
                    System.out.println(denominations[i] + ":" + counter[i]);
                }
            }
        }
    }

}
