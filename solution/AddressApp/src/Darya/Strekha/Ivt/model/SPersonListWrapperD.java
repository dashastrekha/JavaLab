package Darya.Strekha.Ivt.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helper class to wrap a list of persons. This is used for saving the
 * list of persons to XML.
 * 
 * @author Marco Jakob
 */
@XmlRootElement(name = "persons")
public class SPersonListWrapperD {

    private List<SPersonD> persons;

    @XmlElement(name = "person")
    public List<SPersonD> getPersons() {
        return persons;
    }

    public void setPersons(List<SPersonD> persons) {
        this.persons = persons;
    }
}