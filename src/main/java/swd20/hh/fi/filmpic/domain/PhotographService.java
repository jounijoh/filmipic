package swd20.hh.fi.filmpic.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotographService {

	@Autowired PhotographRepository photorepo;
	
	public List<Photograph> listAll(String keyword) {
        if (keyword != null) {
            return photorepo.search(keyword);
		}
			return (List<Photograph>) photorepo.findAll();
	}
}
