package Utils.RandomAccounts.Generator;

import java.util.ArrayList;
import java.util.List;

public class AccountNumberThread implements Runnable {
    @Override
    public void run() {
        List<String> accNums = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            accNums.add(AccountGenerator.assignAccountNumber());
        }
        System.out.println(accNums);
    }
}
