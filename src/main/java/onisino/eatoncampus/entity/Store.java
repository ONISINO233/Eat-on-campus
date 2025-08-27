package onisino.eatoncampus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "store")
@Data
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeId;

    @Column(name = "store_name")
    @NotBlank(message = "店铺名称不能为空")
    private String storeName;

    @Column(name = "store_description")
    private String storeDescription="这个店铺暂无描述";

    @Column(name = "store_picture_id")
    private String storePictureId = "0";

    // Getters
    public int getStoreId() {
        return storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public String getStorePictureId() {
        return storePictureId;
    }

    // Setters
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }

    public void setStorePictureId(String storePictureId) {
        this.storePictureId = storePictureId;
    }
}