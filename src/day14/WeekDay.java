package day14;

public enum WeekDay {

    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private int abbr;

    WeekDay(int abbr) {
        this.abbr = abbr;
    }

    public int getAbbr() {
        return abbr;
    }

    @Override
    public String toString() {
        return String.valueOf(abbr);
    }
}

