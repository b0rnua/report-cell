package ua.name.paa.cell;

import java.math.BigDecimal;

public class ReportCellDouble extends ReportCell<Double> {
	
	private static final Double DEFAULT_VALUE = 0.;

	public ReportCellDouble(int cellStyle, Double value) {
		super(cellStyle, value);
	}

	@Override
	public Class<Double> getTClass() {
		return Double.class;
	}

	@Override
	public void addToValue(Number[] values) {
		if (values instanceof Double[]) {
			Double v = getValue();
			
			for (int i=0; i<values.length; i++) {
				if (values[i] != null) {
					v +=(Double)values[i];
				}
			}
			
			setValue(new BigDecimal(v).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		}
	}

	@Override
	public Double getDefaultValue() {
		return DEFAULT_VALUE;
	}
	
}
