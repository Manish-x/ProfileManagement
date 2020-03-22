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
 * SkillsList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-22T22:15:12.014Z")

public class SkillsList   {
  @JsonProperty("skillCategory")
  private String skillCategory = null;

  @JsonProperty("toolName")
  private String toolName = null;

  @JsonProperty("yearsOfExperience")
  private Integer yearsOfExperience = null;

  @JsonProperty("monthsOfExperience")
  private Integer monthsOfExperience = null;

  @JsonProperty("recentlyUsed")
  private Boolean recentlyUsed = null;

  public SkillsList skillCategory(String skillCategory) {
    this.skillCategory = skillCategory;
    return this;
  }

  /**
   * Get skillCategory
   * @return skillCategory
  **/
  @ApiModelProperty(example = "programming", value = "")


  public String getSkillCategory() {
    return skillCategory;
  }

  public void setSkillCategory(String skillCategory) {
    this.skillCategory = skillCategory;
  }

  public SkillsList toolName(String toolName) {
    this.toolName = toolName;
    return this;
  }

  /**
   * Get toolName
   * @return toolName
  **/
  @ApiModelProperty(example = "swagger", value = "")


  public String getToolName() {
    return toolName;
  }

  public void setToolName(String toolName) {
    this.toolName = toolName;
  }

  public SkillsList yearsOfExperience(Integer yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
    return this;
  }

  /**
   * Get yearsOfExperience
   * @return yearsOfExperience
  **/
  @ApiModelProperty(example = "1", value = "")


  public Integer getYearsOfExperience() {
    return yearsOfExperience;
  }

  public void setYearsOfExperience(Integer yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }

  public SkillsList monthsOfExperience(Integer monthsOfExperience) {
    this.monthsOfExperience = monthsOfExperience;
    return this;
  }

  /**
   * Get monthsOfExperience
   * @return monthsOfExperience
  **/
  @ApiModelProperty(example = "6", value = "")


  public Integer getMonthsOfExperience() {
    return monthsOfExperience;
  }

  public void setMonthsOfExperience(Integer monthsOfExperience) {
    this.monthsOfExperience = monthsOfExperience;
  }

  public SkillsList recentlyUsed(Boolean recentlyUsed) {
    this.recentlyUsed = recentlyUsed;
    return this;
  }

  /**
   * Get recentlyUsed
   * @return recentlyUsed
  **/
  @ApiModelProperty(example = "true", value = "")


  public Boolean isRecentlyUsed() {
    return recentlyUsed;
  }

  public void setRecentlyUsed(Boolean recentlyUsed) {
    this.recentlyUsed = recentlyUsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillsList skillsList = (SkillsList) o;
    return Objects.equals(this.skillCategory, skillsList.skillCategory) &&
        Objects.equals(this.toolName, skillsList.toolName) &&
        Objects.equals(this.yearsOfExperience, skillsList.yearsOfExperience) &&
        Objects.equals(this.monthsOfExperience, skillsList.monthsOfExperience) &&
        Objects.equals(this.recentlyUsed, skillsList.recentlyUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillCategory, toolName, yearsOfExperience, monthsOfExperience, recentlyUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillsList {\n");
    
    sb.append("    skillCategory: ").append(toIndentedString(skillCategory)).append("\n");
    sb.append("    toolName: ").append(toIndentedString(toolName)).append("\n");
    sb.append("    yearsOfExperience: ").append(toIndentedString(yearsOfExperience)).append("\n");
    sb.append("    monthsOfExperience: ").append(toIndentedString(monthsOfExperience)).append("\n");
    sb.append("    recentlyUsed: ").append(toIndentedString(recentlyUsed)).append("\n");
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

