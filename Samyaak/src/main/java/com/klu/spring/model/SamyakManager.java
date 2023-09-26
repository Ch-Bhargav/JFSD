package com.klu.spring.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.klu.entity.Events;
import com.klu.entity.Samyak;
import com.klu.repository.EventsRepository;
import com.klu.repository.SamyakRepository;

@Service
public class SamyakManager {
	@Autowired
	SamyakRepository SR;
	
	@Autowired
	EventsRepository ER;
	
	//Load Events
	public List<String> getEvents()
	{
		List<String> list = new ArrayList<String>();
		for(Events E : ER.findAll())
		{
			list.add(toJsonString(E));
		}
		return list;
	}
	
	//Registration
	public String registration(Samyak S)
	{
		SR.save(S);
		return "Registered Successfully, No. of Participants: " + SR.countParticipants();
	}
	
	//Method for converting Java Object to JSON String
	public String toJsonString(Object obj)
	{
		GsonBuilder builder = new GsonBuilder();
		Gson G = builder.create();
		return G.toJson(obj);
	}
}
