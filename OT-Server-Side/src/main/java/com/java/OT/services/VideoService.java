package com.java.OT.services;

import java.io.IOException;

import com.java.OT.exceptions.NoResourceFoundException;
import com.java.OT.models.Video;
import org.springframework.web.multipart.MultipartFile;



public interface VideoService {
	public String addVideo(String name, boolean isPrivate, MultipartFile file)throws IOException;
	public Video getVideo(int id)throws IOException, IllegalStateException, NoResourceFoundException;
	public Video updateVideo(int id, Video video)throws NoResourceFoundException;
}
