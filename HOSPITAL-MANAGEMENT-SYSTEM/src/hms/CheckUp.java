package hms;

public class CheckUp {
	Doctor Doctor;
	Patient Patient;
	int priority;
	String  Recomendation, Date;
	public CheckUp(Doctor Doctor, Patient patient, int priority, String Recomendation, String Date) {
		super();
		this.Doctor = Doctor;
		this.Patient = Patient;
		this.priority = priority;
		this.Recomendation = Recomendation;
		this.Date = Date;
	}
	public Doctor getDoctor() {
		return Doctor;
	}
	public void setDoctor(Doctor doctor) {
		Doctor = doctor;
	}
	public Patient getPatient() {
		return Patient;
	}
	public void setPatient(Patient patient) {
		Patient = patient;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getRecomendation() {
		return Recomendation;
	}
	public void setRecomendation(String recomendation) {
		Recomendation = recomendation;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "CheckUp [Doctor=" + Doctor.toString() + ", Patient=" + Patient.toString() + ", priority=" + priority + ", Recomendation="
				+ Recomendation + ", Date=" + Date + "]";
	}

}
