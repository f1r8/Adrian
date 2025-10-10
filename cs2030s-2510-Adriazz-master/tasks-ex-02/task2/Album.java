public class Album{
  private String name;
  private int numSongs;
  private Song[] songs;
  private int currentSize;

  public Album(String name, int numSongs){
    this.name=name;
    this.numSongs=numSongs;
    this.songs = new Song[numSongs];
    this.currentSize=0;
  }

  public String add(String artist, String title, int minute, int seconds){
    if (this.currentSize==numSongs){
      return "No more space on album "+this.name;
    }
    Song song = new Song(title,artist,minute,seconds);
    this.songs[currentSize]=song;
    currentSize++;
    return "Added: " + song.toString();
  }

  public String play(int songNumber){
    return songs[songNumber].toString();
  }

  @Override
  public String toString(){
    String string = this.name + ": ";
    for(int i = 0;i<currentSize;i++){
      string+=songs[i].toString()+"; ";
    }
    return string;
  }

}
