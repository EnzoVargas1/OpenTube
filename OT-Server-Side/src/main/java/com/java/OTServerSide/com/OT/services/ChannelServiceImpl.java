package com.java.OTServerSide.com.OT.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.OTServerSide.com.OT.exceptions.NoResourceFoundException;
import com.java.OTServerSide.com.OT.models.Channel;
import com.java.OTServerSide.com.OT.repositiory.ChannelRepository;

@Service
public class ChannelServiceImpl implements ChannelService {
	
	@Autowired
	ChannelRepository channelRepository;
	
	@Override
	public List<Channel> getChannels() {
		// TODO Auto-generated method stub
		return channelRepository.findAll();
	}
	
	@Override
	public Channel findChannelById(int id) throws NoResourceFoundException{
		// TODO Auto-generated method stub
		Channel channel = channelRepository.findById(id).orElse(null);
		if(channel == null) {
			throw new NoResourceFoundException("No Resource Found");
		}
		channel.countStats();
		return channel;
	}

	@Override
	public Channel deleteChannelById(int id) throws NoResourceFoundException {
		// TODO Auto-generated method stub
		Channel channel = channelRepository.findById(id).orElse(null);
		if(channel == null) {
			throw new NoResourceFoundException("No Resource Found");
		}

		return channel;
	}

	@Override
	public Channel addChannel(Channel channel) {
		// TODO Auto-generated method stub
		channelRepository.save(channel);
		return channel;
	}

	@Override
	public List<Channel> getSortedChannelsByPopularity() {
		// TODO Auto-generated method stub
		List<Channel> channels = channelRepository.findAll();
		channels.sort((x, y) -> Integer.compare(x.getSubscribers().size(), y.getSubscribers().size()));
		return channels;
	}
}
