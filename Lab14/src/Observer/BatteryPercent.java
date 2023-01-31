package Observer;
import Observable.*;
public class BatteryPercent implements Widget{
	private double maxCapacity;
	private double currentCapacity;
	private double batteryDrainPerSecond;
	
	private PhoneModule phoneModule;
	
	public BatteryPercent(PhoneModule batteryData) {
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
		if (maxCapacity == 0) System.out.println("\tBattery capacity is wrong"); else {
			String percentFormated = String.format("%.1f", currentCapacity / maxCapacity * 100);
			System.out.println("\tPhone battery percent = " + percentFormated + "%");
		}
	}
}
