package com.storeapp.invoice;

import java.time.LocalDate;

public class PDFInvoice implements InvoiceService {
	@Override
	public String raiseInvoice(float amount) {
		return "PDF Inovice raised on : " + LocalDate.now() + " . And it amounts to :  " + amount;
	}
}
