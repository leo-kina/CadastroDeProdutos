package com.example.demo.infra.persistence;

import com.example.demo.core.enums.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @Column(unique = true, updatable = false, nullable = false)
    private UUID identifier;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private Category category;
    private Integer stock;
    @PrePersist
    public void generateUUID() {
        if (this.identifier == null) {
            this.identifier = UUID.randomUUID();
        }
    }
}
