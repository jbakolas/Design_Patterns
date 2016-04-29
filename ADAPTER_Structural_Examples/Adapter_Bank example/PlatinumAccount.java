package Structural_Adapter_BankCase;

/**
 * Created by bakgi on 3/22/2016.
 */
public class PlatinumAccount extends AbstractAccount{
    public PlatinumAccount(double balance){
        super(balance);
        setOverdraftAvailable(true);
    }
}
