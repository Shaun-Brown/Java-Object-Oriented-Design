package lib;

public class CDTrack {

    private String title, artist;
    private int duration;

    public CDTrack(){
        title = "";
        artist = "";
        duration = 0;
    }

    public CDTrack(String title, String artist, int duration){
        this.title = title;
        this.artist = artist;
        this.duration = Math.max(duration, 0);;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = Math.max(duration, 0);
    }

    @Override
    public String toString() {
        return "CDTrack:[title=" + title + ", artist=" + artist + ", duration=" + duration +"]";
    }

}
