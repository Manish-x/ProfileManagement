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
import io.swagger.client.model.Profile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProfileResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-22T22:09:01.320Z")
public class ProfileResponse {
  @SerializedName("profile")
  private List<Profile> profile = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("code")
  private Integer code = null;

  public ProfileResponse profile(List<Profile> profile) {
    this.profile = profile;
    return this;
  }

  public ProfileResponse addProfileItem(Profile profileItem) {
    if (this.profile == null) {
      this.profile = new ArrayList<Profile>();
    }
    this.profile.add(profileItem);
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(value = "")
  public List<Profile> getProfile() {
    return profile;
  }

  public void setProfile(List<Profile> profile) {
    this.profile = profile;
  }

  public ProfileResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ProfileResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileResponse profileResponse = (ProfileResponse) o;
    return Objects.equals(this.profile, profileResponse.profile) &&
        Objects.equals(this.message, profileResponse.message) &&
        Objects.equals(this.code, profileResponse.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, message, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileResponse {\n");
    
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

