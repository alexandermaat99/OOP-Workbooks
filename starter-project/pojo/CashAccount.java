package pojo;

import java.math.BigDecimal;

public class CashAccount extends TradeAccount {

  private BigDecimal cashBalance;

  public CashAccount(String id, BigDecimal cashBalance) {
    super(id);
    setCashBalance(cashBalance);
  }

  public BigDecimal getCashBalance() {
    return this.cashBalance;
  }

  public void setCashBalance(BigDecimal cashBalanceToSet) {
    this.cashBalance = cashBalanceToSet;
  }

  @Override
  public TradeAccount clone() {
    return new CashAccount(super.getId(), this.cashBalance);
  }
  //this allows for clone method without having to
  //specify cash or trade account, example of polymorphism
  //when you call clone method, if it's a CashAccount, it will
  //return a new CashAccount object with the id (parameter from Parent Trade Account, thus super)
  //and the cash balance which is specific to this CashAccount object, thus the this keyword
}
