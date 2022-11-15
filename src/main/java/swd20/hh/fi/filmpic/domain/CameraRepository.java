package swd20.hh.fi.filmpic.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CameraRepository extends CrudRepository<Camera, Long> {
	List<Camera> findByName(String name);

}
