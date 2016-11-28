package infopower.economyenergy.settingsRecycler;

public class Settings {

    private String title, description;
    private int img;

    public Settings() {}
    public Settings(String title, String description, int img) {
        this.title = title;
        this.description = description;
        this.img = img;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public int getImg() {return img;}

    public void setImg(int img) {this.img = img;}
}