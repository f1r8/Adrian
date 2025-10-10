public class Pair<T> {
  private String string;
  private T value;

  public Pair(String string, T value) {
    this.string = string;
    this.value = value;
  }

  public T get() {
    return value;
  }

  @Override
  public String toString() {
    return String.format("%s: %s", string, value.toString());
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Pair<?>) {
      Pair<?> pair = (Pair<?>) obj;
      return this.string.equals(pair.string);
    }
    return false;
  }
}
