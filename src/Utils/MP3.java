package Utils;

public class MP3 {

	private String author;
	private String file;
	private String name;
	private String trackNo; // Con el sque vamos a ordenar.
	
	
	//Constructor con todos los campos.  

	public MP3(String author, String file, String name, String trackNo) {
		super();
		this.author = author;
		this.file = file;
		this.name = name;
		this.trackNo = trackNo;
	}
	

	public String getAuthor() {
		return author;
	}

	//constructor sin campos. 
	public MP3() {
		super();
		// TODO Auto-generated constructor stub
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
