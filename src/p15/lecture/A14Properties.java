package p15.lecture;

import java.util.Properties;

public class A14Properties {
	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		String path = "bin/p15/lecture/contig1.properties";
		
		props.load(new FileReader(path));
		
		System.out.println(props.get("id"));
		System.out.println(props.get("password"));
		
		String idValue = (String) props.get("id");
		Stirng value = props.getProperty("id");
	}
}
