package Assignmentinterfaces;

import Assignmentinterfaces.Airfare;


	public class Indigo implements Airfare {
	    private int hours;
	    private double costPerHour;

	    // Default constructor
	    public Indigo() {
	        this.hours = 1;
	        this.costPerHour = 1200.0;
	    }

	    // Parameterized constructor
	    public Indigo(int hours, double costPerHour) {
	        this.hours = hours;
	        this.costPerHour = costPerHour;
	    }

	    // Getters
	    public int getHours() {
	        return hours;
	    }

	    public double getCostPerHour() {
	        return costPerHour;
	    }

	    // Setters
	    public void setHours(int hours) {
	        this.hours = hours;
	    }

	    public void setCostPerHour(double costPerHour) {
	        this.costPerHour = costPerHour;
	    }

	    // Implementing method from Airfare interface
	    public double calculateAmount() {
	        return hours * costPerHour * 8;
	    }
	}



