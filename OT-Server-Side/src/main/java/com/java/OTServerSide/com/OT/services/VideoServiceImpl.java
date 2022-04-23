package com.java.OTServerSide.com.OT.services;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.java.OTServerSide.com.OT.exceptions.NoResourceFoundException;
import com.java.OTServerSide.com.OT.models.Video;
import com.java.OTServerSide.com.OT.repositiory.VideoRepository;

public class VideoServiceImpl implements VideoService {
	
	@Autowired
	VideoRepository videoRepository;

	@Override
	public String addVideo(String name, boolean isPrivate, MultipartFile file) throws IOException {
		// TODO Auto-generated method stub
		Video vid = new Video(name, isPrivate, file.getInputStream());
		videoRepository.save(vid);
		return vid.getName();
	}

	@Override
	public Video getVideo(int id) throws IOException, IllegalStateException, NoResourceFoundException{
		// TODO Auto-generated method stub
		Video vid = videoRepository.findById(id).orElse(null);
		if(vid == null)
			throw new NoResourceFoundException("No Resource Found");
		return vid;
	}

	@Override
	public Video updateVideo(int id,Video video) throws NoResourceFoundException {
		// TODO Auto-generated method stub
		Video vid = videoRepository.findById(id).orElse(null);
		if(vid == null)
			throw new NoResourceFoundException("No Resource Found");
		vid = video;
		videoRepository.save(vid);
		return null;
	}

	
	
}
