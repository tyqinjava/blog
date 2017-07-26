package org.bbs.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class VercodeUtils {

	public static void confimVerCode(HttpServletRequest req,HttpServletResponse resp) {

		OutputStream out=null;
		try {
			out = resp.getOutputStream();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		final char[] e = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		int height = 32;
		int width = 100;
		BufferedImage bufferImg = new BufferedImage(100, 32, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = bufferImg.createGraphics();
		Random rand = new Random();
		g.setColor(Color.white);
		g.fillRect(0, 0, width, height);
		Font f = new Font("Fixedsys", Font.PLAIN, 32);
		g.setFont(f);
		g.setColor(Color.white);
		g.drawRect(0, 0, width - 1, height - 1);
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < 4; i++) {
			str.append(e[rand.nextInt(36)]);
		}
		g.setColor(Color.black);
		for (int i = 0; i < 30; i++) {
			g.drawLine(0, rand.nextInt(width), rand.nextInt(width), rand.nextInt(height));
		}
		Color c = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
		g.setColor(c);
		g.drawString(str.toString(), 0, 32);
		try {
			ImageIO.write(bufferImg, "jpeg", out);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		HttpSession session=req.getSession();
		session.setAttribute("vercode", str.toString());
		try {
			out.flush();
			out.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
