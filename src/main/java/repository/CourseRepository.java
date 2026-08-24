package repository;

import model.Course;

public class CourseRepository {

    public final static Course [] courses = new Course[100];

public void addCourse (Course course ) {

    if (course == null)
    {
         throw new IllegalArgumentException("the coues is null") ;
    }

    for (int i = 0; i < courses.length; i++) {
        if (courses [i] == null)
        {
            courses [i] = course;
            return;
        }

    }


}

    public Course findByName(String name)
    {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null && courses [i].getName().equals(name)){
                return courses[i];

            }
        }

        return null;

    }

    public boolean  isDuplicateCourse (String name)
    {
        if (findByName(name) != null)
        {
            return true;
        }

        return false;

    }

    public int getCapacityByCode (int code)
    {
        for (int i = 0; i < courses.length; i++) {
            if (courses [i] != null && courses [i].getCode()==code)
            {
                return courses[i].getCapacity();
            }

        }
        return 0;
    }

    public String getNameByCode (String name)
    {
        for (int i = 0; i < courses.length; i++) {
            if (courses [i] != null && courses [i].getName()==name)
            {
                return courses[i].getName();
            }

        }
        return null;
    }

    public String getCourseNameByCode(int code )
    {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i]!=null && courses[i].getCode()==code)
            {
                return courses[i].getName();
            }

        }
        return null ;


    }
}
