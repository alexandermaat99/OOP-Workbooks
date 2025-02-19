package service;

import java.math.BigDecimal;
import pojo.*;
import repository.TradeAccountRepository;

public class MarginAccountService implements TradeAccountService {

  TradeAccountRepository repository;

  //constructor
  public MarginAccountService(TradeAccountRepository repository) {
    this.repository = repository;
  }

  //withdraw - interface
  @Override
  public void withdraw(String id, BigDecimal amount) {
    MarginAccount account = retrieveTradeAccount(id);
    account.setMargin(account.getMargin().subtract(amount));
    updateTradeAccount(account);
  }

  //deposit - interface
  @Override
  public void deposit(String id, BigDecimal amount) {
    MarginAccount account = retrieveTradeAccount(id);
    account.setMargin(account.getMargin().add(amount));
    updateTradeAccount(account);
  }

  //createTradeAccount
  public void createTradeAccount(MarginAccount account) {
    this.repository.createTradeAccount(account);
  }

  //retrieveTradeAccount
  public MarginAccount retrieveTradeAccount(String id) {
    return (MarginAccount) this.repository.retrieveTradeAccount(id);
  }

  //updateTradeAccount
  public void updateTradeAccount(MarginAccount account) {
    this.repository.updateTradeAccount(account);
  }

  //deleteTradeAccount
  public void deleteTradeAccount(String id) {
    this.repository.deleteTradeAccount(id);
  }
}
