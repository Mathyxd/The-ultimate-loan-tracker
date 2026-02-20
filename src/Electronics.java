public class Electronics extends LoanItem {
    private double baseCost;

    public Electronics(String title, int loanDays, double baseCost)  {
        super(title, loanDays);
        this.baseCost = baseCost;
    }

    public double getBaseCost() {
        return baseCost;
    }

    @Override
    public double calculateLateFees() {
        return baseCost * 0.02; // fast gebyr
    }

    @Override
    public String getDescription() {
        return "Electronics: " + getTitle() + " | Base cost: " + baseCost;
    }
}
