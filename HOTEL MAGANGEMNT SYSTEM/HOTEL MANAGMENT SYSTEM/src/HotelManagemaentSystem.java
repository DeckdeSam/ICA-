import java.sql.*;
import java.util.Scanner;

public class HotelManagemaentSystem {

    private static final String URL = "jdbc:mysql://localhost:3306/Hotel_db";
    private static final String UserName = "root";
    private static final String PassWord = "sameer";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = DriverManager.getConnection(URL, UserName, PassWord);
                 Scanner scanner = new Scanner(System.in)) {

                while (true) {
                    System.out.println("1. Guest a Reservation");
                    System.out.println("2. Check Reservation");
                    System.out.println("3. Get Room");
                    System.out.println("4. Update Reservation");
                    System.out.println("5. Delete Reservation");
                    System.out.println("0. Exit");
                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            GuestReservation(connection, scanner);
                            break;
                        case 2:
                            checkReservation(connection);
                            break;
                        case 3:
                            getRoom(connection, scanner);
                            break;
                        case 4:
                            updateReservation(connection, scanner);
                            break;
                        case 5:
                            deleteReservation(connection, scanner);
                            break;
                        case 0:
                            exit(connection, scanner);
                            return;
                        default:
                            System.out.println("Choose between (0 - 5)");
                    }
                }

            } catch (SQLException e) {
                System.out.println("SQL Exception: " + e.getMessage());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException("MySQL Driver not found", e);
        }
    }

    public static void GuestReservation(Connection connection, Scanner scanner) {
        try {
            scanner.nextLine();
            System.out.print("Enter Guest Name: ");
            String guestName = scanner.nextLine();

            System.out.print("Enter Room Number: ");
            int roomNumber = scanner.nextInt();

            System.out.print("Enter Contact Number: ");
            long mobNumber = scanner.nextLong();

            System.out.print("Enter Aadhar Card Number: ");
            long adhCard = scanner.nextLong();

            String sql = "INSERT INTO Reservation (Guest_Name, Room_Allocate, Mob_Number, Addhar_card) " +
                    "VALUES ('" + guestName + "', " + roomNumber + ", " + mobNumber + ", " + adhCard + ")";

            try (Statement stmt = connection.createStatement()) {
                int rowsAffected = stmt.executeUpdate(sql);
                if (rowsAffected > 0) {
                    System.out.println("Reservation successfully added.");
                }
            } catch (SQLException e) {
                System.out.println("Database Error: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }

    public static void checkReservation(Connection connection) {
        String sql = "SELECT reservation_id,Guest_Name,Room_Allocate,Addhar_card,Mob_Number FROM Reservation";

        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {

            while (rs.next()) {
                int reservationId = rs.getInt("reservation_id");
                String guestName = rs.getString("Guest_Name");
                int roomAllocate = rs.getInt("Room_Allocate");
                long aadharCard = rs.getInt("Addhar_card");
                long mobileNumber = rs.getInt("Mob_Number");

                System.out.println("Reservation ID: " + reservationId);
                System.out.println("Guest Name: " + guestName);
                System.out.println("Room Allocated: " + roomAllocate);
                System.out.println("Aadhar Card: " + aadharCard);
                System.out.println("Mobile Number: " + mobileNumber);
                System.out.println("-----------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    public static void getRoom(Connection connection, Scanner scanner) {
        try {
            System.out.print("Enter Reservation ID: ");
            int res = scanner.nextInt();
            System.out.println("Enter the Name");
            String Ns = scanner.nextLine();
            String sql = "SELECT Room_Allocate FROM Reservation WHERE reservation_id = " + res
                    + "AND Guest_Name =" + Ns + ",";


            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                int roomnumber = rs.getInt("Room_Allocate");
                System.out.println("reservation id is : " + res + " the room allocate is : " + roomnumber + "AND NAME iS " + Ns);
            }
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }

    public static void updateReservation(Connection connection, Scanner scanner) {

    }

    public static void deleteReservation(Connection connection, Scanner scanner) {
    }

    public static void exit(Connection connection, Scanner scanner) throws InterruptedException {

        System.out.print("Exiting System");
        int i = 5;
        while (i != 0) {
            System.out.print(".");
            Thread.sleep(450);
            i--;
        }
    }
}