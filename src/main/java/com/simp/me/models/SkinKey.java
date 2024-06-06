package com.simp.me.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class SkinKey implements Serializable {
    @ManyToOne
    @JoinColumn(name = "acc_Id")
    private Account account;

    @Basic
    @Column(name = "id")
    private String id;
}
