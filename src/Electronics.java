public abstract class Electronics extends LoanItem{
    private double baseCost;

    public Electronics(String title, int loanDays, double baseCost)  {
        super(title, loanDays);
        this.baseCost = baseCost;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public double calculateLateFees() {
        return baseCost * 0.20;
    }

    public String toString() {
        return "Title: " + getTitle() + "\n Loan Days: " + getLoanDays() + "\n Late fee per day: " + calculateLateFees() + " kr";
        //super.toString();
    }

}
