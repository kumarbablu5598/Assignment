package com.example.Restaurant.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;



    @GetMapping("findHotel")
    public List<Restaurant> getListOfHotels() {
        return restaurantService.finaAll();
    }

    @GetMapping("/find/{id}")
    public Restaurant findTodoById(@PathVariable int id) {
        return restaurantService.findById(id);
    }

    @PostMapping("add-Restaurant")
    public void addRestaurant(Restaurant hotelDetails) {

        restaurantService.addHotel(hotelDetails);
    }

    @PutMapping("update-Restaurant")
    public void updateTodo(@PathVariable int RestaurantId, @RequestBody Restaurant restaurant) {
        restaurantService.updateById(RestaurantId,restaurant);
    }

    @DeleteMapping("/delete/{RestaurantId}")
    public void deleteTodo(@PathVariable int RestaurantId) {
        restaurantService.deleteById(RestaurantId);
    }

}
