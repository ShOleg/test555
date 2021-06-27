package ru.sholeg.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 * 
 * 7777777777777777777777777
 * 
 * 
 */
public interface GreetingServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback) throws IllegalArgumentException;
}
