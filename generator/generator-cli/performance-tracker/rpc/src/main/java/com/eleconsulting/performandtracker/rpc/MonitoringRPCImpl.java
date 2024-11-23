package com.eleconsulting.performancetracker.rpc;

import com.inductiveautomation.ignition.common.gateway.RPC;
import java.util.HashSet;
import java.util.Set;

public class MonitoringRPCImpl implements MonitoringRPC {
    private final Set<String> monitoredViews = new HashSet<>();

    @Override
    public void addViewToMonitoring(String viewPath) {
        monitoredViews.add(viewPath);
    }

    @Override
    public Set<String> getMonitoredViews() {
        return new HashSet<>(monitoredViews);
    }
}

