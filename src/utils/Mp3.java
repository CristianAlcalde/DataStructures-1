package utils;

public class Mp3 {

	private String author;
	private String file;
	private String name;
	private String trackNo;
	
	public Mp3() {
	
	}

	public Mp3(String author, String file, String name, String trackNo) {

		this.author = author;
		this.file = file;
		this.name = name;
		this.trackNo = trackNo;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrackNo() {
		return trackNo;
	}

	public void setTrackNo(String trackNo) {
		this.trackNo = trackNo;
	}

}