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
import io.swagger.client.model.Address;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PersonalDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-22T22:09:01.320Z")
public class PersonalDetails {
  @SerializedName("applicantID")
  private Long applicantID = null;

  @SerializedName("emailId")
  private String emailId = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("address")
  private List<Address> address = new ArrayList<Address>();

  @SerializedName("lastName")
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

