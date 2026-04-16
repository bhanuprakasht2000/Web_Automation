package test1.Selenium_POM_SP;

public class Impnote {
	public static void main(String[] args) {
		System.out.println("There will be a scenario where the Webapplication need to be communicated");
		System.out.println("Example uploading the file into the website here we need to make communication in between the we\b application and desktop application");
		System.out.println("In this scenarios we will use the AutoIt");
		System.out.println("Google search for the AutoIt and download it and install it");
		System.out.println("Goto the c drive and check in the program files(x86)"+
		"Navigate toi the ==>C:\\Program Files (x86)\\AutoIt3\\SciTE and open SciTe appln ");
		System.out.println("for inspecting the web application of file upload we use Au3info which is at the location of C:\\Program Files (x86)\\AutoIt3"+
		"Open that tool and finder tool need to be dragged to the file location space for the inspecting"+
				"Once done you will get the title and other info for writing it in the SciTe appln as commands");
		System.out.println("I have created the sample file as Testingupload.txt inm this project");

		System.out.println("==there we need to write commands as follows==");
		System.out.println("check the spaces also while writing the commands");
//		ControlFocus("Open", "", "Edit1")
//		ControlSetText("Open", "", "Edit1", "C:\Users\Bhanuprakash Reddy\Desktop\Kaveri tech\TestNg\Selenium_AutoIT\Testingupload.txt")
//		ControlClick("Open", "", "Button1")
		System.out.println("ControlFocus(\"Open\", \"\", \"Edit1\")\r\n"
				+ "ControlSetText(\"Open\", \"\", \"Edit1\", \"C:\\Users\\Bhanuprakash Reddy\\Desktop\\Kaveri tech\\TestNg\\Selenium_AutoIT\\Testingupload.txt\")\r\n"
				+ "ControlClick(\"Open\", \"\", \"Button1\")");
		System.out.println("Save the cmd written fileat prefferred location ==>Inthis project under resources");
		System.out.println("Open the file location in the file explorer"+
		"==>left click==.more options-->compile with the programfile(x86)==>generates a new appln(refresh it eill pop out");
		System.out.println("use the following code which includes that newly created file path as well");
		System.out.println("		Runtime.getRuntime().exec(\"\\\"C:\\\\Users\\\\Bhanuprakash Reddy\\\\Desktop\\\\Kaveri tech\\\\TestNg\\\\Selenium_AutoIT\\\\src\\\\main\\\\resources\\\\Browsefile.exe\\\"\");\r\n"
			);
}}
