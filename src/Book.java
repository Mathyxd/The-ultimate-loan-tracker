public class Book extends LoanItem {

    private String author;

    public Book(String title, int loanDays, String author) { super(title, loanDays); this.author = author;}

    public String getAuthor() { return author; }

    public void setAuthor(String author) {this.author = author; }

    @Override
    public double calculateLateFees() { return getLoanDays() * 2.75; }

    @Override
    public String getDescription() {return "Book" + getTitle() + "Author" + author; }
}
