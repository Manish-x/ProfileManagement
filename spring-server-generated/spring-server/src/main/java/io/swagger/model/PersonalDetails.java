package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PersonalDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-22T22:15:12.014Z")

public class PersonalDetails   {
  @JsonProperty("applicantID")
  private Long applicantID = null;

  @JsonProperty("emailId")
  private String emailId = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("address")
  @Valid
  private List<Address> address = new ArrayList<Address>();

  @JsonProperty("lastName")
  private String lastName = null;

  public PersonalDetails applicantID(Long applicantID) {
    this.applicantID = applicantID;
    return this;
  }

  /**
   * Get applicantID
   * @return applicantID
  **/
  @ApiModelProperty(example = "4567677", value = "")


  public Long getApplicantID() {
    return applicantID;
  }

  public void setApplicantID(Long applicantID) {
    this.applicantID = applicantID;
  }

  public PersonalDetails emailId(String emailId) {
    this.emailId = emailId;
    return this;
  }

  /**
   * Get emailId
   * @return emailId
  **/
  @ApiModelProperty(example = "yaml@gmail.com", required = true, value = "")
  @NotNull


  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public PersonalDetails phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "8767676756", required = true, value = "")
  @NotNull


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PersonalDetails firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "Manish", required = true, value = "")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PersonalDetails address(List<Address> address) {
    this.address = address;
    return this;
  }

  public PersonalDetails addAddressItem(Address addressItem) {
    this.address.add(addressItem);
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1) 
  public List<Address> getAddress() {
    return address;
  }

  public void setAddress(List<Address> address) {
    this.address = address;
  }

  public PersonalDetails lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "singhal", required = true, value = "")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalDetails personalDetails = (PersonalDetails) o;
    return Objects.equals(this.applicantID, personalDetails.applicantID) &&
        Objects.equals(this.emailId, personalDetails.emailId) &&
        Objects.equals(this.phoneNumber, personalDetails.phoneNumber) &&
        Objects.equals(this.firstName, personalDetails.firstName) &&
        Objects.equals(this.address, personalDetails.address) &&
        Objects.equals(this.lastName, personalDetails.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantID, emailId, phoneNumber, firstName, address, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalDetails {\n");
    
    sb.append("    applicantID: ").append(toIndentedString(applicantID)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

