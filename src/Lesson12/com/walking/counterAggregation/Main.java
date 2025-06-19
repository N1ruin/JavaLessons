package Lesson12.com.walking.counterAggregation;

import Lesson12.com.walking.counterAggregation.model.Counter;
import Lesson12.com.walking.counterAggregation.service.CounterService;

public class Main {
    public static void main(String[] args) {
        Counter coldWater = new Counter("Холодная вода", "м3");
        Counter hotWater = new Counter("Горячая вода", "м3");
        Counter gas = new Counter("Газ", "м3");
        Counter electricEnergy = new Counter("Электричество", "кВт*ч");

        CounterService counterService = new CounterService(coldWater, hotWater, gas, electricEnergy);
        counterService.addValue(coldWater, 153);
        counterService.addValue(hotWater, 322);
        counterService.addValue(gas, 111);
        counterService.incrementValue(electricEnergy);

        printResult(counterService);

        counterService.resetValue(hotWater);
        counterService.resetValue(coldWater);
        counterService.resetValue(gas);
        counterService.resetValue(electricEnergy);
        printResult(counterService);
    }

    private static void printResult(CounterService counterService) {
        Counter[] counters = counterService.getCounters();

        for (Counter counter : counters) {
            System.out.printf("%s : %d %s \n", counter.getName(), counter.getCount(), counter.getUnits());
        }
    }
}
