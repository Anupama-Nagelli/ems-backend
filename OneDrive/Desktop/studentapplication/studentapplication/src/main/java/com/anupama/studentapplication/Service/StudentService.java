package com.anupama.studentapplication.Service;



import com.anupama.studentapplication.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
