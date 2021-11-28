package model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class PaymentId implements Serializable {
    private static final long serialVersionUID = 3703488497909757661L;
    @Column(name = "customerNumber", nullable = false)
    private Integer customerNumber;
    @Column(name = "checkNumber", nullable = false, length = 50)
    private String checkNumber;
}

