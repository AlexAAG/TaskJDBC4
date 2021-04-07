package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService userService = new UserServiceImpl();

        //+++Создание таблицы User(ов)
        userService.createUsersTable();

        //+++Добавление 4 User(ов) в таблицу с данными на свой выбор.
        userService.saveUser("vasya1","petrov1", (byte) 32);
        userService.saveUser("vasya2","petrov2", (byte) 33);
        userService.saveUser("vasya3","petrov3", (byte) 34);
        userService.saveUser("vasya4","petrov4", (byte) 35);

        //+++Получение всех User из базы и вывод в консоль
        System.out.println(userService.getAllUsers());

        //+++Удаление User из таблицы ( по id )
        userService.removeUserById(7);

        //+++Очистка таблицы User(ов)
        userService.cleanUsersTable();

        //+++Удаление таблицы
        userService.dropUsersTable();
    }
}
