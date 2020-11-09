package ru.geekbrains.HomeWork11;

/**
 * Класс с двумя полями с аннотацией DbId для теста
 */

@DbTable(tableName = "users")
public class UserWithDoubleIdAnnotation {

    @DbId
    private Long id;

    @DbId
    private Long idd;

    @DbColumn(columnName = "user_name")
    private String username;

    @DbColumn(columnName = "password")
    private String password;

    public UserWithDoubleIdAnnotation() {
    }

    public UserWithDoubleIdAnnotation(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}