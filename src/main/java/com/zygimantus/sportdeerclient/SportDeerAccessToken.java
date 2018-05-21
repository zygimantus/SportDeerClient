
package com.zygimantus.sportdeerclient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "new_access_token",
    "expire_date",
    "expires_in",
    "expires_in_ms"
})
public class SportDeerAccessToken {

    @JsonProperty("new_access_token")
    private String newAccessToken;
    @JsonProperty("expire_date")
    private String expireDate;
    @JsonProperty("expires_in")
    private String expiresIn;
    @JsonProperty("expires_in_ms")
    private Integer expiresInMs;

    @JsonProperty("new_access_token")
    public String getNewAccessToken() {
        return newAccessToken;
    }

    @JsonProperty("new_access_token")
    public void setNewAccessToken(String newAccessToken) {
        this.newAccessToken = newAccessToken;
    }

    @JsonProperty("expire_date")
    public String getExpireDate() {
        return expireDate;
    }

    @JsonProperty("expire_date")
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    @JsonProperty("expires_in")
    public String getExpiresIn() {
        return expiresIn;
    }

    @JsonProperty("expires_in")
    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    @JsonProperty("expires_in_ms")
    public Integer getExpiresInMs() {
        return expiresInMs;
    }

    @JsonProperty("expires_in_ms")
    public void setExpiresInMs(Integer expiresInMs) {
        this.expiresInMs = expiresInMs;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(newAccessToken).append(expiresIn).append(expireDate).append(expiresInMs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SportDeerAccessToken) == false) {
            return false;
        }
        SportDeerAccessToken rhs = ((SportDeerAccessToken) other);
        return new EqualsBuilder().append(newAccessToken, rhs.newAccessToken).append(expiresIn, rhs.expiresIn).append(expireDate, rhs.expireDate).append(expiresInMs, rhs.expiresInMs).isEquals();
    }

}
