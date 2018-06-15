package unmarshal;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Role {
	
	@XmlAttribute
	public String id;
	@XmlElement
	public List<User> users;

}
