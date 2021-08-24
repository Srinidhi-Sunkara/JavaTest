package com.unit.test;
import java.util.HashMap;
public class Calculator {
	static HashMap<Integer, String> training=new HashMap<Integer,String>();
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int addtraining(int trainingid, String trainingname) {
		training.put(trainingid, trainingname);
		return training.size();
	}
	public static String updatetraining(int trainingid, String trainingname) {
		return training.put(trainingid, trainingname);
	}
	public static int removetraining(int trainingid) {
		training.remove(trainingid);
		return training.size();
	}
	public static HashMap<Integer,String> fetchAll(){
		return training;
	}


}
