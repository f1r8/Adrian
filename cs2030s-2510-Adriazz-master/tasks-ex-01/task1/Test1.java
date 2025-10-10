/**
 * Test 1 for CS2030S Lab Ex 01.
 *
 * @author dcsaysp
 */
public class Test1 {
  /**
   * Main method for Test1.
   *
   * @param args Ignored and unused command line arguments.
   */
  public static void main(String[] args) {
    CS2030STest we = new CS2030STest();

    Course course1 = new Course("CS2030", "S", "Programming II");
    Course course2 = new Course("CS2030", null, "Programming II");
    Course course3 = new Course("CS2040", "S", "Algorithm I");
    Course course4 = new Course("IT2030", "S", "Programming II");
    Course course5 = new Course("CS2030", "DE", "Programming");

    we.expectReturn("Convert 'course1' to String",
      () -> course1.toString(), "CS2030S: Programming II");
    we.expectReturn("Convert 'course2' to String",
      () -> course2.toString(), "CS2030: Programming II");
    we.expectReturn("Convert 'course3' to String",
      () -> course3.toString(), "CS2040S: Algorithm I");
    we.expectReturn("Convert 'course4' to String",
      () -> course4.toString(), "IT2030S: Programming II");
    we.expectReturn("Convert 'course5' to String",
      () -> course5.toString(), "CS2030DE: Programming");

    we.expectReturn("Check 'course1' equal to 'course2",
      () -> course1.equals(course2), true);
    we.expectReturn("Check 'course1' not equal to 'course3",
      () -> course1.equals(course3), false);
    we.expectReturn("Check 'course1' not equal to 'course4",
      () -> course1.equals(course4), false);
    we.expectReturn("Check 'course1' equal to 'course4",
      () -> course1.equals(course5), true);
  }
}
