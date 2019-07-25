package com.wondroussoft.timezone.model.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wondroussoft.timezone.model.entity.Country;

@Repository
public interface CountryRepo extends CrudRepository<Country, Long> {
	List<Country> findAll();

	Optional<Country> findById(Long id);
}
