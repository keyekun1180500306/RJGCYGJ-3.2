package MainInterface;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Implementation.Impl;
import errorProblem.errorProblem;
import resultUI.ResultGUI;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
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
	private JTextField textField_4;
	private JTextField textField_9;
	private JTextField textField_10;
	private ChooseTime chooseTime;
	private JButton btnNewButton;
	private JButton btnNewButton_4;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_1;
	private Main main = this;
	private JButton btnNewButton_6;
	private JTextField textField_11;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private final errorProblem ep = new errorProblem();

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

		this.btnNewButton = new JButton("\u751F\u6210\u9898\u76EE");// ������Ŀ
		btnNewButton.setBounds(776, 116, 113, 27);
		contentPane.add(btnNewButton);

		// ��һ��
		JButton btnNewButton_1 = new JButton("\u4E0A\u4E00\u9898");
		btnNewButton_1.setBounds(103, 378, 113, 27);
		contentPane.add(btnNewButton_1);

		// ��һ��
		JButton btnNewButton_2 = new JButton("\u4E0B\u4E00\u9898");
		btnNewButton_2.setBounds(463, 378, 113, 27);
		contentPane.add(btnNewButton_2);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(103, 229, 473, 120);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		// ��ת���� text ��
		textField_2 = new JTextField();
		textField_2.setBounds(169, 437, 86, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEditable(false);

		JLabel lblNewLabel_2 = new JLabel("\u8DF3\u8F6C\u81F3\u7B2C");// ��ת����
		lblNewLabel_2.setBounds(106, 440, 72, 18);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\u9898");// ��
		lblNewLabel_3.setBounds(258, 440, 22, 18);
		contentPane.add(lblNewLabel_3);

		JButton btnNewButton_3 = new JButton("\u8DF3\u8F6C");// ��ת
		btnNewButton_3.setBounds(463, 436, 113, 27);
		contentPane.add(btnNewButton_3);

		// ���ڼӼ��� ǰ�� text
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(624, 119, 54, 24);
		contentPane.add(textField_3);

		JLabel lblNewLabel_1_1 = new JLabel("\u4EE5\u5185\u52A0\u51CF\u6CD5");// ���ڼӼ���
		lblNewLabel_1_1.setBounds(680, 120, 72, 21);
		contentPane.add(lblNewLabel_1_1);

		btnNewButton_4 = new JButton("\u63d0\u4ea4\u8be5\u9898\u7b54\u6848");// �ύ�����
		btnNewButton_4.setBounds(290, 516, 113, 27);
		contentPane.add(btnNewButton_4);

		// ���и���ǰ����Ǹ�text
		textField_5 = new JTextField();
		textField_5.setBounds(103, 516, 177, 27);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		textField_5.setEditable(false);

		JButton btnNewButton_5 = new JButton("\u4EA4\u5377");// ����
		btnNewButton_5.setBounds(914, 604, 113, 27);
		contentPane.add(btnNewButton_5);
		btnNewButton_5.setEnabled(false);

		JLabel lblNewLabel_4 = new JLabel(new ImageIcon("src\\img\\number1Student.png"));
		lblNewLabel_4.setBounds(657, 229, 370, 314);
		contentPane.add(lblNewLabel_4);

		comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "10\u9053\u9898", "20\u9053\u9898", "50\u9053\u9898",
				"100\u9053\u9898", "\u81EA\u5B9A\u4E49" }));
		comboBox.setBounds(103, 116, 113, 27);
		contentPane.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("\u9053\u9898");// ����
		lblNewLabel_1.setBounds(295, 120, 30, 18);
		contentPane.add(lblNewLabel_1);

		// ����ǰ��text
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(238, 119, 54, 24);
		contentPane.add(textField);

		// �� text ��
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
		// ����ʱ
		textField_4 = new JTextField();
		textField_4.setForeground(Color.RED);
		textField_4.setFont(new Font("����", Font.BOLD, 20));
		textField_4.setEditable(false);
		textField_4.setBounds(169, 590, 133, 51);
		contentPane.add(textField_4);
		textField_4.setColumns(15);

		JLabel lblNewLabel_5 = new JLabel("\u5012\u8BA1\u65F6");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("��������", Font.BOLD, 20));
		lblNewLabel_5.setBounds(103, 588, 63, 51);
		contentPane.add(lblNewLabel_5);

		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "5\u5206\u949F", "10\u5206\u949F", "20\u5206\u949F",
				"30\u5206\u949F", "40\u5206\u949F", "50\u5206\u949F", "1\u5C0F\u65F6", "\u81EA\u5B9A\u4E49" }));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(354, 116, 113, 27);
		contentPane.add(comboBox_1);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(489, 116, 30, 27);
		contentPane.add(textField_9);

		JLabel lblNewLabel_1_2 = new JLabel("h");
		lblNewLabel_1_2.setBounds(519, 120, 11, 18);
		contentPane.add(lblNewLabel_1_2);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(529, 116, 30, 27);
		contentPane.add(textField_10);

		JLabel lblNewLabel_1_2_1 = new JLabel("min");
		lblNewLabel_1_2_1.setBounds(559, 120, 30, 18);
		contentPane.add(lblNewLabel_1_2_1);

		btnNewButton_6 = new JButton("\u9519\u9898\u7EC3\u4E60");
		btnNewButton_6.setBounds(776, 153, 113, 27);
		contentPane.add(btnNewButton_6);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(654, 153, 54, 24);
		contentPane.add(textField_11);

		lblNewLabel_6 = new JLabel("\u9053\u9898");
		lblNewLabel_6.setBounds(708, 157, 30, 18);
		contentPane.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("\u62BD\u53D6");
		lblNewLabel_7.setBounds(624, 159, 30, 18);
		contentPane.add(lblNewLabel_7);
		// ��������Ŀ����ť��ɵĹ���
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String standardString = "[1-9][0-9]*";
				String standardString2 = "0|[1-9][0-9]*";
				String standardString3 = "0|[1-9][0-9]*";
				String selectString = (String) comboBox.getSelectedItem();
				String timeSelectString = (String) comboBox_1.getSelectedItem();// ѡ���ʱ������
				Pattern p = Pattern.compile(standardString3);
				Matcher m = p.matcher(textField_3.getText());
				String tmpp = "";
				if (selectString.equals("�Զ���")) {
					Pattern pattern = Pattern.compile(standardString);
					Matcher matcher = pattern.matcher(textField.getText());
					if (!matcher.matches())
						tmpp = "�Զ������������ʽ����";
				}
				if (timeSelectString.equals("�Զ���")) {
					Pattern pattern = Pattern.compile(standardString2);
					Matcher matcher1 = pattern.matcher(textField_9.getText());
					Matcher matcher2 = pattern.matcher(textField_10.getText());
					if (!matcher1.matches() || !matcher2.matches())
						tmpp = "�Զ��嵹��ʱ�����ʽ����";
				}
				if (!m.matches())
					tmpp = "�Զ��巶Χ�����ʽ����";
				if (!tmpp.equals("")) {
					textField_1.setText(tmpp);
				} else {
					btnNewButton_5.setEnabled(true);

					if (timeSelectString.equals("�Զ���")) {
						try {
							chooseTime = new ChooseTime(textField_4,
									textField_9.getText() + " " + textField_10.getText(), btnNewButton_5);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					} else {
						try {
							chooseTime = new ChooseTime(textField_4, timeSelectString, btnNewButton_5);
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					int tmp = 10;
					if (selectString.equals("10����")) {
						tmp = 10;
					} else if (selectString.equals("20����")) {
						tmp = 20;
					} else if (selectString.equals("50����")) {
						tmp = 50;
					} else if (selectString.equals("100����")) {
						tmp = 100;
					}
					Impl impl1 = new Impl();
					Random random = new Random();
					makeComponentFalse();
					int questionNumber;
					if (selectString.equals("�Զ���")) {
						questionNumber = Integer.parseInt(textField.getText());
					} else {
						questionNumber = tmp;
					}
					int maxRange = Integer.parseInt(textField_3.getText());
					for (int i = 0; i < questionNumber; i++) {
						if (random.nextInt() % 2 == 1) {
							signList.add("+");
							// ���ô𰸽��������[0-100]֮��
							while (true) {
								int newRandom1 = impl1.createRandomNumber(maxRange);
								int newRandom2 = impl1.createRandomNumber(maxRange);
								if (newRandom1 + newRandom2 <= maxRange) {
									leftNumber.add(newRandom1);
									rightNumber.add(newRandom2);
									break;
								}
							}
							resultList.add(leftNumber.get(i) + rightNumber.get(i));
						} else {
							signList.add("-");
							// ���ô𰸽��������[0-100]֮��
							while (true) {
								int newRandom1 = impl1.createRandomNumber(maxRange);
								int newRandom2 = impl1.createRandomNumber(maxRange);
								if (newRandom1 - newRandom2 >= 0) {
									leftNumber.add(newRandom1);
									rightNumber.add(newRandom2);
									break;
								}
							}
							resultList.add(leftNumber.get(i) - rightNumber.get(i));
						}
						// Ĭ��ֵȫ��Ϊfalse �Ա�֤�б���һ������
						judgeList.add(-32768);
					}
					textField_6.setText("1");
					textField_1
							.setText("	    " + leftNumber.get(0) + " " + signList.get(0) + " " + rightNumber.get(0));
					textField_1.setFont(new Font("����", Font.PLAIN, 29));
					btnNewButton_1.setEnabled(false);// ��һ�ⰴť��Ч
					textField_5.setEditable(true);// ���������Ч
					textField_2.setEditable(true);// ��ת���ڼ����������Ч
				}

			}
		});
		// "��һ��"��ɹ���
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setEnabled(true);
				int currentID = Integer.parseInt(textField_6.getText());
				if (currentID == leftNumber.size()) {
					btnNewButton_2.setEnabled(false);
				} else {
					int aimedID = currentID + 1;
					Integer tmp = aimedID;
					textField_6.setText(tmp.toString());
					textField_1.setText("	    " + leftNumber.get(aimedID - 1) + " " + signList.get(aimedID - 1) + " "
							+ rightNumber.get(aimedID - 1));
					if (aimedID == leftNumber.size()) {
						btnNewButton_2.setEnabled(false);
					}
					if (aimedID > 1) {
						btnNewButton_1.setEnabled(true);
					}
					btnNewButton_4.setEnabled(true);
				}
			}

		});
		// "��һ��"��ɹ���
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentID = Integer.parseInt(textField_6.getText());
				if (currentID == 1) {
					btnNewButton_2.setEnabled(false);
				} else {
					int aimedID = currentID - 1;
					Integer tmp = aimedID;
					textField_6.setText(tmp.toString());
					textField_1.setText("	    " + leftNumber.get(aimedID - 1) + " " + signList.get(aimedID - 1) + " "
							+ rightNumber.get(aimedID - 1));
					if (aimedID == 1) {
						btnNewButton_1.setEnabled(false);
					}
					if (aimedID < leftNumber.size()) {
						btnNewButton_2.setEnabled(true);
					}
					btnNewButton_4.setEnabled(true);
				}
			}

		});
		// "��ת"��ɹ���
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField_2.getText();
				String standardString = "[1-9][0-9]*";
				Pattern pattern = Pattern.compile(standardString);
				Matcher m = pattern.matcher(text);
				if (!m.matches()) {
					textField_1.setText("������������������");
				} else {
					textField_2.setText("");
					int aimedID = Integer.parseInt(text);
					Integer tmp = aimedID;
					if (aimedID >= 1 && aimedID <= leftNumber.size()) {
						textField_6.setText(tmp.toString());
						textField_1.setText("	    " + leftNumber.get(aimedID - 1) + " " + signList.get(aimedID - 1)
								+ " " + rightNumber.get(aimedID - 1));
						if (aimedID == leftNumber.size()) {
							btnNewButton_2.setEnabled(false);
						} else {
							btnNewButton_2.setEnabled(true);
						}
						if (aimedID == 1) {
							btnNewButton_1.setEnabled(false);
						} else {
							btnNewButton_1.setEnabled(true);
						}
						btnNewButton_4.setEnabled(true);
					} else {
						textField_1.setText("��������ת����������������");
					}
				}
			}
		});
		// "�ύ�����"��ɹ���
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = textField_5.getText();
				String standardString = "0|[1-9][0-9]*";
				Pattern pattern = Pattern.compile(standardString);
				Matcher matcher = pattern.matcher(result);
				if(!matcher.matches()) {
					textField_5.setText("�ύ�𰸸�ʽ��������������");
				}
				else if(textField_5.getText().length()>=10){
					textField_5.setText("�������ֹ�������������");
				}
				else {
					int tmp = Integer.parseInt(result);
					String number = textField_6.getText();
					int tmp2 = Integer.parseInt(number);
					judgeList.set(tmp2 - 1, (Integer) tmp);
					textField_5.setText("");
					btnNewButton_4.setEnabled(false);
				}
			}
		});
		// "����"��ɹ���
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "�ܹ�����" + leftNumber.size() + "��    ����ԣ�";
				List<String> errorProblem = new ArrayList<String>();// �洢�����list
				int sum = 0;
				List<Integer> wrongIntegers = new ArrayList<Integer>();
				for (int i = 0; i < leftNumber.size(); i++) {
					if (!resultList.get(i).equals(judgeList.get(i))) {
						sum++;
						wrongIntegers.add(i);
					}
				}
				sum = leftNumber.size() - sum;
				message = message + sum + "��" + "\n\n";
				String message1 = "";
				String message2 = "";
				for (int j = 0; j < wrongIntegers.size(); j++) {
					int tmp = wrongIntegers.get(j) + 1;
					if (judgeList.get(wrongIntegers.get(j)).intValue() == -32768) {

						message1 = message1 + "��δ�����" + tmp + "��:" + leftNumber.get(wrongIntegers.get(j))
								+ signList.get(wrongIntegers.get(j)) + rightNumber.get(wrongIntegers.get(j))
								 + "  ��ȷ�𰸣�" + resultList.get(wrongIntegers.get(j)) + "\n";
					} else {
						message2 = message2 + "������˵�" + tmp + "��:" + leftNumber.get(wrongIntegers.get(j))
								+ signList.get(wrongIntegers.get(j)) + rightNumber.get(wrongIntegers.get(j))
								+ "    ���Ĵ𰸣�" + judgeList.get(wrongIntegers.get(j)) + "  ��ȷ�𰸣�"
								+ resultList.get(wrongIntegers.get(j)) + "\n";
						errorProblem.add(leftNumber.get(wrongIntegers.get(j)) + signList.get(wrongIntegers.get(j))
								+ rightNumber.get(wrongIntegers.get(j)));
					}

				}
				message=message+message1+"\n\n"+message2;
				ResultGUI UI = new ResultGUI(message, errorProblem, main, ep);
				UI.setVisible(true);
				chooseTime.endThread();
			}
		});
		// �����ȡ����
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String standardString = "[1-9][0-9]*";
				Pattern pattern = Pattern.compile(standardString);
				Matcher matcher = pattern.matcher(textField_11.getText());
				if (!matcher.matches()) {
					textField_1.setText("�Զ����ȡ������ʽ����");
				} else if (Integer.valueOf(textField_11.getText()) > ep.getAllProblemCount()) {
					textField_1.setText("�Զ����ȡ���������������Ŀ������");
				} else {
					makeComponentFalse();

					btnNewButton_6.setEnabled(false);// ��ֹ���ɴ��ⰴť
					textField_11.setEditable(false);// ���ɶ��ٵ������������Ч
					btnNewButton_5.setEnabled(true);// ������ť��Ч
					// ���ɵ���ʱʱ��
					String timeSelectString = (String) comboBox_1.getSelectedItem();// ѡ���ʱ������
					if (timeSelectString.equals("�Զ���")) {
						try {
							chooseTime = new ChooseTime(textField_4,
									textField_9.getText() + " " + textField_10.getText(), btnNewButton_5);
						} catch (ParseException e1) {
							e1.printStackTrace();
						}
					} else {
						try {
							chooseTime = new ChooseTime(textField_4, timeSelectString, btnNewButton_5);
						} catch (ParseException e1) {
							e1.printStackTrace();
						}
					}

					List<String> errorProblemList = ep.getErrorProblem(Integer.valueOf(textField_11.getText()));
					List<String> answerList = ep.createAnswer(errorProblemList);

					for (int i = 0; i < errorProblemList.size(); i++) {
						String xString2[] = errorProblemList.get(i).split("\\+");
						if (xString2.length > 1) {
							leftNumber.add(Integer.valueOf(xString2[0]));
							rightNumber.add(Integer.valueOf(xString2[1]));
							signList.add("+");
						} else {
							String xString3[] = errorProblemList.get(i).split("-");
							signList.add("-");
							leftNumber.add(Integer.valueOf(xString3[0]));
							rightNumber.add(Integer.valueOf(xString3[1]));
						}
						resultList.add(Integer.valueOf(answerList.get(i)));
						// Ĭ��ֵȫ��Ϊfalse �Ա�֤�б���һ������
						judgeList.add(-32768);
					}

					textField_6.setText("1");
					textField_1
							.setText("	    " + leftNumber.get(0) + " " + signList.get(0) + " " + rightNumber.get(0));
					textField_1.setFont(new Font("����", Font.PLAIN, 29));
					btnNewButton_1.setEnabled(false);// ��һ�ⰴť��Ч
					textField_5.setEditable(true);// ���������Ч
					textField_2.setEditable(true);// ��ת���ڼ����������Ч
				}
			}
		});
	}

	// ʹ��...��һϵ����Ч
	public void makeComponentFalse() {
		textField.setEditable(false);// ��ֹ�л������������
		textField_3.setEditable(false);// ��ֹ�л��������������
		comboBox.setEnabled(false);// ��ֹ�л���Ŀ�������˵�
		comboBox_1.setEnabled(false);// ��ֹ�л�ʱ�������˵�
		textField_9.setEditable(false);// ��ֹ�л�Сʱ
		textField_10.setEditable(false);// ��ֹ�л�����
		btnNewButton.setEnabled(false);// ��ֹ������Ŀ��ť
	}

	// ʹ��ť��Ч
	public void makeButtonEnable() {
		textField.setEditable(true);
		textField_9.setEditable(true);
		textField_10.setEditable(true);
		textField_3.setEditable(true);
		btnNewButton_6.setEnabled(true);// �ָ����ɴ��ⰴť
		textField_6.setText("");
		textField_1.setText("");
		textField_4.setText("");
		btnNewButton.setEnabled(true);
		btnNewButton_4.setEnabled(true);
		comboBox.setEnabled(true);
		comboBox_1.setEnabled(true);
		leftNumber.clear();
		rightNumber.clear();
		resultList.clear();
		judgeList.clear();
	}
}