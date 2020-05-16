package thinkinginjava.chap10innerclass.page105;


/*
 * ��������Ƕ��һ���ڲ���
 * ��TrackingShip��������֮�⣬�ڲ��಻����
 * Nesting a class within a scope
 */
public class Parcel6 {
      
	private void internalTracking(boolean b){
		
		if(b) {
			class TrackingShip{
				private String id;
				public TrackingShip(String s) {
					// TODO Auto-generated constructor stub
				 id = s;
				}
				String getShip() {
					return id;
				}
			}
		}	
	}
	
	public void track() {
		internalTracking(true);
	}
	
	public static void main(String args[]) {
		Parcel6 parcel6 = new Parcel6();
		parcel6.track();
	}
}
