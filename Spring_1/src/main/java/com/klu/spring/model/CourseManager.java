package com.klu.spring.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.klu.spring.entity.Course;
import com.klu.spring.repository.CourseRepository;

@Service
public class CourseManager {
	
	@Autowired
	CourseRepository CR;
	
	public String saveData(Course C)
	{
		CR.save(C); //Insert Operation
		return "Data inserted successfully";
	}
	
	public String updateData(Long id, Course C)
	{
		Course tmp = CR.findById(id).get();
		tmp.setTitle(C.getTitle());
		tmp.setCredit(C.getCredit());
		tmp.setOffereddept(C.getOffereddept());
		CR.save(tmp);
		return "Data updated successfully";
	}
	
	public String deleteData(Long id)
	{
		CR.deleteById(id);
		return "Data deleted successfully";
	}
	
	public List<String> getData()
	{
		List<String> list = new ArrayList<String>();
		for(Course C : CR.findAll())
		{
			list.add(convertToJson(C));
		}
		return list;
	}
	
	//Convert JAVA object to JSON string
	public String convertToJson(Object obj)
	{
		GsonBuilder GB = new GsonBuilder();
		Gson G = GB.create();
		return G.toJson(obj);
	}
}
