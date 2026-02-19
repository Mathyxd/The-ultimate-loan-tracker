public class Video extends LoanItem {

    private int duration;

    public Video(String title, int loanDays, int duration) {super(title, loanDays);}

    public int getDuration() { return duration; }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public double calculateLateFees() { return getLoanDays() * 3.99; }

    @Override
    public String getDescription() {return "video" + getTitle() + "Duration (minutes)" + duration; }
}
