package recordingsort;
/**
 * @author Juan Carlos Romero
 * date: 8/9/2022
 * purpose: Week 9  - exercise 3 a)Create Recording class
 * Version 1.0
 */
public class Recording {
   private String title;
   private String artist;
   private int playingTime;
   public Recording() {
      title = "";
      artist = "";
      playingTime = 0;
   }
   public Recording(String title, String artist, int playtime) {
	   this.title = title;
	   this.artist = artist;
	   playingTime = playtime;
   }
      public void setTitle(String title) {
      this.title = title;
   }
      public void setArtist(String artist) {
      this.artist = artist;
   }
      public void setPlayTime(int playtime) {
      playingTime = playtime;
   }
      public String getTitle() {
      return title;
   }
      public String getArtist() {
      return artist;
   }
      public int getPlayTime() {
      return playingTime; 
}
}