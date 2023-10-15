package com.example.api_exampls.Post.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

@SerializedName("post_id")
@Expose
private Integer postId;
@SerializedName("image")
@Expose
private String image;
@SerializedName("cat_id")
@Expose
private String catId;
@SerializedName("created_at")
@Expose
private String createdAt;
@SerializedName("updated_at")
@Expose
private String updatedAt;

public Integer getPostId() {
return postId;
}

public void setPostId(Integer postId) {
this.postId = postId;
}

public String getImage() {
return image;
}

public void setImage(String image) {
this.image = image;
}

public String getCatId() {
return catId;
}

public void setCatId(String catId) {
this.catId = catId;
}

public String getCreatedAt() {
return createdAt;
}

public void setCreatedAt(String createdAt) {
this.createdAt = createdAt;
}

public String getUpdatedAt() {
return updatedAt;
}

public void setUpdatedAt(String updatedAt) {
this.updatedAt = updatedAt;
}

}
