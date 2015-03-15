package ua.name.paa.cell.test;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import ua.name.paa.cell.ReportCell;
import ua.name.paa.cell.ReportCellDouble;
import ua.name.paa.cell.ReportCellString;
import ua.name.paa.cell.Styles;

public class ReportCellTest {
	
	@Test
	public void ReportCellConstructorTest() {
		ReportCell<?> expect = new ReportCellString(Styles.CS_DATA, "");
		ReportCell<?> result = new ReportCellString(Styles.CS_DATA, null);
		
		ReportCell<?> expect2 = new ReportCellDouble(Styles.CS_DATA);
		ReportCell<?> result2 = new ReportCellDouble(Styles.CS_DATA, null);
		
		assertEquals(expect.getValue(), result.getValue());
		assertEquals(expect2.getValue(), result2.getValue());
	}
	
	@Test
	public void addToValueWithVerify() {
		ReportCell<?> expect = new ReportCellString(Styles.CS_DATA, "");
		ReportCell<?> result = new ReportCellString(Styles.CS_RESULT, "");
		ReportCell.addToValueWithVerify(result, expect, ArrayUtils.toObject("".getBytes()));
		assertEquals(expect.getCellStyle(), result.getCellStyle());
	}

}
