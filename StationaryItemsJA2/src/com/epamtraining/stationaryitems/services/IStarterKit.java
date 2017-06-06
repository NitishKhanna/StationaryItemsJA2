package com.epamtraining.stationaryitems.services;

import java.util.List;

import com.epamtraining.stationaryitems.domain.StationaryItems;

public interface IStarterKit<E extends StationaryItems> {
	
	List<E>	getListOfItems();
}
