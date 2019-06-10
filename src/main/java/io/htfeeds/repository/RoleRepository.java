package io.htfeeds.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.htfeeds.entity.Role;
import io.htfeeds.enums.RoleName;

/**
 * @author HTFeeds
 *
 * Nov 28, 2018
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}