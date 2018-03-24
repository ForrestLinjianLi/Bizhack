package com.example.lilinjian.bizhack.providers;

import java.io.IOException;

/**
 * Created by joyce on 2018-03-24.
 */

public interface DataProvider {
    String dataSourceToString() throws IOException;

    byte[] dataSourceToBytes() throws IOException;

}
