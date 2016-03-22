package Structural_Adapter_BankCase;

/**
 * Created by bakgi on 3/22/2016.
 */
public class OffshoreAccount {
    private double OffshoreBalance;
    private static final double TAX_RATE = 0.04;

    public OffshoreAccount(double OffshoreBalance){
        this.OffshoreBalance = OffshoreBalance;
    }
    public double getTaxRate(){
        return TAX_RATE;
    }
    public double getOffshoreBalance(){
        return OffshoreBalance;
    }
    public void debit(double debit){
        if(OffshoreBalance > debit){
            OffshoreBalance -= debit;
        }
    }
    public void credit(double credit){
        OffshoreBalance += OffshoreBalance;
    }
}
