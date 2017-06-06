package com.epamtraining.stationaryitems.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.epamtraining.stationaryitems.domain.Marker;
import com.epamtraining.stationaryitems.domain.Pen;
import com.epamtraining.stationaryitems.domain.Pencil;
import com.epamtraining.stationaryitems.domain.StationaryItems;
import com.epamtraining.stationaryitems.services.implementation.MessageService;
import com.epamtraining.stationaryitems.services.implementation.StarterKitServices;

public class DriverClass {

	public static final Comparator<StationaryItems> NAME_ORDER  = new NameOrder();
	public static final Comparator<StationaryItems> PRICE_ORDER  = new PriceOrder();
	public static final Comparator<StationaryItems> NAMEPRICE_ORDER  = new NamePriceOrder();
	
	    // comparator to sort by name
	private static class NameOrder implements Comparator<StationaryItems> {
	     public int compare(StationaryItems a, StationaryItems b) {
	          return a.getItemName().compareTo(b.getItemName());
	        }
	    }
	
	private static class PriceOrder implements Comparator<StationaryItems> {
	     public int compare(StationaryItems a, StationaryItems b) {
	          return a.getPrice().compareTo(b.getPrice());
	        }
	    }
	
	private static class NamePriceOrder implements Comparator<StationaryItems> {
		public int compare(StationaryItems a, StationaryItems b) {
			int result = a.getItemName().compareTo(b.getItemName());
			if(result != 0){
				return result;
			}
			return a.getPrice().compareTo(b.getPrice());
		}
	}
	
//	private static class NamePriceOrder implements Comparator<StationaryItems> {
//		private List<Comparator<StationaryItems>> listComparators;
//		@SafeVarargs
//		public NamePriceOrder(Comparator<StationaryItems>... comparators) {
//			// TODO Auto-generated constructor stub
//			this.listComparators = Arrays.asList(comparators);
//		}
//	     public int compare(StationaryItems a, StationaryItems b) {
//	         for (Comparator<StationaryItems> comparator : listComparators) {
//	             int result = comparator.compare(a, b);
//	             if (result != 0) {
//	                 return result;
//	             }
//	         }
//	         return 0;
//	        }
//	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StationaryItems> lll = new StarterKitServices<>().getListOfItems();
		System.out.println("-----------Original");
		System.out.println(lll);
		

		
		Collections.sort(lll, DriverClass.NAME_ORDER);
		System.out.println("-----------Sorted by Name");
		System.out.println(lll);
		
		
		Collections.sort(lll, DriverClass.PRICE_ORDER);
		System.out.println("-----------Sorted by Price");
		System.out.println(lll);
		
		Collections.sort(lll, DriverClass.NAMEPRICE_ORDER);
		System.out.println("-----------Sorted by both");
		System.out.println(lll);
		
		

		
		MessageService<StationaryItems> ms = new MessageService<>();
		StationaryItems p;
		p = new Pencil("Pencil", 1, 1);
		System.out.println(ms.getMessage(p, "PencilMessage"));
		
		p = new Marker("Marker", 1, 1);
		System.out.println(ms.getMessage(p, "MarkerMessage"));
		
		p = new Pen("Pen", 1, 1);
		System.out.println(ms.getMessage(p, "PenMessage"));

		
		

	}

}
