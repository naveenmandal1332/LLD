# Problem Statement:

Design an application for flight inventory and booking management systems. Where every day multiple flights are flying on different sectors and flights can have multiple fares and for each fare there will be a list of seats.

## Assumptions:

There is a supplier that is providing flight data.
Flights can have multiple fare Type and for each fare Type airline is providing an available seat list.
If a seat is already booked, other users can't book the same seat.
Take today's date as 1.
For departDate simple number is provided like - 1, 2, 3, 4, etc
For time, assume its 24 hour format and will be a decimal number.
User fund will be a decimal number only.
Features:

- AddUser(userld, name, funds)
  Return user details
  Output:- <u1, name, funds>

- SearchFlight(from, to, departDate, paxCount)
  Return available flights for given request in below format. (for the same date and if all available seats are equal or more than provided pax count).
  Output:- <flightNumber, airline, from, to, departDate, depart Time, price, fare Type, List< seat >>

- Book flight(userld, from, to, flightNumber, departDate, fareType, list< seat>)
  Book flight if all seats are available with the same fareType and the user has enough funds in his/her wallet. Deduct funds from userAccount for booking and return bookingld.
  If it fails, then return a proper error message.

## Bonus Question

- SearchFlightByPreferedAirline(from, to, departDate, paxCount, preferredAirline, sortBy, SortType)
  Return available flights for given request in below format
  Output:- <flightNumber, airline, from, to, departDate, depart Time, price, List< seat>>
  Create entities and service classes such that if new requirements come code will be extensible.

## Commands(Test cases):

- AddUser(userld, name, funds)
  - ADDUSER u1 Vinit 5000
  - ADDUSER u2 Neha 1500
- SearchFlightfrom, to, departDate, paxCount)
  - SEARCHFLIGHT DEL BLR 2 1
  - SEARCHFLIGHT DEL BLR 22
  - SEARCHFLIGHT DEL HYD 2 22
- Book flight(userld, from, to, flightNumber, airline, departDate, fare Type, list< seat>)
  - BOOK u1, DEL, BOM, 111, 6e, 2, F1, 10a, 11c, 20b
  - BOOK u1, DEL, BOM, 211, 6e, 2, F2, 10a, 11c, 20b
  - BOOK u2, DEL, BOM, 141, 6e, 2, F4, 32e
- SearchFlight(from, to, departDate, paxCount, preferredAirline, sortBy, SortType)
  - SEARCHFLIGHT DEL, BLR, 2, 1, AI, PRICE, DESC
