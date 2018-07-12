package com.chaouki.location.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaouki.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
