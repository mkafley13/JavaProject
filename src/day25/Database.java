package day25;

public class Database {

    private static Database _database;

        private Database(){}

    public static Database getInstance(){
            if (_database == null){
                _database = new Database();
            }
            return _database;
    }
}
