package Lesson5;

public class outMoney {

    ATM atm = null;
    int issuingSum = 0;
    String val = null;

    public outMoney(ATM atm, int issuingSum, String val) {
        this.atm = atm;
        this.issuingSum = issuingSum;
        this.val = val;
    }

    public void issuingMoney (){
        if (atm.getListCassette().size() > 0){

        }else {
            System.out.println("в банкомате нет денег");
        }
    }
}
