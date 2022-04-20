package com.java.OTServerSide.com.OT.services;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface VideoService {
	public String addVideo(String name, boolean isPrivate, MultipartFile file)throws IOException;
	
}
