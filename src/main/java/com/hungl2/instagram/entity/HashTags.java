package com.hungl2.instagram.entity;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "hashtags")
public class HashTags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "created_at")
    private ZonedDateTime createdAt;
    @Column(name = "title", nullable = false)
    private String title;
}
