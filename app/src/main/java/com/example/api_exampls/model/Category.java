package com.example.api_exampls.model;






import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Category {

@SerializedName("cat_id")
@Expose
private Integer catId;
@SerializedName("title")
@Expose
private String title;
@SerializedName("image")
@Expose
private String image;
@SerializedName("created_at")
@Expose
private Object createdAt;
@SerializedName("updated_at")
@Expose
private Object updatedAt;

public Integer getCatId() {
return catId;
}

public void setCatId(Integer catId) {
this.catId = catId;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getImage() {
return image;
}

public void setImage(String image) {
this.image = image;
}

public Object getCreatedAt() {
return createdAt;
}

public void setCreatedAt(Object createdAt) {
this.createdAt = createdAt;
}

public Object getUpdatedAt() {
return updatedAt;
}

public void setUpdatedAt(Object updatedAt) {
this.updatedAt = updatedAt;
}

}
