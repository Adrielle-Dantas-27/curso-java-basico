package nelio_aulas.orientacao_a_objeto.saqueClass;

public class Account {
   // as variaveis
    private int number;
    private String holder;
    private double balance;
    
    // construtor pra quem nao tem dinheiro na conta
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    // construtor pra quem tem dinheiro na conta
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit); // vai ser porque no inicio é zerado o depósito e é uma regra de negócio
    }

    public int getNumber() {
        return number;
    }

    /*  n pode ter o set number porque o numero da conta nao pode ser alterado
    public void setNumber(int number) {
        this.number = number;
    }*/

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    /* o saldo da conta so pode ser alterado por meio de saque e deposito
    public void setBalance(double balance) {
        this.balance = balance;
    }
    */

    // acrescenta a quantia do dinheiro no saldo
    public void deposit(double amount) {
        balance += amount;

    }
    
    // sacar o dinheiro com taxa de 5% (abatendo do saldo)
    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }
   
    public String toString() {
        return "Account "
                + number
                 + ", Holder: "
                  + ", Balance: $"
                   + String.format("%.2f", balance);
    }
    
 


   
}
