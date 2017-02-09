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
 * InlineResponse2003Data
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-10T00:00:58.629+01:00")
public class InlineResponse2003Data   {
  @SerializedName("totalDistance")
  private Double totalDistance = null;

  @SerializedName("totalDuration")
  private Double totalDuration = null;

  @SerializedName("totalFare")
  private Double totalFare = null;

  @SerializedName("duration")
  private Double duration = null;

  @SerializedName("realCost")
  private Double realCost = null;

  @SerializedName("totalPayment")
  private Double totalPayment = null;

  @SerializedName("service_fee")
  private Double serviceFee = null;

  public InlineResponse2003Data totalDistance(Double totalDistance) {
    this.totalDistance = totalDistance;
    return this;
  }

   /**
   * Get totalDistance
   * @return totalDistance
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTotalDistance() {
    return totalDistance;
  }

  public void setTotalDistance(Double totalDistance) {
    this.totalDistance = totalDistance;
  }

  public InlineResponse2003Data totalDuration(Double totalDuration) {
    this.totalDuration = totalDuration;
    return this;
  }

   /**
   * Get totalDuration
   * @return totalDuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTotalDuration() {
    return totalDuration;
  }

  public void setTotalDuration(Double totalDuration) {
    this.totalDuration = totalDuration;
  }

  public InlineResponse2003Data totalFare(Double totalFare) {
    this.totalFare = totalFare;
    return this;
  }

   /**
   * Get totalFare
   * @return totalFare
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTotalFare() {
    return totalFare;
  }

  public void setTotalFare(Double totalFare) {
    this.totalFare = totalFare;
  }

  public InlineResponse2003Data duration(Double duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public InlineResponse2003Data realCost(Double realCost) {
    this.realCost = realCost;
    return this;
  }

   /**
   * Get realCost
   * @return realCost
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getRealCost() {
    return realCost;
  }

  public void setRealCost(Double realCost) {
    this.realCost = realCost;
  }

  public InlineResponse2003Data totalPayment(Double totalPayment) {
    this.totalPayment = totalPayment;
    return this;
  }

   /**
   * Get totalPayment
   * @return totalPayment
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTotalPayment() {
    return totalPayment;
  }

  public void setTotalPayment(Double totalPayment) {
    this.totalPayment = totalPayment;
  }

  public InlineResponse2003Data serviceFee(Double serviceFee) {
    this.serviceFee = serviceFee;
    return this;
  }

   /**
   * Get serviceFee
   * @return serviceFee
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getServiceFee() {
    return serviceFee;
  }

  public void setServiceFee(Double serviceFee) {
    this.serviceFee = serviceFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003Data inlineResponse2003Data = (InlineResponse2003Data) o;
    return Objects.equals(this.totalDistance, inlineResponse2003Data.totalDistance) &&
        Objects.equals(this.totalDuration, inlineResponse2003Data.totalDuration) &&
        Objects.equals(this.totalFare, inlineResponse2003Data.totalFare) &&
        Objects.equals(this.duration, inlineResponse2003Data.duration) &&
        Objects.equals(this.realCost, inlineResponse2003Data.realCost) &&
        Objects.equals(this.totalPayment, inlineResponse2003Data.totalPayment) &&
        Objects.equals(this.serviceFee, inlineResponse2003Data.serviceFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalDistance, totalDuration, totalFare, duration, realCost, totalPayment, serviceFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003Data {\n");
    
    sb.append("    totalDistance: ").append(toIndentedString(totalDistance)).append("\n");
    sb.append("    totalDuration: ").append(toIndentedString(totalDuration)).append("\n");
    sb.append("    totalFare: ").append(toIndentedString(totalFare)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    realCost: ").append(toIndentedString(realCost)).append("\n");
    sb.append("    totalPayment: ").append(toIndentedString(totalPayment)).append("\n");
    sb.append("    serviceFee: ").append(toIndentedString(serviceFee)).append("\n");
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

