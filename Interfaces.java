package test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Interfaces extends JFrame{
	
	static JFrame frm = new JFrame("大数乘法");
	
	public static void main(String[] args) {
		FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
		JLabel lab = new JLabel("这里输入第一个操作数：");
		JTextArea jt= new JTextArea(3,50);
		JLabel lab1 = new JLabel("这里输入第二个操作数：");
		JTextArea jt1= new JTextArea(3,50);
		JLabel lab2 = new JLabel("答案为：");
		JTextArea jt2= new JTextArea(3,50);
		JButton jb = new JButton("提交");
		JButton jb1 = new JButton("清空");
		frm.setSize(600,500);
		frm.setLocation(200,50);
		frm.setVisible(true);
		frm.setLayout(flow);
		frm.add(lab);
		frm.add(jt);
		frm.add(lab1);
		frm.add(jt1);
		frm.add(lab2);
		frm.add(jt2);
		frm.add(jb1);
		frm.add(jb);
		
		jt.setLineWrap(true);
		jt1.setLineWrap(true);
		jt2.setLineWrap(true);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = jt.getText();
				String s2 = jt1.getText();
				boolean flag = true;
				for (int i = 0; i < s1.length(); i++)
				{
					if(!Character.isDigit(s1.charAt(i))) {
						flag=false;
						break;
					}
				}
				
				if(flag) {
					largenumberOperationMultiply lp=new largenumberOperationMultiply();
					String s3 = lp.multiply(s1,s2);
					jt2.setText(s3);
				}
				else {
					JOptionPane.showConfirmDialog(frm, "请输入数字","提示",JOptionPane.YES_NO_OPTION);
				}
				
				
				
			}
		});
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				jt1.setText("");
				jt2.setText("");
			}
		});
	}
}
