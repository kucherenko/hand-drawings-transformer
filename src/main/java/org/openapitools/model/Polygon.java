package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.GADShape;
import org.openapitools.model.GeographicalCoordinates;
import org.openapitools.model.PolygonAllOf;
import org.openapitools.model.SupportedGADShapes;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Polygon.
 */
@ApiModel(description = "Polygon.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class Polygon extends GADShape  {
  @JsonProperty("pointList")
  @Valid
  private List<GeographicalCoordinates> pointList = new ArrayList<>();

  public Polygon pointList(List<GeographicalCoordinates> pointList) {
    this.pointList = pointList;
    return this;
  }

  public Polygon addPointListItem(GeographicalCoordinates pointListItem) {
    this.pointList.add(pointListItem);
    return this;
  }

  /**
   * List of points.
   * @return pointList
  */
  @ApiModelProperty(required = true, value = "List of points.")
  @NotNull

  @Valid
@Size(min = 3, max = 15) 
  public List<GeographicalCoordinates> getPointList() {
    return pointList;
  }

  public void setPointList(List<GeographicalCoordinates> pointList) {
    this.pointList = pointList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Polygon polygon = (Polygon) o;
    return Objects.equals(this.pointList, polygon.pointList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointList, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Polygon {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pointList: ").append(toIndentedString(pointList)).append("\n");
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

