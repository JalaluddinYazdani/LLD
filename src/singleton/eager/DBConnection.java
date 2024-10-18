package singleton.eager;

public class DBConnection {
    private static DBConnection instance=
            new DBConnection();
    private DBConnection(){
        //initialization
    }
    public static DBConnection getInstance(){
//        if(instance==null){
//            instance=new DBConnection();
//        }
        return instance;
    }
}
