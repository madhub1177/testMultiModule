package com.example.RatingService.controller;

import com.example.RatingService.entity.Rating;
import com.example.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/addRating")
    public String addRating(@RequestBody Rating rating) {
        return ratingService.addRating(rating);
    }

    @GetMapping("/getAllRatings")
    public List<Rating> getAllRatings() {
        return ratingService.getAllRatings();
    }

    @GetMapping("/getRatingsByRatingId/{id}")
    public Rating getRatingsByUserId(@PathVariable("id") String ratingId) {
        return ratingService.getRatingsByUserId(ratingId);
    }

    @PostMapping("/updateRating")
    public String updateRating(@RequestBody Rating rating) {
        return ratingService.updateRating(rating);
    }

    @DeleteMapping("/deleteRating/{id}")
    public String deleteRating(@PathVariable("id") String ratingId) {
        return ratingService.deleteRating(ratingId);
    }

}
