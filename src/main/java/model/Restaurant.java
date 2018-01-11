package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Restaurant extends AbstractBaseEntity {

    private Set<Dish> menu;

    private List<Integer> points = new ArrayList<Integer>();

    public Restaurant(Integer id, String name, Set<Dish> menu) {
        super(id, name);
        this.menu = menu;
    }

    public Set<Dish> getMenu() {
        return menu;
    }

    public void setMenu(Set<Dish> menu) {
        this.menu = menu;
    }
}
