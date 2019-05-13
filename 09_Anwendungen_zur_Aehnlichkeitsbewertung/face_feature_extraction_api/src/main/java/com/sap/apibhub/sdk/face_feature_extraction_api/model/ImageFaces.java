/*
 * Inference Service for Face Feature Extraction
 * A functional service for detecting faces in an image / images and extracting feature vectors out of them
 *
 * OpenAPI spec version: Alpha
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.face_feature_extraction_api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sap.apibhub.sdk.face_feature_extraction_api.model.Face;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ImageFaces
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-12T16:21:48.336Z")
public class ImageFaces {
  @SerializedName("name")
  private String name = null;

  @SerializedName("numberOfFaces")
  private BigDecimal numberOfFaces = null;

  @SerializedName("faces")
  private List<Face> faces = null;

  public ImageFaces name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the image file
   * @return name
  **/
  @ApiModelProperty(value = "Name of the image file")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ImageFaces numberOfFaces(BigDecimal numberOfFaces) {
    this.numberOfFaces = numberOfFaces;
    return this;
  }

   /**
   * Number of the faces on the image
   * @return numberOfFaces
  **/
  @ApiModelProperty(value = "Number of the faces on the image")
  public BigDecimal getNumberOfFaces() {
    return numberOfFaces;
  }

  public void setNumberOfFaces(BigDecimal numberOfFaces) {
    this.numberOfFaces = numberOfFaces;
  }

  public ImageFaces faces(List<Face> faces) {
    this.faces = faces;
    return this;
  }

  public ImageFaces addFacesItem(Face facesItem) {
    if (this.faces == null) {
      this.faces = new ArrayList<Face>();
    }
    this.faces.add(facesItem);
    return this;
  }

   /**
   * List of boundry boxes per face detected on the image
   * @return faces
  **/
  @ApiModelProperty(value = "List of boundry boxes per face detected on the image")
  public List<Face> getFaces() {
    return faces;
  }

  public void setFaces(List<Face> faces) {
    this.faces = faces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageFaces imageFaces = (ImageFaces) o;
    return Objects.equals(this.name, imageFaces.name) &&
        Objects.equals(this.numberOfFaces, imageFaces.numberOfFaces) &&
        Objects.equals(this.faces, imageFaces.faces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, numberOfFaces, faces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageFaces {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberOfFaces: ").append(toIndentedString(numberOfFaces)).append("\n");
    sb.append("    faces: ").append(toIndentedString(faces)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

