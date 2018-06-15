package unmarshal;
import java.io.File;  
import java.util.List;  
  
import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Unmarshaller;  
public class XmlToJavaObject {
	
	 public static void main(String[] args) {  
		   
	     try {  
	   
	        File file = new File("/home/linuxuser/eclipse-workspace/XmlJavaObject/src/unmarshal/UserWithRole.xml");  
	        JAXBContext jaxbContext = JAXBContext.newInstance(Role.class);  
	   
	        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
	        Role role= (Role) jaxbUnmarshaller.unmarshal(file);  
	          
	        System.out.println(role.id);  
	        System.out.println("Users:");  
	        List<User> listOfUser=role.users;  
	        for(User user:listOfUser)  
	          System.out.println(user.name+" "+user.email+"  "+user.phonenumber);  
	   
	      } catch (JAXBException e) {  
	        e.printStackTrace();  
	      }  
	   
	    }  

}
