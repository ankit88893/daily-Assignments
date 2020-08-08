import java.util.*;

public class TraineeMain {

	Map<Integer, Trainee> traineeMap = new HashMap<>();
	Set<CsTrainee> csTraineeSet = new HashSet<>();
	Set<EcTrainee> ecTraineeSet = new HashSet<>();

	public static void main(String[] args) {

			TraineeMain demo = new TraineeMain();
			demo.runApp();	
		
		
		}

	public void runApp() {

		Trainee trainee1 = new CsTrainee(1, "ankit", 3);
		Trainee trainee2 = new CsTrainee(2, "ankur", 5);
		Trainee trainee3 = new EcTrainee(5, "anoop", "ammeter");
		Trainee trainee4 = new EcTrainee(7, "anil", "voltmeter");
		
		traineeMap.put(1, trainee1);
		traineeMap.put(2, trainee2);
		traineeMap.put(3, trainee3);
		traineeMap.put(4, trainee4);
		
		
		 for (Trainee trainee : traineeMap.values()) {
	         
	            boolean iscse = trainee instanceof CsTrainee;
	            if (iscse) {
	                csTraineeSet.add((CsTrainee) trainee);
	            } else {
	                ecTraineeSet.add((EcTrainee) trainee);
	            }
	        }
		 
		 for (CsTrainee cs :csTraineeSet) {
			 int id = cs.getId();
			 int language = cs.getLanguages();  
			 String name = cs.getName();
			 
			 System.out.print("name of trainee:-\n"+name+" \n   Id:-  "+id+"\n Languages known :-"+language);
			 
		 }
		 for (EcTrainee ec :ecTraineeSet) {
			 int id = ec.getId();
			 String device = ec.getDevice();
			 String name = ec.getName();
			 
			 System.out.print("names of trainee:-\n"+name+"\n id:-"+id+"\n devices alloted:-"+device);
			 
		 }
		 
		 

	}

}
