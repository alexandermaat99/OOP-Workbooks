import java.util.HashMap;
import java.util.Map;

public class Team {

  private String name;
  private Map<String, String> players;

  //declaring a Map variable called players

  public Team(String name) {
    this.name = name;
    this.players = new HashMap<>();
    //this is saying when you create a new team, it will take in a name for the team and then
    //initializing that map variable called players as a hashmap, Map is polymorphic so we can
    //use any kind of map to init it
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPlayer(String position) {
    return this.players.get(position);
  }

  public void setPlayer(String position, String player) {
    this.players.put(position, player);
  }
}
