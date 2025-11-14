 
        return collection.size();
    }
​
    /**
     * returns the number of pages
     */
    public int pageCount() {
//        double num =  (double) collection.size() /itemsPerPage;
        return (int) Math.ceil((double) collection.size() /itemsPerPage);
    }
​
    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
      System.out.println(collection);
      System.out.println(itemsPerPage);
      System.out.println(pageIndex);
        int pageNum = (int) Math.ceil((double) collection.size() /itemsPerPage);
        if(pageIndex<pageNum-1){
            return  itemsPerPage;
        }
        else if(pageIndex == pageNum-1){
            return  collection.size() - (pageNum-2)* itemsPerPage;
        }
      return 0;
    }
​
    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
//         if(collection.size() == 0){return -1;}
        if(itemIndex>= collection.size() || itemIndex<0){return -1;}
        else {return (int) Math.floor((double) itemIndex /itemsPerPage);}
    }
  
}