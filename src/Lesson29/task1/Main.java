package Lesson29.task1;

public class Main {
    public static void main(String[] args) {
        TestClass<String> testClass1 = null;
        System.out.println(testMethod(testClass1, "Lol"));

        TestClass<Integer> testClass2 = new TestClass<>(10);
        System.out.println(testMethod(testClass2, 5));
    }

    private static <T> T testMethod(TestClass<T> testClass, T object) {
        if (testClass != null) {
            return testClass.getField();
        } else {
            return object;
        }
    }
}
