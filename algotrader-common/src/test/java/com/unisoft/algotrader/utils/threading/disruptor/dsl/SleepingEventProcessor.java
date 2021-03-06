package com.unisoft.algotrader.utils.threading.disruptor.dsl;

import com.unisoft.algotrader.model.event.Event;
import com.unisoft.algotrader.utils.threading.disruptor.MultiEventProcessor;

/**
 * Created by alex on 6/11/15.
 */
public class SleepingEventProcessor extends MultiEventProcessor {

    @Override
    public void onEvent(Event event) {
        try {
            Thread.sleep(1000);
        }
        catch (Exception e){}
    }
}
