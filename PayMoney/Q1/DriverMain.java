package PayMoney.Q1;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        PayMoney p1 = new PayMoney();
        System.out.println("Enter the size of transaction array");
        int numTransactions = in.nextInt(),i,numTargets,target;
        p1.transactions =new int[numTransactions];
        System.out.println("Enter the transaction values");
        for(i=0;i<numTransactions;i++){
            p1.transactions[i]= in.nextInt();
        }
        System.out.println("Enter the total no.of targets to be achieved: ");
        numTargets = in.nextInt();
        for(i=0;i<numTargets;i++){
            System.out.println("Enter the value of Target");
            target = in.nextInt();
            p1.targetAssessment(target);
        }

    }
}
