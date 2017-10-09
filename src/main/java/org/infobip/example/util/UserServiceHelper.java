package org.infobip.example.util;

import lombok.SneakyThrows;

public class UserServiceHelper {
    @SneakyThrows
    public String utf8ToString(byte[] bytes) {
        return new String(bytes, "UTF-8");
    }
}
