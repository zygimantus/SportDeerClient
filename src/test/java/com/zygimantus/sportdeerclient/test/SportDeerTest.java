/*
 * The MIT License
 *
 * Copyright 2018 Zygimantus.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.zygimantus.sportdeerclient.test;

import com.zygimantus.sportdeerclient.SportDeer;
import com.zygimantus.sportdeerclient.SportDeerAccessToken;
import com.zygimantus.sportdeerclient.SportDeerApi;
import com.zygimantus.sportdeerclient.SportDeerCountries;
import com.zygimantus.sportdeerclient.Utils;
import java.io.IOException;
import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Zygimantus
 */
public class SportDeerTest {

    @Test
    public void accessTokenTest() throws IOException {

        String sportDeerRefreshToken = Utils.getPropertyValueFromProperties("sportDeerRefreshToken");

        Assume.assumeTrue(StringUtils.isNotEmpty(sportDeerRefreshToken));

        SportDeerApi.init();
        SportDeer api = SportDeerApi.getApi();

        Call<SportDeerAccessToken> call = api.getAccessToken(sportDeerRefreshToken);

        Response<SportDeerAccessToken> response = call.execute();

        Assert.assertEquals(200, response.raw().code());
    }

    @Test
    public void countriesTest() throws IOException {
        
        String sportDeerRefreshToken = Utils.getPropertyValueFromProperties("sportDeerRefreshToken");        

        Assume.assumeTrue(StringUtils.isNotEmpty(sportDeerRefreshToken));

        SportDeerApi.init();
        SportDeer api = SportDeerApi.getApi();

        Response<SportDeerAccessToken> response = api.getAccessToken(sportDeerRefreshToken).execute();

        Response<SportDeerCountries> response1 = api.getCountries(response.body().getNewAccessToken()).execute();

        Assert.assertEquals(200, response.raw().code());
    }

}
