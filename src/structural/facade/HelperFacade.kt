package com.fstyle.java_design_pattern.structural.facade

import java.sql.Connection

/**
 * Created by framgia on 05/07/2017.
 */
object HelperFacade {
  fun generateReport(dbType: DBType, reportTypes: ReportTypes, tableName: String) {
    var con: Connection?
    when (dbType) {
      DBType.MYSQL -> {
        con = MySqlHelper.getMySqlDBConnection()
        val mySqlHelper = MySqlHelper()
        when (reportTypes) {
          ReportTypes.HTML -> {
            mySqlHelper.generateMySqlHTMLReport(con, tableName)
          }
          ReportTypes.PDF -> {
            mySqlHelper.generateMySqlPDFReport(con, tableName)
          }
        }
      }

      DBType.ORACLE -> {
        con = OracleHelper.oracleDbConnection
        val oracleHelper = OracleHelper()
        when (reportTypes) {
          ReportTypes.HTML -> {
            oracleHelper.generateOraclelHTMLReport(con, tableName)
          }
          ReportTypes.PDF -> {
            oracleHelper.generateOraclelHTMLReport(con, tableName)
          }
        }
      }
    }
  }
}
