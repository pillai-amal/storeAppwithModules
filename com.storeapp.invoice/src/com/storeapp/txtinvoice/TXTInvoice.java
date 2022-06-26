package com.storeapp.txtinvoice;

import java.time.LocalTime;

import com.storeapp.invoice.InvoiceService;

public class TXTInvoice implements InvoiceService {

	@Override
	public String raiseInvoice(float amount) {
		return "Text invoice generated at : " + LocalTime.now() + " with amount : " + amount;
	}

}
