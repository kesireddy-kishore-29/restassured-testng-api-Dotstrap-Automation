# Transcript: Past its rate limit, a token gets a 429 problem from every operation

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#pastTheLimitEveryOperationIsA429` |
| Features | FEAT-RATE-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 103 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-cdfdb331-454a-47ae-ac8e-ace92e37fc7a` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-c3ffe145-7646-4aff-af06-74cf5aaa2c82` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-1e94cea6-26ee-4b02-8897-816a125d8b4e` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-aa5fe601-0ac2-414b-b7d1-4451d2aa2e70` |
| 5 | `GET /v1/accounts/me` | 200 | 16 | `qa-ef19b0a2-a888-4896-8a1d-faa6549a51b1` |
| 6 | `GET /v1/accounts/me` | 200 | 8 | `qa-5fb2ed31-0621-4ad3-b489-59b255afb735` |
| 7 | `GET /v1/accounts/me` | 200 | 23 | `qa-0dbca0fb-e4b6-498f-a381-2ac45dba445e` |
| 8 | `GET /v1/accounts/me` | 200 | 16 | `qa-1cf5a853-d8e0-4895-8520-d60914ae921e` |
| 9 | `GET /v1/accounts/me` | 200 | 14 | `qa-2aeee372-b223-4c62-8184-85e6050706eb` |
| 10 | `GET /v1/accounts/me` | 200 | 25 | `qa-3988df68-c429-4c39-82f9-a614558a1268` |
| 11 | `GET /v1/accounts/me` | 200 | 20 | `qa-1cba5fad-ad4a-49a7-af72-1db33abdbe5a` |
| 12 | `GET /v1/accounts/me` | 200 | 22 | `qa-ebd18c21-e754-4109-b8ab-05b335919236` |
| 13 | `GET /v1/accounts/me` | 200 | 11 | `qa-3beed015-6dee-4591-9c14-4e3db1a1ea82` |
| 14 | `GET /v1/accounts/me` | 200 | 6 | `qa-d650d5ce-c80d-4538-b6f1-d7d9bf0a3322` |
| 15 | `GET /v1/accounts/me` | 200 | 5 | `qa-28a2e58a-faa4-4601-9e23-960c851fb49e` |
| 16 | `GET /v1/accounts/me` | 200 | 13 | `qa-f90cb8ab-62d9-4215-ba49-7a3307809f6c` |
| 17 | `GET /v1/accounts/me` | 200 | 19 | `qa-5eb912b1-f6aa-4ba6-acd5-9692a4dcf14c` |
| 18 | `GET /v1/accounts/me` | 200 | 12 | `qa-b2e99ce2-347b-4a24-bf6f-848b900714e7` |
| 19 | `GET /v1/accounts/me` | 200 | 32 | `qa-782bebc2-256f-45ee-80a7-85a993665426` |
| 20 | `GET /v1/accounts/me` | 200 | 28 | `qa-47b768f5-1e88-48a4-95ce-62aef84a9aaa` |
| 21 | `GET /v1/accounts/me` | 200 | 8 | `qa-9518402e-69bc-4a5b-924c-a300b38e638b` |
| 22 | `GET /v1/accounts/me` | 200 | 21 | `qa-e8a74e17-1f0e-4548-8873-8172c2e21c28` |
| 23 | `GET /v1/accounts/me` | 200 | 15 | `qa-25d162d9-3c1d-4952-9ee6-f0184cec759c` |
| 24 | `GET /v1/accounts/me` | 200 | 14 | `qa-2ba3a0ac-21fc-4654-a294-0a0d4db58fcb` |
| 25 | `GET /v1/accounts/me` | 200 | 13 | `qa-1313de56-0061-4e91-bbce-9f17fd8eaea5` |
| 26 | `GET /v1/accounts/me` | 200 | 12 | `qa-fd6cbe3a-6768-4370-9fe9-b797e3dc8391` |
| 27 | `GET /v1/accounts/me` | 200 | 25 | `qa-4c26fbbe-984e-43de-9236-35b36e087063` |
| 28 | `GET /v1/accounts/me` | 200 | 15 | `qa-91a641ed-4d21-4e63-9b36-3319ce5432dd` |
| 29 | `GET /v1/accounts/me` | 200 | 23 | `qa-b8588c9a-c7fc-4fc3-a261-493b99a7718b` |
| 30 | `GET /v1/accounts/me` | 200 | 23 | `qa-831f447e-518b-457f-8d69-b42c3de4b680` |
| 31 | `GET /v1/accounts/me` | 200 | 23 | `qa-722576bd-0e47-42f2-b175-271be98586d2` |
| 32 | `GET /v1/accounts/me` | 200 | 19 | `qa-f9d4a60e-3b04-4483-a8e2-614fa8c81528` |
| 33 | `GET /v1/accounts/me` | 200 | 15 | `qa-e6d9acb9-4dac-4fb9-a437-795189074fb6` |
| 34 | `GET /v1/accounts/me` | 200 | 16 | `qa-44b2d071-71c5-4459-8d83-30fe06c9c99f` |
| 35 | `GET /v1/accounts/me` | 200 | 12 | `qa-1e8ad1d0-a532-4ffe-8c48-6c593b1250a9` |
| 36 | `GET /v1/accounts/me` | 200 | 13 | `qa-f3ec6722-9b85-4f89-a44e-9376e4490fcc` |
| 37 | `GET /v1/accounts/me` | 200 | 26 | `qa-0878af69-d5e5-41aa-b748-da1fe1b9e3a5` |
| 38 | `GET /v1/accounts/me` | 200 | 34 | `qa-049feca8-1fc5-4b2e-8fdb-7a09cc517824` |
| 39 | `GET /v1/accounts/me` | 200 | 18 | `qa-3429cf2c-1db3-42fd-9f64-b3195ab3d01e` |
| 40 | `GET /v1/accounts/me` | 200 | 25 | `qa-35c2b085-226d-4dda-9f6e-56715a5c9107` |
| 41 | `GET /v1/accounts/me` | 200 | 17 | `qa-590d552f-29f4-4726-ac06-348439b5a0d0` |
| 42 | `GET /v1/accounts/me` | 200 | 14 | `qa-c36f6c3d-ad62-4a6d-b859-9edb6e23ca6a` |
| 43 | `GET /v1/accounts/me` | 200 | 11 | `qa-dcc9523a-5f99-464b-a175-80e1b5bb7376` |
| 44 | `GET /v1/accounts/me` | 200 | 11 | `qa-edde5f78-f74b-4cc8-a406-133a0802b5cc` |
| 45 | `GET /v1/accounts/me` | 200 | 6 | `qa-351a1eb5-b5d8-46a9-b4e1-eab180185ce3` |
| 46 | `GET /v1/accounts/me` | 200 | 10 | `qa-a1b4ee85-dcc3-4937-aec0-be3819bca975` |
| 47 | `GET /v1/accounts/me` | 200 | 13 | `qa-d39ab81a-aaff-4781-ac21-36b28a06b706` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-12f95d16-6a9c-472e-9504-25a430024e7d` |
| 49 | `GET /v1/accounts/me` | 200 | 14 | `qa-af6214b9-5f1e-4ea8-8018-72a69cde7e4c` |
| 50 | `GET /v1/accounts/me` | 200 | 5 | `qa-72fa3448-c75f-4c43-85e2-d1bd911378fb` |
| 51 | `GET /v1/accounts/me` | 200 | 15 | `qa-6fba5aec-9f33-4d92-9221-a3b0b9a14bf1` |
| 52 | `GET /v1/accounts/me` | 200 | 8 | `qa-ef54363f-2770-45c2-a6f3-6773afe38bb9` |
| 53 | `GET /v1/accounts/me` | 200 | 6 | `qa-3e27a80a-ef4a-4b17-91ea-85e03b23c380` |
| 54 | `GET /v1/accounts/me` | 200 | 4 | `qa-d823de97-cae5-4992-b91c-b7f7bd2659e7` |
| 55 | `GET /v1/accounts/me` | 200 | 10 | `qa-5508a243-759b-4be0-a0b5-c9ebc8d26f75` |
| 56 | `GET /v1/accounts/me` | 200 | 24 | `qa-cd69114f-16af-44c0-9dfc-c309b770b5ba` |
| 57 | `GET /v1/accounts/me` | 200 | 12 | `qa-e3c0bc6e-386d-48bb-a2c1-5ab3aaa55c73` |
| 58 | `GET /v1/accounts/me` | 200 | 5 | `qa-ce886de0-3fc1-46b6-8c61-b37d02c0b021` |
| 59 | `GET /v1/accounts/me` | 200 | 27 | `qa-fd8c7ba2-bf84-4d22-bf20-7e5656051fa3` |
| 60 | `GET /v1/accounts/me` | 200 | 16 | `qa-025beea2-acbe-43a5-831b-9cf5fed5fae8` |
| 61 | `GET /v1/accounts/me` | 200 | 11 | `qa-984895a3-bc6d-4080-87d0-460feb86e363` |
| 62 | `GET /v1/accounts/me` | 200 | 12 | `qa-2aa8b23a-5017-4aa6-a40f-016c27d8e440` |
| 63 | `GET /v1/accounts/me` | 200 | 14 | `qa-7690e299-fb9d-41f1-806a-bd5df8327d7d` |
| 64 | `GET /v1/accounts/me` | 429 | 11 | `qa-b1556e27-593b-47e8-bac0-00cdb5fdf83d` |
| 65 | `POST /v1/auth/token` | 429 | 10 | `qa-74723a57-6973-4856-8b05-226f3a66aa23` |
| 66 | `POST /v1/accounts` | 429 | 6 | `qa-881936e1-e080-45f8-b0c3-85023ad13c9d` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-1ce7e270-e0f6-4b3e-94b9-bb2e23fabacd` |
| 68 | `PATCH /v1/accounts/me` | 429 | 4 | `qa-79f565df-78a1-4b8b-acfa-393b22d24599` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-eb28f98c-5b67-4ad1-800c-256db8547e35` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 4 | `qa-b696cd52-d9a5-41c9-ab57-1ec6dc02ece4` |
| 71 | `POST /v1/conversations` | 429 | 4 | `qa-76ca9e66-5660-45e1-973e-e251ff759b7d` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-1878dfff-0032-4700-9af0-7198f86d181c` |
| 73 | `GET /v1/conversations/{id}` | 429 | 3 | `qa-6bbf01b3-4343-4c86-8179-84516b037fc9` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-3f609073-8a65-403d-b4fb-7eaa822e0740` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 3 | `qa-dddf3a31-9730-44c0-9a3a-d6dd80eb52d0` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-530bff18-c709-4828-8f94-f429535baf1c` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 5 | `qa-98da5ab5-3f9f-4d23-8e97-c41a00733cd4` |
| 78 | `GET /v1/credits/balance` | 429 | 3 | `qa-a4f55069-495f-4dd9-9b2e-9bbba7ad04b9` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-5ce9ef03-3d69-42d9-b73b-c5ae32f05fb8` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-00be6591-4fe9-4a80-b920-06e70b0d08a7` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-9ab06dd4-3f84-4477-bf7a-91e7dec5f251` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-58d2406b-db35-4f4a-bfb5-c519a0617dc7` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-3a051f5b-17d3-42f4-be9d-411a466581fc` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-9a02e234-d746-461a-971b-c280058baed1` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-ed728406-b7fb-41da-b388-b911a3beeeac` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-0ea550fa-f2d1-4031-bb10-ce0af0ba6495` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-d11d35e6-8f4d-4faa-9e69-fcc207e80298` |
| 88 | `GET /v1/accounts/me` | 429 | 4 | `qa-906c8df2-3afc-4020-8828-9fabcbd7fa6c` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-6574c7c1-b47b-4919-8469-5ac8a71cdb95` |
| 90 | `GET /v1/accounts/me` | 429 | 4 | `qa-0d557a10-2ff4-4b85-885c-1021edabd648` |
| 91 | `GET /v1/accounts/me` | 429 | 4 | `qa-508acee4-449d-4bd0-966c-3863e5eff69d` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-89e8b866-db1b-43ac-9814-e41049036d96` |
| 93 | `GET /v1/accounts/me` | 429 | 3 | `qa-8024cbb9-38a8-487c-a388-e0221bcc63ab` |
| 94 | `GET /v1/accounts/me` | 429 | 5 | `qa-20ec3266-1bbd-49b4-9852-3e95e4102021` |
| 95 | `GET /v1/accounts/me` | 429 | 4 | `qa-76ebd0d4-309d-4868-affd-6e5a392ce38f` |
| 96 | `GET /v1/accounts/me` | 429 | 4 | `qa-f3ea5a43-6623-495b-b6c0-9a5a7790b650` |
| 97 | `GET /v1/accounts/me` | 429 | 7 | `qa-d2cfd7b2-13df-43e3-baea-3d4e4d7a0ef0` |
| 98 | `GET /v1/accounts/me` | 200 | 4 | `qa-286a0fb4-ad30-4665-86bc-77f5907c911a` |
| 99 | `POST /v1/auth/token` | 200 | 9 | `qa-1979c14b-4622-41f3-8f81-35f817b14389` |
| 100 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-58a65ed2-2754-4378-a4cc-5b7fe6f5a3b4` |
| 101 | `POST /v1/auth/token` | 401 | 4 | `qa-0da5fe5e-18a1-48af-9550-65a7967baa2b` |
| 102 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-dab3901d-39cf-4139-bd30-0ba6fbb635ee` |
| 103 | `POST /v1/auth/token` | 401 | 3 | `qa-cdbcf502-5250-402a-b528-c0ee7362ab20` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cdfdb331-454a-47ae-ac8e-ace92e37fc7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdfdb331-454a-47ae-ac8e-ace92e37fc7a
Content-Type: application/json

--- request body ---
{"handle":"qa-a71166694118","displayName":"QA a71166694118","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdfdb331-454a-47ae-ac8e-ace92e37fc7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Location: /v1/accounts/qa-a71166694118
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c3ffe145-7646-4aff-af06-74cf5aaa2c82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3ffe145-7646-4aff-af06-74cf5aaa2c82
Content-Type: application/json

--- request body ---
{"handle":"qa-6fc439b4f917","displayName":"QA 6fc439b4f917","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3ffe145-7646-4aff-af06-74cf5aaa2c82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Location: /v1/accounts/qa-6fc439b4f917
X-Served-Region: eu
Content-Length: 181

{"id":"acc_384f1794-c677-4c59-8414-855e0d12c331","handle":"qa-6fc439b4f917","displayName":"QA 6fc439b4f917","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.864840687Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1e94cea6-26ee-4b02-8897-816a125d8b4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e94cea6-26ee-4b02-8897-816a125d8b4e
Content-Type: application/json

--- request body ---
{"handle":"qa-a71166694118","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e94cea6-26ee-4b02-8897-816a125d8b4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aa5fe601-0ac2-414b-b7d1-4451d2aa2e70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa5fe601-0ac2-414b-b7d1-4451d2aa2e70
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6fc439b4f917","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa5fe601-0ac2-414b-b7d1-4451d2aa2e70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_c2991cbf-2623-4cbe-af1d-ee65e3b29846
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c2991cbf-2623-4cbe-af1d-ee65e3b29846","subject":"Error contract","status":"open","region":"eu","participants":["qa-a71166694118","qa-6fc439b4f917"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:47.911320399Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef19b0a2-a888-4896-8a1d-faa6549a51b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef19b0a2-a888-4896-8a1d-faa6549a51b1
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef19b0a2-a888-4896-8a1d-faa6549a51b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-5fb2ed31-0621-4ad3-b489-59b255afb735

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fb2ed31-0621-4ad3-b489-59b255afb735
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fb2ed31-0621-4ad3-b489-59b255afb735
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-0dbca0fb-e4b6-498f-a381-2ac45dba445e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dbca0fb-e4b6-498f-a381-2ac45dba445e
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dbca0fb-e4b6-498f-a381-2ac45dba445e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-1cf5a853-d8e0-4895-8520-d60914ae921e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cf5a853-d8e0-4895-8520-d60914ae921e
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cf5a853-d8e0-4895-8520-d60914ae921e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-2aeee372-b223-4c62-8184-85e6050706eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aeee372-b223-4c62-8184-85e6050706eb
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-2aeee372-b223-4c62-8184-85e6050706eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-3988df68-c429-4c39-82f9-a614558a1268

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3988df68-c429-4c39-82f9-a614558a1268
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3988df68-c429-4c39-82f9-a614558a1268
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-1cba5fad-ad4a-49a7-af72-1db33abdbe5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cba5fad-ad4a-49a7-af72-1db33abdbe5a
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cba5fad-ad4a-49a7-af72-1db33abdbe5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-ebd18c21-e754-4109-b8ab-05b335919236

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebd18c21-e754-4109-b8ab-05b335919236
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebd18c21-e754-4109-b8ab-05b335919236
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-3beed015-6dee-4591-9c14-4e3db1a1ea82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3beed015-6dee-4591-9c14-4e3db1a1ea82
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3beed015-6dee-4591-9c14-4e3db1a1ea82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-d650d5ce-c80d-4538-b6f1-d7d9bf0a3322

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d650d5ce-c80d-4538-b6f1-d7d9bf0a3322
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d650d5ce-c80d-4538-b6f1-d7d9bf0a3322
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-28a2e58a-faa4-4601-9e23-960c851fb49e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28a2e58a-faa4-4601-9e23-960c851fb49e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-28a2e58a-faa4-4601-9e23-960c851fb49e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-f90cb8ab-62d9-4215-ba49-7a3307809f6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f90cb8ab-62d9-4215-ba49-7a3307809f6c
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-f90cb8ab-62d9-4215-ba49-7a3307809f6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-5eb912b1-f6aa-4ba6-acd5-9692a4dcf14c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5eb912b1-f6aa-4ba6-acd5-9692a4dcf14c
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-5eb912b1-f6aa-4ba6-acd5-9692a4dcf14c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2e99ce2-347b-4a24-bf6f-848b900714e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2e99ce2-347b-4a24-bf6f-848b900714e7
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2e99ce2-347b-4a24-bf6f-848b900714e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-782bebc2-256f-45ee-80a7-85a993665426

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-782bebc2-256f-45ee-80a7-85a993665426
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-782bebc2-256f-45ee-80a7-85a993665426
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-47b768f5-1e88-48a4-95ce-62aef84a9aaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47b768f5-1e88-48a4-95ce-62aef84a9aaa
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-47b768f5-1e88-48a4-95ce-62aef84a9aaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-9518402e-69bc-4a5b-924c-a300b38e638b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9518402e-69bc-4a5b-924c-a300b38e638b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-9518402e-69bc-4a5b-924c-a300b38e638b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8a74e17-1f0e-4548-8873-8172c2e21c28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8a74e17-1f0e-4548-8873-8172c2e21c28
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8a74e17-1f0e-4548-8873-8172c2e21c28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-25d162d9-3c1d-4952-9ee6-f0184cec759c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25d162d9-3c1d-4952-9ee6-f0184cec759c
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-25d162d9-3c1d-4952-9ee6-f0184cec759c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-2ba3a0ac-21fc-4654-a294-0a0d4db58fcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ba3a0ac-21fc-4654-a294-0a0d4db58fcb
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ba3a0ac-21fc-4654-a294-0a0d4db58fcb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-1313de56-0061-4e91-bbce-9f17fd8eaea5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1313de56-0061-4e91-bbce-9f17fd8eaea5
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-1313de56-0061-4e91-bbce-9f17fd8eaea5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd6cbe3a-6768-4370-9fe9-b797e3dc8391

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd6cbe3a-6768-4370-9fe9-b797e3dc8391
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd6cbe3a-6768-4370-9fe9-b797e3dc8391
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c26fbbe-984e-43de-9236-35b36e087063

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c26fbbe-984e-43de-9236-35b36e087063
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c26fbbe-984e-43de-9236-35b36e087063
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-91a641ed-4d21-4e63-9b36-3319ce5432dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91a641ed-4d21-4e63-9b36-3319ce5432dd
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-91a641ed-4d21-4e63-9b36-3319ce5432dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8588c9a-c7fc-4fc3-a261-493b99a7718b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8588c9a-c7fc-4fc3-a261-493b99a7718b
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8588c9a-c7fc-4fc3-a261-493b99a7718b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-831f447e-518b-457f-8d69-b42c3de4b680

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-831f447e-518b-457f-8d69-b42c3de4b680
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-831f447e-518b-457f-8d69-b42c3de4b680
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-722576bd-0e47-42f2-b175-271be98586d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-722576bd-0e47-42f2-b175-271be98586d2
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-722576bd-0e47-42f2-b175-271be98586d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9d4a60e-3b04-4483-a8e2-614fa8c81528

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9d4a60e-3b04-4483-a8e2-614fa8c81528
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9d4a60e-3b04-4483-a8e2-614fa8c81528
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-e6d9acb9-4dac-4fb9-a437-795189074fb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6d9acb9-4dac-4fb9-a437-795189074fb6
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6d9acb9-4dac-4fb9-a437-795189074fb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-44b2d071-71c5-4459-8d83-30fe06c9c99f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44b2d071-71c5-4459-8d83-30fe06c9c99f
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-44b2d071-71c5-4459-8d83-30fe06c9c99f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e8ad1d0-a532-4ffe-8c48-6c593b1250a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e8ad1d0-a532-4ffe-8c48-6c593b1250a9
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e8ad1d0-a532-4ffe-8c48-6c593b1250a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3ec6722-9b85-4f89-a44e-9376e4490fcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3ec6722-9b85-4f89-a44e-9376e4490fcc
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3ec6722-9b85-4f89-a44e-9376e4490fcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-0878af69-d5e5-41aa-b748-da1fe1b9e3a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0878af69-d5e5-41aa-b748-da1fe1b9e3a5
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-0878af69-d5e5-41aa-b748-da1fe1b9e3a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-049feca8-1fc5-4b2e-8fdb-7a09cc517824

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-049feca8-1fc5-4b2e-8fdb-7a09cc517824
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-049feca8-1fc5-4b2e-8fdb-7a09cc517824
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-3429cf2c-1db3-42fd-9f64-b3195ab3d01e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3429cf2c-1db3-42fd-9f64-b3195ab3d01e
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3429cf2c-1db3-42fd-9f64-b3195ab3d01e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-35c2b085-226d-4dda-9f6e-56715a5c9107

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35c2b085-226d-4dda-9f6e-56715a5c9107
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-35c2b085-226d-4dda-9f6e-56715a5c9107
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-590d552f-29f4-4726-ac06-348439b5a0d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-590d552f-29f4-4726-ac06-348439b5a0d0
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-590d552f-29f4-4726-ac06-348439b5a0d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-c36f6c3d-ad62-4a6d-b859-9edb6e23ca6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c36f6c3d-ad62-4a6d-b859-9edb6e23ca6a
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-c36f6c3d-ad62-4a6d-b859-9edb6e23ca6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-dcc9523a-5f99-464b-a175-80e1b5bb7376

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcc9523a-5f99-464b-a175-80e1b5bb7376
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcc9523a-5f99-464b-a175-80e1b5bb7376
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-edde5f78-f74b-4cc8-a406-133a0802b5cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edde5f78-f74b-4cc8-a406-133a0802b5cc
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-edde5f78-f74b-4cc8-a406-133a0802b5cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-351a1eb5-b5d8-46a9-b4e1-eab180185ce3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-351a1eb5-b5d8-46a9-b4e1-eab180185ce3
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-351a1eb5-b5d8-46a9-b4e1-eab180185ce3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-a1b4ee85-dcc3-4937-aec0-be3819bca975

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1b4ee85-dcc3-4937-aec0-be3819bca975
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1b4ee85-dcc3-4937-aec0-be3819bca975
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-d39ab81a-aaff-4781-ac21-36b28a06b706

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d39ab81a-aaff-4781-ac21-36b28a06b706
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d39ab81a-aaff-4781-ac21-36b28a06b706
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-12f95d16-6a9c-472e-9504-25a430024e7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12f95d16-6a9c-472e-9504-25a430024e7d
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-12f95d16-6a9c-472e-9504-25a430024e7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-af6214b9-5f1e-4ea8-8018-72a69cde7e4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af6214b9-5f1e-4ea8-8018-72a69cde7e4c
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-af6214b9-5f1e-4ea8-8018-72a69cde7e4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-72fa3448-c75f-4c43-85e2-d1bd911378fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72fa3448-c75f-4c43-85e2-d1bd911378fb
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-72fa3448-c75f-4c43-85e2-d1bd911378fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-6fba5aec-9f33-4d92-9221-a3b0b9a14bf1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fba5aec-9f33-4d92-9221-a3b0b9a14bf1
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fba5aec-9f33-4d92-9221-a3b0b9a14bf1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef54363f-2770-45c2-a6f3-6773afe38bb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef54363f-2770-45c2-a6f3-6773afe38bb9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef54363f-2770-45c2-a6f3-6773afe38bb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e27a80a-ef4a-4b17-91ea-85e03b23c380

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e27a80a-ef4a-4b17-91ea-85e03b23c380
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e27a80a-ef4a-4b17-91ea-85e03b23c380
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-d823de97-cae5-4992-b91c-b7f7bd2659e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d823de97-cae5-4992-b91c-b7f7bd2659e7
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-d823de97-cae5-4992-b91c-b7f7bd2659e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-5508a243-759b-4be0-a0b5-c9ebc8d26f75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5508a243-759b-4be0-a0b5-c9ebc8d26f75
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-5508a243-759b-4be0-a0b5-c9ebc8d26f75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd69114f-16af-44c0-9dfc-c309b770b5ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd69114f-16af-44c0-9dfc-c309b770b5ba
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd69114f-16af-44c0-9dfc-c309b770b5ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-e3c0bc6e-386d-48bb-a2c1-5ab3aaa55c73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3c0bc6e-386d-48bb-a2c1-5ab3aaa55c73
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3c0bc6e-386d-48bb-a2c1-5ab3aaa55c73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce886de0-3fc1-46b6-8c61-b37d02c0b021

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce886de0-3fc1-46b6-8c61-b37d02c0b021
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce886de0-3fc1-46b6-8c61-b37d02c0b021
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd8c7ba2-bf84-4d22-bf20-7e5656051fa3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd8c7ba2-bf84-4d22-bf20-7e5656051fa3
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd8c7ba2-bf84-4d22-bf20-7e5656051fa3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-025beea2-acbe-43a5-831b-9cf5fed5fae8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-025beea2-acbe-43a5-831b-9cf5fed5fae8
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-025beea2-acbe-43a5-831b-9cf5fed5fae8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-984895a3-bc6d-4080-87d0-460feb86e363

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-984895a3-bc6d-4080-87d0-460feb86e363
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-984895a3-bc6d-4080-87d0-460feb86e363
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-2aa8b23a-5017-4aa6-a40f-016c27d8e440

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aa8b23a-5017-4aa6-a40f-016c27d8e440
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-2aa8b23a-5017-4aa6-a40f-016c27d8e440
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-7690e299-fb9d-41f1-806a-bd5df8327d7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7690e299-fb9d-41f1-806a-bd5df8327d7d
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-7690e299-fb9d-41f1-806a-bd5df8327d7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1556e27-593b-47e8-bac0-00cdb5fdf83d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1556e27-593b-47e8-bac0-00cdb5fdf83d
Content-Type: application/json

--- response: 429 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1556e27-593b-47e8-bac0-00cdb5fdf83d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b1556e27-593b-47e8-bac0-00cdb5fdf83d"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-74723a57-6973-4856-8b05-226f3a66aa23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74723a57-6973-4856-8b05-226f3a66aa23
Content-Type: application/json

--- request body ---
{"handle":"qa-a71166694118","password":"****"}

--- response: 429 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74723a57-6973-4856-8b05-226f3a66aa23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 240

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-74723a57-6973-4856-8b05-226f3a66aa23"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-881936e1-e080-45f8-b0c3-85023ad13c9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-881936e1-e080-45f8-b0c3-85023ad13c9d
Content-Type: application/json

--- request body ---
{"handle":"qa-c5ebf4929a64","displayName":"QA c5ebf4929a64","password":"****","region":"eu"}

--- response: 429 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-881936e1-e080-45f8-b0c3-85023ad13c9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 238

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-881936e1-e080-45f8-b0c3-85023ad13c9d"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-1ce7e270-e0f6-4b3e-94b9-bb2e23fabacd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ce7e270-e0f6-4b3e-94b9-bb2e23fabacd
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ce7e270-e0f6-4b3e-94b9-bb2e23fabacd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1ce7e270-e0f6-4b3e-94b9-bb2e23fabacd"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-79f565df-78a1-4b8b-acfa-393b22d24599

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79f565df-78a1-4b8b-acfa-393b22d24599
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79f565df-78a1-4b8b-acfa-393b22d24599
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-79f565df-78a1-4b8b-acfa-393b22d24599"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eb28f98c-5b67-4ad1-800c-256db8547e35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb28f98c-5b67-4ad1-800c-256db8547e35
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb28f98c-5b67-4ad1-800c-256db8547e35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-eb28f98c-5b67-4ad1-800c-256db8547e35"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-a71166694118
correlation: qa-b696cd52-d9a5-41c9-ab57-1ec6dc02ece4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b696cd52-d9a5-41c9-ab57-1ec6dc02ece4
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b696cd52-d9a5-41c9-ab57-1ec6dc02ece4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-a71166694118","correlationId":"qa-b696cd52-d9a5-41c9-ab57-1ec6dc02ece4"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-76ca9e66-5660-45e1-973e-e251ff759b7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76ca9e66-5660-45e1-973e-e251ff759b7d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a71166694118","subject":"Probe","message":"Hi"}

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76ca9e66-5660-45e1-973e-e251ff759b7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-76ca9e66-5660-45e1-973e-e251ff759b7d"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-1878dfff-0032-4700-9af0-7198f86d181c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1878dfff-0032-4700-9af0-7198f86d181c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1878dfff-0032-4700-9af0-7198f86d181c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-1878dfff-0032-4700-9af0-7198f86d181c"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_c2991cbf-2623-4cbe-af1d-ee65e3b29846
correlation: qa-6bbf01b3-4343-4c86-8179-84516b037fc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bbf01b3-4343-4c86-8179-84516b037fc9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6bbf01b3-4343-4c86-8179-84516b037fc9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 284

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_c2991cbf-2623-4cbe-af1d-ee65e3b29846","correlationId":"qa-6bbf01b3-4343-4c86-8179-84516b037fc9"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_c2991cbf-2623-4cbe-af1d-ee65e3b29846/messages
correlation: qa-3f609073-8a65-403d-b4fb-7eaa822e0740

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f609073-8a65-403d-b4fb-7eaa822e0740
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f609073-8a65-403d-b4fb-7eaa822e0740
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_c2991cbf-2623-4cbe-af1d-ee65e3b29846/messages","correlationId":"qa-3f609073-8a65-403d-b4fb-7eaa822e0740"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_c2991cbf-2623-4cbe-af1d-ee65e3b29846/messages
correlation: qa-dddf3a31-9730-44c0-9a3a-d6dd80eb52d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dddf3a31-9730-44c0-9a3a-d6dd80eb52d0
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dddf3a31-9730-44c0-9a3a-d6dd80eb52d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_c2991cbf-2623-4cbe-af1d-ee65e3b29846/messages","correlationId":"qa-dddf3a31-9730-44c0-9a3a-d6dd80eb52d0"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_c2991cbf-2623-4cbe-af1d-ee65e3b29846/read
correlation: qa-530bff18-c709-4828-8f94-f429535baf1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-530bff18-c709-4828-8f94-f429535baf1c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-530bff18-c709-4828-8f94-f429535baf1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 289

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_c2991cbf-2623-4cbe-af1d-ee65e3b29846/read","correlationId":"qa-530bff18-c709-4828-8f94-f429535baf1c"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_c2991cbf-2623-4cbe-af1d-ee65e3b29846/close
correlation: qa-98da5ab5-3f9f-4d23-8e97-c41a00733cd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98da5ab5-3f9f-4d23-8e97-c41a00733cd4
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98da5ab5-3f9f-4d23-8e97-c41a00733cd4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 290

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_c2991cbf-2623-4cbe-af1d-ee65e3b29846/close","correlationId":"qa-98da5ab5-3f9f-4d23-8e97-c41a00733cd4"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-a4f55069-495f-4dd9-9b2e-9bbba7ad04b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4f55069-495f-4dd9-9b2e-9bbba7ad04b9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4f55069-495f-4dd9-9b2e-9bbba7ad04b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 245

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-a4f55069-495f-4dd9-9b2e-9bbba7ad04b9"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-5ce9ef03-3d69-42d9-b73b-c5ae32f05fb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ce9ef03-3d69-42d9-b73b-c5ae32f05fb8
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ce9ef03-3d69-42d9-b73b-c5ae32f05fb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 244

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-5ce9ef03-3d69-42d9-b73b-c5ae32f05fb8"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-00be6591-4fe9-4a80-b920-06e70b0d08a7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3c0d80838b194f01ade74ed85a508968
X-Correlation-Id: qa-00be6591-4fe9-4a80-b920-06e70b0d08a7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00be6591-4fe9-4a80-b920-06e70b0d08a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 247

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-00be6591-4fe9-4a80-b920-06e70b0d08a7"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-9ab06dd4-3f84-4477-bf7a-91e7dec5f251

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ab06dd4-3f84-4477-bf7a-91e7dec5f251
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ab06dd4-3f84-4477-bf7a-91e7dec5f251
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-9ab06dd4-3f84-4477-bf7a-91e7dec5f251"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-58d2406b-db35-4f4a-bfb5-c519a0617dc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58d2406b-db35-4f4a-bfb5-c519a0617dc7
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58d2406b-db35-4f4a-bfb5-c519a0617dc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-58d2406b-db35-4f4a-bfb5-c519a0617dc7"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a051f5b-17d3-42f4-be9d-411a466581fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a051f5b-17d3-42f4-be9d-411a466581fc
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a051f5b-17d3-42f4-be9d-411a466581fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3a051f5b-17d3-42f4-be9d-411a466581fc"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-9a02e234-d746-461a-971b-c280058baed1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a02e234-d746-461a-971b-c280058baed1
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a02e234-d746-461a-971b-c280058baed1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9a02e234-d746-461a-971b-c280058baed1"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-ed728406-b7fb-41da-b388-b911a3beeeac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed728406-b7fb-41da-b388-b911a3beeeac
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed728406-b7fb-41da-b388-b911a3beeeac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ed728406-b7fb-41da-b388-b911a3beeeac"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ea550fa-f2d1-4031-bb10-ce0af0ba6495

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ea550fa-f2d1-4031-bb10-ce0af0ba6495
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ea550fa-f2d1-4031-bb10-ce0af0ba6495
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0ea550fa-f2d1-4031-bb10-ce0af0ba6495"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-d11d35e6-8f4d-4faa-9e69-fcc207e80298

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d11d35e6-8f4d-4faa-9e69-fcc207e80298
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d11d35e6-8f4d-4faa-9e69-fcc207e80298
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d11d35e6-8f4d-4faa-9e69-fcc207e80298"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-906c8df2-3afc-4020-8828-9fabcbd7fa6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-906c8df2-3afc-4020-8828-9fabcbd7fa6c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-906c8df2-3afc-4020-8828-9fabcbd7fa6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-906c8df2-3afc-4020-8828-9fabcbd7fa6c"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-6574c7c1-b47b-4919-8469-5ac8a71cdb95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6574c7c1-b47b-4919-8469-5ac8a71cdb95
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6574c7c1-b47b-4919-8469-5ac8a71cdb95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6574c7c1-b47b-4919-8469-5ac8a71cdb95"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d557a10-2ff4-4b85-885c-1021edabd648

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d557a10-2ff4-4b85-885c-1021edabd648
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d557a10-2ff4-4b85-885c-1021edabd648
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0d557a10-2ff4-4b85-885c-1021edabd648"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-508acee4-449d-4bd0-966c-3863e5eff69d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-508acee4-449d-4bd0-966c-3863e5eff69d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-508acee4-449d-4bd0-966c-3863e5eff69d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-508acee4-449d-4bd0-966c-3863e5eff69d"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-89e8b866-db1b-43ac-9814-e41049036d96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89e8b866-db1b-43ac-9814-e41049036d96
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89e8b866-db1b-43ac-9814-e41049036d96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-89e8b866-db1b-43ac-9814-e41049036d96"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-8024cbb9-38a8-487c-a388-e0221bcc63ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8024cbb9-38a8-487c-a388-e0221bcc63ab
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8024cbb9-38a8-487c-a388-e0221bcc63ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8024cbb9-38a8-487c-a388-e0221bcc63ab"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-20ec3266-1bbd-49b4-9852-3e95e4102021

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20ec3266-1bbd-49b4-9852-3e95e4102021
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20ec3266-1bbd-49b4-9852-3e95e4102021
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-20ec3266-1bbd-49b4-9852-3e95e4102021"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-76ebd0d4-309d-4868-affd-6e5a392ce38f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76ebd0d4-309d-4868-affd-6e5a392ce38f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76ebd0d4-309d-4868-affd-6e5a392ce38f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-76ebd0d4-309d-4868-affd-6e5a392ce38f"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3ea5a43-6623-495b-b6c0-9a5a7790b650

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3ea5a43-6623-495b-b6c0-9a5a7790b650
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3ea5a43-6623-495b-b6c0-9a5a7790b650
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f3ea5a43-6623-495b-b6c0-9a5a7790b650"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2cfd7b2-13df-43e3-baea-3d4e4d7a0ef0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2cfd7b2-13df-43e3-baea-3d4e4d7a0ef0
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2cfd7b2-13df-43e3-baea-3d4e4d7a0ef0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d2cfd7b2-13df-43e3-baea-3d4e4d7a0ef0"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-286a0fb4-ad30-4665-86bc-77f5907c911a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-286a0fb4-ad30-4665-86bc-77f5907c911a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-286a0fb4-ad30-4665-86bc-77f5907c911a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_617ffcad-8f8c-40f4-b126-f4f82883f693","handle":"qa-a71166694118","displayName":"QA a71166694118","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.801614111Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-1979c14b-4622-41f3-8f81-35f817b14389

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1979c14b-4622-41f3-8f81-35f817b14389
Content-Type: application/json

--- request body ---
{"handle":"qa-6fc439b4f917","password":"****"}

--- response: 200 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-1979c14b-4622-41f3-8f81-35f817b14389
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_384f1794-c677-4c59-8414-855e0d12c331"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58a65ed2-2754-4378-a4cc-5b7fe6f5a3b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58a65ed2-2754-4378-a4cc-5b7fe6f5a3b4
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58a65ed2-2754-4378-a4cc-5b7fe6f5a3b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 101. POST /v1/auth/token

```text
#101 POST http://localhost:7070/v1/auth/token
correlation: qa-0da5fe5e-18a1-48af-9550-65a7967baa2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0da5fe5e-18a1-48af-9550-65a7967baa2b
Content-Type: application/json

--- request body ---
{"handle":"qa-6fc439b4f917","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0da5fe5e-18a1-48af-9550-65a7967baa2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0da5fe5e-18a1-48af-9550-65a7967baa2b"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dab3901d-39cf-4139-bd30-0ba6fbb635ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dab3901d-39cf-4139-bd30-0ba6fbb635ee
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Mon, 26 Oct 2026 07:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dab3901d-39cf-4139-bd30-0ba6fbb635ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 103. POST /v1/auth/token

```text
#103 POST http://localhost:7070/v1/auth/token
correlation: qa-cdbcf502-5250-402a-b528-c0ee7362ab20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdbcf502-5250-402a-b528-c0ee7362ab20
Content-Type: application/json

--- request body ---
{"handle":"qa-a71166694118","password":"****"}

--- response: 401 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cdbcf502-5250-402a-b528-c0ee7362ab20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cdbcf502-5250-402a-b528-c0ee7362ab20"}
```
