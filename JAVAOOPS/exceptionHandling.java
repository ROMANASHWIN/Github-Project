public class exceptionHandling {
    public static void main(String[] args) {

        account acc = new account(700);
        acc.outPut();
    }
}

class account {
    public final int bal = 300;
    int withdraw = 0;

    account(int withdraw) {
        this.withdraw = withdraw;
    }

    public void outPut() {
        try {
            if (bal < this.withdraw) {
                throw new InsufficientFindException(this.withdraw - bal);
            }
        } catch (InsufficientFindException e) {
            System.out.println("Your balance is very low");
            System.out.println("You need " + e.insufficientAmt + "amout");
        }
    }
}

class InsufficientFindException extends Exception {
    int insufficientAmt = 0;

    InsufficientFindException(int insufficientAmt) {
        this.insufficientAmt = insufficientAmt;
    }

}
