package MainInterface;
//��B3���ĸ��ļ������޸� �޸��ļ�֮һ��1.0/src/MainInterface/Main.java
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Implementation.Impl;
import resultUI.ResultGUI;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private List<Integer> leftNumber = new ArrayList<Integer>();
	private List<Integer> rightNumber = new ArrayList<Integer>();
	private List<String> signList = new ArrayList<String>();
	private List<Integer> resultList = new ArrayList<Integer>();
	private List<Integer> judgeList = new ArrayList<Integer>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1059, 713);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 
		JLabel lblNewLabel = new JLabel("\u52A0\u51CF\u6CD5\u7EC3\u4E60\u8F6F\u4EF6");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 27));
		lblNewLabel.setBounds(430, 28, 263, 55);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u751F\u6210\u9898\u76EE");//������Ŀ
		btnNewButton.setBounds(776, 116, 113, 27);
		contentPane.add(btnNewButton);

		
		//��һ��
		JButton btnNewButton_1 = new JButton("\u4E0A\u4E00\u9898");
		btnNewButton_1.setBounds(103, 378, 113, 27);
		contentPane.add(btnNewButton_1);
		
		//��һ��
		JButton btnNewButton_2 = new JButton("\u4E0B\u4E00\u9898");
		btnNewButton_2.setBounds(463, 378, 113, 27);
		contentPane.add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(103, 229, 465, 120);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		//��ת���� text ��
		textField_2 = new JTextField();
		textField_2.setBounds(169, 437, 86, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEditable(false);
		
		JLabel lblNewLabel_2 = new JLabel("\u8DF3\u8F6C\u81F3\u7B2C");//��ת����
		lblNewLabel_2.setBounds(106, 440, 72, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u9898");//��
		lblNewLabel_3.setBounds(258, 440, 22, 18);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_3 = new JButton("\u8DF3\u8F6C");//��ת
		btnNewButton_3.setBounds(463, 436, 113, 27);
		contentPane.add(btnNewButton_3);
		
		//���ڼӼ��� ǰ�� text
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(590, 119, 54, 24);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u4EE5\u5185\u52A0\u51CF\u6CD5");//���ڼӼ���
		lblNewLabel_1_1.setBounds(648, 122, 114, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_4 = new JButton("\u63d0\u4ea4\u8be5\u9898\u7b54\u6848");//�ύ�����
		btnNewButton_4.setBounds(313, 516, 113, 27);
		contentPane.add(btnNewButton_4);
		
		
		//���и���ǰ����Ǹ�text
		textField_5 = new JTextField();
		textField_5.setBounds(103, 516, 177, 27);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		textField_5.setEditable(false);
		
		JButton btnNewButton_5 = new JButton("\u4EA4\u5377");//����
		btnNewButton_5.setBounds(914, 604, 113, 27);
		contentPane.add(btnNewButton_5);
		btnNewButton_5.setEnabled(false);
		
		JLabel lblNewLabel_4 = new JLabel(new ImageIcon("src\\img\\number1Student.png"));
		lblNewLabel_4.setBounds(657, 229, 370, 314);
		contentPane.add(lblNewLabel_4);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"10\u9053\u9898", "20\u9053\u9898", "50\u9053\u9898", "100\u9053\u9898", "\u81EA\u5B9A\u4E49"}));
		comboBox.setBounds(103, 116, 113, 27);
		contentPane.add(comboBox);
		
		
		JLabel lblNewLabel_1 = new JLabel("\u9053\u9898");//����
		lblNewLabel_1.setBounds(388, 120, 30, 18);
		contentPane.add(lblNewLabel_1);
		
		//����ǰ��text
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(331, 119, 54, 24);
		contentPane.add(textField);
		
		
		//�� text ��
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(297, 192, 63, 24);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setText("\u7B2C");
		textField_7.setBounds(270, 192, 22, 24);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setText("\u9898");
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(363, 192, 22, 24);
		contentPane.add(textField_8);		
		//��������Ŀ����ť��ɵĹ���
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				btnNewButton_5.setEnabled(true);
				String selectString = (String)comboBox.getSelectedItem();
				int tmp=10;
				if(selectString.equals("10����")) {
					tmp=10;
				}
				else if(selectString.equals("20����")) {
					tmp=20;
				}
				else if(selectString.equals("50����")) {
					tmp=50;
				}
				else if(selectString.equals("100����")) {
					tmp=100;
				}
				Impl impl1 = new Impl();
				String sign;
				Random random = new Random();
				textField.setEditable(false);
				textField_3.setEditable(false);
				btnNewButton.setEnabled(false);						
				int questionNumber; 
				if(selectString.equals("�Զ���"))	{
					questionNumber = Integer.parseInt(textField.getText());
				}
				else {
					questionNumber = tmp;
				}			
				int maxRange= Integer.parseInt(textField_3.getText());
				for(int i=0;i<questionNumber;i++) {
					leftNumber.add(impl1.createRandomNumber(maxRange));
					rightNumber.add(impl1.createRandomNumber(maxRange));
					if(random.nextInt()%2==1) {
						signList.add("+");
						resultList.add(leftNumber.get(i)+rightNumber.get(i));
					}
					else {
						signList.add("-");
						resultList.add(leftNumber.get(i)-rightNumber.get(i));
					}
					//Ĭ��ֵȫ��Ϊfalse �Ա�֤�б���һ������
					judgeList.add(-32768);			
				}
				textField_6.setText("1");				
				textField_1.setText("	    "+leftNumber.get(0)+" "+signList.get(0)+" "+rightNumber.get(0));
				textField_1.setFont(new Font("����", Font.PLAIN, 29));
				btnNewButton_1.setEnabled(false);
				textField_5.setEditable(true);
				textField_2.setEditable(true);
			}
		});
		//"��һ��"��ɹ���	
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setEnabled(true);
				int currentID = Integer.parseInt(textField_6.getText());
				if(currentID == leftNumber.size()) {
					btnNewButton_2.setEnabled(false);
				}
				else {
					int aimedID = currentID+1;
					Integer tmp  = aimedID;
					textField_6.setText(tmp.toString());
					textField_1.setText("	    "+leftNumber.get(aimedID-1)+" "+signList.get(aimedID-1)+" "+rightNumber.get(aimedID-1));
					if(aimedID == leftNumber.size()) {
						btnNewButton_2.setEnabled(false);
					}
					if(aimedID>1) {
						btnNewButton_1.setEnabled(true);
					}
					btnNewButton_4.setEnabled(true);
				}
			}
			
		});
		//"��һ��"��ɹ���	
		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int currentID = Integer.parseInt(textField_6.getText());
				if(currentID == 1) {
					btnNewButton_2.setEnabled(false);
				}
				else {
					int aimedID = currentID-1;
					Integer tmp  = aimedID;
					textField_6.setText(tmp.toString());
					textField_1.setText("	    "+leftNumber.get(aimedID-1)+" "+signList.get(aimedID-1)+" "+rightNumber.get(aimedID-1));
					if(aimedID == 1) {
						btnNewButton_1.setEnabled(false);
					}
					if(aimedID < leftNumber.size()) {
						btnNewButton_2.setEnabled(true);
					}
					btnNewButton_4.setEnabled(true);
				}
			}
			
		});
		//"��ת"��ɹ���	
		btnNewButton_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String text = textField_2.getText();
				textField_2.setText("");
				int aimedID = Integer.parseInt(text);
				Integer tmp  = aimedID;
				if(aimedID>=1 && aimedID <=leftNumber.size()) {
					textField_6.setText(tmp.toString());
					textField_1.setText("	    "+leftNumber.get(aimedID-1)+" "+signList.get(aimedID-1)+" "+rightNumber.get(aimedID-1));
					if(aimedID==leftNumber.size()) {
						btnNewButton_2.setEnabled(false);
					}
					else {
						btnNewButton_2.setEnabled(true);
					}
					if(aimedID==1) {
						btnNewButton_1.setEnabled(false);
					}
					else {
						btnNewButton_1.setEnabled(true);
					}
				}
				btnNewButton_4.setEnabled(true);
			}
		});
		//"�ύ�����"��ɹ���
		btnNewButton_4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String result = textField_5.getText();
				int tmp = Integer.parseInt(result);
				String number = textField_6.getText();
				int tmp2 = Integer.parseInt(number);
				judgeList.set(tmp2-1,(Integer)tmp );
				textField_5.setText("");
				btnNewButton_4.setEnabled(false);
				//System.out.println("��ȷ�𰸣�"+resultList.get(tmp2-1)+"  ��Ĵ𰸣�"+ judgeList.get(tmp2-1));
			}
		});
		//"����"��ɹ���
		btnNewButton_5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String message = "�ܹ�����"+leftNumber.size()+"��    ����ԣ�";
				int sum=0;
				List<Integer> wrongIntegers = new ArrayList<Integer>();
				for(int i = 0 ;i<leftNumber.size();i++) {
					if(!resultList.get(i).equals(judgeList.get(i))) {
						sum++;
						wrongIntegers.add(i);
					}
				}
				System.out.println(wrongIntegers.size());
				sum=leftNumber.size()-sum;
				message = message+sum+"��"+"\n���������\n";
				for(int j =0;j<wrongIntegers.size();j++) {
					int tmp = wrongIntegers.get(j)+1;
					if(judgeList.get(wrongIntegers.get(j)).intValue()==-32768) {
						
						message = message+"������˵�"+ tmp+"��:"+leftNumber.get(wrongIntegers.get(j))+
						signList.get(wrongIntegers.get(j))+rightNumber.get(wrongIntegers.get(j))+"    ��δ����"+
								  "  ��ȷ�𰸣�"+resultList.get(wrongIntegers.get(j))+"\n";
					}
					else {
						message = message+"������˵�"+ tmp+"��:"+ leftNumber.get(wrongIntegers.get(j))+
								signList.get(wrongIntegers.get(j))+rightNumber.get(wrongIntegers.get(j))
					  +"    ���Ĵ𰸣�"+ 	judgeList.get(wrongIntegers.get(j))+"  ��ȷ�𰸣�"+resultList.get(wrongIntegers.get(j))+"\n";
					}
					
				}
				
				ResultGUI UI = new ResultGUI(message);
				
				UI.setVisible(true);
			}
		});
	}
	}
	
