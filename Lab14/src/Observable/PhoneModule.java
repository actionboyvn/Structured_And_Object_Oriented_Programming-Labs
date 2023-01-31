package Observable;
import Observer.*;
public interface PhoneModule {
	public void registerWidget(Widget widget);
	public void removeWidget(Widget widget);
	public void notifyWidgets();
}
