/*
 This file is generated by Code Generator
 for CIMClass SAP_ITSAMTransactionStatisticsData
 WARNING:DO NOT CHANGE THE CODE MANUALLY
 */

package com.sap.engine.services.ts.mbeans;

/* 
 ManagedElement is an abstract class that provides a common superclass (or top of the inheritance tree) for the non-association classes in the CIM Schema. 
 @version 3.3	
 */

public class SAP_ITSAMTransactionStatisticsData {

	private String Name = null;

	private long PendingTxCount = 0;

	private long TotalCompletedTx = 0;

	private long TotalCommittedTx = 0;

	private long TotalRollbackedTx = 0;

	private long ActiveTxCount = 0;

	private long SuspendedTxCount = 0;

	private long TxWithHeuristicOutcomesCount = 0;

	private long TxPassedAbandonTimeout = 0;

	private long TxRollbackedByApplication = 0;

	private long TxRollbackedBecauseRMError = 0;

	private long TimeoutedTxCount = 0;

	private int AverageCommitTime = 0;

	private com.sap.engine.services.ts.mbeans.SAP_ITSAMJ2eeActionStatus ActionStatus;

	private long NotRecoveredTxCount = 0;

	private String Caption = null;

	private String Description = null;

	private String ElementName = null;

	public SAP_ITSAMTransactionStatisticsData() {

	}

	public SAP_ITSAMTransactionStatisticsData(String Name, long PendingTxCount,
			long TotalCompletedTx, long TotalCommittedTx,
			long TotalRollbackedTx, long ActiveTxCount, long SuspendedTxCount,
			long TxWithHeuristicOutcomesCount, long TxPassedAbandonTimeout,
			long TxRollbackedByApplication, long TxRollbackedBecauseRMError,
			long TimeoutedTxCount, int AverageCommitTime,
			long NotRecoveredTxCount, String Caption, String Description,
			String ElementName) {

		this.Name = Name;

		this.PendingTxCount = PendingTxCount;

		this.TotalCompletedTx = TotalCompletedTx;

		this.TotalCommittedTx = TotalCommittedTx;

		this.TotalRollbackedTx = TotalRollbackedTx;

		this.ActiveTxCount = ActiveTxCount;

		this.SuspendedTxCount = SuspendedTxCount;

		this.TxWithHeuristicOutcomesCount = TxWithHeuristicOutcomesCount;

		this.TxPassedAbandonTimeout = TxPassedAbandonTimeout;

		this.TxRollbackedByApplication = TxRollbackedByApplication;

		this.TxRollbackedBecauseRMError = TxRollbackedBecauseRMError;

		this.TimeoutedTxCount = TimeoutedTxCount;

		this.AverageCommitTime = AverageCommitTime;

		this.NotRecoveredTxCount = NotRecoveredTxCount;

		this.Caption = Caption;

		this.Description = Description;

		this.ElementName = ElementName;

	}

	/*
	 * 
	 * @return String
	 */
	public String getName() {
		return this.Name;
	}

	/*
	 * Description Missing
	 * 
	 * @return long
	 */
	public long getPendingTxCount() {
		return this.PendingTxCount;
	}

	/*
	 * 
	 * @return long
	 */
	public long getTotalCompletedTx() {
		return this.TotalCompletedTx;
	}

	/*
	 * 
	 * @return long
	 */
	public long getTotalCommittedTx() {
		return this.TotalCommittedTx;
	}

	/*
	 * 
	 * @return long
	 */
	public long getTotalRollbackedTx() {
		return this.TotalRollbackedTx;
	}

	/*
	 * 
	 * @return long
	 */
	public long getActiveTxCount() {
		return this.ActiveTxCount;
	}

	/*
	 * Description Missing
	 * 
	 * @return long
	 */
	public long getSuspendedTxCount() {
		return this.SuspendedTxCount;
	}

	/*
	 * 
	 * @return long
	 */
	public long getTxWithHeuristicOutcomesCount() {
		return this.TxWithHeuristicOutcomesCount;
	}

	/*
	 * 
	 * @return long
	 */
	public long getTxPassedAbandonTimeout() {
		return this.TxPassedAbandonTimeout;
	}

	/*
	 * 
	 * @return long
	 */
	public long getTxRollbackedByApplication() {
		return this.TxRollbackedByApplication;
	}

	/*
	 * =TxRollbackedBecaouseRMError:uint64
	 * 
	 * @return long
	 */
	public long getTxRollbackedBecauseRMError() {
		return this.TxRollbackedBecauseRMError;
	}

	/*
	 * 
	 * @return long
	 */
	public long getTimeoutedTxCount() {
		return this.TimeoutedTxCount;
	}

	/*
	 * 
	 * @return int
	 */
	public int getAverageCommitTime() {
		return this.AverageCommitTime;
	}

	/*
	 * Description Missing
	 * 
	 * @return com.sap.engine.services.ts.mbeans.SAP_ITSAMJ2eeActionStatus
	 */
	public com.sap.engine.services.ts.mbeans.SAP_ITSAMJ2eeActionStatus getActionStatus() {
		return this.ActionStatus;
	}

	/*
	 * @param com.sap.engine.services.ts.mbeans.SAP_ITSAMJ2eeActionStatus
	 */
	public void setActionStatus(
			com.sap.engine.services.ts.mbeans.SAP_ITSAMJ2eeActionStatus ActionStatus) {
		this.ActionStatus = ActionStatus;
	}

	/*
	 * Description Missing
	 * 
	 * @return long
	 */
	public long getNotRecoveredTxCount() {
		return this.NotRecoveredTxCount;
	}

	/*
	 * The Caption property is a short textual description (one- line string) of
	 * the object.
	 * 
	 * @return String
	 */
	public String getCaption() {
		return this.Caption;
	}

	/*
	 * The Description property provides a textual description of the object.
	 * 
	 * @return String
	 */
	public String getDescription() {
		return this.Description;
	}

	/*
	 * A user-friendly name for the object. This property allows each instance
	 * to define a user-friendly name IN ADDITION TO its key properties/identity
	 * data, and description information. Note that ManagedSystemElement's Name
	 * property is also defined as a user-friendly name. But, it is often
	 * subclassed to be a Key. It is not reasonable that the same property can
	 * convey both identity and a user friendly name, without inconsistencies.
	 * Where Name exists and is not a Key (such as for instances of
	 * LogicalDevice), the same information MAY be present in both the Name and
	 * ElementName properties.
	 * 
	 * @return String
	 */
	public String getElementName() {
		return this.ElementName;
	}

}
