public enum Day {
    SANDAY(1), MONDAY(1),TUESDAY(3),WEDNESDAY(4),THUSDAY(5),FRIDAY(6),SATURDAY(7);
    private final int dayNumber;

    Day(int dayNumber) {
        this.dayNumber = dayNumber;

    }

    public int getDayNumber() {
        return dayNumber;
    }
}
