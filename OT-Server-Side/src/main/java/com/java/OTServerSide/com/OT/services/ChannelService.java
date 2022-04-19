package com.java.OTServerSide.com.OT.services;

import java.util.List;

import com.java.OTServerSide.com.OT.exceptions.NoResourceFoundException;
import com.java.OTServerSide.com.OT.models.Channel;

public interface ChannelService {
	public List<Channel> getChannels();
	public Channel findChannelById(int id)throws NoResourceFoundException;
	public Channel deleteChannelById(int id);
	public Channel addChannel(Channel channel);
	
}
