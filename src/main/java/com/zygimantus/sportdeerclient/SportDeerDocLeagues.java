
package com.zygimantus.sportdeerclient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "id_country",
    "logo_svg"
})
public class SportDeerDocLeagues
    extends SportDeerDoc
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("id_country")
    private Integer idCountry;
    @JsonProperty("logo_svg")
    private String logoSvg;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("id_country")
    public Integer getIdCountry() {
        return idCountry;
    }

    @JsonProperty("id_country")
    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    @JsonProperty("logo_svg")
    public String getLogoSvg() {
        return logoSvg;
    }

    @JsonProperty("logo_svg")
    public void setLogoSvg(String logoSvg) {
        this.logoSvg = logoSvg;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(name).append(logoSvg).append(idCountry).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SportDeerDocLeagues) == false) {
            return false;
        }
        SportDeerDocLeagues rhs = ((SportDeerDocLeagues) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(name, rhs.name).append(logoSvg, rhs.logoSvg).append(idCountry, rhs.idCountry).isEquals();
    }

}
