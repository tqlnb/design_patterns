package org.example;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.custom.StyledText;

import java.awt.event.ActionListener;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.eclipse.swt.events.TouchListener;
import org.eclipse.swt.events.TouchEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class MainWindow {
	private static Text txtf;
	private static Text text;
	private static Text textOfG3;
	private static Text textOfG4;
	private static Shell mainWindow;
	private static Label label1OfGroup1;
	private static Group group1 ;
	private static Button buttonSelfTestOfG1;
	private static Button buttonWriteTest;
	private static Button buttonReadTest;
	private static Button buttonAutoTest;
	private static StyledText styledText;	//最下方的对话框里面的文字
	
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		initWindow();	
	}
	


	public static void initWindow() {
		Display display = Display.getDefault();
		mainWindow = new Shell();
		mainWindow.setSize(794, 575);
		mainWindow.setText("接口测试程序");
		mainWindow.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		group1 = new Group(mainWindow, SWT.NONE);
		group1.setLayout(new RowLayout(SWT.HORIZONTAL));
		group1.setLayoutData(new RowData(766, SWT.DEFAULT));
		group1.setText("输入输出开关量模块测试");
		
		label1OfGroup1 = new Label(group1, SWT.NONE);
		label1OfGroup1.setAlignment(SWT.CENTER);
		label1OfGroup1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label1OfGroup1.setLayoutData(new RowData(SWT.DEFAULT, 30));
		label1OfGroup1.setText("测试数据(HEX)");
		
		txtf = new Text(group1, SWT.BORDER);
		txtf.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		txtf.setText("00 0F");
		txtf.setLayoutData(new RowData(330, 27));
		
		buttonSelfTestOfG1 = new Button(group1, SWT.BORDER | SWT.FLAT | SWT.CENTER);

		buttonSelfTestOfG1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				txtf.setText("1234");
			}
		});
		buttonSelfTestOfG1.setText("自检");
		buttonSelfTestOfG1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		

		
		buttonWriteTest = new Button(group1, SWT.NONE);
		buttonWriteTest.setText("写测试");
		buttonWriteTest.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		buttonReadTest = new Button(group1, SWT.NONE);
		buttonReadTest.setText("读测试");
		buttonReadTest.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		buttonAutoTest = new Button(group1, SWT.NONE);
		buttonAutoTest.setText("自收发测试");
		buttonAutoTest.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		Group group2 = new Group(mainWindow, SWT.NONE);
		group2.setLayout(null);
		group2.setLayoutData(new RowData(766, 80));
		group2.setText("SPI通讯模块设置");
		
		Label label1OfGroup2 = new Label(group2, SWT.NONE);
		label1OfGroup2.setBounds(6, 20, 125, 25);
		label1OfGroup2.setText("测试数据(HEX)");
		label1OfGroup2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label1OfGroup2.setAlignment(SWT.CENTER);
		
		text = new Text(group2, SWT.BORDER);
		text.setBounds(134, 20, 283, 33);
		text.setText("01 02 03 04 05");
		text.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		Label label2OfGroup2 = new Label(group2, SWT.NONE);
		label2OfGroup2.setBounds(420, 20, 87, 25);
		label2OfGroup2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label2OfGroup2.setText("通道选择: ");
		
		Combo combo = new Combo(group2, SWT.NONE);
		combo.setBounds(510, 20, 255, 33);
		combo.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		
		Button buttonSelfTestOfG2 = new Button(group2, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonSelfTestOfG2.setBounds(316, 59, 50, 37);
		buttonSelfTestOfG2.setText("自检");
		buttonSelfTestOfG2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		Button buttonOpenChannelOfG2 = new Button(group2, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonOpenChannelOfG2.setBounds(369, 59, 84, 37);
		buttonOpenChannelOfG2.setText("打开通道");
		buttonOpenChannelOfG2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		Button buttonCloseChannelOfG2 = new Button(group2, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonCloseChannelOfG2.setBounds(456, 59, 84, 37);
		buttonCloseChannelOfG2.setEnabled(false);
		buttonCloseChannelOfG2.setText("关闭通道");
		buttonCloseChannelOfG2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		Button buttonSendDataOfG2 = new Button(group2, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonSendDataOfG2.setBounds(543, 59, 118, 37);
		buttonSendDataOfG2.setEnabled(false);
		buttonSendDataOfG2.setText("发送测试数据");
		buttonSendDataOfG2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		Button buttonAutoTestOfG2 = new Button(group2, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonAutoTestOfG2.setBounds(664, 59, 101, 37);
		buttonAutoTestOfG2.setEnabled(false);
		buttonAutoTestOfG2.setText("自收发测试");
		buttonAutoTestOfG2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		Group group3 = new Group(mainWindow, SWT.NONE);
		group3.setLayout(null);
		group3.setLayoutData(new RowData(766, 80));
		group3.setText("串行通讯模块");
		
		Label label1OfG3 = new Label(group3, SWT.NONE);
		label1OfG3.setBounds(6, 20, 125, 25);
		label1OfG3.setText("测试数据(HEX)");
		label1OfG3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label1OfG3.setAlignment(SWT.CENTER);
		
		textOfG3 = new Text(group3, SWT.BORDER);
		textOfG3.setBounds(134, 20, 283, 33);
		textOfG3.setText("01 02 03 04 05");
		textOfG3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		Label label2OfGroup3 = new Label(group3, SWT.NONE);
		label2OfGroup3.setBounds(420, 20, 87, 25);
		label2OfGroup3.setText("通道选择: ");
		label2OfGroup3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		
		Combo comboOfG3 = new Combo(group3, SWT.NONE);
		comboOfG3.setBounds(510, 20, 255, 33);
		comboOfG3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		
		Button buttonSelfTestOfG3 = new Button(group3, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonSelfTestOfG3.setBounds(316, 59, 50, 37);
		buttonSelfTestOfG3.setText("自检");
		buttonSelfTestOfG3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		Button buttonOpenChannelOfG3 = new Button(group3, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonOpenChannelOfG3.setBounds(369, 59, 84, 37);
		buttonOpenChannelOfG3.setText("打开通道");
		buttonOpenChannelOfG3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		Button buttonCloseChannelOfG3 = new Button(group3, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonCloseChannelOfG3.setBounds(456, 59, 84, 37);
		buttonCloseChannelOfG3.setText("关闭通道");
		buttonCloseChannelOfG3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		buttonCloseChannelOfG3.setEnabled(false);
		
		Button buttonSendDataOfG3 = new Button(group3, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonSendDataOfG3.setBounds(543, 59, 118, 37);
		buttonSendDataOfG3.setText("发送测试数据");
		buttonSendDataOfG3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		buttonSendDataOfG3.setEnabled(false);
		
		Button buttonAutoTestOfG3 = new Button(group3, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonAutoTestOfG3.setBounds(664, 59, 101, 37);
		buttonAutoTestOfG3.setText("自收发测试");
		buttonAutoTestOfG3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		buttonAutoTestOfG3.setEnabled(false);
		
		Group group4 = new Group(mainWindow, SWT.NONE);
		group4.setLayout(null);
		group4.setLayoutData(new RowData(766, 80));
		group4.setText("CAN通讯模块设置");
		
		Label label1OfG4 = new Label(group4, SWT.NONE);
		label1OfG4.setBounds(6, 20, 125, 25);
		label1OfG4.setText("测试数据(HEX)");
		label1OfG4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label1OfG4.setAlignment(SWT.CENTER);
		
		textOfG4 = new Text(group4, SWT.BORDER);
		textOfG4.setBounds(134, 20, 283, 33);
		textOfG4.setText("01 02 03 04 05");
		textOfG4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		Label label2OfG4 = new Label(group4, SWT.NONE);
		label2OfG4.setBounds(420, 20, 87, 25);
		label2OfG4.setText("通道选择: ");
		label2OfG4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		
		Combo comboOfG4 = new Combo(group4, SWT.NONE);
		comboOfG4.setBounds(510, 20, 255, 33);
		comboOfG4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		
		Button buttonSelfTestOfG4 = new Button(group4, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonSelfTestOfG4.setBounds(316, 59, 50, 37);
		buttonSelfTestOfG4.setText("自检");
		buttonSelfTestOfG4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		Button buttonOpenChannelOfG4 = new Button(group4, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonOpenChannelOfG4.setBounds(369, 59, 84, 37);
		buttonOpenChannelOfG4.setText("打开通道");
		buttonOpenChannelOfG4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		Button buttonCloseChannelOfG4 = new Button(group4, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonCloseChannelOfG4.setBounds(456, 59, 84, 37);
		buttonCloseChannelOfG4.setText("关闭通道");
		buttonCloseChannelOfG4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		buttonCloseChannelOfG4.setEnabled(false);
		
		Button buttonSendDataOfG4 = new Button(group4, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonSendDataOfG4.setBounds(543, 59, 118, 37);
		buttonSendDataOfG4.setText("发送测试数据");
		buttonSendDataOfG4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		buttonSendDataOfG4.setEnabled(false);
		
		Button buttonAutoTestOfG4 = new Button(group4, SWT.BORDER | SWT.FLAT | SWT.CENTER);
		buttonAutoTestOfG4.setBounds(664, 59, 101, 37);
		buttonAutoTestOfG4.setText("自收发测试");
		buttonAutoTestOfG4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		buttonAutoTestOfG4.setEnabled(false);
		
		Label labelOut = new Label(mainWindow, SWT.NONE);
		labelOut.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		labelOut.setText("输出信息:");

		
		mainWindow.open();
		mainWindow.layout();
		
		while (!mainWindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
