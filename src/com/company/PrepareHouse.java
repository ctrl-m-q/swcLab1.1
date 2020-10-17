package com.company;
public abstract class PrepareHouse {

        // Template method is final so subclasses can't override
        public final void constructHouse() {
            construcFoundation();
            construcPillars();
            construcWalls();
            construcWindows();
                //you need to add lintel
             construclintel();
                
            System.out.println("House is constructed.");
        }

        // Methods to be implemented by subclasses

        public abstract void construcFoundation();

        public abstract void construcPillars();

        public abstract void construcWalls();

        public abstract void construcWindows();
        
        public abstract void construclintel();

    }



