public class Course{
  private String courseCode;
  private String courseVariant;
  private String courseName;
  public Course(String courseCode,String courseVariant, String courseName){
    this.courseCode=courseCode;
    this.courseVariant=courseVariant==null?"":courseVariant;
    this.courseName=courseName;
  }
  @Override
  public String toString(){
    return this.courseCode+this.courseVariant+": "+this.courseName;
  }
  @Override
  public boolean equals(Object o){
    if (o instanceof Course){
      return this.courseCode.equals(((Course)o).courseCode);
    }
    return false;
  }
}
