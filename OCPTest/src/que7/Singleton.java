package que7;

public class Singleton {

	public static void main(String[] args) {
		

	}

		
		private static Singleton singleton;
		static{
			singleton=new Singleton();
		}
		private Singleton(){
			
		}
		public static Singleton getInstance(){
			if(singleton==null){
				synchronized (Singleton.class) {
					if (singleton==null)
					singleton=new Singleton();	
				}
			}
			return singleton;
		}

	}


