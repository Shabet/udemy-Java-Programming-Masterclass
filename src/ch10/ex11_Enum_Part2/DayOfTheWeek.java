package ch10.ex11_Enum_Part2;

public enum DayOfTheWeek {
    SUN(1), MON(2), TUES(3), WED(4), THURS(5), FRI(6), SAT(7);

    private final int number;

    DayOfTheWeek(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
