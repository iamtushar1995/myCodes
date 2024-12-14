package com.mphasis.appstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.appstore.entity.Apps;

@Repository
public interface AppsRepository extends JpaRepository<Apps, Long>{

}
