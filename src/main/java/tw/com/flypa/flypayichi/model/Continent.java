package tw.com.flypa.flypayichi.model;

import java.util.Date;

public class Continent {
    
    private String continentCode;
    private String continentName;
    private Date createdDate;
    private Date lastModifiedDate;
    
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
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
}
