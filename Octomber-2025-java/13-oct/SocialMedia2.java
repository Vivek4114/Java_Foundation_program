/* Hierarchical Inheritance Example 2: Content Types in Social Media
Scenario:
In a social media platform, users can create different types of content like photos and videos.
Each content type shares common metadata but adds unique features. Use hierarchical inheritance
to demonstrate this.

Requirements:
Base class: Content
Subclasses: Photo, Video
Class: Content
Instance variables: title, uploadedBy

Method: displayContentInfo()
Class: Photo (extends Content)
Instance variables: resolution, filterUsed
Method: displayPhotoInfo()
Prints own + inherited info
Calls displayContentInfo()

Class: Video (extends Content)
Instance variables: durationInSeconds, quality
Method: displayVideoInfo()
Prints own + inherited info
Calls displayContentInfo()

Main class:
Create objects of Photo and Video
Call their display methods

Test Case (Hardcoded):
Photo:  
  Title: "Sunset Bliss"  
  Uploaded By: "Emma"  
  Resolution: "1080x720"  
  Filter: "Vintage"

Video:  
  Title: "My Vlog"  
  Uploaded By: "Liam"  
  Duration: 300  
  Quality: "HD"
Expected Output:
Photo Content:
Title: Sunset Bliss  
Uploaded By: Emma  
Resolution: 1080x720  
Filter Used: Vintage

Video Content:
Title: My Vlog  
Uploaded By: Liam  
Duration: 300 seconds  
Quality: HD  

 */

class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
