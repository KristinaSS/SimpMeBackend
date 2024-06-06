package com.simp.me.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "skin")
public class Skin {
    @EmbeddedId
    private SkinKey skinKey;

    @Basic
    @Column(name = "liked")
    private boolean isLiked;

    @Basic
    @Column(name = "owned")
    private boolean isOwned;
}
