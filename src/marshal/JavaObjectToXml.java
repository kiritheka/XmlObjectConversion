package marshal;

import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaObjectToXml {
	public static void main(String[] args) throws Exception {
		JAXBContext contextObj = JAXBContext.newInstance(Role.class);
		Marshaller marshaller = contextObj.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		User user1 = new User("xyz", "xyzz@gmail.com", "33332");
		User user2 = new User("abc", "abc@gmail.com", "99988");
		ArrayList<User> listOfUser = new ArrayList<User>();
		listOfUser.add(user1);
		listOfUser.add(user2);

		Role role = new Role("admin", listOfUser);

		marshaller.marshal(role,
				new FileOutputStream("/home/linuxuser/eclipse-workspace/XmlJavaObject/src/marshal/roles.xml"));

	}
}