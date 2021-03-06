package sensors;

/**
 * This is the updatingSensor interface which is implemented by all sensors so
 * that the sensorHandler can update all sensors
 * 
 * @author Robert Bezem <robert.bezem@student.hu.nl>
 * @version 1.0
 * @since 01-04-2014
 */
public interface UpdatingSensor {
	/**
	 * When implemented this method can update the measured values from a sensor
	 */
	public void updateState();

	/**
	 * Every sensor is from a different type, with this method you can determine
	 * the sensor type
	 */
	public SensorType getSensorType();
}
