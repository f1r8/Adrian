public class JustSnagRide extends Ride{

  public JustSnagRide(){
    super(4);
  }

  @Override
  public String enterRide(int capacity){
    return String.format("(%s pax) ", capacity);
  }


  @Override
  public int costOfRide(int distance){
    return distance / 3;
  }

  @Override
  public String toString(){
    return "JustSnag";
  }
}
