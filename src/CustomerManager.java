import java.util.Scanner;

public class CustomerManager {
    private static final int MAX_CUSTOMERS = 10000;
    private static Customer[] customers = new Customer[MAX_CUSTOMERS];
    private static int lastId = 0;
    private static int customerCount = 0;





    public static Customer createAccount(Scanner scanner) {
        System.out.println("Account Creation");
        if (lastId >= MAX_CUSTOMERS) {
            System.out.println("Max customer limit reached.");
            System.out.println("---------------------------------------------------------------------");
            return null;
        }

        int id = ++lastId;

        System.out.println("ID : " + id);
        String name;
        while (true) {
            System.out.println("Name (a-z, A-Z): ");
            name = scanner.nextLine();
            if (name.matches("[a-zA-Z]+")) {
                break;
            }
            System.out.println("Invalid name! Please enter letters only.");
        }

        int age;
        while (true) {
            System.out.println("Age (18 - 70): ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age >= 18 && age <= 70) {
                    break;
                } else {
                    System.out.println("Invalid age! Please enter age between 18 and 70.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();
            }
        }
        scanner.nextLine();

        String gender;
        while (true) {
            System.out.println("Gender (Male/Female): ");
            gender = scanner.nextLine();
            if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) {
                break;
            }
            System.out.println("Invalid gender! Please enter 'Male' or 'Female'.");
        }

        String phone;
        while (true) {
            System.out.println("Phone (11 digit number 0 to 9): ");
            phone = scanner.nextLine();
            if (phone.matches("[0-9]{11}")) {
                break;
            }
            System.out.println("Invalid phone number! Please enter an 11-digit number.");
        }

        String password;
        while (true) {
            System.out.println("Password (6 Digit number 0 - 9): ");
            password = scanner.nextLine();
            if (password.matches("[0-9]{6}")) {
                break;
            }
            System.out.println("Invalid password! Please enter a 6-digit number.");
        }


        Customer newCustomer = new Customer(id, name, age, gender, phone, password);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("phone : " + phone);
        System.out.println("Your Account Creation was successful!");
        System.out.println("---------------------------------------------------------------------");

        customers[customerCount++] = newCustomer;

        return newCustomer;
    }

    public static void deleteAccount(Scanner scanner) {
        System.out.println("Account Deletion");

        System.out.println("Enter your ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        int indexToDelete = -1;
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getId() == id) {
                indexToDelete = i;
                break;
            }
        }


        if (indexToDelete != -1) {
            Customer customer = customers[indexToDelete];


            System.out.println("Name: " + customer.getName());
            System.out.println("Age: " + customer.getAge());
            System.out.println("Gender: " + customer.getGender());
            System.out.println("Phone: " + customer.getPhone());


            System.out.println("Enter your password: ");
            String password = scanner.nextLine();


            if (customer.getPassword().equals(password)) {
                for (int i = indexToDelete; i < customerCount - 1; i++) {
                    customers[i] = customers[i + 1];
                }
                customerCount--;

                System.out.println("Your account has been deleted successfully!");
                System.out.println("--------------------------------------------------------");
            } else {
                System.out.println("Incorrect password! Please try again.");
                System.out.println("--------------------------------------------------------");
            }
        } else {
            System.out.println("No customer found with that ID.");
            System.out.println("--------------------------------------------------------");
        }
    }


    public static void displayCreatedAccountsList(Scanner scanner) {
        System.out.println("Enter security code:");
        int securityCode = scanner.nextInt();
        scanner.nextLine();

        if (securityCode != SecurityCode.getFinalSecurityCode()) {
            System.out.println("Incorrect security code. Access denied.");
            System.out.println("--------------------------------------------------------");
            return;
        }

        if (customerCount == 0) {
            System.out.println("There is nothing here.");
            System.out.println("--------------------------------------------------------");
            return;
        }

        System.out.println("Created Accounts List:");
        for (int i = 0; i < customerCount; i++) {
            Customer customer = customers[i];
            System.out.println("ID : " + customer.getId());
            System.out.println("Name : " + customer.getName());
            System.out.println("Age : " + customer.getAge());
            System.out.println("Gender : " + customer.getGender());
            System.out.println("phone : " + customer.getPhone());
            System.out.println("password : " + customer.getPassword());
            System.out.println("------------------------------------------");
        }
    }

        public static Customer findCustomerById ( int id){
            for (int i = 0; i < customerCount; i++) {
                if (customers[i].getId() == id) {
                    return customers[i];
                }
            }
            return null;


        }
    }


