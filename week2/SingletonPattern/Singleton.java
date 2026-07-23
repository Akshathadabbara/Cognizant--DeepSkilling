package week2.SingletonPattern;

public class Singleton {

    public static void main(String[] args) {

        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        db1.connect();

        if (db1 == db2) {
            System.out.println("Only one instance is created.");
        } else {
            System.out.println("Different instances created.");
        }
    }
}

class Database {

    private static Database instance;

    private Database() {
        System.out.println("Database Object Created");
    }

    public static Database getInstance() {

        if (instance == null) {
            instance = new Database();
        }

        return instance;
    }

    public void connect() {
        System.out.println("Database Connected Successfully.");
    }
}