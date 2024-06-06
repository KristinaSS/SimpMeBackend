package com.simp.me.repository;

import com.simp.me.models.Skin;
import com.simp.me.models.SkinKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkinRepository extends JpaRepository<Skin, SkinKey> {
}
