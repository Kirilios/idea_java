package OOPSeminars.Seminar3;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    List<StudentGroup> studentGroups;
    int counter;
    public StreamIterator(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroups.size();
    }

    @Override
    public StudentGroup next() {
        if(hasNext()){
            return studentGroups.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext())
            studentGroups.remove(counter);
    }
}

