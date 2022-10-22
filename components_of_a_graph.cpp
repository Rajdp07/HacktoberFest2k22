//CREATED BY VENNELA2132 
//Calculating no. of components of a given graph using DSU (Disjoint Set Union) 

#include<bits/stdc++.h>
#define int long long

using namespace std;

int find_rep(int x,vector<int> &rep)                     //Finding representative of given node
{
    if(rep[x]==x)
    return x;

    return rep[x]=find_rep(rep[x],rep);
}

void union_grph(int u,int v,vector<vector<int> > &adj,vector<int> &rep,vector<int> &rnk) //Creating union of nodes of same component
{
    int p=find_rep(u,rep),q=find_rep(v,rep);

    if(p!=q)
    {
        if(rnk[p]>rnk[q])
        {
            rep[q]=p;
            rnk[p]+=rnk[q];
            rnk[q]=0;
        }
        else
        {
            rep[p]=q;
            rnk[q]+=rnk[p];
            rnk[p]=0;
        }
    }

}

int no_of_components(vector<vector<int> > &adj)            //Returning no. of components
{
    vector<int> rep(adj.size()),rnk(adj.size(),1);

    for(int i=0;i<adj.size();i++)
    rep[i]=i;                                             //Initiating DSU

    for(int i=0;i<adj.size();i++)
    {
        for(int j: adj[i])
        {
            union_grph(i,j,adj,rep,rnk);                   
        }
    }

    int ans=0;

    for(int i=0;i<rnk.size();i++)
    {
        if(rnk[i]!=0)
        ans++;
    }
    return ans;
}

int32_t main()
{
    int nodes,edges;
    cout<<"Enter no. of nodes:";
    cin>>nodes;

    cout<<"Enter no. of edges:";
    cin>>edges;

    vector<vector <int> > graph;                      //Creating graph

    graph.resize(nodes);

    if(edges!=0)
    cout<<"Enter the joining edges:\n";

    for(int i=0;i<edges;i++)
    {
        int u,v;

        cin>>u>>v;
        graph[u].push_back(v);
        graph[v].push_back(u);
    }

    cout<<"\nNo. of components in the graph: ";
    cout<<no_of_components(graph);

}
