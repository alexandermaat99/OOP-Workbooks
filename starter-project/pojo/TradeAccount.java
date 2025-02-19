package pojo;

public abstract class TradeAccount {

  private String id;

  public TradeAccount(String id) {
    setId(id);
  }

  public String getId() {
    return this.id;
  }

  public void setId(String idToSet) {
    this.id = idToSet;
  }

  public abstract TradeAccount clone();
}
