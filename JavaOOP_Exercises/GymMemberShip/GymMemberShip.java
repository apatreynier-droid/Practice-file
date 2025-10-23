package GymMemberShip;

// Base class
class GymMembership {
    protected String memberName;
    protected String membershipType; 
    protected int duration; 

    public GymMembership(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    public double calculateMembershipFee() {
        double monthlyRate;

        switch (membershipType.toLowerCase()) {
            case "basic":
                monthlyRate = 800.0;
                break;
            case "standard":
                monthlyRate = 1200.0;
                break;
            case "premium":
                monthlyRate = 2000.0;
                break;
            default:
                monthlyRate = 1000.0;
        }

        return monthlyRate * duration;
    }

    public void checkSpecialOffers() {
        if (duration >= 12) {
            System.out.println("🎉 Special Offer: You get 1 month FREE for your annual membership!");
        } else if (duration >= 6) {
            System.out.println("🎉 Special Offer: 10% discount on next renewal!");
        } else {
            System.out.println("No special offers available for this plan.");
        }
    }

    public void displayMembershipDetails() {
        System.out.println("=== Gym Membership ===");
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Total Fee: ₱" + calculateMembershipFee());
    }
}

class PremiumMembership extends GymMembership {
    private boolean hasPersonalTrainer;
    private boolean hasSpaAccess;

    public PremiumMembership(String memberName, int duration, boolean hasPersonalTrainer, boolean hasSpaAccess) {
        super(memberName, "Premium", duration);
        this.hasPersonalTrainer = hasPersonalTrainer;
        this.hasSpaAccess = hasSpaAccess;
    }

    @Override
    public double calculateMembershipFee() {
        double baseFee = super.calculateMembershipFee();
        double extra = 0;

        if (hasPersonalTrainer) extra += 500.0 * duration;
        if (hasSpaAccess) extra += 300.0 * duration;

        return baseFee + extra;
    }

    @Override
    public void displayMembershipDetails() {
        System.out.println("=== Premium Gym Membership ===");
        System.out.println("Member Name: " + memberName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Personal Trainer: " + (hasPersonalTrainer ? "Yes" : "No"));
        System.out.println("Spa Access: " + (hasSpaAccess ? "Yes" : "No"));
        System.out.println("Total Fee: ₱" + calculateMembershipFee());
        checkSpecialOffers();
    }
}


