package com.yuqar.yuparty.monolithic.repository;

import com.yuqar.yuparty.monolithic.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
