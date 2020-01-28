package enumTeach;

public enum Months {

    IAN(1,"January"),
    FEB(2, "Februarie"),
    MAR(3, "Martie");

    Months(int positionInYear, String fullName) {
        this.positionInYear = positionInYear;
        this.fullName = fullName;
    }

    private int positionInYear;
    private String fullName;

    public int getPositionInYear() {
        return positionInYear;
    }

    public String getFullName() {
        return fullName;
    }
}
