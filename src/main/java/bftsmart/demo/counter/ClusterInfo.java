package bftsmart.demo.counter;

import java.util.HashMap;

public class ClusterInfo {

    public int replicaCount = 4;
    public int totalCount = 8;

    public int nClusters = 0;

    public HashMap<Integer, Integer> clusterMap = new HashMap<Integer, Integer>();

    public HashMap<Integer, String> clusterNumberToFolderMap = new HashMap<Integer, String>();

    public HashMap<Integer, Integer> ServerNoToIntraClusterNumber = new HashMap<Integer, Integer>();

    public HashMap<Integer, Integer> NodeToLatency = new HashMap<Integer, Integer>();


    public ClusterInfo()
    {
        this.nClusters = totalCount/replicaCount;

        this.NodeToLatency.put(0, 0);
        this.NodeToLatency.put(1, 0);
        this.NodeToLatency.put(2, 0);
        this.NodeToLatency.put(3, 0);

        this.NodeToLatency.put(4, 0);
        this.NodeToLatency.put(5, 0);
        this.NodeToLatency.put(6, 0);
        this.NodeToLatency.put(7, 0);

        this.NodeToLatency.put(8, 0);
        this.NodeToLatency.put(9, 0);
        this.NodeToLatency.put(10, 0);
        this.NodeToLatency.put(11, 0);

        this.NodeToLatency.put(12, 0);
        this.NodeToLatency.put(13, 0);
        this.NodeToLatency.put(14, 0);
        this.NodeToLatency.put(15, 0);

        for (int i=0;i < this.nClusters; i++)
        {
            for (int j=0;j < this.replicaCount; j++)
            {
                this.clusterMap.put(i*this.replicaCount + j,i);
                this.ServerNoToIntraClusterNumber.put(i*this.replicaCount + j, j);

            }
        }

        for (int i=0;i < this.nClusters; i++)
        {
            for (int j=0;j < this.replicaCount; j++)
            {
                this.clusterNumberToFolderMap.put(i*this.replicaCount + j, "config" + Integer.toString(i));
            }
        }


    }

}
