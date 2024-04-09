package com.sample.assignment.taxipark

/*
 * Task #1. Find all the drivers who performed no trips.
 */
fun TaxiPark.findFakeDrivers(): Set<Driver> =
    allDrivers.filter { driver -> trips.none { trip -> trip.driver == driver } }.toSet();
/*
 * Task #2. Find all the clients who completed at least the given number of trips.
 */
fun TaxiPark.findFaithfulPassengers(minTrips: Int): Set<Passenger> =
    allPassengers.filter { passenger -> trips.count { trip -> trip.passengers.contains(passenger) } >= minTrips }.toSet();


/*
 * Task #3. Find all the passengers, who were taken by a given driver more than once.
 */
fun TaxiPark.findFrequentPassengers(driver: Driver): Set<Passenger> =
    trips.filter { trip -> trip.driver == driver }
        .flatMap { trip -> trip.passengers }
        .groupingBy { passenger -> passenger }
        .eachCount()
        .filter { (_, count) -> count > 1 }
        .keys;

/*
 * Task #4. Find the passengers who had a discount for majority of their trips.
 */
fun TaxiPark.findSmartPassengers(): Set<Passenger> =
    allPassengers.filter { passenger ->
        val (tripsWithDiscount, tripsWithoutDiscount) = trips.partition {
            trip -> trip.passengers.contains(passenger) && trip.discount != null };
        tripsWithDiscount.size > tripsWithoutDiscount.size
    }.toSet();

/*
 * Task #5. Find the most frequent trip duration among minute periods 0..9, 10..19, 20..29, and so on.
 * Return any period if many are the most frequent, return `null` if there're no trips.
 */
fun TaxiPark.findTheMostFrequentTripDurationPeriod(): IntRange? {
    if(trips.isEmpty()) return null;
    val tripDurations = trips.map { it.duration };
    return tripDurations.groupingBy { it / 10 }.eachCount().maxBy { it.value }?.key?.let { it * 10 until (it + 1) * 10 };
}

/*
 * Task #6.
 * Check whether 20% of the drivers contribute 80% of the income.
 */
fun TaxiPark.checkParetoPrinciple(): Boolean {
    if(trips.isEmpty()) return false;
    val totalIncome = trips.sumOf { it.cost };
    val driversIncome = trips.groupBy { it.driver }.mapValues { (_, trips) -> trips.sumOf { it.cost } };
    val sortedDriversIncome = driversIncome.values.sortedDescending();
    val top20Income = sortedDriversIncome.take(((allDrivers.size * 0.2)).toInt()).sum();
    return top20Income >= totalIncome * 0.8;
}


