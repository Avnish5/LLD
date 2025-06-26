package z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AuctionBidder.Mediator;

import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AuctionBidder.Colleague.Bidder;

public interface AuctionMediator {
    void registerBidder(Bidder bidder);
    void placeBid(Bidder bidder, double amount);
    double getHighestBid();
    Bidder getHigjestBidder();

}
