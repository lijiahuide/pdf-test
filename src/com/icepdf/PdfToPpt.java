package com.icepdf;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xslf.usermodel.TextAlign;
import org.apache.poi.xslf.usermodel.VerticalAlignment;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFHyperlink;
import org.apache.poi.xslf.usermodel.XSLFPictureData;
import org.apache.poi.xslf.usermodel.XSLFPictureShape;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFTable;
import org.apache.poi.xslf.usermodel.XSLFTableCell;
import org.apache.poi.xslf.usermodel.XSLFTableRow;
import org.apache.poi.xslf.usermodel.XSLFTextBox;
import org.apache.poi.xslf.usermodel.XSLFTextParagraph;
import org.apache.poi.xslf.usermodel.XSLFTextRun;

public class PdfToPpt {
	public static void main(String[] args) throws Exception {

		XMLSlideShow ppt = new XMLSlideShow();
		// XSLFSlide slide = ppt.createSlide();// 创建幻灯片
		// XSLFTextBox textBox = slide.createTextBox();
		// textBox.setAnchor(new Rectangle2D.Double(10, 10, 0, 0));
		// textBox.addNewTextParagraph().addNewTextRun().setText("创建幻灯片");

		// 插入图片
		// byte[] bt = FileUtils.readFileToByteArray(new File("E://test/zxgh_1.jpg"));
		// int idx = ppt.addPicture(bt, XSLFPictureData.PICTURE_TYPE_PNG);
		// XSLFPictureShape pic = slide.createPicture(idx);
		// pic.setAnchor(new Rectangle2D.Double(0, 0, 720, 540));
		//
		// XSLFSlide slide1 = ppt.createSlide();// 创建幻灯片
		//
		// byte[] bt1 = FileUtils.readFileToByteArray(new File("E://test/zxgh_2.jpg"));
		// int idx1 = ppt.addPicture(bt1, XSLFPictureData.PICTURE_TYPE_PNG);
		// XSLFPictureShape pic1 = slide1.createPicture(idx1);
		// pic1.setAnchor(new Rectangle2D.Double(0, 0, 720, 540));

		for (int i = 0; i < 267; i++) {
			XSLFSlide slide1 = ppt.createSlide();// 创建幻灯片
			byte[] bt1 = FileUtils.readFileToByteArray(new File("E://test2/专项规划_" + i + ".jpg"));
			int idx1 = ppt.addPicture(bt1, XSLFPictureData.PICTURE_TYPE_PNG);
			XSLFPictureShape pic1 = slide1.createPicture(idx1);
			pic1.setAnchor(new Rectangle2D.Double(0, 0, 720, 540));
		}
		System.out.println("转换完成");

		// 创建一个文本链接
		// XSLFTextBox linkText = slide.createTextBox();
		// linkText.setAnchor(new Rectangle2D.Double(430, 310, 0, 0));
		// XSLFTextRun r = linkText.addNewTextParagraph().addNewTextRun();
		//// r.setText("Apache POI");
		// XSLFHyperlink link = r.createHyperlink();
		// link.setAddress("http://poi.apache.org");

		ppt.write(new FileOutputStream("E://专项规划.pptx"));
	}

}
