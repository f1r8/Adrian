public class OverCapacityException extends RuntimeException{

  public OverCapacityException(int capacity){
    super(String.format("Over capacity: %d", capacity));
  }
}

