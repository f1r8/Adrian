public class Classroom<T> {

  private Pair<T>[] students;

  public Classroom(int numStudents) {
    //The only way to add a Pair to students is through the add method,
    //which only allows creation of Pair<T>, therefore, we can safely
    //cast to Pair<T>, as no other kinds of Pairs can be added
    @SuppressWarnings("unchecked")
    Pair<T>[] arr = (Pair<T>[]) new Pair<?>[numStudents];
    this.students = arr;
  }

  public String add(int index, String matric, T item) {
    Pair<T> pair = new Pair<>(matric, item);
    students[index] = pair;
    return String.format("Added %s at %d", pair.toString(), index);
  }

  public T get(String matric) {
    Pair<?> pair = new Pair<>(matric, null);
    for (Pair<T> student : students) {
      if (student.equals(pair)) {
        return student.get();
      }
    }
    return null;
  }
      
}
