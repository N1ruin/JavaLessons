package Lesson40.task1;

import Lesson40.task1.model.Task;
import Lesson40.task1.services.TaskService;

public class Main {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        taskService.addTask(new Task("1", "Сходить на работу", 1));
        taskService.addTask(new Task("2", "Прийти с работы", 2));
        taskService.addTask(new Task("3", "Выучить джаву", 365));
        taskService.addTask(new Task("4", "Сделать пет проект", 0));

        taskService.finishTask();
        taskService.finishTask();
        taskService.finishTask();
        taskService.finishTask();
        taskService.finishTask();
    }
}
