import java.util.ArrayList;

public class MagazineLibrary {

  private ArrayList<Magazine> magazines;

  MagazineLibrary() {
    this.magazines = new ArrayList<>();
  }

  public Magazine getMagazine(int index) {
    return new Magazine(magazines.get(index));
  }

  public void setMagazine(Magazine newMagazine, int index) {
    magazines.set(index, (new Magazine(newMagazine)));
  }

  public void addMagazine(Magazine newMagazine) {
    magazines.add(new Magazine(newMagazine));
  }
}
