package qa.meerim.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import qa.meerim.models.Task;

import java.util.List;

class TaskServiceTest {

    private TaskService taskService;

    @BeforeEach
    void setUp() {
        taskService = new TaskService();
    }

    @Test
    void getTodoList() {
        // Arrange
        Task task = new Task("my task", false);
        taskService.addTask(task);

        // Act
        List<Task> todoList = taskService.getTodoList();

        // Assert
        Assertions.assertEquals(1, todoList.size());
    }

    @Test
    void getTask() {
        // Arrange
        Task expectedTask = new Task("my task", false);
        taskService.addTask(expectedTask);

        // Act
        Task actualTask = taskService.getTask(0);

        // Assert
        Assertions.assertEquals(expectedTask, actualTask);
    }

    @Test
    void addTask() {
        // Arrange
        Task expectedTask = new Task("my task", false);

        // Act
        Task actualTask = taskService.addTask(expectedTask);

        // Assert
        Assertions.assertEquals(expectedTask, actualTask);
        Assertions.assertEquals(1, taskService.getTodoList().size());
    }

    @Test
    void updateTask() {
        // Arrange
        Task initialTask = new Task("my task", false);
        taskService.addTask(initialTask);
        Task updatedTask = new Task("my updated task", true);

        // Act
        Task actualTask = taskService.updateTask(0, updatedTask);

        // Assert
        Assertions.assertEquals(updatedTask, actualTask);
        Assertions.assertEquals(1, taskService.getTodoList().size());
    }

    @Test
    void deleteTask() {
        // Arrange

        // Act

        // Assert
    }
}