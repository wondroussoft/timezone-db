package com.wondroussoft.timezone.model.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wondroussoft.timezone.model.entity.Timezone;

@Repository
public interface TimezoneRepo extends CrudRepository<Timezone, Long> {
	List<Timezone> findAll();

	Optional<Timezone> findById(Long id);
}
