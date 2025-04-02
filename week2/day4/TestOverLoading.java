package week2.day4;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TestOverLoading {
	
	public void reportStep(String msg, String status)
	{
		System.out.println("Message : " + msg + " Status :" + status);
	}
	public void reportStep(String msg, String status , Boolean snap)
	{
		System.out.println("Message : " + msg + " Status : " + status + " snap : " + snap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestOverLoading TestOver = new TestOverLoading();
		
		TestOver.reportStep("Infa","Pass");
		TestOver.reportStep("Infa","Pass",true);
	}

}
