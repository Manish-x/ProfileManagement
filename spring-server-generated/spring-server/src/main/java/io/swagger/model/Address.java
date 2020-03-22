package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Address
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-22T22:15:12.014Z")

public class Address   {
  @JsonProperty("unit")
  private String unit = null;

  @JsonProperty("street")
  private String street = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("zipcode")
  private Integer zipcode = null;

  /**
   * Gets or Sets addressType
   */
  public enum AddressTypeEnum {
    HOME("home"),
    
    OFFICE("office");

    private String value;

    AddressTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AddressTypeEnum fromValue(String text) {
      for (AddressTypeEnum b : AddressTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("addressType")
  private AddressTypeEnum addressType = null;

  public Address unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(example = "U1103", value = "")


  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public Address street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
  **/
  @ApiModelProperty(example = "7K high street windsor", value = "")


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "VIC", value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "Australia", value = "")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address zipcode(Integer zipcode) {
    this.zipcode = zipcode;
    return this;
  }

  /**
   * Get zipcode
   * @return zipcode
  **/
  @ApiModelProperty(example = "3181", value = "")


  public Integer getZipcode() {
    return zipcode;
  }

  public void setZipcode(Integer zipcode) {
    this.zipcode = zipcode;
  }

  public Address addressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(example = "home", value = "")


  public AddressTypeEnum getAddressType() {
    return addressType;
  }

  public void setAddressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.unit, address.unit) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.zipcode, address.zipcode) &&
        Objects.equals(this.addressType, address.addressType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, street, state, country, zipcode, addressType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
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

