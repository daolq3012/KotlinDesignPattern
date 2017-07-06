package com.fstyle.java_design_pattern.structural.facade

import java.sql.Connection

/**
 * Created by framgia on 05/07/2017.
 */
class MySqlHelper {

  companion object {
    fun getMySqlDBConnection(): Connection? {
      // get MySql DB connection using connection parameters
      return null
    }
  }

  fun generateMySqlPDFReport(con: Connection?,tableName: String) {
    // get data from table and generate pdf report
  }

  fun generateMySqlHTMLReport(con: Connection?,tableName: String) {
    // get data from table and generate pdf report
  }
}
