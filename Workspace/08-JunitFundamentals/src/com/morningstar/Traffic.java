package com.morningstar;



public class Traffic {

	public static String main(String args) {

		String color = args.toLowerCase();

		switch (color) {

		case "red": {

			return "Stop";
		}
		case "green": {

			return "Go";
		}
		case "yellow": {

			return "Ready";
		}
		default: {

			return null;
		}
		}

	}

}
