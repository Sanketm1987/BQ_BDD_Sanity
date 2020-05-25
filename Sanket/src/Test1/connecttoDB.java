package Test1;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

public class connecttoDB {

	public static void main(String[] args) throws SQLException, InterruptedException {
		// TODO Auto-generated method stub
		ResultSet result=null;
			
			String orderstat;
			String orderstat2;
			String env1;
			System.out.println("Loading Oracle JDBC driver Now........");
			
			
			String abc="https://mijn.int.tele2zakelijk.nl/Login.do";
			  
			
		   String xyz=abc.substring(13,16);
		    System.out.println("Substring is   "+xyz);
		    
		    
		    
			    try {
			    	
					Class.forName("oracle.jdbc.OracleDriver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    System.out.println("Oracle JDBC driver loaded ok.");

			   // Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.205.10.163:1521:clauat","sa","g0ldf1nger");
		          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.205.10.164:1521:claint","sa","logint");
			    System.out.println("DB Connected Successfuly");
			    
			    Thread.sleep(1000);

			    Statement stmt = con.createStatement();
			
			    Thread.sleep(1000);		
			  //   result = stmt.executeQuery("select x_active ,x_ord_proc_status from table_contr_itm where x_order_no='OS-1120979'");//UAT
			     result = stmt.executeQuery("select x_active ,x_ord_proc_status from table_contr_itm where x_order_no='OS-1091142'");
			        while(result.next()){
					        System.out.println("Entering into While loop");
					        orderstat = result.getString("x_ord_proc_status");
					        orderstat2= result.getString("X_ACTIVE");
					        System.out.println("order Status   " + orderstat);
					        System.out.println("Processing Status   " +orderstat2);
				    
			        if(!orderstat2.equals("Active"))
			        {
			        	for(int i=0;i<5;i++){
			            //  	result = stmt.executeQuery("select x_active ,x_ord_proc_status from table_contr_itm where x_order_no='OS-1120979'");//UAT
			              	result = stmt.executeQuery("select x_active ,x_ord_proc_status from table_contr_itm where x_order_no='OS-1091142'");
			     	    while(result.next()){
						   System.out.println("Entering into While loop");
					        orderstat = result.getString("x_ord_proc_status");
					        orderstat2= result.getString("X_ACTIVE");
					        System.out.println("order Status   " + orderstat);
					        System.out.println("Processing Status   " +orderstat2);
					        System.out.println("value of i   " +i);
					        if (orderstat2.equals("Active"))
					        {
					        	System.out.println("Order is completed  successfullly");
					        	break;
					        }
					        else if(i==4)
					        {
					        	System.out.println("Order is not successful");
					        	break;
					        }
					         
					        
				    }
			        	}
			        	//System.out.println("Order is Active Now");
			        }
			        else{
			        	System.out.println("Order is completed  successfullly");
			        	break;
			        	
			        }

}
			        con.close();
	}
}				        

			    
			 
		
		
	


