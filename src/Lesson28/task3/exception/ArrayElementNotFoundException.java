package Lesson28.task3.exception;

public class ArrayElementNotFoundException extends RuntimeException {

  public ArrayElementNotFoundException(Object element) {
    super(String.format("Element %s not found in array", element.toString()));
  }

}
