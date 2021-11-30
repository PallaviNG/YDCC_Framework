package com.ydcc.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;
/*import ru.yandex.qatools.ashot.shooting.ShootingStrategy;
import ydcc.config.BaseClass;
*/
import ydcc.config.BaseClassN;
import ydcc.keyword.UIKeywords;

public class YdccTestListener implements ITestListener {
	UIKeywords keywords = UIKeywords.getInstance();
	private static final Logger LOG = Logger.getLogger(YdccTestListener.class);

	@Override
	/*
	 * public void onTestFailure(ITestResult result) { String dir =
	 * System.getProperty("user.dir"); System.out.println("dir:" + dir); AShot ashot
	 * = new AShot(); LOG.info("TakeScreenShot While Test Case Failed..");
	 * ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000)); Screenshot
	 * screenshot = ashot.takeScreenshot(BaseClassN.driver);
	 * LOG.info("TakeScreenShot While Test Case Failed2.."); BufferedImage bs =
	 * screenshot.getImage(); LOG.info("TakeScreenShot While Test Case Failed3..");
	 * try { LOG.info("TakeScreenShot While Test Case Failed4..");
	 * /*ImageIO.write(bs, "png", new File(dir + "/Screenshots/" + result.getName()
	 * + ".png"));
	 * 
	 * String fileName = dir + "/Screenshots/" + "/screenshots_" + timestamp() +
	 * ".jpg";ImageIO.write(bs,"jpg",new
	 * File(fileName));LOG.info("ScreenShot is Save Successfully5");}catch(
	 * IOException e) { e.printStackTrace();
	 * LOG.info("ScreenShot is Save Successfully catch"); } try {
	 * Thread.sleep(3000); } catch (InterruptedException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } }*
	 * 
	 * public static String timestamp() {
	 * LOG.info("ScreenShot is Save Date formate Successfully6"); return new
	 * SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(new Date()); }
	 */

	public void onTestFailure(ITestResult result) {
		AShot ashot = new AShot();
		//ShootingStrategy strategy = ShootingStrategies.viewportPasting(20);
		//ashot.shootingStrategy(strategy);
		Screenshot scr = ashot.takeScreenshot(BaseClassN.driver);
		BufferedImage img = scr.getImage();
		try {
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy-hh-mm-ss");
			String strDate = formatter.format(date);
			String dir = System.getProperty("user.dir");
			System.out.println("dir:" + dir);
			String fileName = dir + "/Screenshots/" + "/screenshots_" + strDate + ".jpg";
			ImageIO.write(img, "jpg", new File(fileName));
			LOG.info("ScreenShot is Save Successfully5");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}