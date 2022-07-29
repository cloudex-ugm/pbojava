import java.rmi.server.UID;

public class Singleton{

    private static String _singleton;
    private String _nonSingleton;

    public static String GetInstance(){
        if (_singleton == null){
            _singleton = new UID().toString();
        }
        return _singleton;
    }

    public String GetNonSingletonInstance(){
        if (_nonSingleton == null){
            _nonSingleton = new UID().toString();
        }
        return _nonSingleton;
    }
}