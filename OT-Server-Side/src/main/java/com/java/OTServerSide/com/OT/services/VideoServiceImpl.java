package com.java.OTServerSide.com.OT.services;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.java.OTServerSide.com.OT.models.Video;
import com.java.OTServerSide.com.OT.repositiory.VideoRepository;

public class VideoServiceImpl implements VideoService {
	
	@Autowired
	VideoRepository videoRepository;

	@Override
	public String addVideo(String name, boolean isPrivate, MultipartFile file) throws IOException {
		// TODO Auto-generated method stub
		Video vid = new Video(name, isPrivate, file.getInputStream());
		return vid.getName();
	}

}
