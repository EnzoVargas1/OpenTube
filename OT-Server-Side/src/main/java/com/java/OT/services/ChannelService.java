package com.java.OT.services;

import java.util.List;

import com.java.OT.exceptions.NoResourceFoundException;
import com.java.OT.models.Channel;


public interface ChannelService {
	public List<Channel> getChannels();
	public Channel findChannelById(int id)throws NoResourceFoundException;
	public Channel deleteChannelById(int id)throws NoResourceFoundException;
	public Channel addChannel(Channel channel);
	public List<Channel> getSortedChannelsByPopularity();
}
