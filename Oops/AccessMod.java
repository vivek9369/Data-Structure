public class AccessMod {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Vivek kumar maurya";
        myAcc.setPassword("abcd");
        
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
    password = pwd;
    }
}
