public class EcTrainee extends Trainee {
	private String device;

	public EcTrainee(int id, String name, String device) {
		super(id, name);
		this.device = device;
	}

	public String getDevice() {
		return device;
	}

	public void setLanguages(String device) {
		this.device = device;
	}

}
