Hotel Management Application
Overview
This Hotel Management Application is developed in Java and provides a comprehensive solution for managing hotel reservations. The application includes functionalities for different user roles: Admin, Reservationist, and Guest. Each role has specific capabilities to ensure smooth operation and management of hotel reservations.

Features
Admin
Add Room: Admins can add new rooms to the hotel inventory.
Delete Room: Admins can remove rooms from the hotel inventory.
Reservationist
View Empty Rooms: Reservationists can view all available rooms.
View Occupied Rooms: Reservationists can see which rooms are currently occupied by guests.
Guest
Reserve Room: Guests can reserve a room for a specified time period using a date picker for start and end times.
Payment: After selecting a room, guests can proceed to the payment page to complete their reservation.
Common Features
Login & Signup: Both Reservationists and Guests can create accounts and log in to access their respective functionalities.
Email Validation: The application includes a controller to ensure email addresses are in the correct format.
Phone Number Validation: The application checks that phone numbers are correctly formatted.
Age Validation: The application checks that user has to be at least 18 years old.
Password Security Level Validation: The application checks that password must be at least 8 character and contains words and numbers.
Technologies Used
Java: Core programming language used for development.
JavaFX: Used for creating the graphical user interface (GUI).
Installation
Clone the repository:
git clone https://github.com/pskh2004/Hotel-Management.git

Navigate to the project directory:
cd Hotel-Management

Compile the project:
javac -cp .:lib/* src/*.java

Run the application:
java -cp .:lib/* src.Main

Usage
Admin: Log in with admin credentials to add or delete rooms.
Reservationist: Log in to view room availability.
Guest: Sign up or log in to reserve a room and proceed to payment.
Contributing
Contributions are welcome! Please fork the repository and submit a pull request with your changes.


