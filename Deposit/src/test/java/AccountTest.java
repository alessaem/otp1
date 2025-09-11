import static org.junit.jupiter.api.Assertions.*;

import org.example.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {

    Account ac;

    @BeforeEach
    void setUp() {
        ac = new Account();
    }

    @Test
    void initialBalance(){
        assertEquals(0.0,ac.getBalance());
    }

    @Test
    void deposit(){
        ac.deposit(150);
        assertEquals(150.0,ac.getBalance());
        ac.deposit(-10);
        assertEquals(150.0,ac.getBalance());
    }

    @Test
    void withdrawPositive(){
        ac.deposit(150);
        double withdrawn = ac.withdraw(10);
        assertEquals(10.0,withdrawn);
        assertEquals(140.0,ac.getBalance());
    }

    @Test
    void withdrawNegative(){
        ac.deposit(150);
        double withdrawn = ac.withdraw(-10);
        assertEquals(0.0,withdrawn);
        assertEquals(150.0,ac.getBalance());
    }

    @Test
    void withdrawOverBalance(){
        ac.deposit(150);
        double withdrawn = ac.withdraw(200);
        assertEquals(0.0,withdrawn);
        assertEquals(150.0,ac.getBalance());
    }
    //Alessa Pentinmikko


}
