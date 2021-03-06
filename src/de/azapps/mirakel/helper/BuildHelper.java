package de.azapps.mirakel.helper;


public class BuildHelper {
	public static boolean	DEBUG				= true;
	private static boolean PLAYSTORE_RELEASE=false;
	public static boolean isBeta() {
		return DEBUG;
	}

	public static boolean isForFDroid() {
		return !PLAYSTORE_RELEASE;
	}

	public static boolean isForPlayStore() {
		return PLAYSTORE_RELEASE;
	}

	public static boolean isNightly() {
		return DEBUG;
	}

	public static boolean isRelease() {
		return !DEBUG;
	}

	public static boolean useAutoUpdater() {
		return !(isForPlayStore() || isForFDroid());
	}
}
