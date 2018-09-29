package org.icepdf.core.application;

public class ProductInfo {
	/**
	 * The company that owns this product.
	 */
	public static String COMPANY = "ICEsoft Technologies, Inc.";

	/**
	 * The name of the product.
	 */
	public static String PRODUCT = "ICEpdf";

	/**
	 * The 3 levels of version identification, e.g. 1.0.0.
	 */
	public static String VERSION = "6.3.0";

	/**
	 * The release type of the product (alpha, beta, production).
	 */
	public static String RELEASE_TYPE = "";

	/**
	 * The build number. Typically this would be tracked and maintained by the build
	 * system (i.e. Ant).
	 */
	public static String BUILD_NO = "19";

	/**
	 * The revision number retrieved from the repository for this build. This is
	 * substitued automatically by subversion.
	 */
	public static String REVISION = "49267";

	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append("\n");
		info.append(COMPANY);
		info.append("\n");
		info.append(PRODUCT);
		info.append(" ");
		info.append(VERSION);
		info.append(" ");
		info.append(RELEASE_TYPE);
		info.append("\n");
		info.append("Build number: ");
		info.append(BUILD_NO);
		info.append("\n");
		info.append("Revision: ");
		info.append(REVISION);
		info.append("\n");
		return info.toString();
	}

	public String getVersion() {
		StringBuilder info = new StringBuilder();
		// info.append(VERSION);
		// info.append( " " );
		// info.append( RELEASE_TYPE );
		return info.toString();
	}

	public static void main(String[] args) {
		ProductInfo app = new ProductInfo();
		System.out.println(app.toString());
	}

}
