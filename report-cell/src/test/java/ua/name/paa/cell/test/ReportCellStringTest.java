package ua.name.paa.cell.test;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import ua.name.paa.cell.ReportCell;
import ua.name.paa.cell.ReportCellString;
import ua.name.paa.cell.Styles;

public class ReportCellStringTest {
	
	@Test
	public void addToValue() {
		ReportCell<String> source = new ReportCellString(Styles.CS_DATA, "first");
		ReportCell<String> except = new ReportCellString(Styles.CS_HEADER, "first second");
		source.addToValue(ArrayUtils.toObject(" second".getBytes()));
		assertEquals(except.getValue(), source.getValue());
	}

}
