package Streams.Streams2;

import java.util.List;

public class DataBaseService {
    List<Integer> list;

    public DataBaseService(List<Integer> list){
        this.list=list;
    }
    public List<Integer> getList(){
        return list;
    }
}
