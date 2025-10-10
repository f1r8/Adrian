public abstract class Ride{

  private int maxCapacity;
  private int passengers;
  private int distance;

  public Ride(int maxCapacity){
    this.maxCapacity = maxCapacity;
  }

  public String startRide(int passengers, int distance){
    this.passengers = passengers;
    this.distance = distance;
    return String.format("for %d passenger(s) for $%d",
        this.passengers, costOfRide(this.distance));
  }

  public abstract int costOfRide(int distance);

}
