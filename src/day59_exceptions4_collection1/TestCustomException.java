package day59_exceptions4_collection1;
import java.util.*;
public class TestCustomException {
    public static void main(String[] args) {
        //throw new InsufficientFundsException();
        double balance = 150;
        double price = 145.99;

        if (balance < price){
            throw new InsufficientFundsException("Insufficient Fund");
        } else {
            balance -= price;
            System.out.println("Transaction successful. Your new balace " + balance);
        }




    }
}
