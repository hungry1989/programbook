package thinkinginjava.chap10innerclass.page108;

public class GreenHouseController {
     public static void main(String args[]) {
    	 GreenHouseControls gControls = new GreenHouseControls();
    	 gControls.addEvent(gControls.new Bell(900));
    	 Event[] eventsList = {
    			 gControls.new ThermostatNight(10),
    			 gControls.new LightOn(200),
    			 gControls.new LightOff(400),
    			 gControls.new WaterOn(600),
    			 gControls.new WaterOff(800),
    			 gControls.new ThermostatDay(1400)
    	 };
    	 gControls.addEvent(gControls.new Restart(200, eventsList));
    	 if (args.length ==1) {
			gControls.addEvent(
					new GreenHouseControls.Terminate
					     (Long.valueOf(args[0].toString())));
		}
    	 gControls.run();
     }
}
