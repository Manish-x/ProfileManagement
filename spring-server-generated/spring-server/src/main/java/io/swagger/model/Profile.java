package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PersonalDetails;
import io.swagger.model.ProfessionalDetails;
import io.swagger.model.SkillsList;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Profile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-22T22:15:12.014Z")

public class Profile   {
  @JsonProperty("personalDetails")
  private PersonalDetails personalDetails = null;

  @JsonProperty("professionalDetails")
  private ProfessionalDetails professionalDetails = null;

  @JsonProperty("skiilsList")
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

  @Valid

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

  @Valid

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

  @Valid

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

