package bg.softuni.smartphone_shop.model;

import bg.softuni.smartphone_shop.model.enums.CategoryType;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class ToBeConcidered_Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private CategoryType category;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    //##########################################################


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategoryType getCategory() {
        return category;
    }

    public void setCategory(CategoryType category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
