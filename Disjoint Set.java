class DSU {
        static List<Integer> rank = new ArrayList<>();
        static List<Integer> parent = new ArrayList<>();
        static List<Integer> size = new ArrayList<>();

        public DSU(int n) {
            for (int i = 0; i < n; i++) {
                rank.add(0);
                parent.add(i);
                size.add(1);
            }
        }

        public int findParent(int node) {
            if (parent.get(node) == node)
                return node;
            parent.set(node, findParent(parent.get(node)));
            return parent.get(node);
        }

        public void unionByRank(int u, int v) {
            int pu = findParent(u);
            int pv = findParent(v);
            if (rank.get(pu) == rank.get(pv)) {
                parent.set(pv, pu);
                rank.set(pu, rank.get(pu) + 1);
            } else if (rank.get(pu) < rank.get(pv))
                parent.set(pu, pv);
            else if (rank.get(pu) > rank.get(pv))
                parent.set(pv, pu);
        }

        public void unionBySize(int u, int v) {
            int pu = findParent(u);
            int pv = findParent(v);
            if (size.get(pu) < size.get(pv)) {
                parent.set(pu, pv);
                size.set(pv, size.get(pu) + size.get(pv));
            } else {
                parent.set(pv, pu);
                size.set(pu, size.get(pu) + size.get(pv));
            }
        }

        public void display() {
            System.out.println(rank);
            System.out.println(parent);
            System.out.println(size);
        }
    }
