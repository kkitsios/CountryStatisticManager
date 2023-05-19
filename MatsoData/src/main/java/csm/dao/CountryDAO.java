package csm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import csm.entity.Country;

@Repository
public interface CountryDAO extends JpaRepository<Country, Integer> {
	
	public List<Country> findAll();
	
}
