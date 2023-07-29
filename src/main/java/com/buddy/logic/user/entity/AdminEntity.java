package com.buddy.logic.user.entity;

import com.buddy.logic.user.entity.enumfactory.AdminRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Admin")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminId;
    private AdminRole adminRole;
}
