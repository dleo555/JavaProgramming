package day59_exceptions4_collection1;
import java.util.*;
public class InsufficientFundsException extends RuntimeException{
        public InsufficientFundsException(){
        super();
        }
        public InsufficientFundsException(String desc){
        super(desc);
        }


}
