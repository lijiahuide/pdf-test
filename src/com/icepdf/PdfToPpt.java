package com.icepdf;

import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFPictureData;
import org.apache.poi.xslf.usermodel.XSLFPictureShape;
import org.apache.poi.xslf.usermodel.XSLFSlide;

public class PdfToPpt {

	public static void main(String[] args) throws Exception {
		XMLSlideShow ppt = new XMLSlideShow();
		for (int i = 0; i < 267; i++) {
			XSLFSlide slide1 = ppt.createSlide();// 创建幻灯片
			byte[] bt1 = FileUtils.readFileToByteArray(new File("E://test/test_" + i + ".jpg"));
			// 插入图片
			int idx1 = ppt.addPicture(bt1, XSLFPictureData.PICTURE_TYPE_PNG);
			XSLFPictureShape pic1 = slide1.createPicture(idx1);
			pic1.setAnchor(new Rectangle2D.Double(0, 0, 720, 540));
		}
		System.out.println("转换完成");
		ppt.write(new FileOutputStream("E://test.pptx"));
	}

}
