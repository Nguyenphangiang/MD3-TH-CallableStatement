package dao;
import java.sql.SQLException;
import java.util.List;

import model.User;

public interface IUserDAO {
     void insertUser(User user) throws SQLException;

     User selectUser(int id);

     List<User> selectAllUsers();

     boolean deleteUser(int id) throws SQLException;

     boolean updateUser(User user) throws SQLException;

     User getUserById(int id);

     void insertUserStore(User user) throws SQLException;

     void addUserTransaction(User user, int[] permission);

     void insertUpdateWithoutTransaction();

     void insertUpdateUseTransaction();

     List<User> selectUserStore() throws SQLException;

     boolean editUserStore(int id,User user) throws SQLException;

     boolean deleteUserStore(int id ) throws SQLException;
}
