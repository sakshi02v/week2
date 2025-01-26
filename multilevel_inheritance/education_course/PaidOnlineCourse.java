package multilevel_inheritance.education_course;

class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, String duration,String platform, String isRecorded,double fee, double discount){
        super(courseName, duration,platform,isRecorded);
        this.fee=fee;
        this.discount=discount;

        System.out.println("Fees of course:"+fee);
        System.out.println("Discount offered:"+discount);

    }
}
