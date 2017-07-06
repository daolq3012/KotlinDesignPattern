package structural.facade

import java.sql.Connection

/**
 * Created by framgia on 05/07/2017.
 */
class OracleHelper {

    companion object {
        val oracleDbConnection: Connection?
            get() = null
    }

    fun generateOraclePDFReport(con: Connection?, tableName: String) {
        // get data from table and generate pdf report
    }

    fun generateOraclelHTMLReport(con: Connection?, tableName: String) {
        // get data from table and generate pdf report
    }
}
