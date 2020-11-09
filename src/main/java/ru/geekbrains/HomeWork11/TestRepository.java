package ru.geekbrains.HomeWork11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class TestRepository {

    /**
     * Все написано для СУБР postgresql
     */
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/postgres",
                "postgres", "1234");

        Repository<User> userRepository = new Repository<>(User.class, connection);

        userRepository.insert(new User(null, "ccc", "ccc"));
        userRepository.insert(new User(null, "ddd", "ddd"));

        userRepository.update(new User(2L, "sss", "sss"));

        User user = userRepository.findById(3L);
        System.out.println(user);

        user = userRepository.findById(2L);
        System.out.println(user);

        userRepository.delete(1L);

        List<User> users = userRepository.findAll();
        System.out.println(users);

        try {
            Repository<UserWithoutId> userWithoutIdRepository = new Repository<>(UserWithoutId.class, connection);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        try {
            Repository<UserWithDoubleIdAnnotation> userWithDoubleIdAnnotationRepository = new Repository<>(UserWithDoubleIdAnnotation.class, connection);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}