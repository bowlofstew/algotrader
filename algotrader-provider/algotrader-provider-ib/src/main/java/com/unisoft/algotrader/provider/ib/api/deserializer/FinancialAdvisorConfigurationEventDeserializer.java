package com.unisoft.algotrader.provider.ib.api.deserializer;

import com.unisoft.algotrader.provider.ib.api.IBSession;
import com.unisoft.algotrader.provider.ib.api.IncomingMessageId;

import java.io.InputStream;

import static com.unisoft.algotrader.provider.ib.api.InputStreamUtils.readInt;
import static com.unisoft.algotrader.provider.ib.api.InputStreamUtils.readString;

/**
 * Created by alex on 8/13/15.
 */
public class FinancialAdvisorConfigurationEventDeserializer extends Deserializer {


    public FinancialAdvisorConfigurationEventDeserializer(){
        super(IncomingMessageId.FINANCIAL_ADVISOR_CONFIGURATION);
    }

    @Override
    public void consumeVersionLess(final int version, final InputStream inputStream, final IBSession ibSession) {
        final int dataType = readInt(inputStream);
        final String xml = readString(inputStream);
        ibSession.onFinancialAdvisorConfiguration(dataType, xml);
    }
}