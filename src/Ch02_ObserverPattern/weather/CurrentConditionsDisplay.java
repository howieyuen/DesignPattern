package Ch02_ObserverPattern.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  
  private float temperature;
  
  private float humidity;
  
  public CurrentConditionsDisplay(WeatherData weatherData) {
    weatherData.registerObserver(this);
  }
  
  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }
  
  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }
}
