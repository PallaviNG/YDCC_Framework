package com.ydcc.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ydcc.keyword.UIKeywords;

public class YdccTestListener implements ITestListener {
	UIKeywords keywords = UIKeywords.getInstance();
	private static final Logger LOG = Logger.getLogger(YdccTestListener.class);

	@Override
	public void onTestFailure(ITestResult result) {
		AShot ashot = new AShot();
		LOG.info("TakeScreenShot While Test Case Failed..");
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000));
		Screenshot screenshot = ashot.takeScreenshot(UIKeywords.getInstance().driver);
		LOG.info("TakeScreenShot While Test Case Failed2..");
		BufferedImage bs = screenshot.getImage();
		String dir = System.getProperty("user.dir");
		LOG.info("TakeScreenShot While Test Case Failed3..");
		System.out.println("dir:" + dir);
		try {
			LOG.info("TakeScreenShot While Test Case Failed4..");
			 ImageIO.write(bs, "png", new File(dir + "/Screenshots/" + result.getName() +
			 ".png"));
		//	ImageIO.write(bs, "jpg", new File(dir + "/screenshots_" + timestamp() + ".png"));
			//LOG.info("ScreenShot is Save Successfully5");
		}

		catch (IOException e) {
			e.printStackTrace();
			LOG.info("ScreenShot is Save Successfully catch");
		}
	}

	public static String timestamp() {
		LOG.info("ScreenShot is Save Date formate Successfully6");
		return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(new Date());
	}
}
