package com.singleton;

public class Singleton {

	private static final Singleton INSTANCE = new Singleton();/*
																 * this is Eager initialization, it is initialized
																 * without client request(bad practice) and this will
																 * not have try catch exception handling, while getting the
																 * instance by getInstance
																 */

	private Singleton() {

	}

	public static Singleton getInstance() {

		return INSTANCE;

	}

}
