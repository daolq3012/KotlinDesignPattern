package structural.facade

import java.sql.Connection

/**
 * Created by framgia on 05/07/2017.
 */
object Facade {
    @JvmStatic fun main(args: Array<String>) {
        val tableName = "Employee"

        // generating MySQL HTML report and Oracle PDF report without using facade
        val mySqlCon: Connection? = MySqlHelper.getMySqlDBConnection()
        val mySqlHelper: MySqlHelper = MySqlHelper()
        mySqlHelper.generateMySqlHTMLReport(mySqlCon, tableName)
        val oracleCon: Connection? = OracleHelper.oracleDbConnection
        val oracleHelper: OracleHelper = OracleHelper()
        oracleHelper.generateOraclePDFReport(oracleCon, tableName)

        // generating MYSQL HTML report and oracle PDF report using facade
        HelperFacade.generateReport(DBType.MYSQL, ReportTypes.HTML, tableName)
        HelperFacade.generateReport(DBType.ORACLE, ReportTypes.PDF, tableName)
    }
}
