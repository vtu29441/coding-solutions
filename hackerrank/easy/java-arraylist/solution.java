        List<List<Integer>> lines = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(scan.nextInt());
            }
            lines.add(line);
        }
        
        // Read the number of queries
        int q = scan.nextInt();
        
        // Process each query
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            try {
                // The problem uses 1-based indexing, so 
                subtract 1 for ArrayList access
                System.out.println(lines.get(x - 1).get(y 
                - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        
        scan.close();
    }
}