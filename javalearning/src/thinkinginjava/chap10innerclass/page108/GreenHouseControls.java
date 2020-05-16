package thinkinginjava.chap10innerclass.page108;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/*
 * 1.控制ling和water的开关
 * 2.控制thermostat白天还是黑夜
 * 3.bell响铃
 * 4.restart重启 
 * 5.代码虽然很多，但很多都是重复的
 */
public class GreenHouseControls extends Controller{
    private  boolean light;
    public class LightOn extends Event{

		public LightOn(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			light = true;
		}
    	
		public String toString() {return "Light is on";}
    }
    

    
    public class LightOff extends Event{

		public LightOff(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			light = false;
		}
    	
		public String toString() {
			return "light is off";
		}
    }
    
    private boolean water = false;
    public class WaterOn extends Event{

		public WaterOn(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			water = true;
		}
    	
		public String toString(){
			return "water is on";
		}
    }
    
    public class WaterOff extends Event{

		public WaterOff(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			water = false;
		}
    	
		public String toString() {
			return "water is off";
		}
    }
    
    private String thermostat = "Day";
    public class ThermostatNight extends Event{

		public ThermostatNight(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			thermostat = "night";
		}
    	public String toString(){
    		return "Thermostat on night setting";
    	}
    }
    
    public class ThermostatDay extends Event{

		public ThermostatDay(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			thermostat = "Day";
		}
    	
		public String toString() {
			return "Thermostat on day Setting";
		}
    }
    
    public class Bell extends Event{

		public Bell(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			addEvent(new Bell(delayTime));
		}
    	
		public String toString() {
			return "Bing!";
		}
    }
    
    public class Restart extends Event{
         
    	private Event[] eventList;
    	public Restart(long delayTime,Event[] eventsList) {
    		super(delayTime);
    		this.eventList = eventsList;
    		for (int i = 0; i < eventsList.length; i++) {
				Event event = eventsList[i];
				addEvent(event);
			}
    	}
    	
		public Restart(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			for (int i = 0; i < eventList.length; i++) {
				Event event = eventList[i];
				event.start();;
				addEvent(event);
			}
			start();
			addEvent(this);
		}
    	public String toString() {
    		return "Restarting system";
    	}
    }
    
    public static class Terminate extends Event{

		public Terminate(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			System.exit(0);
		}
    	public String toString() {
    		return "Terminating";
    	}
    }
}
