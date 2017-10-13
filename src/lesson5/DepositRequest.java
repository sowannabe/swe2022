package lesson5;
//인터페이스끼리의 상속.
public interface DepositRequest extends Request {
    Account getDepositAccount();
}
