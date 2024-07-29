package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // 입금 public 메서드
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("잔액이 작습니다");
        }
    }

    // 출금 public 메서드
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다");
        }
    }

    public void getBalance(){
        System.out.println("현재 잔액은 : " + balance);
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야됨
        return amount > 0;
    }
}
