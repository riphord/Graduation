package service;

import model.Restaurant;

import java.util.List;

public interface RestaurantService {

    Restaurant get();

    boolean delete();

    Restaurant save();

    List<Restaurant> getAll();


}
