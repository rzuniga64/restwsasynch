package com.restws.restwsasynch;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.container.AsyncResponse;

import org.springframework.stereotype.Service;

import com.restws.model.ChecksList;

@Service
public class CheckProcessorImpl implements CheckProcessor {

	@Override
	public void processChecks(AsyncResponse response, ChecksList checksList) {
		// logic
		new Thread() {
			public void run() {
				if (checksList == null || checksList.getChecks() == null || checksList.getChecks().size() == 0) {
					response.resume(new BadRequestException());
				}
				System.out.println("true");
				response.resume(true);
			}
		}.start();
	}
}
