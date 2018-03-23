import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;

public class TablePartA {
    public static void main(String[] args) throws IOException {

        // Instantiating configuration class
        Configuration con = HBaseConfiguration.create();

        // Instantiating HbaseAdmin class
        HBaseAdmin admin = new HBaseAdmin(con);

        // Instantiating table descriptor class
        HTableDescriptor tableDescriptor = new
        HTableDescriptor(TableName.valueOf("emp"));

        // Adding column families to table descriptor
        tableDescriptor.addFamily(new HColumnDescriptor("personal"));
        tableDescriptor.addFamily(new HColumnDescriptor("professional"));

        // Execute the table through admin
        admin.createTable(tableDescriptor);
        System.out.println(" Table created ");
        
        
/*         Configuration con = HBaseConfiguration.create();
        HBaseAdmin admin = new HBaseAdmin(con);

        HTableDescriptor powers
            = new HTableDescriptor(TableName.valueOf("emp"));
        powers.addFamily(new HColumnDescriptor("personal"));
        powers.addFamily(new HColumnDescriptor("professional"));
        powers.addFamily(new HColumnDescriptor("custom"));
        admin.createTable(powers);
        
        HTableDescriptor food
            = new HTableDescriptor(TableName.valueOf("emp"));
        food.addFamily(new HColumnDescriptor("nutrition"));
        food.addFamily(new HColumnDescriptor("taste"));
        admin.createTable(food); */
    }
}

