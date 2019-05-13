/*
 * Inference Service for Similarity Scoring
 * Similarity Scoring API compares vectors using a similarity score (cosine distance) ranging from -1 to 1. The similarity score is calculated based on the cosine similarity of the vectors. The vectors retrieved from the “image feature extraction” and “document feature extraction” services can be used as inputs for this service.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.similarity_scoring_api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sap.apibhub.sdk.similarity_scoring_api.model.TopSimilarVectors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IdTopSimilarVectors
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-12T15:50:57.909Z")
public class IdTopSimilarVectors {
  @SerializedName("id")
  private String id = null;

  @SerializedName("similarVectors")
  private TopSimilarVectors similarVectors = null;

  public IdTopSimilarVectors id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Name of the file containing the vector.
   * @return id
  **/
  @ApiModelProperty(value = "Name of the file containing the vector.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IdTopSimilarVectors similarVectors(TopSimilarVectors similarVectors) {
    this.similarVectors = similarVectors;
    return this;
  }

   /**
   * Get similarVectors
   * @return similarVectors
  **/
  @ApiModelProperty(value = "")
  public TopSimilarVectors getSimilarVectors() {
    return similarVectors;
  }

  public void setSimilarVectors(TopSimilarVectors similarVectors) {
    this.similarVectors = similarVectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdTopSimilarVectors idTopSimilarVectors = (IdTopSimilarVectors) o;
    return Objects.equals(this.id, idTopSimilarVectors.id) &&
        Objects.equals(this.similarVectors, idTopSimilarVectors.similarVectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, similarVectors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdTopSimilarVectors {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    similarVectors: ").append(toIndentedString(similarVectors)).append("\n");
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

