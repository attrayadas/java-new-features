package com.attraya.java13and14.stringcontent;

public class StringContentBlockDemo {

	public static void main(String[] args) {

		String str = """
				<html>
					<body>
					</body>
				</html>
				""";

		String str1 = """
				{
					"name": "Bharath",
					"sal:":1000000
				}
				""";

		String str2 = """
				{\
				"name": "Bharath",\
				"sal:":1000000\
				}\
				""";

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
	}

}
