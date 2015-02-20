package ua.name.paa.cell;

import java.util.Date;

public class ReportCellDate extends ReportCell<Date> {

	private static final Date DEFAULT_VALUE = new Date();
	
	public ReportCellDate(int cellStyle, Date value) {
		super(cellStyle, value);
	}

	@Override
	public Class<Date> getTClass() {
		return Date.class;
	}

	@Override
	public void addToValue(Number values[]) {
		
	}

	@Override
	public Date getDefaultValue() {
		return DEFAULT_VALUE;
	}

	public ReportCellDate() {
		super();
	}

	public ReportCellDate(int cellStyle) {
		super(cellStyle);
	}
		
}
