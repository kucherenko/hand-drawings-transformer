package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.NetworkAreaInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the description of a circumstance.
 */
@ApiModel(description = "Contains the description of a circumstance.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class CircumstanceDescription   {
  @JsonProperty("freq")
  private Float freq;

  @JsonProperty("tm")
  private OffsetDateTime tm;

  @JsonProperty("locArea")
  private NetworkAreaInfo locArea;

  @JsonProperty("vol")
  private Long vol;

  public CircumstanceDescription freq(Float freq) {
    this.freq = freq;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return freq
  */
  @ApiModelProperty(value = "string with format \"float\" as defined in OpenAPI.")


  public Float getFreq() {
    return freq;
  }

  public void setFreq(Float freq) {
    this.freq = freq;
  }

  public CircumstanceDescription tm(OffsetDateTime tm) {
    this.tm = tm;
    return this;
  }

  /**
   * Get tm
   * @return tm
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTm() {
    return tm;
  }

  public void setTm(OffsetDateTime tm) {
    this.tm = tm;
  }

  public CircumstanceDescription locArea(NetworkAreaInfo locArea) {
    this.locArea = locArea;
    return this;
  }

  /**
   * Get locArea
   * @return locArea
  */
  @ApiModelProperty(value = "")

  @Valid

  public NetworkAreaInfo getLocArea() {
    return locArea;
  }

  public void setLocArea(NetworkAreaInfo locArea) {
    this.locArea = locArea;
  }

  public CircumstanceDescription vol(Long vol) {
    this.vol = vol;
    return this;
  }

  /**
   * Unsigned integer identifying a volume in units of bytes.
   * minimum: 0
   * @return vol
  */
  @ApiModelProperty(value = "Unsigned integer identifying a volume in units of bytes.")

@Min(0L) 
  public Long getVol() {
    return vol;
  }

  public void setVol(Long vol) {
    this.vol = vol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CircumstanceDescription circumstanceDescription = (CircumstanceDescription) o;
    return Objects.equals(this.freq, circumstanceDescription.freq) &&
        Objects.equals(this.tm, circumstanceDescription.tm) &&
        Objects.equals(this.locArea, circumstanceDescription.locArea) &&
        Objects.equals(this.vol, circumstanceDescription.vol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freq, tm, locArea, vol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CircumstanceDescription {\n");
    
    sb.append("    freq: ").append(toIndentedString(freq)).append("\n");
    sb.append("    tm: ").append(toIndentedString(tm)).append("\n");
    sb.append("    locArea: ").append(toIndentedString(locArea)).append("\n");
    sb.append("    vol: ").append(toIndentedString(vol)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

