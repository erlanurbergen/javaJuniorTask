// Task 1
SELECT Pass_in_trip.passenger, Trip.plane, Trip.company FROM Trip
                                                                 INNER JOIN Pass_in_trip ON Pass_in_trip.trip = Trip.id
WHERE Trip.company = 5 and Trip.plane = 'Boeing'


    // Task 2
SELECT Pass_in_trip.trip, SUM(passenger)
FROM Pass_in_trip
         INNER JOIN Passenger ON Pass_in_trip.passenger = Passenger.id
GROUP BY Pass_in_trip.trip
ORDER BY SUM(Passenger) DESC


    // Task 3
SELECT SUBSTR (name, 1, 1) first_char, COUNT (*)
FROM Passenger
GROUP BY SUBSTR (name, 1, 1)
HAVING COUNT (*) > 1
ORDER BY 2 DESC;