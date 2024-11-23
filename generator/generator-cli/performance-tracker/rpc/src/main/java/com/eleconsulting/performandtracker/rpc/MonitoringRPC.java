package com.eleconsulting.performancetracker.rpc;

import com.inductiveautomation.ignition.common.gateway.RPC;

import java.util.Set;

public interface MonitoringRPC extends RPC {
    void addViewToMonitoring(String viewPath);
    Set<String> getMonitoredViews();
}
