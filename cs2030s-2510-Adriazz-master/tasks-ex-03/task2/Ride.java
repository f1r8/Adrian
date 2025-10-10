public abstract class Ride{

  private int maxCapacity;

  public Ride(int maxCapacity){
    this.maxCapacity = maxCapacity;
  }

  public String startRide(int passengers, int distance){
    if (passengers > this.maxCapacity){
      throw new OverCapacityException(passengers);
    }
    return String.format("%s %sfor $%d",
        this.toString(), this.enterRide(passengers),
        this.costOfRide(distance));
  }

  public abstract String enterRide(int pax);

  public abstract int costOfRide(int distance);

}
