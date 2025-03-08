package model;

import jakarta.persistence.*;

import lombok.*;

import java.util.Date;

@Entity
@Table(name = "studentAddress")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    @Column(length = 50)
    private String street;
    private String city;
    @Transient
    private double x;
    private boolean isOpen;
    private Date addedDate;
    @Lob
    private byte[] image;

}
