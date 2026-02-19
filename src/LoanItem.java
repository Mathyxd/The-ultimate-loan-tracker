public abstract class LoanItem {

    private String title;
    private int loanDays;

    //Constructor
    public LoanItem(String title, int loanDays) {
        this.title = title;
        this.loanDays = loanDays;
    }

    //Getter
    public String getTitle() {
    return title;
    }

    public int getLoanDays() {
    return loanDays;
    }

    //Setter
    public void setTitle(String title) {
    this.title = title;
    }

    public void setLoanDays(int loanDays) {
    this.loanDays = loanDays;
    }

    //Polymorphic method
    public abstract double calculateLateFees();

    public abstract String getDescription();
}
