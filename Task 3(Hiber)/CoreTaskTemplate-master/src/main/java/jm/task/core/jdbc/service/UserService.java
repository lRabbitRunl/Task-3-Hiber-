package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface UserService {
    void createUsersTable() throws SQLException, ClassNotFoundException, IOException;

    void dropUsersTable() throws IOException, SQLException;

    void saveUser(String name, String lastName, byte age) throws IOException, SQLException;

    void removeUserById(long id) throws IOException, SQLException;

    List<User> getAllUsers() throws IOException, SQLException;

    void cleanUsersTable() throws SQLException, IOException;
}
