package com.simp.me.repository;

import com.simp.me.models.Skin;
import com.simp.me.models.SkinKey;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SkinRepository extends JpaRepository<Skin, SkinKey> {
    @Query("SELECT s FROM skin s WHERE s.skinKey.account.id = :uuid")
    List<Skin> findAllByAccountId(@Param("uuid") UUID uuid);
}
