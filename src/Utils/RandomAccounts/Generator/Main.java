package Utils.RandomAccounts.Generator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new AccountNumberThread());
        thread.start();
    }


}
