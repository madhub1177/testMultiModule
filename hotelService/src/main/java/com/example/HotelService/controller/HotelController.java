package com.example.HotelService.controller;

import com.example.HotelService.entity.Hotel;
import com.example.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/addHotel")
    public String addHotel(@RequestBody Hotel hotel) {
        return hotelService.addHotel(hotel);
    }

    @GetMapping("/getAllHotels")
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/getHotelById/{id}")
    public Hotel getHotelById(@PathVariable("id") String hotelId) {
        return hotelService.getHotelById(hotelId);
    }

    @PutMapping("/updateHotel")
    public String updateHotel(@RequestBody Hotel hotel) {
        return hotelService.updateHotel(hotel);
    }

    @DeleteMapping("/deleteHotel/{id}")
    public String deleteHotel(@PathVariable("id") String hotelId) {
        return hotelService.deleteHotel(hotelId);
    }

}
