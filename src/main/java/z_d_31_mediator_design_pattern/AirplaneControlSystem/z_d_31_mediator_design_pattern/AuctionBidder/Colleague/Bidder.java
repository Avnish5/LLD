package z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AuctionBidder.Colleague;

import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AuctionBidder.Mediator.AuctionMediator;

public interface Bidder {

    void setMediator(AuctionMediator mediator);
    void placeBid(double amount);
    String getName();
}
