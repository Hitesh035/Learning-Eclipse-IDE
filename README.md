# Learning-Eclipse-IDE
This repository contains programs in structured packages. All written while I was learning Eclipse for the first time.
Please overlook the naming conventions for some of the packages and identifiers as those were created during the initial stage of my JAVA learning.
This repository contains basic to advance programs.
Some Programs may not be fully developed e.g 'Play_with_letter.java' in 'com.menu_driven'.


```javascript
document.getElementById("FORM").addEventListener("submit", async (e) => {
                e.preventDefault();

                const file = document.getElementById("File").files[0];

                
                const meta = { additionalProp1: "string" };

                
                const metaData = new File([JSON.stringify(meta)], "met.json", {
                    type: "application/json",
                });

                const body = new FormData();
                body.append("file", file);
                body.append("document", metaData);

                const res = await fetch("http://localhost:8080/o/headless-delivery/v1.0/sites/20121/documents", {
                    method: "POST",
                    headers: {
                        authorization: `Basic ${btoa('test@liferay.com:learn')}`,
                    },
                    body,
                });

                

                console.log(res.json());
            });

```
