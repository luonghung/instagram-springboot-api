package com.hungl2.instagram.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "posts")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "created_at")
    private ZonedDateTime createdAt;
    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;
    @Column(name = "url", nullable = false)
    private String url;
    @Column(name = "caption")
    private String caption;
    @Column(name = "lat")
    private BigDecimal lat;
    @Column(name = "lng")
    private BigDecimal lng;
    @Column(name = "user_id", nullable = false)
    private int userId;
}
