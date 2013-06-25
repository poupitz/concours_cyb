package org.poupitz.dev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException,
			NumberFormatException, ParseException {

		/* INIT */
		String thisLine;
		boolean first_line = true;
		int nbre_events = 0;

		List<Event> events = new ArrayList<Event>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		BufferedReader r = new BufferedReader(new FileReader(
				"src//main//resources//data.properties"));

		while ((thisLine = r.readLine()) != null) {

			if (first_line) {

				nbre_events = Integer.parseInt(thisLine);
				System.out.println("Nombre events : " + nbre_events);
				first_line = false;

			} else {
				Date date = sdf.parse(thisLine.split(";")[0]);
				int dur = Integer.parseInt(thisLine.split(";")[1]);
				Event event = new Event(date, dur);

				events.add(event);

				// System.out.println(event);
			}

		}

		System.out.println("Liste non triée");
		System.out.println(events);
		Collections.sort(events);
		System.out.println("Liste triée :");
		System.out.println(events);

		/* TRAITEMENT */

		// List<ChaineEvent> chainesEvents = new ArrayList<ChaineEvent>();
		List<List<Event>> chainesEvents = new ArrayList<List<Event>>();

		Iterator<List<Event>> iterator = chainesEvents.iterator();

		for (List<Event> list : chainesEvents) {

			for (Event event : list) {

			}

		}

		// for (ChaineEvent chaine : chainesEvents) {
		// for (Event event : events) {
		//
		// chaine.
		//
		// }
		// }
		//
		// for (int i = 0; i < nbre_events; i++) {
		//
		// (chainesEvents.get(i)).add(events.get(i));
		//
		// }

	}
}
