package OOPSeminars.Seminar3;

import java.util.List;

public class StreamService {

    public List<Stream> SortStreamBySize(List<Stream> streams, StreamComparator comparator){
        streams.sort(new StreamComparator());
        return streams;
    }
}
