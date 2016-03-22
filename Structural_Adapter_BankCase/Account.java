package Structural_Adapter_BankCase;

/**
 * Created by bakgi on 3/22/2016.
 */
//Create of TARGET interface
public interface Account {
    public double getBalance();
    public boolean isOverdraftAvailable();
    public void credit(double credit);
}
