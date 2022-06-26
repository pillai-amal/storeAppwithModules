package com.storeapp.invoice;

import java.time.LocalDate;

public class HTMLInvoice implements InvoiceService {
	@Override
	public String raiseInvoice(float amount) {
		return "HTML Inovice raised on : " + LocalDate.now() + " . And it amounts to :  " + amount;
	}
}
