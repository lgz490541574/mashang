package com.mashang.common.utils;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class ThreadPoolUtils {

	/**
	 * 充值结算线程池
	 */
	private static ScheduledThreadPoolExecutor rechargeSettlementPool = new ScheduledThreadPoolExecutor(5);

	/**
	 * 已支付的商户订单线程池
	 */
	private static ScheduledThreadPoolExecutor paidMerchantOrderPool = new ScheduledThreadPoolExecutor(10);

	/**
	 * 登录日志线程池
	 */
	private static ScheduledThreadPoolExecutor loginLogPool = new ScheduledThreadPoolExecutor(4);

	private static ScheduledThreadPoolExecutor dispatchOrderPool = new ScheduledThreadPoolExecutor(8);

	private static ScheduledThreadPoolExecutor monthlyDeductionPool = new ScheduledThreadPoolExecutor(3);

	public static ScheduledThreadPoolExecutor getRechargeSettlementPool() {
		return rechargeSettlementPool;
	}

	public static ScheduledThreadPoolExecutor getPaidMerchantOrderPool() {
		return paidMerchantOrderPool;
	}

	public static ScheduledThreadPoolExecutor getLoginLogPool() {
		return loginLogPool;
	}

	public static ScheduledThreadPoolExecutor getDispatchOrderPool() {
		return dispatchOrderPool;
	}

	public static ScheduledThreadPoolExecutor getMonthlyDeductionPool() {
		return monthlyDeductionPool;
	}
}
