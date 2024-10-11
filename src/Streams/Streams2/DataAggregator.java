package Streams.Streams2;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class DataAggregator {
    public List<Integer> getItems(){
        DataBaseService service = new DataBaseService(new LinkedList<>());
        service.list.addAll(List.of(1,2,3,4));
        return service.list;
    }
}
