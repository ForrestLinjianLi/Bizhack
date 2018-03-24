package com.example.lilinjian.bizhack.providers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by joyce on 2018-03-24.
 */

public class HttpCategoryDataProvider extends AbstractHttpDataProvider{
    protected URL getURL() throws MalformedURLException {

        String ss = "https://bizhacks.bbycastatic.ca/mobile-si/si/catalog?lang=en";
        return new URL(ss);
    }

    @Override
    public byte[] dataSourceToBytes() throws IOException {
        return new byte[0];
    }
}

