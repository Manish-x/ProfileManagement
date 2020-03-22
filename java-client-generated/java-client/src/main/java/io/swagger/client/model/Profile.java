/*
 * Microservices
 * Profile management microservice which will allow query, create, update, delete of profiles 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: manishsinghal.m@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PersonalDetails;
import io.swagger.client.model.ProfessionalDetails;
import io.swagger.client.model.SkillsList;
import java.io.IOException;

/**
 * Profile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-22T22:09:01.320Z")
public class Profile {
  @SerializedName("personalDetails")
  private PersonalDetails personalDetails = null;

  @SerializedName("professionalDetails")
  private ProfessionalDetails professionalDetails = null;

  @SerializedName("skiilsList")
  private SkillsList skiilsList = null;

  public Profile personalDetails(PersonalDetails personalDetails) {
    this.personalDetails = personalDetails;
    return this;
  }

   /**
   * Get personalDetails
   * @return personalDetails
  **/
  @ApiModelProperty(value = "")
  public PersonalDetails getPersonalDetails() {
    return personalDetails;
  }

  public void setPersonalDetails(PersonalDetails personalDetails) {
    this.personalDetails = personalDetails;
  }

  public Profile professionalDetails(ProfessionalDetails professionalDetails) {
    this.professionalDetails = professionalDetails;
    return this;
  }

   /**
   * Get professionalDetails
   * @return professionalDetails
  **/
  @ApiModelProperty(value = "")
  public ProfessionalDetails getProfessionalDetails() {
    return professionalDetails;
  }

  public void setProfessionalDetails(ProfessionalDetails professionalDetails) {
    this.professionalDetails = professionalDetails;
  }

  public Profile skiilsList(SkillsList skiilsList) {
    this.skiilsList = skiilsList;
    return this;
  }

   /**
   * Get skiilsList
   * @return skiilsList
  **/
  @ApiModelProperty(value = "")
  public SkillsList getSkiilsList() {
    return skiilsList;
  }

  public void setSkiilsList(SkillsList skiilsList) {
    this.skiilsList = skiilsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.personalDetails, profile.personalDetails) &&
        Objects.equals(this.professionalDetails, profile.professionalDetails) &&
        Objects.equals(this.skiilsList, profile.skiilsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalDetails, professionalDetails, skiilsList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    
    sb.append("    personalDetails: ").append(toIndentedString(personalDetails)).append("\n");
    sb.append("    professionalDetails: ").append(toIndentedString(professionalDetails)).append("\n");
    sb.append("    skiilsList: ").append(toIndentedString(skiilsList)).append("\n");
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

