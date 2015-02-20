package ua.name.paa.cell.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ua.name.paa.cell.ReportCell;
import ua.name.paa.cell.ReportCellDouble;
import ua.name.paa.cell.ReportCellString;
import ua.name.paa.cell.Styles;

public class ReportCellTest {
	
	@Test
	public void ReportCellConstructorTest() {
		ReportCell<?> except = new ReportCellString(Styles.CS_DATA, "");
		ReportCell<?> result = new ReportCellString(Styles.CS_DATA, null);
		
		ReportCell<?> except2 = new ReportCellDouble(Styles.CS_DATA);
		ReportCell<?> result2 = new ReportCellDouble(Styles.CS_DATA, null);
		
		assertEquals(except.getValue(), result.getValue());
		assertEquals(except2.getValue(), result2.getValue());
	}

}
