package OOPSeminars.Seminar5.Service;

import OOPSeminars.Seminar5.Data.*;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;

    private List<StudentGroup> studentGroupList;

    public DataService() {
        this.userList = new ArrayList<>();

    }

    public void create(String firstName, String secondName, String lastName, Type type) {
        User user = null;
        int id = getFreeID(type);
        if (Type.STUDENT == type) {
            user = new Student(firstName, secondName, lastName, id );
        if (Type.TEACHER == type) {
            user = new Teacher(firstName, secondName, lastName, id);
            }
            userList.add(user);
        }
    }


    private int getFreeID(Type type){
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for(User user : userList){
            if(user instanceof Teacher && !itsStudent){
                lastId = ((Teacher)user).getTeacherID() + 1;
            }
            if(user instanceof Student && itsStudent){
                lastId = ((Student) user).getStudentID() + 1;
            }
        }
        return lastId;
    }
    public List<User> getAllUser(){
        return userList;
    }
    public List<User> getAllStudents(){
        List<User> resultList = new ArrayList<>();
        for (User user: userList) {
            if (user instanceof Student){
                resultList.add(user);
            }

        }
        return resultList;
    }

}
