package entity1;


public class KYCVerification {
	private long aadharNumber;
	private String panNumber;
	private String documentType;
	private String documentNumber;
	
	public KYCVerification() {
		super();
	}
		// TODO Auto-generated constructor stub
		public  KYCVerification(long aadharNumber,String panNumber,String documentType,String documentNumber) {
			super();
			this.aadharNumber = aadharNumber;
			this.panNumber = panNumber ;
			this.documentType = documentType ;
			this.documentNumber = documentNumber;
		}
		public long getAadharNumber() {
			return aadharNumber;
		}
		public void setAadharNumber(long aadharNumber) {
			this.aadharNumber = aadharNumber;
		}
		public String getPanNumber() {
			return panNumber;
		}
		public void setPanNumber(String panNumber) {
			this.panNumber = panNumber;
		}
		public String getDocumentType() {
			return documentType;
		}
		public void setDocumentType(String documentType) {
			this.documentType = documentType;
		}
		public String getDocumentNumber() {
			return documentNumber;
		}
		public void setDocumentNumber(String documentNumber) {
			this.documentNumber = documentNumber;
		}
		@Override
		public String toString() 
		return "KYCVerification [aadharNumber="+aadharNumber+",panNumber="+panNumber+",documentType="+documentType+",documentNumber="+documentNumber];	
		}
       }
}