package z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AuctionBidder.Mediator;

import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AuctionBidder.Colleague.Bidder;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediatorImpl implements AuctionMediator{

    List<Bidder> bidders = new ArrayList<>();
    private double highestBid = 0.0;
    private Bidder highestBidder = null;

    @Override
    public void registerBidder(Bidder bidder) {
           if (!bidders.contains(bidder)) {
               bidders.add(bidder);
               bidder.setMediator(this);
               System.out.println("Bidder " + bidder.getName() + " registered.");
           }
    }

    @Override
    public void placeBid(Bidder bidder, double amount) {
           if (amount > highestBid) {
               highestBid = amount;
               highestBidder = bidder;
               System.out.println(bidder.getName() + " placed the highest bid: $" + amount);
           } else {
               System.out.println(bidder.getName() + "'s bid of $" + amount + " is too low. Current highest bid is $" + highestBid);
           }
    }

    @Override
    public double getHighestBid() {
        return highestBid;
    }

    @Override
    public Bidder getHigjestBidder() {
        return highestBidder;
    }
}
