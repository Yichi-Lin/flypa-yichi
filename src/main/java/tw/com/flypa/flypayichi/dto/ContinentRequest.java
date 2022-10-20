package tw.com.flypa.flypayichi.dto;

import javax.validation.constraints.NotBlank;

public class ContinentRequest {
    
    @NotBlank
    private String continentCode;

    @NotBlank
    private String continentName;

    public String getContinentCode() {
        return continentCode;
    }
    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }
    public String getContinentName() {
        return continentName;
    }
    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }
    
}
