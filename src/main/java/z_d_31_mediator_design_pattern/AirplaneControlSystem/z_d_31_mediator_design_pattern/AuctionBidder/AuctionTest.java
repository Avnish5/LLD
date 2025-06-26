package z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AuctionBidder;

import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AuctionBidder.Colleague.Bidder;
import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AuctionBidder.Colleague.BidderImpl;
import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AuctionBidder.Mediator.AuctionMediator;
import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AuctionBidder.Mediator.AuctionMediatorImpl;



        public class AuctionTest {
            public static void main(String[] args) {
                AuctionMediator mediator = new AuctionMediatorImpl();

                Bidder alice = new BidderImpl("Alice");
                Bidder bob = new BidderImpl("Bob");
                Bidder charlie = new BidderImpl("Charlie");

                mediator.registerBidder(alice);
                mediator.registerBidder(bob);
                mediator.registerBidder(charlie);

                alice.placeBid(100);
                bob.placeBid(150);
                charlie.placeBid(120);
                alice.placeBid(200);

                System.out.println("Auction ended. Highest bid: $" + mediator.getHighestBid() +
                        " by " + mediator.getHigjestBidder().getName());
            }
        }


