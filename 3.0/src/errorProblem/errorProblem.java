package errorProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Implementation.Impl;

public class errorProblem {
	private int allProblemCount = getAllProblemCount();// ��ǰ���⼯�����д�������
	private final String errorProblemString = "src\\errorProblem\\errorProblem.txt";// ���еĴ����·��
	private final String allProblemCountString = "src\\errorProblem\\allProblemCount.txt";// ���д�����Ŀ��·��

	/**
	 * ���ݴ��⹹���
	 * 
	 * @param list ����
	 * @return ���ݴ��⹹��Ĵ�
	 */
	public List<String> createAnswer(List<String> list) {
		List<String> answerList = new ArrayList<String>();
		for (String xString : list) {
			String xString2[] = xString.split("\\+");
			if (xString2.length > 1) {
				answerList.add(String.valueOf(Integer.valueOf(xString2[0]) + Integer.valueOf(xString2[1])));
			} else {
				String xString3[] = xString.split("\\-");
				answerList.add(String.valueOf(Integer.valueOf(xString3[0]) - Integer.valueOf(xString3[1])));
			}
		}
		return answerList;
	}

	/**
	 * ���ص�ǰ���д�����Ŀ
	 * 
	 * @return
	 */
	public int getAllProblemCount() {
		File file = new File(allProblemCountString);
		BufferedReader reader = null;
		String string = "";
		try {
			reader = new BufferedReader(new FileReader(file));
			string = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
		return Integer.valueOf(string);
	}

	/**
	 * �������еĵ�ǰ���д��⣨ÿ����֮�����ûس�������ģ�ǰ�������,������ӵ����⼯��
	 * 
	 * @param list ����Ĵ�������
	 */
	public void addErrorProblemAndNumber(List<String> list) {
		List<String> result = new ArrayList<String>();
		for (String xString : list) {
			allProblemCount++;
			xString = allProblemCount + ":" + xString;
			result.add(xString);
		}
		List<String> aList = new ArrayList<String>();
		aList.add(String.valueOf(allProblemCount));
		WriteMessageInFile(aList, allProblemCountString, false);
		WriteMessageInFile(result, errorProblemString, true);
	}

	/**
	 * �����ȡ�ļ��д���
	 * 
	 * @param number ��Ҫ��ȡ�Ĵ�������
	 * @return ���д��⹹�ɵ��ַ�������
	 */
	public List<String> getErrorProblem(int number) {
		Impl impl = new Impl();
		List<Integer> problemNumber = new ArrayList<Integer>();// ����������ɵ���ȡ��ŵ�����
		for (int i = 0; i < number; i++) {
			int x = impl.createRandomNumber(allProblemCount + 1);
			while (x == 0 || problemNumber.contains(x)) {
				x = impl.createRandomNumber(allProblemCount + 1);
			}
			problemNumber.add(x);
		}
		Collections.sort(problemNumber);// ������������ɵ�Ҫ��ȡ���������������
		return removeNumberAddNewNumber(readFileByLines(problemNumber, errorProblemString));
	}

	/**
	 * ��stringд���ļ�
	 * 
	 * @param list     Ҫд���ļ����ַ�������
	 * @param filePath Ҫд����ļ�·��
	 * @param flag     �Ƿ񸲸�֮ǰ���ļ�
	 */
	private void WriteMessageInFile(List<String> list, String filePath, Boolean flag) {
		try {
			File file = new File(filePath);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw;
			if (flag) {
				fw = new FileWriter(file, true);
			} else {
				fw = new FileWriter(file);
			}
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < list.size(); i++) {
				bw.write(list.get(i)+"\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ��string�еĵ�ǰ���д��⣨ÿ����֮�����ûس�������ģ�ǰ�Ƴ����
	private List<String> removeNumberAddNewNumber(List<String> string) {
		List<String> result = new ArrayList<String>();
		for (String xString : string) {
			String xString1[] = xString.split(":");
			xString = xString1[1];
			result.add(xString);
		}
		return result;
	}

	// �������Ϊlist�е���Ŀ
	private List<String> readFileByLines(List<Integer> list, String filePath) {
		File file = new File(filePath);
		BufferedReader reader = null;
		int i = 0;
		List<String> result = new ArrayList<String>();
		try {
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			// һ�ζ���һ�У�ֱ������nullΪ�ļ�����
			while ((tempString = reader.readLine()) != null && i < list.size()) {
				String xString[] = tempString.split(":");
				if (Integer.valueOf(xString[0]) == list.get(i)) {
					result.add(tempString);
					i++;
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
		return result;
	}
}
