package Structural_Adapter_BankCase;

/**
 * Created by bakgi on 3/22/2016.
 */
public class StandardAccount extends AbstractAccount{
    public StandardAccount(double balance){
        super(balance);
        setOverdraftAvailable(false);
    }

}
