package multilevel_inheritance.education_course;

class Course{
    String courseName;
    String duration;

    Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
        System.out.println("Course name:"+courseName);
        System.out.println("Duration:"+duration);
    }
}
