package Utils.RandomAccounts.Generator;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class AccountGenerator {
    static int index = 2;
    private final static Set<String> accNum = new HashSet<>();
    
    public static void generateAccountNumbers(Integer index) {
        for (long i = 10_000_000L; i<=30_000_000; i++){
           String temp = index.toString() + i;
           accNum.add(temp);
        }
    }

    public static String assignAccountNumber(){
        if (accNum.isEmpty()){
            index += 10;
            generateAccountNumbers(index);
        }
        int size = accNum.size();
        int item = new Random().nextInt(size);
        int i = 0;
        String temp = "";
        for(String obj : accNum)
        {
            if (i == item) { 
                temp = obj;
                accNum.remove(obj);
                break;
            }
            i++;
        }
        return temp;
    }

    public Set<String> getAccNum() {
        return accNum;
    }
}
