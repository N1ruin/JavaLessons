package Lesson37.task1.service;

import Lesson37.task1.model.Counter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CounterService {
    private final List<Counter> counters;

    public CounterService(Counter... counters) {
        this.counters = new ArrayList<>();
        Collections.addAll(this.counters, counters);
    }

    public List<Counter> getCounters() {
        return counters;
    }

    public Counter getCounter(String name) {
        for (Counter counter : counters) {
            if (counter.getName().equals(name)) {
                return counter;
            }
        }
        System.out.println("Такого счетчика нет!");
        return null;
    }

    public void incrementValue(Counter counter) {
        if (isCounterExist(counter)) {
            int currentCount = counter.getCount();
            counter.setCount(++currentCount);
        }
    }

    public void addValue(Counter counter, int value) {
        if (isCounterExist(counter)) {
            int currentCount = counter.getCount();
            counter.setCount(currentCount + value);
        }
    }

    public void resetValue(Counter counter) {
        if (isCounterExist(counter)) {
            counter.setCount(0);

        }
    }

    private boolean isCounterExist(Counter counter) {
        if (counter == null) {
            System.out.println("Incorrect counter");
            return false;
        }
        return true;
    }
}
