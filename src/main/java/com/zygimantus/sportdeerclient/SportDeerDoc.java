
package com.zygimantus.sportdeerclient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_id" })
public class SportDeerDoc {

	@JsonProperty("_id")
	private Integer id;

	@JsonProperty("_id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("_id")
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof SportDeerDoc) == false) {
			return false;
		}
		SportDeerDoc rhs = ((SportDeerDoc) other);
		return new EqualsBuilder().append(id, rhs.id).isEquals();
	}

}
