//AccoutnNumber
//HoilderNname
//Bbalance

class BankAccount{
    private int accountnumber;
    private String holdername;
    private double balance;

    BankAccount(int accNo, String name){
        this.accountnumber=accNo;
        this.holdername=name;
    }

    void display(){
        System.out.println("Account no: " + accountnumber);
        System.out.println("Holder Name: " + holdername);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] main){
        BankAccount acc=new BankAccount(10009,"Rishu");
        acc.display();
    }
}