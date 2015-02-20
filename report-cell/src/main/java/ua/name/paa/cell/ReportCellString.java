package ua.name.paa.cell;

import org.apache.commons.lang3.ArrayUtils;

public class ReportCellString extends ReportCell<String> {
	
	private static final String DEFAULT_VALUE = "";

	public ReportCellString(int cellStyle, String value) {
		super(cellStyle, value);
	}

	@Override
	public Class<String> getTClass() {
		return String.class;
	}

	@Override
	public void addToValue(Number values[]) {
		if (values instanceof Byte[]) {
			byte string[] = ArrayUtils.toPrimitive((Byte[])values);
			setValue(getValue() + new String(string));
		}
	}

	@Override
	public String getDefaultValue() {
		return DEFAULT_VALUE;
	}

}
