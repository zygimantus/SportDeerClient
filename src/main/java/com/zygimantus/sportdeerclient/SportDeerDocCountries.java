
package com.zygimantus.sportdeerclient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "rectangle_flag",
    "square_flag"
})
public class SportDeerDocCountries
    extends SportDeerDoc
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("rectangle_flag")
    private String rectangleFlag;
    @JsonProperty("square_flag")
    private String squareFlag;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("rectangle_flag")
    public String getRectangleFlag() {
        return rectangleFlag;
    }

    @JsonProperty("rectangle_flag")
    public void setRectangleFlag(String rectangleFlag) {
        this.rectangleFlag = rectangleFlag;
    }

    @JsonProperty("square_flag")
    public String getSquareFlag() {
        return squareFlag;
    }

    @JsonProperty("square_flag")
    public void setSquareFlag(String squareFlag) {
        this.squareFlag = squareFlag;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(name).append(squareFlag).append(rectangleFlag).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SportDeerDocCountries) == false) {
            return false;
        }
        SportDeerDocCountries rhs = ((SportDeerDocCountries) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(name, rhs.name).append(squareFlag, rhs.squareFlag).append(rectangleFlag, rhs.rectangleFlag).isEquals();
    }

}
