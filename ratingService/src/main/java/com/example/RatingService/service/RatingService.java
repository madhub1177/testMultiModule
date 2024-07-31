package com.example.RatingService.service;

import com.example.RatingService.entity.Rating;
import com.example.RatingService.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    public String addRating(Rating rating) {
        ratingRepository.save(rating);
        return "Rating added successfully";
    }

    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    public Rating getRatingsByUserId(String ratingId) {
        return ratingRepository.findById(ratingId).get();
    }

    public String updateRating(Rating rating) {
        ratingRepository.save(rating);
        return "Rating updated successfully";
    }

    public String deleteRating(String ratingId) {
        ratingRepository.deleteById(ratingId);
        return "Rating deleted successfully";
    }
}
