/*
Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
*/
int[] solution(int[] a) {
    int[] ans = new int[a.length];
    ArrayList<Integer> values = new ArrayList<>();
    HashSet<Integer> treePos = new HashSet<>();
    
    for(int i =0 ;i < a.length; i++){
        if(a[i] == -1){
            treePos.add(i);
        }else{
            values.add(a[i]);
        }
    }
    Collections.sort(values);
    System.out.println(values);
    for(int j = 0; j < a.length; j++){
        if(treePos.contains(j)){
            ans[j] = -1;
        }else{
            ans[j] = values.remove(0);
        }
    }
    return ans;
}
