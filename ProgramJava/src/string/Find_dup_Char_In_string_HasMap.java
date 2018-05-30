package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Find_dup_Char_In_string_HasMap {
	
//	public void findDuplicateChars(String str){
//	
//	Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
//    char[] chrs = str.toCharArray();
//    for(Character ch:chrs){
//        if(dupMap.containsKey(ch)){
//            dupMap.put(ch, dupMap.get(ch)+1);
//        } else {
//            dupMap.put(ch, 1);
//        }
//    }
//    Set<Character> keys = dupMap.keySet();
//    for(Character ch:keys){
//        if(dupMap.get(ch) > 1){
//            System.out.println(ch+"--->"+dupMap.get(ch));
//        }
//    }
//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Find_dup_Char_In_string_HasMap fdc=new Find_dup_Char_In_string_HasMap();
//		fdc.findDuplicateChars("testyantra");
		
		String cname="testyantra";
		Map<Character,Integer> dupMap=new HashMap<Character,Integer>();
		char[] chrs=cname.toCharArray();
		for(Character ch:chrs){
			if(dupMap.containsKey(ch)){
				dupMap.put(ch, dupMap.get(ch)+1);
			}else{
				dupMap.put(ch, 1);
					
			}
			
			}
		Set<Character> keys = dupMap.keySet();
		for(Character ch:keys){
			if(dupMap.get(ch) > 1){
				System.out.println(ch+"--->"+dupMap.get(ch));
			}
		}
	}

}
