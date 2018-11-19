package org.thoth.boot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
@Repository
public class ConfigurationRepository {
    
    protected String hardCoded;
    
    @Value("${my.application.name}")
    protected String applicationName;
    
    @Value("${my.personal.name}")
    protected String personalName;

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }
    
    
    public ConfigurationRepository() {
        hardCoded = "Hard coded value";
    }

    public String getHardCoded() {
        return hardCoded;
    }

    public void setHardCoded(String hardCoded) {
        this.hardCoded = hardCoded;
    }
    
}
