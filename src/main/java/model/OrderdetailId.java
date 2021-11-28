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
public class OrderdetailId implements Serializable  {
    private static final long serialVersionUID = 8239247235975796867L;
    @Column(name = "orderNumber", nullable = false)
    private Integer orderNumber;
    @Column(name = "productCode", nullable = false, length = 15)
    private String productCode;
}