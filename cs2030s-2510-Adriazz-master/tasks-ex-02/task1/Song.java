public class Song{
  private String name;
  private String artist;
  private int min;
  private int seconds;

  public Song(String name, String artist, int min, int seconds){
    this.name=name;
    this.artist=artist;
    this.min=min;
    this.seconds=seconds;
  }

  @Override
  public String toString(){
    return name+" ("+min+"m "+seconds+"s) by "+artist;
  }

}
