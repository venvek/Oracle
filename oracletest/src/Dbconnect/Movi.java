package Dbconnect;

public class Movi {
	private String movie_id;
	private String title;
	private String location;
	private int screen;
	
	public String getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getScreen() {
		return screen;
	}
	public void setScreen(int screen) {
		this.screen = screen;
	}
	@Override
	public String toString() {
		return "movi [movie_id=" + movie_id + ", title=" + title + ", location=" + location + ", screen=" + screen
				+ "]";
	}
}
