package com.bridgelabz;
public class HotelReservationSystem {
    public static void main(String[] args) {
        //Welcome message for User
        System.out.println("Welcome to Hotel Reservation System Workshop.");

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
        hotelReservation.addHotel();
        hotelReservation.addHotel();
        hotelReservation.printHotel();
        hotelReservation.cheapestHotel();
    }
}