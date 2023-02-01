package hms;

public class Patient {
private String Id, Name, Contact;

public Patient() {
	 Id ="";
	 this.Name="";
	 this.Contact="";
	 
}

public Patient(String id, String Name, String Contact) {
	super();
	this.Id = id;
	this.Name = Name;
	this.Contact = Contact;
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

public String getContact() {
	return Contact;
}

public void setContact(String contact) {
	Contact = contact;
}

@Override
public String toString() {
	return "Patient [Id=" + Id + ", Name=" + Name + ", Contact=" + Contact + "]";
}

	
}
