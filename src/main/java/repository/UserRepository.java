package repository;

import model.User;

import java.util.List;

public interface UserRepository {

    User save();

    boolean delete();

    User get();

    List<User> getAll();
}
