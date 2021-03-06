package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Profile;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProfileResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-22T22:15:12.014Z")

public class ProfileResponse   {
  @JsonProperty("profile")
  @Valid
  private List<Profile> profile = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("code")
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

  @Valid

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

