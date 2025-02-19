package service;

import java.math.BigDecimal;
import pojo.CashAccount;
import repository.*;

public class CashAccountService implements TradeAccountService {

  private TradeAccountRepository repository;

  //this constructor is what links this service layer to the repo. This class is called from the main(presentation layer) so it
  //essentially links the presentation layer to the repo

  public CashAccountService(TradeAccountRepository repository) {
    this.repository = repository;
  }

  @Override
  public void deposit(String id, BigDecimal amount) {
    CashAccount account = retrieveTradeAccount(id);
    account.setCashBalance(account.getCashBalance().add(amount));
    updateTradeAccount(account);
  }

  @Override
  public void withdraw(String id, BigDecimal amount) {
    //CashAccount is a type, retrieving an existing account i name account, I'm retrieving using the id parameter, it clones it in the repo layer
    CashAccount account = retrieveTradeAccount(id);

    //setting the cash balance as the cash balance pulled in, subtracted by the amount parameter
    account.setCashBalance(account.getCashBalance().subtract(amount));

    //the account is then updated
    updateTradeAccount(account);
  }

  public void createTradeAccount(CashAccount account) {
    this.repository.createTradeAccount(account);
  }

  public CashAccount retrieveTradeAccount(String id) {
    return (CashAccount) this.repository.retrieveTradeAccount(id);
  }

  public void updateTradeAccount(CashAccount account) {
    this.repository.updateTradeAccount(account);
  }

  public void deleteTradeAccount(String id) {
    this.repository.deleteTradeAccount(id);
  }
}
