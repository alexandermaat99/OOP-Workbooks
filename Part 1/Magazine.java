public class Magazine {

  private String title;
  private String publisher;
  private int issueNumber;
  private int publicationYear;

  public Magazine(
    String title,
    String publisher,
    int issueNumber,
    int publicationYear
  ) {
    setTitle(title);
    setPublisher(publisher);
    setIssueNumber(issueNumber);
    setPublicationYear(publicationYear);
  }

  public Magazine(Magazine source) {
    setTitle(source.getTitle());
    setPublisher(source.getPublisher());
    setIssueNumber(source.getIssueNumber());
    setPublicationYear(source.getPublicationYear());
  }

  public void setTitle(String newTitle) {
    if ((newTitle == null) | newTitle.isBlank()) {
      throw new IllegalArgumentException("Title cannot be null or blank");
    }
    this.title = newTitle;
  }

  public String getTitle() {
    return this.title;
  }

  public void setPublisher(String newPublisher) {
    if ((newPublisher == null) | newPublisher.isBlank()) {
      throw new IllegalArgumentException("Publisher cannot be null or blank");
    }
    this.publisher = newPublisher;
  }

  public String getPublisher() {
    return this.publisher;
  }

  public void setIssueNumber(int newIssueNumber) {
    if (newIssueNumber <= 0) {
      throw new IllegalArgumentException("Issue number must be greater than 0");
    }
    this.issueNumber = newIssueNumber;
  }

  public int getIssueNumber() {
    return this.issueNumber;
  }

  public void setPublicationYear(int newPublicationYear) {
    if (newPublicationYear <= 0) {
      throw new IllegalArgumentException(
        "Publication year must be greater than 0"
      );
    }
    this.publicationYear = newPublicationYear;
  }

  public int getPublicationYear() {
    return this.publicationYear;
  }
}
