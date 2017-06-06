package com.epamtraining.stationaryitems.services.implementation;

import com.epamtraining.stationaryitems.domain.Pen;
import com.epamtraining.stationaryitems.domain.Pencil;
import com.epamtraining.stationaryitems.domain.StationaryItems;
import com.epamtraining.stationaryitems.domain.StickyNotes;
import com.epamtraining.stationaryitems.services.IMessage;

public class MessageService<E extends StationaryItems> implements IMessage<StationaryItems> {

	@Override
	public String getMessage(StationaryItems s, String message) {
		// TODO Auto-generated method stub
		StickyNotes stickyNotes = null;
		if(s instanceof Pencil || s instanceof Pen){
			stickyNotes = new StickyNotes(message, 1, 1);
			stickyNotes.setMessage(message);
			return stickyNotes.getMessage();
		}
		return "Object not of Pen and Pencil type";
	}

}
