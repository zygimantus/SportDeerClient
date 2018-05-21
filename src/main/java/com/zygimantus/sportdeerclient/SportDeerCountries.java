
package com.zygimantus.sportdeerclient;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "docs",
    "pagination"
})
public class SportDeerCountries {

    @JsonProperty("docs")
    private List<SportDeerDocCountries> docs = new ArrayList<SportDeerDocCountries>();
    @JsonProperty("pagination")
    private Pagination pagination;

    @JsonProperty("docs")
    public List<SportDeerDocCountries> getDocs() {
        return docs;
    }

    @JsonProperty("docs")
    public void setDocs(List<SportDeerDocCountries> docs) {
        this.docs = docs;
    }

    @JsonProperty("pagination")
    public Pagination getPagination() {
        return pagination;
    }

    @JsonProperty("pagination")
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(docs).append(pagination).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SportDeerCountries) == false) {
            return false;
        }
        SportDeerCountries rhs = ((SportDeerCountries) other);
        return new EqualsBuilder().append(docs, rhs.docs).append(pagination, rhs.pagination).isEquals();
    }

}
