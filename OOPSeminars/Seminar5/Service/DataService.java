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

    public User create(String firstName, String secondName, String lastName, Type type) {
        User user = null;
        int id = getFreeID(type);

        if (Type.STUDENT == type) {
            user = new Student(firstName, secondName, lastName, id);
        } else if (Type.TEACHER == type) {
            user = new Teacher(firstName, secondName, lastName, id);
        }

        if (user != null) {
            userList.add(user);
        }

        return user;
    }

    public List<User> createStudents(List<String> firstNames, List<String> secondNames, List<String> lastNames) {
        List<User> students = new ArrayList<>();
        for (int i = 0; i < firstNames.size(); i++) {
            String firstName = firstNames.get(i);
            String secondName = secondNames.get(i);
            String lastName = lastNames.get(i);

            Student student = new Student(firstName, secondName, lastName, getFreeID(Type.STUDENT));
            userList.add(student);
            students.add(student);
        }
        return students;
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
