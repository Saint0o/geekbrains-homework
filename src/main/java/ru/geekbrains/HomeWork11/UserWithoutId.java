package ru.geekbrains.HomeWork11;

/**
 * Класс с без поля с аннотацией DbId
 */

@DbTable(tableName = "users")
public class UserWithoutId {


    private Long id;

    @DbColumn(columnName = "user_name")
    private String username;

    @DbColumn(columnName = "password")
    private String password;

    public UserWithoutId() {
    }

    public UserWithoutId(Long id, String username, String password) {
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