package guru.springframework.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;  //No cascade, so if delete Notes, will NOT delete Recipe

    @Lob
    private String recipeNotes;

//    // TAKEN CARE OF WITH @Data LOMBOK
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Recipe getRecipe() {
//        return recipe;
//    }
//
//    public void setRecipe(Recipe recipe) {
//        this.recipe = recipe;
//    }
//
//    public String getRecipeNotes() {
//        return recipeNotes;
//    }
//
//    public void setRecipeNotes(String recipeNotes) {
//        this.recipeNotes = recipeNotes;
//    }
}
