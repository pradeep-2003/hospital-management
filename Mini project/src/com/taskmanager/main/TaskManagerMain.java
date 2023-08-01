package com.taskmanager.main;

import java.util.Scanner;
import com.taskmanager.model.Task;
import com.taskmanager.model.User;
import com.taskmanager.dao.TaskDao;
import com.taskmanager.dao.TaskDaoImpl;
import com.taskmanager.dao.UserDao;
import com.taskmanager.dao.UserDaoImpl;

public class TaskManagerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = null, password, taskName, dueDate;
        int ch;
        boolean loggedIn = false;
        TaskDao taskDao = new TaskDaoImpl();
        UserDao userDao = new UserDaoImpl();

        do {
            System.out.println("Task Manager Application");
            if (!loggedIn) {
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
            } else {
                System.out.println("4. Add new task");
                System.out.println("5. List tasks");
                System.out.println("6. Mark task as completed");
            }
            System.out.println("Enter your choice:");
            ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter your desired username:");
                    username = scanner.next();
                    System.out.println("Enter your password:");
                    password = scanner.next();
                    User user = new User(username, password);
                    userDao.registerUser(user);
                    System.out.println("Registration successful. Please log in.");
                    break;
                case 2:
                    System.out.println("Enter your username:");
                    username = scanner.next();
                    System.out.println("Enter your password:");
                    password = scanner.next();
                    loggedIn = userDao.loginUser(username, password);
                    if (loggedIn) {
                        System.out.println("Login successful. Welcome, " + username + "!");
                    } else {
                        System.out.println("Invalid username or password. Please try again.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting Task Manager...");
                    System.exit(0);
                case 4:
                    if (loggedIn) {
                        System.out.println("Enter task name:");
                        taskName = scanner.next();
                        System.out.println("Enter due date (YYYY-MM-DD):");
                        dueDate = scanner.next();
                        Task task = new Task(taskName, username, dueDate, false);
                        taskDao.create(task);
                    } else {
                        System.out.println("Please log in to perform this action.");
                    }
                    break;
                case 5:
                    if (loggedIn) {
                        System.out.println("Tasks for user: " + username);
                        listTasksForUser(username);
                    } else {
                        System.out.println("Please log in to perform this action.");
                    }
                    break;
                case 6:
                    if (loggedIn) {
                        System.out.println("Enter task ID to mark as completed:");
                        int taskId = scanner.nextInt();
                        taskDao.markTaskAsCompleted(taskId);
                    } else {
                        System.out.println("Please log in to perform this action.");
                    }
                    break;
                case 7:
                    loggedIn = false;
                    System.out.println("Logged out successfully.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (true);
    }

    private static void listTasksForUser(String username) {
        TaskDao dao = new TaskDaoImpl();
        for (Task task : dao.getTasksForUser(username)) {
            System.out.println(task);
        }
    }
}