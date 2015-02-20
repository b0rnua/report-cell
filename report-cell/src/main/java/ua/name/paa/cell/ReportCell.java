package ua.name.paa.cell;

public abstract class ReportCell<T> {

		private  int cellStyle;
		private T value;
		
		public abstract Class<T> getTClass();
		public abstract T getDefaultValue();
				
		public void setValue(T value) {
			this.value = value;
		}
		
		public T getValue() {
			if (value != null) {
				return value;
			} else {
				return getDefaultValue();
			}
		}
		
		public void setStyle(int cellStyle) {
			this.cellStyle = cellStyle;
		}
		
		public int getCellStyle() {
			return cellStyle;
		}

		public ReportCell(int cellStyle, T value) {
			super();
			this.cellStyle = cellStyle;
			this.value = value;

		}	
		
		public ReportCell() {
			super();
			this.value = this.getDefaultValue();
		}
		
		public ReportCell(int cellStyle) {
			super();
			this.cellStyle = cellStyle;
			this.value = this.getDefaultValue();
		}

		public abstract void addToValue(Number value[]);
		
		private static ReportCell<?> verifyReportCell(ReportCell<?> targetCell, ReportCell<?> instanceType) {
			if (targetCell == null) {
				targetCell = instanceType; 
			} else if (targetCell.getTClass() != instanceType.getTClass()) {
				targetCell = instanceType;
			}
			return targetCell;
		}
		
		public static ReportCell<?> addToValueWithVerify(ReportCell<?> targetCell, ReportCell<?> instanceType, Number values[]) {
			targetCell = verifyReportCell(targetCell, instanceType);
			targetCell.addToValue(values);
			return targetCell;	
		}
		
		
}
