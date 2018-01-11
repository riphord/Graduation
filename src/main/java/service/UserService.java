package service;

import model.User;

import java.util.List;

public interface UserService {

    User save();

    boolean delete();

    User get();

    List<User> getAll();
}
