package Observable;
import java.util.*;
import Observer.*;
public class BatteryData implements PhoneModule {
	ArrayList<Widget> WidgetList = new ArrayList<Widget>();
	
	private double maxCapacity;
	private double currentCapacity;
	private double batteryDrainPerSecond;
	public BatteryData() {
		maxCapacity = 0;
		currentCapacity = 0;
		batteryDrainPerSecond = 0;
	}
	public void registerWidget(Widget widget) {
		WidgetList.add(widget);
	}
	public void removeWidget(Widget widget) {
		WidgetList.remove(widget);
	}
	public void notifyWidgets() {
		for (int i = 0; i < WidgetList.size(); i++)
			WidgetList.get(i).update(maxCapacity, currentCapacity, batteryDrainPerSecond);
	}
	public void setBatteryStatus(double maxCapacity, double currentCapacity, double batteryDrainPerSecond) {
		this.maxCapacity = maxCapacity;
		this.currentCapacity = currentCapacity;
		this.batteryDrainPerSecond = batteryDrainPerSecond;
		notifyWidgets();
	}

}
