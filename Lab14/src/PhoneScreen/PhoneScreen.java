package PhoneScreen;
import Observer.*;
import Observable.*;
public class PhoneScreen {
	public static void main(String[] args) {
		BatteryData batteryData = new BatteryData();
		BatteryPercent percent = new BatteryPercent(batteryData);
		BatteryTimeLeft timeLeft = new BatteryTimeLeft(batteryData);
		
		System.out.println("Battery status: ");
		batteryData.setBatteryStatus(4000, 2500, 0.2);
		System.out.println();
		
		batteryData.removeWidget(timeLeft); 
		System.out.println("Battery status: ");
		batteryData.setBatteryStatus(4000, 2300, 0.2);
		System.out.println();
		
		batteryData.registerWidget(timeLeft);
		System.out.println("Battery status: ");
		batteryData.setBatteryStatus(4000, 1800, 0.1);
	}
}
