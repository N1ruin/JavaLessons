package Lesson37.task1.model;

public class Counter {
    private final String name;
    private final String units;
    private int count;

    public Counter(String name, String units, int count) {
        this.name = name;
        this.units = units;
        this.count = count;
    }

    public Counter(String name, String units) {
        this(name, units, 0);
    }

    public String getName() {
        return name;
    }

    public String getUnits() {
        return units;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
