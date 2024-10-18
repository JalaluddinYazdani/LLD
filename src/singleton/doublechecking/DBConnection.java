package singleton.doublechecking;

public class DBConnection {
    private static DBConnection instance=null;
    private DBConnection(){
        //initialization
    }
    //T1,T2,T3,T4,T5
    public static DBConnection getInstance(){
        if(instance==null){
            synchronized (DBConnection.class){//T1
                if(instance==null){
                    instance=new DBConnection();
                }
            }
        }
        return instance;
    }
}
