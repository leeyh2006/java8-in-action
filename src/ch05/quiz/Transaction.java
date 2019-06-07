package ch05.quiz;

/**
 * Name:Transaction
 * Desc :
 * Developer :82108
 * Date : 2019-06-07
 * Time : 오후 10:18
 */
public class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }
}
