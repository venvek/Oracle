package oracletest;

import java.util.ArrayList;

public class MemberTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVo> list = dao.list();
		
		for(int i = 0; i < list.size(); i++) {
			MemberVo data = (MemberVo) list.get(i);
			String empno = data.getEmpno();
			String ename = data.getEname();
			int sal = data.getSal();
			int comm = data.getComm();
			int sum = sal + comm;
			
			System.out.println(empno + " : " + ename + " : " + sal + " : " + comm + " : " + sum );
		}
	}}
