package com.bbva.egpi.lib.r020.impl.manualmapper;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

public class DateMapper {

	public LocalDate localDateTimeToLocalDate(LocalDateTime ldt) {
		return new LocalDate(ldt.getYear(), ldt.getMonthOfYear(), ldt.getDayOfMonth());
	}
}