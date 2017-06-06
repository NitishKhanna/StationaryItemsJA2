package com.epamtraining.stationaryitems.services.implementation;

import java.util.ArrayList;
import java.util.List;

import com.epamtraining.stationaryitems.domain.Marker;
import com.epamtraining.stationaryitems.domain.Pen;
import com.epamtraining.stationaryitems.domain.Pencil;
import com.epamtraining.stationaryitems.domain.StationaryItems;
import com.epamtraining.stationaryitems.domain.StickyNotes;
import com.epamtraining.stationaryitems.services.IStarterKit;

public class StarterKitServices<E extends StationaryItems> implements IStarterKit<StationaryItems> {

	private static List<StationaryItems> items;
	
	public StarterKitServices() {
		// TODO Auto-generated constructor stub
		items = new ArrayList<StationaryItems>();
	}
	@Override
	public List<StationaryItems> getListOfItems() {
		// TODO Auto-generated method stub
		items.add(new Marker("bMarker", 1, 16));
		items.add(new Pen("ZPen", 6, 1));
		items.add(new Pencil("APencil", 3, 12));
		items.add(new StickyNotes("StickyNotes", 1, 100));
		items.add(new StickyNotes("StickyNotes", 8, 999));
		items.add(new Pencil("Pencil", 20, 6));
		
		return items;
	}

}
