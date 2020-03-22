package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProfessionalDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-22T22:15:12.014Z")

public class ProfessionalDetails   {
  @JsonProperty("totalYearsOfExperience")
  private Integer totalYearsOfExperience = null;

  @JsonProperty("primarySkill")
  private String primarySkill = null;

  @JsonProperty("role/designation")
  private String roledesignation = null;

  public ProfessionalDetails totalYearsOfExperience(Integer totalYearsOfExperience) {
    this.totalYearsOfExperience = totalYearsOfExperience;
    return this;
  }

  /**
   * Get totalYearsOfExperience
   * @return totalYearsOfExperience
  **/
  @ApiModelProperty(example = "10", required = true, value = "")
  @NotNull


  public Integer getTotalYearsOfExperience() {
    return totalYearsOfExperience;
  }

  public void setTotalYearsOfExperience(Integer totalYearsOfExperience) {
    this.totalYearsOfExperience = totalYearsOfExperience;
  }

  public ProfessionalDetails primarySkill(String primarySkill) {
    this.primarySkill = primarySkill;
    return this;
  }

  /**
   * Get primarySkill
   * @return primarySkill
  **/
  @ApiModelProperty(example = "java", required = true, value = "")
  @NotNull


  public String getPrimarySkill() {
    return primarySkill;
  }

  public void setPrimarySkill(String primarySkill) {
    this.primarySkill = primarySkill;
  }

  public ProfessionalDetails roledesignation(String roledesignation) {
    this.roledesignation = roledesignation;
    return this;
  }

  /**
   * Get roledesignation
   * @return roledesignation
  **/
  @ApiModelProperty(example = "software engineer", required = true, value = "")
  @NotNull


  public String getRoledesignation() {
    return roledesignation;
  }

  public void setRoledesignation(String roledesignation) {
    this.roledesignation = roledesignation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfessionalDetails professionalDetails = (ProfessionalDetails) o;
    return Objects.equals(this.totalYearsOfExperience, professionalDetails.totalYearsOfExperience) &&
        Objects.equals(this.primarySkill, professionalDetails.primarySkill) &&
        Objects.equals(this.roledesignation, professionalDetails.roledesignation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalYearsOfExperience, primarySkill, roledesignation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfessionalDetails {\n");
    
    sb.append("    totalYearsOfExperience: ").append(toIndentedString(totalYearsOfExperience)).append("\n");
    sb.append("    primarySkill: ").append(toIndentedString(primarySkill)).append("\n");
    sb.append("    roledesignation: ").append(toIndentedString(roledesignation)).append("\n");
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

