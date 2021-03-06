package com.unisoft.algotrader.provider.ib.api.event;


import com.unisoft.algotrader.model.event.execution.Order;
import com.unisoft.algotrader.model.refdata.Instrument;
import com.unisoft.algotrader.provider.ib.api.model.order.OrderExecution;

/**
 * Created by alex on 8/26/15.
 */
public class RetrieveOpenOrderEvent extends IBEvent<RetrieveOpenOrderEvent>  {

    public final Instrument instrument;
    public final Order order;
    public final OrderExecution orderExecution;

    public RetrieveOpenOrderEvent(final long requestId, final Instrument instrument,
                                  final Order order, final OrderExecution orderExecution){
        super(requestId);
        this.instrument = instrument;
        this.order = order;
        this.orderExecution = orderExecution;
    }

    @Override
    public void on(IBEventHandler handler) {
        handler.onRetrieveOpenOrderEvent(this);
    }

    @Override
    public String toString() {
        return "RetrieveOpenOrderEvent{" +
                "instrument=" + instrument +
                ", order=" + order +
                ", orderExecution=" + orderExecution +
                "} " + super.toString();
    }
}