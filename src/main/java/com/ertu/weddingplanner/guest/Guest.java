package com.ertu.weddingplanner.guest;

import jakarta.persistence.*;

@Entity
@Table
public class Guest {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    private long id;
    private String name;
    @Column(unique = true)
    private String email;
    private boolean isAttending;
    private int additionalGuests;
    @Column(columnDefinition = "TEXT")
    private String comment;

    public Guest() {
    }

    public Guest(long id, String name, String email, boolean isAttending, int additionalGuests, String comment) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.isAttending = isAttending;
        this.additionalGuests = additionalGuests;
        this.comment = comment;
    }

    public Guest(String name, String email, boolean isAttending, int additionalGuests, String comment) {
        this.name = name;
        this.email = email;
        this.isAttending = isAttending;
        this.additionalGuests = additionalGuests;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAttending() {
        return isAttending;
    }

    public void setAttending(boolean attending) {
        isAttending = attending;
    }

    public int getAdditionalGuests() {
        return additionalGuests;
    }

    public void setAdditionalGuests(int additionalGuests) {
        this.additionalGuests = additionalGuests;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isAttending=" + isAttending +
                ", additionalGuests=" + additionalGuests +
                ", comment='" + comment + '\'' +
                '}';
    }
}