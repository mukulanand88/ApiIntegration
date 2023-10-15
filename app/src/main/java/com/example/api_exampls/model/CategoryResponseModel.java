package com.example.api_exampls.model;





import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CategoryResponseModel {

@SerializedName("status")
@Expose
private Boolean status;
@SerializedName("message")
@Expose
private String message;
@SerializedName("category")
@Expose
private List<Category> category;

public Boolean getStatus() {
return status;
}

public void setStatus(Boolean status) {
this.status = status;
}

public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}

public List<Category> getCategory() {
return category;
}

public void setCategory(List<Category> category) {
this.category = category;
}

}