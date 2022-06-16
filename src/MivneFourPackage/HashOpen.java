package MivneFourPackage;

public class HashOpen{
    private int[] array_of_hall;    /// open addressing here !!!

    private int m;  //// size

    public HashOpen(int m){  /////  the size of HashOpen we want it to be
        this.m = m;
        this.array_of_hall = new int[this.m];  /////  the table of the people in the hall
    }
    public int getSize(){ return this.m; }
    public int[] getArray_of_hall() { return this.array_of_hall; }

    public int getNumberElements(){
        int amount = 0;
        for (int id : this.array_of_hall){
            if(id != 0){      //////////  beacause when initialized, every cell is 0
                amount++;
            }
        }
        return amount;
    }


    public int insert(int id, int hashFunc){
        int insertion_index, steps_amount = 0, curr_step_size = 1;
        if (hashFunc == 1) {
            insertion_index = this.h_1(id, this.getSize());
        }else{
            insertion_index = this.h_2(id, this.getSize());
        }
        if (this.array_of_hall[insertion_index] == 0){
            this.array_of_hall[insertion_index] = id;
            return steps_amount;
        }else{
            while ((insertion_index + curr_step_size != (this.getSize()-1)) && (insertion_index + curr_step_size != 0)){
                steps_amount++;
                if(this.array_of_hall[insertion_index + curr_step_size] == 0){
                    this.array_of_hall[insertion_index + curr_step_size] = id;
                    return steps_amount;
                }else{
                    if (curr_step_size > 0){
                        curr_step_size = curr_step_size*-1;
                    }else{
                        curr_step_size = (curr_step_size - 1)*-1;
                    }
                }
            }
            //////////  now from the edge go one by one to the other edge
            int check_index;
            if(insertion_index + curr_step_size == 0){
                curr_step_size = 1;
                check_index = 0;
            }else{
                curr_step_size = -1;
                check_index = this.getSize() - 1;
            }
            while (true){  /// going from the edge to the other side
                steps_amount++;
                if(check_index >= this.getSize() || check_index <= -1){
                    break;
                }
                if (this.array_of_hall[check_index] == 0){
                    this.array_of_hall[check_index] = id;
                    return steps_amount;
                }
                check_index += curr_step_size;
            }
            return steps_amount;  ///////  if not found, even though not reachable
        }
    }


    private int h_1(int id, int m){   /////// Hash function 1: division method
        return id % m;
    }

    private int h_2(int id, int m){   /////// Hash function 2: reverse id and then do the division method
        String input_str = Integer.toString(id), res_str = "";
        while (!input_str.equals("")){
            res_str += input_str.charAt(input_str.length()-1);
            input_str = input_str.substring(0, input_str.length()-1);
        }
        int res = Integer.parseInt(res_str);

        return res % m;
    }




}
