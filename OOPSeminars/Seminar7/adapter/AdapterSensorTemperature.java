package OOPSeminars.Seminar7.adapter;

public class AdapterSensorTemperature implements MeteoSensor{
    SensorTemperature adapter;

    public AdapterSensorTemperature(SensorTemperature adapter) {
        this.adapter = adapter;
    }
}
