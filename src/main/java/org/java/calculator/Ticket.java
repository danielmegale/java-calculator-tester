package org.java.calculator;

public class Ticket {
    private static final double PRICE_PER_KM = 0.21;
    private static final double DISCOUNT_MINOR = 0.20;
    private static final double DISCOUNT_SENIOR = 0.40;

    private int distanceInKm;
    private int passengerAge;

    public Ticket(int distanceInKm, int passengerAge) throws Exception {
        setDistanceInKm(distanceInKm);
        setPassengerAge(passengerAge);
    }

    public double calculatePrice() {
        double basePrice = distanceInKm * PRICE_PER_KM;

        System.out.println("Base Price: " + basePrice);

        if (passengerAge < 18) {
            double discount = basePrice * DISCOUNT_MINOR;
            System.out.println("Discount Applied: " + discount);
            basePrice= basePrice - discount;
        } else if (passengerAge >= 65) {
            double discount = basePrice * DISCOUNT_SENIOR;
            System.out.println("Discount Applied: " + discount);
            basePrice= basePrice - discount;
        }
            return basePrice;
    }

	public int getDistanceInKm() {
		return distanceInKm;
	}

	public void setDistanceInKm(int distanceInKm) throws Exception {
		if(distanceInKm <=0) {
			throw new Exception("I Km non posso essere negativi");
		}
		this.distanceInKm = distanceInKm;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) throws Exception {
		if(passengerAge <=0) {
			throw new Exception("l'età non puo essere negativi");
		}
		this.passengerAge = passengerAge;
	}
}

