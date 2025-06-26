package z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AuctionBidder.Colleague;

import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AuctionBidder.Mediator.AuctionMediator;

public class BidderImpl implements Bidder{

    private String name;
    private AuctionMediator mediator;

    public BidderImpl(String name) {
        this.name = name;
    }

    @Override
    public void setMediator(AuctionMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void placeBid(double amount) {
        System.out.println(name + " attempts to bid $" + amount);
        mediator.placeBid(this, amount);
    }

    @Override
    public String getName() {
        return name;
    }
}
