package co.edureka.model;

public class Settings {
	
	Integer volumeLevel;
	Integer brightness;
	String appName;
	String primaryColor;
	String author;
	
	
	public Integer getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(Integer volumeLevel) {
		this.volumeLevel = volumeLevel;
	}
	public Integer getBrightness() {
		return brightness;
	}
	public void setBrightness(Integer brightness) {
		this.brightness = brightness;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getPrimaryColor() {
		return primaryColor;
	}
	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Settings [volumeLevel=" + volumeLevel + ", brightness=" + brightness + ", appName=" + appName
				+ ", primaryColor=" + primaryColor + ", author=" + author + "]";
	}
	
	
	
}
