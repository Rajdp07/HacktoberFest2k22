#include<iostream>
#include<vector>
#include<set>
#define INF 1e7
using namespace std;


int dijikstra(vector<vector<pair<int,int>>>&adj, int src, int dest, int n)
{
    vector<int>dist(n,INF);
    dist[src]=0;
    set<pair<int,int>>s;
    s.insert({0,src});

 
   while(!s.empty())
    {
        pair<int,int> finalised=*s.begin();
        int finalisedNode=finalised.second;
        
        s.erase(s.begin());
        for(int i=0;i<adj[finalisedNode].size();i++)
        {
            int nextNode=adj[finalisedNode][i].second;
            int w=adj[finalisedNode][i].first;

            if(dist[nextNode]>dist[finalisedNode]+w)
            {
                if(dist[nextNode]!=INF)
                {
                    s.erase(s.find({dist[nextNode],nextNode}));
                }
                dist[nextNode]=dist[finalisedNode]+w;
                s.insert({dist[nextNode],nextNode});
            }
        }
    }
    return dist[dest];

}

int main()
{
    int nodes, edges, source, destination;
    cin>>nodes>>edges;
    vector< vector <pair<int,int>>> adj(nodes);
 
    int u,v,w;
    for(int i=0;i<edges;i++)
    {
        cin>>u>>v>>w; // U----w----->V (Edge from U to V with weight W)
        if(w<0)
        {
            i--;
            cout<<"Please enter values again, Dijikstra won't work for negative weights"<<endl;
            continue;
        }
        adj[u].push_back({w,v});
        //adj[v].push_back({w,u}); // for making a bidirectional graph
    }
    cin>>source>>destination;
    cout<<"distance between "<<source<<" & " <<destination<<" = "<<dijikstra(adj,source,destination,nodes);
    return 0;
}