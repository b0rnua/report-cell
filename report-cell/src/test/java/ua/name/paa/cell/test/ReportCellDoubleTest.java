package ua.name.paa.cell.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.name.paa.cell.ReportCell;
import ua.name.paa.cell.ReportCellDouble;
import ua.name.paa.cell.Styles;

public class ReportCellDoubleTest {
	
	@Test
	public void addToValue() {
		ReportCell<?> source = new ReportCellDouble(Styles.CS_HEADER, 2.);
		ReportCell<?> except = new ReportCellDouble(Styles.CS_DATA, 2.);
		source.addToValue(new Integer[]{2,1});
		assertEquals(except.getValue(), source.getValue());
	}

}
