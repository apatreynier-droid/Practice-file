package GymMemberShip;

public class GymMemberShipMain {
    public static void main(String[] args) {
        GymMembership basicMember = new GymMembership("Reynier Apat", "Standard", 6);
        basicMember.displayMembershipDetails();
        basicMember.checkSpecialOffers();

        System.out.println("\n--------------------------------\n");

        PremiumMembership premiumMember = new PremiumMembership("Maria Santos", 12, true, true);
        premiumMember.displayMembershipDetails();
    }
}