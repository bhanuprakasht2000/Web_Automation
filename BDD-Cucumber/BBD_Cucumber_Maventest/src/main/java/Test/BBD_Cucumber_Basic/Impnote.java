package Test.BBD_Cucumber_Basic;

public class Impnote {
	public static void main(String[] args) {
		System.out.println("Change allrunner class as preceeding with Test or Suffix with test to identify by the m,aven for running as maven test in run as");
		System.out.println("Add the plug in dependency \n <plugins>\r\n"
				+ "		<plugin>\r\n"
				+ "			<groupId>org.apache.maven.plugins</groupId>\r\n"
				+ "			<artifactId>maven-surefire-plugin</artifactId>\r\n"
				+ "			<version>2.22.0</version>\r\n"
				+ "			<dependencies>\r\n"
				+ "				<dependency>\r\n"
				+ "					<groupId>org.apache.maven.surefire</groupId>\r\n"
				+ "					<artifactId>surefire-junit4</artifactId>\r\n"
				+ "					<version>2.22.0</version>\r\n"
				+ "				</dependency>\r\n"
				+ "			</dependencies>\r\n"
				+ "			<configuration>\r\n"
				+ "				<includes>\r\n"
				+ "					<include>**/*.java</include>\r\n"
				+ "				</includes>\r\n"
				+ "			</configuration>\r\n"
				+ "		</plugin>\r\n"
				+ "	</plugins>");		
		System.err.println("Run it as maven test=>All test cases need to be executed");}
}
