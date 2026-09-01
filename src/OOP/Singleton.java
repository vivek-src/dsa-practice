package OOP;

public class Singleton {


    static void main() {
//        DBInstance mysql = new DBInstance();
        DBInstance mysql = DBInstance.getInstance();
        DBInstance pgsql = DBInstance.getInstance();

        // weather both the instances are same
        System.out.println(mysql == pgsql);
    }
}

class DBInstance{
    private DBInstance(){
        connectToDatabase();
    };

    private static DBInstance instance;

    static DBInstance getInstance(){
        if (instance == null){
            instance = new DBInstance();
        }
        return instance;
    }

    private void connectToDatabase() {
        // db connection logic here
        System.out.println("Connecting to DB...");
    }
}
