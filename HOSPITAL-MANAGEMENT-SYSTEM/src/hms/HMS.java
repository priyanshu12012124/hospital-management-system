package hms;
import java.util.*;
public class HMS {

  public static void main(String[] args) {
	  PatientList plist = new PatientList();
	  DoctorsList dlist = new DoctorsList();
	  Scanner sc = new Scanner(System.in);
	  
	  String choice;
	  while(true) {
		  MainMenu();
		  choice = sc.nextLine();
		  if(choice.equals("1")) {
			  System.out.println("\n Doctor ID");
			  String id = sc.nextLine();
			  
			  System.out.println("\n Doctor Name");
			  String name = sc.nextLine();
			  
			  System.out.println("\n Doctor Contact");
			  String contact = sc.nextLine();
			 
			  System.out.println("\n Doctor Speciality");
			  String spec = sc.nextLine();
			  
			  System.out.println("\n Doctor Fees");
			  int fee = sc.nextInt();
			  sc.nextLine();
			  
			  Doctor d = new Doctor(id, name,contact, spec,  fee);
			  dlist.insert(d);
		  } else if(choice.equals("2")){
			  System.out.println("\n Patient ID");
			  String id = sc.nextLine();
			  
			  System.out.println("\n Patient Name");
			  String name = sc.nextLine();
			  
			  System.out.println("\n Patient contact");
			  String contact = sc.nextLine();
			  
			 Patient patient = new Patient(id,name,contact); 
				 plist.insert(patient);
			   
		  } else if(choice.equals("3")) {
			  dlist.PrintData();
		  }else if(choice.equals("4")) {
			  plist.PrintData();
		  }else if(choice.equals("5")) {
			  System.out.println("\nWelcome to Cheackup Menu \n");
			  
			  CheackupList[] clist = new CheackupList[dlist.size()];
			  
			  for(int i = 0; i < clist.length; i++) {
				  
				  clist[i] = new CheackupList();
				  Doctor doctor = dlist.getAtIndex(i);
				  System.out.println("\n\nEnter patient for Doctor ");
				  System.out.println("Name       :"+doctor.getName());
				  System.out.println("Speciality  "+ doctor.getSpeciality());
				  System.out.println("Fees     :"+doctor.getFees());
				  
				  System.out.println("All Patients :");
				  plist.PrintData();
				  
				  while(true) {
					  System.out.println("Enter patient Id or type null to stop");
					  String id = sc.nextLine();
					  
					  if(id.equals("null")) {
					  		break;
				  }
					  System.out.println("Priority 3 for Emergency 2 for Intermediate any other key for normal");
					  String per = sc.nextLine();
					  
					  int p=1;
					  if(per.equals("3")) {
					  		 p = 3;
				  }
					  else if(per.equals("2")) {
						  p = 2;
					  }
					  
					  Patient patient = plist.searchByID(id);
					  if(patient==null) {
						  System.out.println("\nInvalid patient ID : \n");
					  }else {
						  CheckUp cup = new CheckUp(doctor,patient,p,"",""+java.util.Calendar.getInstance().getTime().toString());
						  clist[i].Enqueue(cup);
					  }
				  }
			  }
			  for(int i = 0;i<clist.length;i++) {
				  System.out.println("\n\n patient "+(i+1)+" In Queue for Doctor "+dlist.getAtIndex(i).getName());
				  for(int j = 0;j<clist[i].size();j++) {
					  System.out.println("Enter Recomendation for Patient : "+ clist[i].getPatient(j));
					  String rec = sc.nextLine();
					  clist[i].addRecomendation(j, rec);
				  }
			  }
		  }
	  }
	}
  public static void MainMenu() {
	  System.out.println("\n\n ||    *****    HMS      *****       ||");
	  System.out.println("      ||    Main Menu    ||");
	  System.out.println("\nEnter 1 for Insert New Doctor ");
	  System.out.println("Enter 2 for Insert Patient ");
	  System.out.println("\nEnter 3 for Print all Doctor ");
	  System.out.println("Enter 4 for print all patient ");
	  
	  System.out.println("Enter 5 for CheckUp Menu ");
	  System.out.println("Enter 0 for Exit ");
  }

}
 