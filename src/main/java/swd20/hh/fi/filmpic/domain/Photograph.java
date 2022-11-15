package swd20.hh.fi.filmpic.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Photograph {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private String filePath;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	@JsonIgnoreProperties("photographs")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "filmId")
	@JsonIgnoreProperties("photographs")
	private Film film;
	
	
	@ManyToOne
	@JoinColumn(name = "cameraId")
	@JsonIgnoreProperties("photographs")
	private Camera camera;
	
	// KONSTURKTORIT 
	public Photograph() {}


	public Photograph(String title, String description, String filePath, Film film, Camera camera, User user) {
		super();
		this.title = title;
		this.description = description;
		this.filePath = filePath;
		this.film = film;
		this.camera = camera;
		this.user = user;
	}
	public Photograph(String title, String description, String filePath, Film film, Camera camera) {
		super();
		this.title = title;
		this.description = description;
		this.filePath = filePath;
		this.film = film;
		this.camera = camera;
		
	}

	

	// SETTERIT
	public void setUser(User user) {
		this.user = user;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public void setFilm(Film film) {
		this.film = film;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
	public void setCamera(Camera camera) {
		this.camera = camera;
	}


	// GETTERIT
	public Long getId() {
		return id;
	}


	public Film getFilm() {
		return film;
	}


	public String getTitle() {
		return title;
	}


	public String getDescription() {
		return description;
	}


	public String getFilePath() {
		return filePath;
	}
	
	public Camera getCamera() {
		return camera;
	}
	
	public User getUser() {
		return user;
	}

	@Override
	public String toString() {
		return "Photograph [id=" + id + ", title=" + title + ", description=" + description 
				+ ", filePath=" + filePath + "]";
	}
	
}
