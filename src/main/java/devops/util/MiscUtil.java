package devops.util;

public class MiscUtil {
	public static String logoHeader = "Sample";
	public static String slogan = "Bank App";
	public static String sessionScreenMessage="ScreenMsg";

	public static String trimUtil(String input)
	{
		String output = "";
		if (null != input)
		{
			output=input.trim();
		}
		return output;
	}
	public static String trimUtil(Integer input)
	{
		String output = "";
		if (null != input)
		{
			output=input.toString().trim();
		}
		return output;
	}
}
