package swd20.hh.fi.filmpic.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long filmId;
	private String type;
	private String name;
	private String size;
	private int isoSpeed;
	
	@OneToMany
	@JsonIgnoreProperties("film")
	private List<Photograph> photographs;
	
	// KONSTRUKTORIT
	public Film() {}
	
	public Film(String name, String type, String size, int isoSpeed) {
		this.type = type;
		this.name = name;
		this.size = size;
		this.isoSpeed = isoSpeed;
	}
	
	// SETTERIT
	public void setFilmId(Long id) {
		this.filmId = id;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setIsoSpeed(int isoSpeed) {
		this.isoSpeed = isoSpeed;
	}
	
	// GETTERIT
	public Long getFilmId() {
		return filmId;
	}
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public String getSize() {
		return size;
	}
	public int getIsoSpeed() {
		return isoSpeed;
	}
	@Override
	public String toString() {
		return "Film [id=" + filmId + ", type=" + type + ", name=" + name + ", size=" + size + ", isoSpeed=" + isoSpeed
				+ "]";
	}
	
	
}
