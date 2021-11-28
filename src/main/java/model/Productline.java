package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "productlines")
@Entity
@Getter
@Setter
public class Productline extends BaseObject{
    @Id
    @Column(name = "productLine", nullable = false, length = 50)
    private String id;

    @Column(name = "textDescription", length = 4000)
    private String textDescription;

    @Lob
    @Column(name = "htmlDescription")
    private String htmlDescription;

    @Column(name = "image")
    private byte[] image;

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}