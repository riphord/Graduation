package repository;

import model.Restaurant;

import java.util.List;

public interface RestaurantRepository {

    Restaurant save();

    boolean delete();

    Restaurant get();

    List<Restaurant> getAll();
}
