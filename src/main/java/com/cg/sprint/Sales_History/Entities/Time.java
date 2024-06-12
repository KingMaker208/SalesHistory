package com.cg.sprint.Sales_History.Entities;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "times")
public class Time {
	
	@Id
	@Column(name = "time_id")
	@Temporal(TemporalType.DATE)
	private Date timeId;
	@Column(name = "day_name", length = 9, nullable = false)
	private String dayName;
	@Column(name = "day_INT_in_week", nullable = false)
	private int dayINTInWeek;
	@Column(name = "day_INT_in_month", nullable = false)
	private int dayINTInMonth;
	@Column(name = "calendar_week_INT", nullable = false)
	private int calendarWeekINT;
	@Column(name = "fiscal_week_INT", nullable = false)
	private int fiscalWeekINT;
	@Column(name = "week_ending_day", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date weekEndingDay;
	@Column(name = "calendar_month_INT", nullable = false)
	private int calendarMonthINT;
	@Column(name = "fiscal_month_INT", nullable = false)
	private int fiscalMonthINT;
	@Column(name = "calendar_month_desc", length = 8, nullable = false)
	private String calendarMonthDesc;
	@Column(name = "calendar_month_id", nullable = false)
	private int calendarMonthId;
	@Column(name = "fiscal_month_desc", length = 8, nullable = false)
	private String fiscalMonthDesc;
	@Column(name = "fiscal_month_id", nullable = false)
	private int fiscalMonthId;
	@Column(name = "days_in_cal_month", nullable = false)
	private int daysInCalMonth;
	@Column(name = "days_in_fis_month", nullable = false)
	private int daysInFisMonth;
	@Column(name = "end_of_cal_month", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date endOfCalMonth;
	@Column(name = "end_of_fis_month", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date endOfFisMonth;
	@Column(name = "calendar_month_name", length = 9, nullable = false)
	private String calendarMonthName;
	@Column(name = "fiscal_month_name", length = 9, nullable = false)
	private String fiscalMonthName;
	@Column(name = "calendar_quarter_desc", length = 7, nullable = false)
	private String calendarQuarterDesc;
	@Column(name = "calendar_quarter_id", nullable = false)
	private int calendarQuarterId;
	@Column(name = "fiscal_quarter_desc", length = 7, nullable = false)
	private String fiscalQuarterDesc;
	@Column(name = "fiscal_quarter_id", nullable = false)
	private int fiscalQuarterId;
	@Column(name = "days_in_cal_quarter", nullable = false)
	private int daysInCalQuarter;
	@Column(name = "days_in_fis_quarter", nullable = false)
	private int daysInFisQuarter;
	@Column(name = "end_of_cal_quarter", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date endOfCalQuarter;
	@Column(name = "end_of_fis_quarter", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date endOfFisQuarter;
	@Column(name = "calendar_quarter_INT", nullable = false)
	private int calendarQuarterINT;
	@Column(name = "fiscal_quarter_INT", nullable = false)
	private int fiscalQuarterINT;
	@Column(name = "calendar_year", nullable = false)
	private int calendarYear;
	@Column(name = "calendar_year_id", nullable = false)
	private int calendar_year_id;
	@Column(name = "fiscal_year_id", nullable = false)
	private int fiscalYearId;
	@Column(name = "days_in_cal_year", nullable = false)
	private int daysInCalYear;
	@Column(name = "days_in_fis_year", nullable = false)
	private int daysInFisYear;
	@Column(name = "end_of_cal_year", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date endOfCalYear;
	@Column(name = "end_of_fis_year", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date endOfFisYear;
	public Date getTimeId() {
		return timeId;
	}
	public void setTimeId(Date timeId) {
		this.timeId = timeId;
	}
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	public int getDayINTInWeek() {
		return dayINTInWeek;
	}
	public void setDayINTInWeek(int dayINTInWeek) {
		this.dayINTInWeek = dayINTInWeek;
	}
	public int getDayINTInMonth() {
		return dayINTInMonth;
	}
	public void setDayINTInMonth(int dayINTInMonth) {
		this.dayINTInMonth = dayINTInMonth;
	}
	public int getCalendarWeekINT() {
		return calendarWeekINT;
	}
	public void setCalendarWeekINT(int calendarWeekINT) {
		this.calendarWeekINT = calendarWeekINT;
	}
	public int getFiscalWeekINT() {
		return fiscalWeekINT;
	}
	public void setFiscalWeekINT(int fiscalWeekINT) {
		this.fiscalWeekINT = fiscalWeekINT;
	}
	public Date getWeekEndingDay() {
		return weekEndingDay;
	}
	public void setWeekEndingDay(Date weekEndingDay) {
		this.weekEndingDay = weekEndingDay;
	}
	public int getCalendarMonthINT() {
		return calendarMonthINT;
	}
	public void setCalendarMonthINT(int calendarMonthINT) {
		this.calendarMonthINT = calendarMonthINT;
	}
	public int getFiscalMonthINT() {
		return fiscalMonthINT;
	}
	public void setFiscalMonthINT(int fiscalMonthINT) {
		this.fiscalMonthINT = fiscalMonthINT;
	}
	public String getCalendarMonthDesc() {
		return calendarMonthDesc;
	}
	public void setCalendarMonthDesc(String calendarMonthDesc) {
		this.calendarMonthDesc = calendarMonthDesc;
	}
	public int getCalendarMonthId() {
		return calendarMonthId;
	}
	public void setCalendarMonthId(int calendarMonthId) {
		this.calendarMonthId = calendarMonthId;
	}
	public String getFiscalMonthDesc() {
		return fiscalMonthDesc;
	}
	public void setFiscalMonthDesc(String fiscalMonthDesc) {
		this.fiscalMonthDesc = fiscalMonthDesc;
	}
	public int getFiscalMonthId() {
		return fiscalMonthId;
	}
	public void setFiscalMonthId(int fiscalMonthId) {
		this.fiscalMonthId = fiscalMonthId;
	}
	public int getDaysInCalMonth() {
		return daysInCalMonth;
	}
	public void setDaysInCalMonth(int daysInCalMonth) {
		this.daysInCalMonth = daysInCalMonth;
	}
	public int getDaysInFisMonth() {
		return daysInFisMonth;
	}
	public void setDaysInFisMonth(int daysInFisMonth) {
		this.daysInFisMonth = daysInFisMonth;
	}
	public Date getEndOfCalMonth() {
		return endOfCalMonth;
	}
	public void setEndOfCalMonth(Date endOfCalMonth) {
		this.endOfCalMonth = endOfCalMonth;
	}
	public Date getEndOfFisMonth() {
		return endOfFisMonth;
	}
	public void setEndOfFisMonth(Date endOfFisMonth) {
		this.endOfFisMonth = endOfFisMonth;
	}
	public String getCalendarMonthName() {
		return calendarMonthName;
	}
	public void setCalendarMonthName(String calendarMonthName) {
		this.calendarMonthName = calendarMonthName;
	}
	public String getFiscalMonthName() {
		return fiscalMonthName;
	}
	public void setFiscalMonthName(String fiscalMonthName) {
		this.fiscalMonthName = fiscalMonthName;
	}
	public String getCalendarQuarterDesc() {
		return calendarQuarterDesc;
	}
	public void setCalendarQuarterDesc(String calendarQuarterDesc) {
		this.calendarQuarterDesc = calendarQuarterDesc;
	}
	public int getCalendarQuarterId() {
		return calendarQuarterId;
	}
	public void setCalendarQuarterId(int calendarQuarterId) {
		this.calendarQuarterId = calendarQuarterId;
	}
	public String getFiscalQuarterDesc() {
		return fiscalQuarterDesc;
	}
	public void setFiscalQuarterDesc(String fiscalQuarterDesc) {
		this.fiscalQuarterDesc = fiscalQuarterDesc;
	}
	public int getFiscalQuarterId() {
		return fiscalQuarterId;
	}
	public void setFiscalQuarterId(int fiscalQuarterId) {
		this.fiscalQuarterId = fiscalQuarterId;
	}
	public int getDaysInCalQuarter() {
		return daysInCalQuarter;
	}
	public void setDaysInCalQuarter(int daysInCalQuarter) {
		this.daysInCalQuarter = daysInCalQuarter;
	}
	public int getDaysInFisQuarter() {
		return daysInFisQuarter;
	}
	public void setDaysInFisQuarter(int daysInFisQuarter) {
		this.daysInFisQuarter = daysInFisQuarter;
	}
	public Date getEndOfCalQuarter() {
		return endOfCalQuarter;
	}
	public void setEndOfCalQuarter(Date endOfCalQuarter) {
		this.endOfCalQuarter = endOfCalQuarter;
	}
	public Date getEndOfFisQuarter() {
		return endOfFisQuarter;
	}
	public void setEndOfFisQuarter(Date endOfFisQuarter) {
		this.endOfFisQuarter = endOfFisQuarter;
	}
	public int getCalendarQuarterINT() {
		return calendarQuarterINT;
	}
	public void setCalendarQuarterINT(int calendarQuarterINT) {
		this.calendarQuarterINT = calendarQuarterINT;
	}
	public int getFiscalQuarterINT() {
		return fiscalQuarterINT;
	}
	public void setFiscalQuarterINT(int fiscalQuarterINT) {
		this.fiscalQuarterINT = fiscalQuarterINT;
	}
	public int getCalendarYear() {
		return calendarYear;
	}
	public void setCalendarYear(int calendarYear) {
		this.calendarYear = calendarYear;
	}
	public int getCalendar_year_id() {
		return calendar_year_id;
	}
	public void setCalendar_year_id(int calendar_year_id) {
		this.calendar_year_id = calendar_year_id;
	}
	public int getFiscalYearId() {
		return fiscalYearId;
	}
	public void setFiscalYearId(int fiscalYearId) {
		this.fiscalYearId = fiscalYearId;
	}
	public int getDaysInCalYear() {
		return daysInCalYear;
	}
	public void setDaysInCalYear(int daysInCalYear) {
		this.daysInCalYear = daysInCalYear;
	}
	public int getDaysInFisYear() {
		return daysInFisYear;
	}
	public void setDaysInFisYear(int daysInFisYear) {
		this.daysInFisYear = daysInFisYear;
	}
	public Date getEndOfCalYear() {
		return endOfCalYear;
	}
	public void setEndOfCalYear(Date endOfCalYear) {
		this.endOfCalYear = endOfCalYear;
	}
	public Date getEndOfFisYear() {
		return endOfFisYear;
	}
	public void setEndOfFisYear(Date endOfFisYear) {
		this.endOfFisYear = endOfFisYear;
	}
	public Time(Date timeId, String dayName, int dayINTInWeek, int dayINTInMonth, int calendarWeekINT,
			int fiscalWeekINT, Date weekEndingDay, int calendarMonthINT, int fiscalMonthINT, String calendarMonthDesc,
			int calendarMonthId, String fiscalMonthDesc, int fiscalMonthId, int daysInCalMonth, int daysInFisMonth,
			Date endOfCalMonth, Date endOfFisMonth, String calendarMonthName, String fiscalMonthName,
			String calendarQuarterDesc, int calendarQuarterId, String fiscalQuarterDesc, int fiscalQuarterId,
			int daysInCalQuarter, int daysInFisQuarter, Date endOfCalQuarter, Date endOfFisQuarter,
			int calendarQuarterINT, int fiscalQuarterINT, int calendarYear, int calendar_year_id, int fiscalYearId,
			int daysInCalYear, int daysInFisYear, Date endOfCalYear, Date endOfFisYear) {
		super();
		this.timeId = timeId;
		this.dayName = dayName;
		this.dayINTInWeek = dayINTInWeek;
		this.dayINTInMonth = dayINTInMonth;
		this.calendarWeekINT = calendarWeekINT;
		this.fiscalWeekINT = fiscalWeekINT;
		this.weekEndingDay = weekEndingDay;
		this.calendarMonthINT = calendarMonthINT;
		this.fiscalMonthINT = fiscalMonthINT;
		this.calendarMonthDesc = calendarMonthDesc;
		this.calendarMonthId = calendarMonthId;
		this.fiscalMonthDesc = fiscalMonthDesc;
		this.fiscalMonthId = fiscalMonthId;
		this.daysInCalMonth = daysInCalMonth;
		this.daysInFisMonth = daysInFisMonth;
		this.endOfCalMonth = endOfCalMonth;
		this.endOfFisMonth = endOfFisMonth;
		this.calendarMonthName = calendarMonthName;
		this.fiscalMonthName = fiscalMonthName;
		this.calendarQuarterDesc = calendarQuarterDesc;
		this.calendarQuarterId = calendarQuarterId;
		this.fiscalQuarterDesc = fiscalQuarterDesc;
		this.fiscalQuarterId = fiscalQuarterId;
		this.daysInCalQuarter = daysInCalQuarter;
		this.daysInFisQuarter = daysInFisQuarter;
		this.endOfCalQuarter = endOfCalQuarter;
		this.endOfFisQuarter = endOfFisQuarter;
		this.calendarQuarterINT = calendarQuarterINT;
		this.fiscalQuarterINT = fiscalQuarterINT;
		this.calendarYear = calendarYear;
		this.calendar_year_id = calendar_year_id;
		this.fiscalYearId = fiscalYearId;
		this.daysInCalYear = daysInCalYear;
		this.daysInFisYear = daysInFisYear;
		this.endOfCalYear = endOfCalYear;
		this.endOfFisYear = endOfFisYear;
	}
	public Time() {
		super();
	}
	@Override
	public String toString() {
		return "Time [timeId=" + timeId + ", dayName=" + dayName + ", dayINTInWeek=" + dayINTInWeek + ", dayINTInMonth="
				+ dayINTInMonth + ", calendarWeekINT=" + calendarWeekINT + ", fiscalWeekINT=" + fiscalWeekINT
				+ ", weekEndingDay=" + weekEndingDay + ", calendarMonthINT=" + calendarMonthINT + ", fiscalMonthINT="
				+ fiscalMonthINT + ", calendarMonthDesc=" + calendarMonthDesc + ", calendarMonthId=" + calendarMonthId
				+ ", fiscalMonthDesc=" + fiscalMonthDesc + ", fiscalMonthId=" + fiscalMonthId + ", daysInCalMonth="
				+ daysInCalMonth + ", daysInFisMonth=" + daysInFisMonth + ", endOfCalMonth=" + endOfCalMonth
				+ ", endOfFisMonth=" + endOfFisMonth + ", calendarMonthName=" + calendarMonthName + ", fiscalMonthName="
				+ fiscalMonthName + ", calendarQuarterDesc=" + calendarQuarterDesc + ", calendarQuarterId="
				+ calendarQuarterId + ", fiscalQuarterDesc=" + fiscalQuarterDesc + ", fiscalQuarterId="
				+ fiscalQuarterId + ", daysInCalQuarter=" + daysInCalQuarter + ", daysInFisQuarter=" + daysInFisQuarter
				+ ", endOfCalQuarter=" + endOfCalQuarter + ", endOfFisQuarter=" + endOfFisQuarter
				+ ", calendarQuarterINT=" + calendarQuarterINT + ", fiscalQuarterINT=" + fiscalQuarterINT
				+ ", calendarYear=" + calendarYear + ", calendar_year_id=" + calendar_year_id + ", fiscalYearId="
				+ fiscalYearId + ", daysInCalYear=" + daysInCalYear + ", daysInFisYear=" + daysInFisYear
				+ ", endOfCalYear=" + endOfCalYear + ", endOfFisYear=" + endOfFisYear + "]";
	}
	
	
}
