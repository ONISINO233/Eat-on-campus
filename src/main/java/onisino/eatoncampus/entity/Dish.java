package onisino.eatoncampus.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "dish")
@Data
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dishId;

    @Column(name = "dish_name")
    private String dishName;

    @Column(name = "dish_description")
    private String dishDescription;

    @Column(name = "store_id")
    private String storeId;

    @Column(name = "dish_picture_id")
    private String dishPictureId;

    @Column(name = "dish_price")
    private float dishPrice;

    @Column(name = "dish_number")
    private int dishNumber;

    @Column(name = "dish_sale")
    private int dishSale;

    // Getters
    public int getDishId() {
        return dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public String getStoreId() {
        return storeId;
    }

    public String getDishPictureId() {
        return dishPictureId;
    }

    public float getDishPrice() {
        return dishPrice;
    }

    public int getDishNumber() {
        return dishNumber;
    }

    public int getDishSale() {
        return dishSale;
    }

    // Setters
    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public void setDishPictureId(String dishPictureId) {
        this.dishPictureId = dishPictureId;
    }

    public void setDishPrice(float dishPrice) {
        this.dishPrice = dishPrice;
    }

    public void setDishNumber(int dishNumber) {
        this.dishNumber = dishNumber;
    }

    public void setDishSale(int dishSale) {
        this.dishSale = dishSale;
    }
}