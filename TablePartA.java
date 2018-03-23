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
        Configuration con = HBaseConfiguration.create();
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
        admin.createTable(food);
    }
}

