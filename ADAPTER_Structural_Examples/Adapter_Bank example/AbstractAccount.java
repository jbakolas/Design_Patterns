package Structural_Adapter_BankCase;

/**
 * Created by bakgi on 3/22/2016.
 */
// The AbstractAccount class implement the Target interface
public class AbstractAccount implements Account {

    private double balance;
    private boolean isOverdraftAvailable;

    public AbstractAccount(double balance){
        this.balance = balance;
    }
    @Override
    public double getBalance(){
        return balance;
    }
    @Override
    public boolean isOverdraftAvailable(){
        return isOverdraftAvailable;
    }
    public void setOverdraftAvailable(boolean isOverdraftAvailable){
        this.isOverdraftAvailable = isOverdraftAvailable;
    }
    public String toString(){
        return (getClass().getSimpleName()+" Balance = "+ getBalance()+ " Overdraft :"+ isOverdraftAvailable());
    }
    @Override
    public void credit(double credit){
        balance += credit;
    }


}
