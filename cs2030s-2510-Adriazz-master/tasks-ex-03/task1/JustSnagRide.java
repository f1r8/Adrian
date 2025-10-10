public class JustSnagRide extends Ride{

  public JustSnagRide(){
    super(4);
  }

  @Override
  public String startRide(int capacity, int distance){
    return String.format("%s %s", this.toString(), 
        super.startRide(capacity, distance));
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
