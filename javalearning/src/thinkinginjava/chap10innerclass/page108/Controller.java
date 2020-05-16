package thinkinginjava.chap10innerclass.page108;

import java.util.List;
import java.util.ArrayList;

public class Controller {
     private  List<Event> eventList = new ArrayList<Event>();
     public void addEvent(Event c){
    	 eventList.add(c);
     }
     public void run(){
    	 for(Event e:new ArrayList<Event>(eventList)){
    		 if(e.ready()) {
    			 System.out.println(e);
    			 e.action();
    			 eventList.remove(e);
    		 }
    	 }
     }
     
}
