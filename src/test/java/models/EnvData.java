package models;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EnvData {
    private String protocol;
    private String domain;
    private int wait;

    public String getHost() {
        return (protocol != null && domain != null) ? protocol + "://" + domain : "Invalid Host";
    }
}