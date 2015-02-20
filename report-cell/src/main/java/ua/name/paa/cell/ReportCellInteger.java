package ua.name.paa.cell;

public class ReportCellInteger extends ReportCell<Integer> {
	
	private static final Integer DEFAULT_VALUE = 0;

	public ReportCellInteger(int cellStyle, Integer value) {
		super(cellStyle, value);
	}

	@Override
	public Class<Integer> getTClass() {
		return Integer.class;
	}

	@Override
	public void addToValue(Number values[]) {
		if (values instanceof Integer[]) {
			Integer v = getValue();
			
			for (int i=0; i<values.length; i++) {
				if (values[i] != null) {
					v +=(Integer)values[i];
				}
			}
			
			setValue(v);
		}
	}

	@Override
	public Integer getDefaultValue() {
		return DEFAULT_VALUE;
	}
		
}
