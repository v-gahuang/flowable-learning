package com.ghuang.listener;

import lombok.extern.slf4j.Slf4j;
import org.flowable.common.engine.api.delegate.event.FlowableEngineEventType;
import org.flowable.common.engine.api.delegate.event.FlowableEvent;
import org.flowable.common.engine.api.delegate.event.FlowableEventListener;
import org.flowable.variable.api.types.VariableType;
import org.flowable.variable.service.event.impl.FlowableVariableEventImpl;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SponsorSelectedEventListener implements FlowableEventListener {
    @Override
    public void onEvent(FlowableEvent event) {

        log.info("FOSponsorSelectedEventListener Invoked!");
        if(event.getType() == FlowableEngineEventType.VARIABLE_CREATED) {

            FlowableVariableEventImpl variableEvent = (FlowableVariableEventImpl)event;
            String varName = variableEvent.getVariableName();
            Object varValue = variableEvent.getVariableValue();
            VariableType varType = variableEvent.getVariableType();
            log.info("Variable {} was created with value:{}.",varName, varValue);
        } else if (event.getType() == FlowableEngineEventType.VARIABLE_UPDATED) {
            FlowableVariableEventImpl variableEvent = (FlowableVariableEventImpl)event;
            String varName = variableEvent.getVariableName();
            Object varValue = variableEvent.getVariableValue();
            VariableType varType = variableEvent.getVariableType();
            log.info("Variable {} was created with value:{}.",varName, varValue);
        } else {
            log.info("Event received: {}", event.getType());
        }

    }

    @Override
    public boolean isFailOnException() {
        return false;
    }

    @Override
    public boolean isFireOnTransactionLifecycleEvent() {
        return false;
    }

    @Override
    public String getOnTransaction() {
        return null;
    }
}
