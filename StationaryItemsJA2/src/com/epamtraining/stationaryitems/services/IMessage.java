package com.epamtraining.stationaryitems.services;

import com.epamtraining.stationaryitems.domain.StationaryItems;

public interface IMessage<E extends StationaryItems> {
	
	String getMessage(E e, String message);
}
