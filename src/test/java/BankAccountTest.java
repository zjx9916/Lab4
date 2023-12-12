import org.example.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawSufficientBalance() {
        BankAccount account = new BankAccount(100);
        account.withdraw(30);
        assertEquals(70, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawInsufficientBalance() {
        BankAccount account = new BankAccount(100);
        account.withdraw(150);
        assertEquals(100, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(100);
        account.withdraw(-30);
        assertEquals(100, account.getBalance(), 0.001);
    }
}
