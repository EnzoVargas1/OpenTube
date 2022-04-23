package com.java.OTServerSide.com.OT.services;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.java.OTServerSide.com.OT.exceptions.NoResourceFoundException;
import com.java.OTServerSide.com.OT.models.Video;

public interface VideoService {
	public String addVideo(String name, boolean isPrivate, MultipartFile file)throws IOException;
	public Video getVideo(int id)throws IOException, IllegalStateException, NoResourceFoundException;
	public Video updateVideo(int id, Video video)throws NoResourceFoundException;
}
