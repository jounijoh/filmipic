package swd20.hh.fi.filmpic.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Camera {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String filmFormat;
	
	@OneToMany
	@JsonIgnoreProperties("film")
	private List<Photograph> photographs;
	
	
	// KONSTRUKTORIT
	public Camera() {}
	
	public Camera(String name, String filmFormat) {
		this.name = name;
		this.filmFormat = filmFormat;
	}
	
	// SETTERIT
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFilmFormat(String filmFormat) {
		this.filmFormat = filmFormat;
	}
	
	// GETTERIT
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getFilmFormat() {
		return filmFormat;
	}
	@Override
	public String toString() {
		return "Camera [id=" + id + ", name=" + name + ", filmFormat=" + filmFormat + "]";
	}
	
	
}
