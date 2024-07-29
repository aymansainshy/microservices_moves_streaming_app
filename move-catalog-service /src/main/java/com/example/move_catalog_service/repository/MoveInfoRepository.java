package com.example.move_catalog_service.repository;

import com.example.move_catalog_service.model.MoveInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoveInfoRepository extends JpaRepository<MoveInfo, Long> {
}
