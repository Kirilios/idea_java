package OOPSeminars.Seminar3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    List<StudentGroup> studentGroups;

    public Stream(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
}
