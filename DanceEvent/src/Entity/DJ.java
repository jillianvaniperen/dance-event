package Entity;
import java.io.Serializable;

public class DJ implements Serializable{
    private String name;
    private String musicStyle;

    public DJ() {}

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getMusicStyle() { return this.musicStyle; }

    public void setMusicStyle(String musicStyle) {
        this.musicStyle = musicStyle;
    }
}

