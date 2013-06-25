package org.poupitz.dev;

import java.util.Calendar;
import java.util.Date;

public class Event implements Comparable<Event> {

	private final Date dateDebut;
	private final int duree;
	private final Date dateFin;

	public Event(Date date, int duree) {
		super();
		this.dateDebut = date;
		this.duree = duree;

		Calendar cal = Calendar.getInstance();
		cal.setTime(dateDebut);
		cal.add(Calendar.DATE, duree);
		this.dateFin = cal.getTime();
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public int getDuree() {
		return duree;
	}

	public Date getDateFin() {
		return dateFin;
	}

	@Override
	public String toString() {
		return "Event [dateDebut=" + dateDebut + ", duree=" + duree
				+ ", dateFin=" + dateFin + "]";
	}

	@Override
	public int compareTo(Event o) {

		if ((this.getDateDebut().compareTo(o.getDateDebut())) == 0) {
			return 0;
		} else if ((this.getDateDebut().compareTo(o.getDateDebut())) < 0) {
			return -1;
		} else {
			return 1;

		}

	}

}
