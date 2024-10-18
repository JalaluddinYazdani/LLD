package singleton.single;

public class DBConnection {
    private static DBConnection instance=null;
    private DBConnection(){
        //initialization
    }
    public static DBConnection getInstance(){
        if(instance==null){
            instance=new DBConnection();
        }
        return instance;
    }
}
