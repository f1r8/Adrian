public class BikeSnagRide extends Ride{

  public BikeSnagRide(){
    super(2);
  }

  @Override
  public String enterRide(int pax){
    return "";
  }

  @Override
  public int costOfRide(int distance){
    return 5;
  }

  @Override
  public String toString(){
    return "BikeSnag";
  }
}
  
