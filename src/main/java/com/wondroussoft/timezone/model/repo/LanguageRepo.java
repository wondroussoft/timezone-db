package com.wondroussoft.timezone.model.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wondroussoft.timezone.model.entity.Language;

@Repository
public interface LanguageRepo extends CrudRepository<Language, Long> {
	List<Language> findAll();

	Optional<Language> findById(Long id);
}
