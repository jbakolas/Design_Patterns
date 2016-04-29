package Structural_Adapter_BankCase;

import java.util.Scanner;

/**
 * Created by bakgi on 3/23/2016.
 */
public class ClientClass {
    public static void main(String []args){
        //1st way of implementation f client

        StandardAccount sa = new StandardAccount(2000);
        System.out.println(sa.toString());
        PlatinumAccount pa = new PlatinumAccount(2000);
        System.out.println(pa.toString());
        //Calling getBalance() on Adapter
        AccountAdapter adapter = new AccountAdapter(new OffshoreAccount(2000));
        System.out.println(adapter.toString());

        //2nd way of client implementation
       /* AbstractAccount sa = new StandardAccount(2000);
        AbstractAccount adapter = new AccountAdapter(new OffshoreAccount(2000));
        printBalance(sa);
        printBalance(adapter);*/
    }

   /* public static void printBalance(AbstractAccount abstractAccount){
        System.out.println("Acount Balance = "+ abstractAccount.getBalance());
    }*/
}
