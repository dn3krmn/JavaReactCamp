package Entity;

import odev4.datetime;
import odev4.get;
import odev4.string;

public class Customer :IEntity{ //IEntityden implemente ediyor. veritabanı nesnesi olduğunu göstermek için

		
		public int id {get; set;}
		public string firstname {get; set;}
		public string lastname {get; set;}
		public datetime dateofbirsth {get; set;}
		public string nationalityid {get; set;}
		
	
}
