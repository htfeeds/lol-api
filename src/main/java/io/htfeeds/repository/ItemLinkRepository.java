package io.htfeeds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.htfeeds.entity.ItemLink;

/**
 * @author HTFeeds
 *
 * Nov 28, 2018
 */
@Repository
public interface ItemLinkRepository extends JpaRepository<ItemLink, Long> {

}
