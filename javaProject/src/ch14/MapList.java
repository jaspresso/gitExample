package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	static void print(Map<String, Object> map) {
		@SuppressWarnings("unchecked")//무점검 경고 : 제너릭을 사용할 때 타입안정성에 문제가 있을 수 있음을 경고
		ArrayList<Student> list2=(ArrayList<Student>)map.get("list");//map에서는 key로 데이터를 불러옴
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()
			+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}

	public static void main(String[] args) {
		Map<String, Object> map=new HashMap<>();//맵 인스턴스 생성
		List<Student> list=new ArrayList<>();//리스트 인스턴스 생성
		list.add(new Student("201801", "kim", "전산", 1, "park"));//리스트에 Student 추가
		list.add(new Student("201902", "choi", "영문", 3, "hong"));
		list.add(new Student("202003", "lee", "경제", 2, "min"));
		map.put("list", list);//맵에 리스트 추가
		
		print(map);//압축파일처럼 list안의 3개의 객체가 map에 담겨져 print쪽의 매개변수화되어 넘김

	}

}
