package com.spring.constructor.withmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;  
	private String name;  
	private Map<String,String> answers=new HashMap<String,String>();  

	public Question() {}  
	public Question(int id, String name, Map<String, String> answers) {  
		this.id = id;  
		this.name = name;  
		this.answers = answers;  
	}  

	public void displayInfo(){  
		System.out.println("question id:"+id);  
		System.out.println("question name:"+name);  
		System.out.println("Answers....");  
		Set<Entry<String, String>> set=answers.entrySet();  
		/*Iterator<Entry<String, String>> itr=set.iterator();  
		while(itr.hasNext()){  
			Entry<String,String> entry=itr.next();  
			System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
		}  */
		for(Entry<String,String> value:set){
			System.out.println("Answer : " + value.getKey() + " Posted By : " + value.getValue());	
		}
	}  
}  


