package org.fabrelab.textkit;

import org.fabrelab.textkit.sequence.NeedlemanWunsch;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NeedlemanWunsch nw = new NeedlemanWunsch("ADDR正常签收扫描 /签收人:门卫", "ADDR/正常签收录入扫描/签收人:陈");
	
		nw.printScoreTable();
		for(String s : nw.getAlignment()){
			System.out.println(s);
		}
		

	}

}
