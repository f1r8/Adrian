public class Snag{

  private Ride[] rideQueue;
  private int currIndex;

  public Snag(int num){
    this.rideQueue = new Ride[num];
    currIndex = 0;
  }

  public String ride(int idx, int pax, int distance){
    return String.format("%d: %s", idx, 
        rideQueue[idx].startRide(pax, distance));
  }

  public String addJust(){
    JustSnagRide jsRide = new JustSnagRide();
    rideQueue[currIndex] = jsRide;
    return String.format("%d: %s joined", currIndex++,
        jsRide.toString());
  }

  public String addBike(){
    BikeSnagRide bsRide = new BikeSnagRide();
    rideQueue[currIndex] = bsRide;
    return String.format("%d: %s joined", currIndex++,
        bsRide.toString());
  }

}
