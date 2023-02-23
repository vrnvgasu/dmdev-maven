package ru.edu;

import ru.edu.service.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // UserService использует UserDao из другого модуля
        var userService = new UserService();
        System.out.println(userService.getUser(25L));
    }
}
