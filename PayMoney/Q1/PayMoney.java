package PayMoney.Q1;

public class PayMoney {
    int []transactions;
    public void targetAssessment(int dailyTarget){
        int sum=0;

        for(int j=0;j<transactions.length;j++){
            sum+=transactions[j];
            if(sum>=dailyTarget){
                System.out.println("Target achieved after "+(j+1)+" transactions \n");
                return;
            }
        }
        System.out.println("Given Target is not achieved");
    }

}
