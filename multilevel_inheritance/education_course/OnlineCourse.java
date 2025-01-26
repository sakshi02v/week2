package multilevel_inheritance.education_course;

class OnlineCourse extends Course{
    String platform;
    String isRecorded;

    OnlineCourse(String courseName, String duration,String platform, String isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;

        System.out.println("Platform name:"+platform);
        System.out.println("Recording available?:"+isRecorded);
    }
}
