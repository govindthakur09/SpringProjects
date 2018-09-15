import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement
public class Employee {

	private String emplId;
	private Name name;
	private String dept;
	
	public String getEmplId() {
		return emplId;
	}
	@XmlAttribute
	public void setEmplId(String emplId) {
		this.emplId = emplId;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	@XmlElement (name="department")
	public void setDept(String dept) {
		this.dept = dept;
	}
}
