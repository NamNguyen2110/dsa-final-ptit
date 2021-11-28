package dekiemtralan2.bai5;

import java.util.*;

public class MonHoc {
    static class TransLog {
        private String plxId;
        private String transId;

        public TransLog(String a, String b) {
            this.plxId = a;
            this.transId = b;
        }

        public String getPlxId() {
            return plxId;
        }

        public void setPlxId(String plxId) {
            this.plxId = plxId;
        }

        public String getTransId() {
            return transId;
        }

        public void setTransId(String transId) {
            this.transId = transId;
        }

        @Override
        public String toString() {
            return "test{" +
                    "a='" + plxId + '\'' +
                    ", b='" + transId + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<TransLog> list = Arrays.asList(
                new TransLog("125", "162"),
                new TransLog("125", "6841"),
                new TransLog("125", "2959"),
                new TransLog("351", "231"),
                new TransLog("351", "232"),
                new TransLog("351", "222")
        );
        Set<TransLog> transLogs = new HashSet<>(list);
        transLogs.forEach(System.out::println);
//        Map<String, String> map = new HashMap<>();
//        list.forEach(transLog -> {
//            map.put(transLog.plxId, transLog.transId);
//        });
//        System.out.println(map);
    }

}
