package hms;

public class Doctor {

	private String Id, Name, Speciality, Contact;
	private int Fees;
	
	
	public Doctor() {

	}


	public Doctor(String Id, String Name, String Speciality, String Contact, int Fees) {
		this.Id = Id;
		this.Name = Name;
		this.Speciality = Speciality;
		this.Contact = Contact;
		this.Fees = Fees;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getSpeciality() {
		return Speciality;
	}
	
	public String getContact() {
		return Contact;
	}
	
	public void setContact(String Contact) {
		this.Contact = Contact;
	}


	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}


	public int getFees() {
		return Fees;
	}


	public void setFees(int fees) {
		Fees = fees;
	}


	@Override
	public String toString() {
		return "Doctor [Id=" + Id + ", Name=" + Name + ", Contact=" + Contact +",Speciality=" + Speciality + ", Fees=" + Fees + "]";
	}
  
}
