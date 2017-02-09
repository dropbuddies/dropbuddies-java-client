/**
 * DropBuddies API
 * An API for Dropbuddies on-demand delivery service
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@dropbuddies.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.dropbuddies.core.client;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Account
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-10T00:00:58.629+01:00")
public class Account   {
  @SerializedName("longitude")
  private Double longitude = null;

  @SerializedName("latitude")
  private Double latitude = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("created_on")
  private Long createdOn = null;

  @SerializedName("updated_on")
  private Long updatedOn = null;

  @SerializedName("activated_on")
  private Long activatedOn = null;

  @SerializedName("isOnline")
  private Integer isOnline = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("phonenumber")
  private String phonenumber = null;

  @SerializedName("apiKey")
  private String apiKey = null;

  @SerializedName("unique_id")
  private String uniqueId = null;

  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("companyDepartment")
  private String companyDepartment = null;

  public Account longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Account latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Account id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Account createdOn(Long createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Long createdOn) {
    this.createdOn = createdOn;
  }

  public Account updatedOn(Long updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * Get updatedOn
   * @return updatedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(Long updatedOn) {
    this.updatedOn = updatedOn;
  }

  public Account activatedOn(Long activatedOn) {
    this.activatedOn = activatedOn;
    return this;
  }

   /**
   * Get activatedOn
   * @return activatedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getActivatedOn() {
    return activatedOn;
  }

  public void setActivatedOn(Long activatedOn) {
    this.activatedOn = activatedOn;
  }

  public Account isOnline(Integer isOnline) {
    this.isOnline = isOnline;
    return this;
  }

   /**
   * Get isOnline
   * @return isOnline
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getIsOnline() {
    return isOnline;
  }

  public void setIsOnline(Integer isOnline) {
    this.isOnline = isOnline;
  }

  public Account email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Account firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Account lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Account phonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
    return this;
  }

   /**
   * Get phonenumber
   * @return phonenumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhonenumber() {
    return phonenumber;
  }

  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }

  public Account apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public Account uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public Account companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Account companyDepartment(String companyDepartment) {
    this.companyDepartment = companyDepartment;
    return this;
  }

   /**
   * Get companyDepartment
   * @return companyDepartment
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCompanyDepartment() {
    return companyDepartment;
  }

  public void setCompanyDepartment(String companyDepartment) {
    this.companyDepartment = companyDepartment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.longitude, account.longitude) &&
        Objects.equals(this.latitude, account.latitude) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.createdOn, account.createdOn) &&
        Objects.equals(this.updatedOn, account.updatedOn) &&
        Objects.equals(this.activatedOn, account.activatedOn) &&
        Objects.equals(this.isOnline, account.isOnline) &&
        Objects.equals(this.email, account.email) &&
        Objects.equals(this.firstName, account.firstName) &&
        Objects.equals(this.lastName, account.lastName) &&
        Objects.equals(this.phonenumber, account.phonenumber) &&
        Objects.equals(this.apiKey, account.apiKey) &&
        Objects.equals(this.uniqueId, account.uniqueId) &&
        Objects.equals(this.companyName, account.companyName) &&
        Objects.equals(this.companyDepartment, account.companyDepartment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longitude, latitude, id, createdOn, updatedOn, activatedOn, isOnline, email, firstName, lastName, phonenumber, apiKey, uniqueId, companyName, companyDepartment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    isOnline: ").append(toIndentedString(isOnline)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phonenumber: ").append(toIndentedString(phonenumber)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyDepartment: ").append(toIndentedString(companyDepartment)).append("\n");
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

