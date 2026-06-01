public class YouTube{

public static void main(String [] args){
	
	YouTubeUser y1 = new YouTubeUser();
	y1.setInfo("Apna@123", "ApnaCollege");
	y1.uploadVideo("Array");
	y1.uploadVideo("DSA");
	y1.uploadVideo("JAVA");
	y1.uploadVideo("JAVAsCRIPT");
	
	y1.addSubcriber();
	y1.addSubcriber();
	y1.addSubcriber();
	y1.addSubcriber();
	y1.addSubcriber();
	
	y1.displayChannelInfo(); 
	
	
	YouTubeUser y2 = new YouTubeUser();
	
	y2.setInfo("CWH123", "CodeWithHarry");
	y2.uploadVideo("Heap Sort");
	y2.uploadVideo("HTML");
	y2.uploadVideo("CSS");
	y2.uploadVideo("BootStrap");
	
	 
	y2.addSubcriber();
	y2.addSubcriber();
	
	y2.displayChannelInfo(); 
	
	
	}

}

class YouTubeUser
{
	
	 String channelId, channelName;
	 int subscribers, videosCount;
	 static String platformName = " You Tube " ;
	 
	 public void setInfo(String channelId , String channelName){
		 this.channelId = channelId;
		 this.channelName = channelName;
		 
	 }
	 
	 public void uploadVideo(String title){
		 videosCount++;
		 System.out.println(title +" is uploaded on Youtube "+ channelName);
		 System.out.println("Your Video are Uploaded in " + videosCount);
	 }
	 
	 public void addSubcriber(){
		 subscribers++;
		 System.out.println(this.channelName + " is total Subcriber is " + subscribers );
		 
	 }
	 
	 public void displayChannelInfo(){
		 
		 System.out.println("\n Platform : " + YouTubeUser.platformName);
		 System.out.println("Channel Name : " + channelName);
		 System.out.println("Channel id : " + channelId);
		 System.out.println("Channel Subcriber : " + subscribers);
		 System.out.println("Video uploaded on Channel  : " + videosCount);
		 
		 
	 }
	 
	 
		 

}