package Observer;
import Observable.PhoneModule;
public class BatteryTimeLeft implements Widget {
	private double maxCapacity;
	private double currentCapacity;
	private double batteryDrainPerSecond;
	
	private PhoneModule phoneModule;
	
	public BatteryTimeLeft(PhoneModule batteryData) {
		this.phoneModule = batteryData;
		this.phoneModule.registerWidget(this);
	}
	
	public void update(double maxCapacity, double currentCapacity, double batteryDrainPerSecond) {
		this.maxCapacity = maxCapacity;
		this.currentCapacity = currentCapacity;
		this.batteryDrainPerSecond = batteryDrainPerSecond;
		display();
	}
	public void display() {
		if (batteryDrainPerSecond == 0) System.out.println("\tCan not estimate remaining use time"); else {
			String timeFormated = String.format("%.2f", currentCapacity / batteryDrainPerSecond / 3600);
			System.out.println("\tPhone remaining use time = " + timeFormated + " hours");
		}
	}
}
