# Transcript: Past its rate limit, a token gets a 429 problem from every operation

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#pastTheLimitEveryOperationIsA429` |
| Features | FEAT-RATE-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 102 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-dfb01b43-33b2-4696-a009-709803778f43` |
| 2 | `POST /v1/accounts` | 201 | 72 | `qa-0200cf6b-6465-4581-80e9-c768d34499f3` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-f12bba9b-5d1a-457f-b207-5c50c447f599` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-1aa560c0-c2ea-4d2e-a00c-ceb2bbb4e0d0` |
| 5 | `GET /v1/accounts/me` | 200 | 32 | `qa-6119054c-80b9-4441-b94a-247e304895ec` |
| 6 | `GET /v1/accounts/me` | 200 | 21 | `qa-5703c020-2fca-460c-8961-e7c59eb0a687` |
| 7 | `GET /v1/accounts/me` | 200 | 23 | `qa-4b895c42-f00d-4d6d-be53-86b86de7c07b` |
| 8 | `GET /v1/accounts/me` | 200 | 17 | `qa-d4089cc8-808b-428e-877a-15b5e01801f6` |
| 9 | `GET /v1/accounts/me` | 200 | 15 | `qa-799555fd-a43d-4e6d-8e13-06587bab731d` |
| 10 | `GET /v1/accounts/me` | 200 | 18 | `qa-d5cdb016-314e-48a8-be6f-eede09c0125c` |
| 11 | `GET /v1/accounts/me` | 200 | 11 | `qa-e3993f8a-28b0-4359-8ccd-a4ed2ab02a93` |
| 12 | `GET /v1/accounts/me` | 200 | 8 | `qa-3541a3e1-9ef9-45bc-ad05-671ebc950db1` |
| 13 | `GET /v1/accounts/me` | 200 | 17 | `qa-22f669d1-5f53-46db-af6a-067714198c4f` |
| 14 | `GET /v1/accounts/me` | 200 | 16 | `qa-6e47eaf1-bfe1-4a23-a692-f184fc81c133` |
| 15 | `GET /v1/accounts/me` | 200 | 14 | `qa-e2164352-ef76-4ec9-8e50-ea9928fe5eaa` |
| 16 | `GET /v1/accounts/me` | 200 | 21 | `qa-660cdc44-4220-4d07-9cad-0a63d7194706` |
| 17 | `GET /v1/accounts/me` | 200 | 31 | `qa-24331603-ffb6-4d10-b632-961abef61566` |
| 18 | `GET /v1/accounts/me` | 200 | 25 | `qa-e593a0f9-cca4-4065-9016-9c960389f4c1` |
| 19 | `GET /v1/accounts/me` | 200 | 13 | `qa-40adea04-0311-42da-b768-371e382b0c35` |
| 20 | `GET /v1/accounts/me` | 200 | 22 | `qa-b29dd751-9391-4a05-86f7-5df7fd01458a` |
| 21 | `GET /v1/accounts/me` | 200 | 22 | `qa-555e31d9-f5ca-40ee-8fa3-bb9765a897b1` |
| 22 | `GET /v1/accounts/me` | 200 | 15 | `qa-cf7583c7-f1af-4abb-bbbf-9539ccbb3093` |
| 23 | `GET /v1/accounts/me` | 200 | 25 | `qa-01a58e16-f153-43c2-94af-7dc7eea8cfb5` |
| 24 | `GET /v1/accounts/me` | 200 | 19 | `qa-8fd23236-0bc8-4e2b-b170-5156d0537110` |
| 25 | `GET /v1/accounts/me` | 200 | 12 | `qa-9d2cb174-3ab0-4213-80a4-027b748f0691` |
| 26 | `GET /v1/accounts/me` | 200 | 13 | `qa-1623250a-b0b4-42a9-8134-5d2caf56df8a` |
| 27 | `GET /v1/accounts/me` | 200 | 36 | `qa-bbe8b694-79a7-4e0e-8954-80c736f950a4` |
| 28 | `GET /v1/accounts/me` | 200 | 30 | `qa-9db0fb05-4baa-4d52-abde-c29511fcb507` |
| 29 | `GET /v1/accounts/me` | 200 | 10 | `qa-5783bd05-193a-4657-8865-aafef3807861` |
| 30 | `GET /v1/accounts/me` | 200 | 22 | `qa-c7163c0b-9017-4e1e-a255-fa133ca15fff` |
| 31 | `GET /v1/accounts/me` | 200 | 25 | `qa-6c49271c-7055-40f9-b1d9-86f9240f3fbd` |
| 32 | `GET /v1/accounts/me` | 200 | 17 | `qa-6130c286-a1dc-4ac0-b22d-a32453612b15` |
| 33 | `GET /v1/accounts/me` | 200 | 13 | `qa-299d9fd8-7da0-4e00-83fa-677aeda5201f` |
| 34 | `GET /v1/accounts/me` | 200 | 16 | `qa-3345a182-6702-4c3a-ae0a-52d08d2fec9d` |
| 35 | `GET /v1/accounts/me` | 200 | 15 | `qa-d8f2605b-9c06-454e-a617-a7fbed7b45bd` |
| 36 | `GET /v1/accounts/me` | 200 | 4 | `qa-44b4931d-6713-4d2f-8752-ec0927cdec11` |
| 37 | `GET /v1/accounts/me` | 200 | 6 | `qa-67a20637-adf7-4d9a-9954-a0d6bebedf1f` |
| 38 | `GET /v1/accounts/me` | 200 | 13 | `qa-ea66fcfb-58a2-4748-91ad-5ea0d87c788f` |
| 39 | `GET /v1/accounts/me` | 200 | 15 | `qa-5b344bca-1b99-4600-b406-819cdf774e10` |
| 40 | `GET /v1/accounts/me` | 200 | 19 | `qa-5de50fb1-7dca-41d4-ba91-98762bad594f` |
| 41 | `GET /v1/accounts/me` | 200 | 12 | `qa-d20cb810-e463-4d93-8a07-fc306dd0a050` |
| 42 | `GET /v1/accounts/me` | 200 | 17 | `qa-ecbc4dea-a02e-44e6-8a52-d1cecfb62972` |
| 43 | `GET /v1/accounts/me` | 200 | 19 | `qa-226ccc01-e6ea-4a5f-bdf5-58ec156124d1` |
| 44 | `GET /v1/accounts/me` | 200 | 13 | `qa-2e44427f-f784-4a35-a35c-7f66c7d8ae85` |
| 45 | `GET /v1/accounts/me` | 200 | 15 | `qa-0831ebd3-4af8-445a-970a-6d252c7e45fb` |
| 46 | `GET /v1/accounts/me` | 200 | 5 | `qa-0e805690-77bd-4cbf-9dc7-edd8c7a4975c` |
| 47 | `GET /v1/accounts/me` | 200 | 4 | `qa-65065572-04a8-462c-ab97-b0380427944a` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-3cdc448b-2607-4a6a-b2cb-eb4f38b6b9bf` |
| 49 | `GET /v1/accounts/me` | 200 | 5 | `qa-efb44390-9495-4266-9d5b-ca0884b89eb5` |
| 50 | `GET /v1/accounts/me` | 200 | 7 | `qa-f938ecfa-2d35-4656-a8f8-06f86b036e1c` |
| 51 | `GET /v1/accounts/me` | 200 | 9 | `qa-7c347781-849b-4aab-80d7-cd0b5fcb12f6` |
| 52 | `GET /v1/accounts/me` | 200 | 3 | `qa-3254a701-8639-46a5-ba5c-a1a0fa23a376` |
| 53 | `GET /v1/accounts/me` | 200 | 6 | `qa-be9f94ff-bb90-46eb-b3b2-7890261e245f` |
| 54 | `GET /v1/accounts/me` | 200 | 6 | `qa-2dff1314-59c8-4560-a5f6-19c86c0972bc` |
| 55 | `GET /v1/accounts/me` | 200 | 6 | `qa-5a5d1c5f-378e-40ea-bb13-ed8a435ef6bd` |
| 56 | `GET /v1/accounts/me` | 200 | 9 | `qa-7018b169-839d-462f-b8c4-3a3fe881de6f` |
| 57 | `GET /v1/accounts/me` | 200 | 11 | `qa-fac6ecdf-c9a8-41f9-8231-7f2a9f719906` |
| 58 | `GET /v1/accounts/me` | 200 | 10 | `qa-77125dd5-0b25-4158-b3b4-767067fe382e` |
| 59 | `GET /v1/accounts/me` | 200 | 6 | `qa-8a4152b0-d145-479c-bf5a-5eba1e78842b` |
| 60 | `GET /v1/accounts/me` | 200 | 9 | `qa-a9005832-4214-4605-be98-50a6417705d4` |
| 61 | `GET /v1/accounts/me` | 200 | 10 | `qa-de79385f-0f78-4736-bad9-fde2d4e62cf9` |
| 62 | `GET /v1/accounts/me` | 200 | 9 | `qa-7f4ba05c-d71f-4c28-a39f-6efef7be0342` |
| 63 | `GET /v1/accounts/me` | 200 | 15 | `qa-313e35d0-6d62-4879-8acc-c137413a50d3` |
| 64 | `GET /v1/accounts/me` | 429 | 60 | `qa-9e9890ff-d145-44a0-a6f0-37fba0fa41b8` |
| 65 | `POST /v1/auth/token` | 429 | 16 | `qa-50987adb-3f4f-43c0-b9aa-7329cf03eba2` |
| 66 | `POST /v1/accounts` | 429 | 14 | `qa-6f3dfbb9-22e1-4a73-8953-db2a942a35ad` |
| 67 | `GET /v1/accounts/me` | 429 | 11 | `qa-311bc243-b7cd-4546-a2af-ffb98c67e21b` |
| 68 | `PATCH /v1/accounts/me` | 429 | 4 | `qa-17f6c442-1cdd-4b65-8688-6f577d37708c` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-eeda4110-3ab4-4ddf-a1d9-270bd06eed6f` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 4 | `qa-83d943c8-ce76-4326-b669-7faf24b9cf4b` |
| 71 | `POST /v1/conversations` | 429 | 5 | `qa-92100717-c655-402d-abb5-3b6c1276acce` |
| 72 | `GET /v1/conversations` | 429 | 4 | `qa-ecd5d4bf-fe6e-431f-8cce-b09e378c2d86` |
| 73 | `GET /v1/conversations/{id}` | 429 | 4 | `qa-7f036e34-87a2-42d8-a38c-ce952b66e2ab` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 5 | `qa-3f9612fb-3297-4a2c-a1c1-0dee257620aa` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 5 | `qa-e1947d63-77fa-48b6-ad26-26343159b645` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-8d87113c-9ead-4d76-8504-69fb7a4d16cb` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 4 | `qa-be1da99c-81cc-4fc1-bc57-b69f3e4b2c0f` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-01a8dbf2-6bb9-48cd-93b6-8a17c0aa4ab6` |
| 79 | `GET /v1/credits/ledger` | 429 | 4 | `qa-4e0b932f-e9fc-4ebe-a98e-f7cb95f9f77c` |
| 80 | `POST /v1/credits/purchases` | 429 | 5 | `qa-d6d91a51-84bf-4cc3-9c98-c807bc63a4e7` |
| 81 | `GET /v1/admin/stats` | 429 | 4 | `qa-6d2d5014-0e8c-46d3-a3a6-d5141eecaf9e` |
| 82 | `GET /v1/accounts/me` | 429 | 5 | `qa-f0b46ee6-e449-4017-b4a2-018d81408535` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-9ac0bdb1-c015-499c-97f5-b7d8a91f0141` |
| 84 | `GET /v1/accounts/me` | 429 | 4 | `qa-7e4b11e9-f3ac-427a-928d-0a8282e46b79` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-5b9920c0-0155-44c1-8768-a24c94ed4095` |
| 86 | `GET /v1/accounts/me` | 429 | 4 | `qa-9f89cb11-1f1a-4ba0-b8f7-01ffcae11d0c` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-fb9a9cc1-4999-46e6-8a4c-da0cff6be11b` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-d1bd74c5-4ea1-4a28-a215-d9744ebcda44` |
| 89 | `GET /v1/accounts/me` | 429 | 4 | `qa-77068cd5-78de-409c-96d8-dac8ccc8c7e6` |
| 90 | `GET /v1/accounts/me` | 429 | 4 | `qa-7464b7fb-9e02-463b-8e62-036a22a9f508` |
| 91 | `GET /v1/accounts/me` | 429 | 4 | `qa-35d1aa5a-07d1-40a6-af0f-1772f036b04e` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-88cc07c7-3e50-4129-8714-456bf8ede899` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-495a822f-3fb2-4e8d-9382-db635e334db5` |
| 94 | `GET /v1/accounts/me` | 429 | 3 | `qa-690ac629-09b1-4835-87fb-4c67824ff341` |
| 95 | `GET /v1/accounts/me` | 429 | 7 | `qa-d0f7c44f-07e5-4b53-bf4c-68a6bd25462c` |
| 96 | `GET /v1/accounts/me` | 429 | 6 | `qa-d2feef0e-6f3c-4f8a-b44b-7d2f0ef3e0a0` |
| 97 | `GET /v1/accounts/me` | 200 | 5 | `qa-fea8bfcb-1cc9-4313-821f-125d298d3285` |
| 98 | `POST /v1/auth/token` | 200 | 11 | `qa-6f6c1403-5ffe-4970-bc99-4fa6356b8325` |
| 99 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-75923dd4-8bcb-408e-80c1-ba94119e40dc` |
| 100 | `POST /v1/auth/token` | 401 | 4 | `qa-96c1d233-fdf3-4b47-89e3-dd2cb73b7a8e` |
| 101 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-dea031bb-d564-4e6f-aa97-2b273b638345` |
| 102 | `POST /v1/auth/token` | 401 | 5 | `qa-b15603a6-f786-4380-bfca-e8108664fe76` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dfb01b43-33b2-4696-a009-709803778f43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfb01b43-33b2-4696-a009-709803778f43
Content-Type: application/json

--- request body ---
{"handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfb01b43-33b2-4696-a009-709803778f43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 7
Location: /v1/accounts/qa-5d83eccd381d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0200cf6b-6465-4581-80e9-c768d34499f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0200cf6b-6465-4581-80e9-c768d34499f3
Content-Type: application/json

--- request body ---
{"handle":"qa-21451678bfcd","displayName":"QA 21451678bfcd","password":"****","region":"eu"}

--- response: 201 in 72 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0200cf6b-6465-4581-80e9-c768d34499f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 7
Location: /v1/accounts/qa-21451678bfcd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c407a747-fcd0-4602-890b-5eef7b828a06","handle":"qa-21451678bfcd","displayName":"QA 21451678bfcd","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.012808609Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f12bba9b-5d1a-457f-b207-5c50c447f599

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f12bba9b-5d1a-457f-b207-5c50c447f599
Content-Type: application/json

--- request body ---
{"handle":"qa-5d83eccd381d","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f12bba9b-5d1a-457f-b207-5c50c447f599
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1aa560c0-c2ea-4d2e-a00c-ceb2bbb4e0d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1aa560c0-c2ea-4d2e-a00c-ceb2bbb4e0d0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-21451678bfcd","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1aa560c0-c2ea-4d2e-a00c-ceb2bbb4e0d0
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
Location: /v1/conversations/cnv_0b75a497-dbe4-42f4-8885-e519e2700729
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0b75a497-dbe4-42f4-8885-e519e2700729","subject":"Error contract","status":"open","region":"eu","participants":["qa-5d83eccd381d","qa-21451678bfcd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.095650097Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-6119054c-80b9-4441-b94a-247e304895ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6119054c-80b9-4441-b94a-247e304895ec
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6119054c-80b9-4441-b94a-247e304895ec
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-5703c020-2fca-460c-8961-e7c59eb0a687

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5703c020-2fca-460c-8961-e7c59eb0a687
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5703c020-2fca-460c-8961-e7c59eb0a687
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-4b895c42-f00d-4d6d-be53-86b86de7c07b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b895c42-f00d-4d6d-be53-86b86de7c07b
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b895c42-f00d-4d6d-be53-86b86de7c07b
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-d4089cc8-808b-428e-877a-15b5e01801f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4089cc8-808b-428e-877a-15b5e01801f6
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4089cc8-808b-428e-877a-15b5e01801f6
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-799555fd-a43d-4e6d-8e13-06587bab731d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-799555fd-a43d-4e6d-8e13-06587bab731d
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-799555fd-a43d-4e6d-8e13-06587bab731d
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5cdb016-314e-48a8-be6f-eede09c0125c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5cdb016-314e-48a8-be6f-eede09c0125c
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5cdb016-314e-48a8-be6f-eede09c0125c
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-e3993f8a-28b0-4359-8ccd-a4ed2ab02a93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3993f8a-28b0-4359-8ccd-a4ed2ab02a93
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3993f8a-28b0-4359-8ccd-a4ed2ab02a93
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-3541a3e1-9ef9-45bc-ad05-671ebc950db1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3541a3e1-9ef9-45bc-ad05-671ebc950db1
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3541a3e1-9ef9-45bc-ad05-671ebc950db1
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-22f669d1-5f53-46db-af6a-067714198c4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22f669d1-5f53-46db-af6a-067714198c4f
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-22f669d1-5f53-46db-af6a-067714198c4f
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e47eaf1-bfe1-4a23-a692-f184fc81c133

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e47eaf1-bfe1-4a23-a692-f184fc81c133
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e47eaf1-bfe1-4a23-a692-f184fc81c133
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-e2164352-ef76-4ec9-8e50-ea9928fe5eaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2164352-ef76-4ec9-8e50-ea9928fe5eaa
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2164352-ef76-4ec9-8e50-ea9928fe5eaa
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-660cdc44-4220-4d07-9cad-0a63d7194706

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-660cdc44-4220-4d07-9cad-0a63d7194706
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-660cdc44-4220-4d07-9cad-0a63d7194706
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-24331603-ffb6-4d10-b632-961abef61566

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24331603-ffb6-4d10-b632-961abef61566
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-24331603-ffb6-4d10-b632-961abef61566
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-e593a0f9-cca4-4065-9016-9c960389f4c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e593a0f9-cca4-4065-9016-9c960389f4c1
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e593a0f9-cca4-4065-9016-9c960389f4c1
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-40adea04-0311-42da-b768-371e382b0c35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40adea04-0311-42da-b768-371e382b0c35
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-40adea04-0311-42da-b768-371e382b0c35
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-b29dd751-9391-4a05-86f7-5df7fd01458a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b29dd751-9391-4a05-86f7-5df7fd01458a
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b29dd751-9391-4a05-86f7-5df7fd01458a
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-555e31d9-f5ca-40ee-8fa3-bb9765a897b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-555e31d9-f5ca-40ee-8fa3-bb9765a897b1
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-555e31d9-f5ca-40ee-8fa3-bb9765a897b1
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf7583c7-f1af-4abb-bbbf-9539ccbb3093

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf7583c7-f1af-4abb-bbbf-9539ccbb3093
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf7583c7-f1af-4abb-bbbf-9539ccbb3093
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-01a58e16-f153-43c2-94af-7dc7eea8cfb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01a58e16-f153-43c2-94af-7dc7eea8cfb5
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-01a58e16-f153-43c2-94af-7dc7eea8cfb5
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-8fd23236-0bc8-4e2b-b170-5156d0537110

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fd23236-0bc8-4e2b-b170-5156d0537110
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fd23236-0bc8-4e2b-b170-5156d0537110
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d2cb174-3ab0-4213-80a4-027b748f0691

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d2cb174-3ab0-4213-80a4-027b748f0691
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d2cb174-3ab0-4213-80a4-027b748f0691
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-1623250a-b0b4-42a9-8134-5d2caf56df8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1623250a-b0b4-42a9-8134-5d2caf56df8a
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1623250a-b0b4-42a9-8134-5d2caf56df8a
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-bbe8b694-79a7-4e0e-8954-80c736f950a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbe8b694-79a7-4e0e-8954-80c736f950a4
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbe8b694-79a7-4e0e-8954-80c736f950a4
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-9db0fb05-4baa-4d52-abde-c29511fcb507

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9db0fb05-4baa-4d52-abde-c29511fcb507
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9db0fb05-4baa-4d52-abde-c29511fcb507
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-5783bd05-193a-4657-8865-aafef3807861

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5783bd05-193a-4657-8865-aafef3807861
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5783bd05-193a-4657-8865-aafef3807861
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-c7163c0b-9017-4e1e-a255-fa133ca15fff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7163c0b-9017-4e1e-a255-fa133ca15fff
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7163c0b-9017-4e1e-a255-fa133ca15fff
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c49271c-7055-40f9-b1d9-86f9240f3fbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c49271c-7055-40f9-b1d9-86f9240f3fbd
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c49271c-7055-40f9-b1d9-86f9240f3fbd
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-6130c286-a1dc-4ac0-b22d-a32453612b15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6130c286-a1dc-4ac0-b22d-a32453612b15
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6130c286-a1dc-4ac0-b22d-a32453612b15
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-299d9fd8-7da0-4e00-83fa-677aeda5201f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-299d9fd8-7da0-4e00-83fa-677aeda5201f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-299d9fd8-7da0-4e00-83fa-677aeda5201f
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-3345a182-6702-4c3a-ae0a-52d08d2fec9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3345a182-6702-4c3a-ae0a-52d08d2fec9d
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3345a182-6702-4c3a-ae0a-52d08d2fec9d
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-d8f2605b-9c06-454e-a617-a7fbed7b45bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8f2605b-9c06-454e-a617-a7fbed7b45bd
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8f2605b-9c06-454e-a617-a7fbed7b45bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-44b4931d-6713-4d2f-8752-ec0927cdec11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44b4931d-6713-4d2f-8752-ec0927cdec11
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-44b4931d-6713-4d2f-8752-ec0927cdec11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-67a20637-adf7-4d9a-9954-a0d6bebedf1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67a20637-adf7-4d9a-9954-a0d6bebedf1f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-67a20637-adf7-4d9a-9954-a0d6bebedf1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea66fcfb-58a2-4748-91ad-5ea0d87c788f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea66fcfb-58a2-4748-91ad-5ea0d87c788f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea66fcfb-58a2-4748-91ad-5ea0d87c788f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b344bca-1b99-4600-b406-819cdf774e10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b344bca-1b99-4600-b406-819cdf774e10
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b344bca-1b99-4600-b406-819cdf774e10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-5de50fb1-7dca-41d4-ba91-98762bad594f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5de50fb1-7dca-41d4-ba91-98762bad594f
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5de50fb1-7dca-41d4-ba91-98762bad594f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-d20cb810-e463-4d93-8a07-fc306dd0a050

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d20cb810-e463-4d93-8a07-fc306dd0a050
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d20cb810-e463-4d93-8a07-fc306dd0a050
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-ecbc4dea-a02e-44e6-8a52-d1cecfb62972

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecbc4dea-a02e-44e6-8a52-d1cecfb62972
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecbc4dea-a02e-44e6-8a52-d1cecfb62972
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-226ccc01-e6ea-4a5f-bdf5-58ec156124d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-226ccc01-e6ea-4a5f-bdf5-58ec156124d1
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-226ccc01-e6ea-4a5f-bdf5-58ec156124d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e44427f-f784-4a35-a35c-7f66c7d8ae85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e44427f-f784-4a35-a35c-7f66c7d8ae85
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e44427f-f784-4a35-a35c-7f66c7d8ae85
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-0831ebd3-4af8-445a-970a-6d252c7e45fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0831ebd3-4af8-445a-970a-6d252c7e45fb
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0831ebd3-4af8-445a-970a-6d252c7e45fb
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e805690-77bd-4cbf-9dc7-edd8c7a4975c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e805690-77bd-4cbf-9dc7-edd8c7a4975c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e805690-77bd-4cbf-9dc7-edd8c7a4975c
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-65065572-04a8-462c-ab97-b0380427944a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65065572-04a8-462c-ab97-b0380427944a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-65065572-04a8-462c-ab97-b0380427944a
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-3cdc448b-2607-4a6a-b2cb-eb4f38b6b9bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cdc448b-2607-4a6a-b2cb-eb4f38b6b9bf
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cdc448b-2607-4a6a-b2cb-eb4f38b6b9bf
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-efb44390-9495-4266-9d5b-ca0884b89eb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efb44390-9495-4266-9d5b-ca0884b89eb5
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-efb44390-9495-4266-9d5b-ca0884b89eb5
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-f938ecfa-2d35-4656-a8f8-06f86b036e1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f938ecfa-2d35-4656-a8f8-06f86b036e1c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f938ecfa-2d35-4656-a8f8-06f86b036e1c
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c347781-849b-4aab-80d7-cd0b5fcb12f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c347781-849b-4aab-80d7-cd0b5fcb12f6
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c347781-849b-4aab-80d7-cd0b5fcb12f6
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-3254a701-8639-46a5-ba5c-a1a0fa23a376

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3254a701-8639-46a5-ba5c-a1a0fa23a376
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3254a701-8639-46a5-ba5c-a1a0fa23a376
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-be9f94ff-bb90-46eb-b3b2-7890261e245f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be9f94ff-bb90-46eb-b3b2-7890261e245f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-be9f94ff-bb90-46eb-b3b2-7890261e245f
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-2dff1314-59c8-4560-a5f6-19c86c0972bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dff1314-59c8-4560-a5f6-19c86c0972bc
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dff1314-59c8-4560-a5f6-19c86c0972bc
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a5d1c5f-378e-40ea-bb13-ed8a435ef6bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a5d1c5f-378e-40ea-bb13-ed8a435ef6bd
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a5d1c5f-378e-40ea-bb13-ed8a435ef6bd
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-7018b169-839d-462f-b8c4-3a3fe881de6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7018b169-839d-462f-b8c4-3a3fe881de6f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-7018b169-839d-462f-b8c4-3a3fe881de6f
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-fac6ecdf-c9a8-41f9-8231-7f2a9f719906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fac6ecdf-c9a8-41f9-8231-7f2a9f719906
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-fac6ecdf-c9a8-41f9-8231-7f2a9f719906
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-77125dd5-0b25-4158-b3b4-767067fe382e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77125dd5-0b25-4158-b3b4-767067fe382e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-77125dd5-0b25-4158-b3b4-767067fe382e
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-8a4152b0-d145-479c-bf5a-5eba1e78842b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a4152b0-d145-479c-bf5a-5eba1e78842b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a4152b0-d145-479c-bf5a-5eba1e78842b
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-a9005832-4214-4605-be98-50a6417705d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9005832-4214-4605-be98-50a6417705d4
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9005832-4214-4605-be98-50a6417705d4
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-de79385f-0f78-4736-bad9-fde2d4e62cf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de79385f-0f78-4736-bad9-fde2d4e62cf9
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-de79385f-0f78-4736-bad9-fde2d4e62cf9
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-7f4ba05c-d71f-4c28-a39f-6efef7be0342

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f4ba05c-d71f-4c28-a39f-6efef7be0342
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f4ba05c-d71f-4c28-a39f-6efef7be0342
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-313e35d0-6d62-4879-8acc-c137413a50d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-313e35d0-6d62-4879-8acc-c137413a50d3
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-313e35d0-6d62-4879-8acc-c137413a50d3
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-9e9890ff-d145-44a0-a6f0-37fba0fa41b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e9890ff-d145-44a0-a6f0-37fba0fa41b8
Content-Type: application/json

--- response: 429 in 60 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e9890ff-d145-44a0-a6f0-37fba0fa41b8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9e9890ff-d145-44a0-a6f0-37fba0fa41b8"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-50987adb-3f4f-43c0-b9aa-7329cf03eba2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50987adb-3f4f-43c0-b9aa-7329cf03eba2
Content-Type: application/json

--- request body ---
{"handle":"qa-5d83eccd381d","password":"****"}

--- response: 429 in 16 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50987adb-3f4f-43c0-b9aa-7329cf03eba2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-50987adb-3f4f-43c0-b9aa-7329cf03eba2"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-6f3dfbb9-22e1-4a73-8953-db2a942a35ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f3dfbb9-22e1-4a73-8953-db2a942a35ad
Content-Type: application/json

--- request body ---
{"handle":"qa-e4a8decf98b6","displayName":"QA e4a8decf98b6","password":"****","region":"eu"}

--- response: 429 in 14 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f3dfbb9-22e1-4a73-8953-db2a942a35ad
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-6f3dfbb9-22e1-4a73-8953-db2a942a35ad"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-311bc243-b7cd-4546-a2af-ffb98c67e21b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-311bc243-b7cd-4546-a2af-ffb98c67e21b
Content-Type: application/json

--- response: 429 in 11 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-311bc243-b7cd-4546-a2af-ffb98c67e21b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-311bc243-b7cd-4546-a2af-ffb98c67e21b"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-17f6c442-1cdd-4b65-8688-6f577d37708c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17f6c442-1cdd-4b65-8688-6f577d37708c
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17f6c442-1cdd-4b65-8688-6f577d37708c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-17f6c442-1cdd-4b65-8688-6f577d37708c"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eeda4110-3ab4-4ddf-a1d9-270bd06eed6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eeda4110-3ab4-4ddf-a1d9-270bd06eed6f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eeda4110-3ab4-4ddf-a1d9-270bd06eed6f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-eeda4110-3ab4-4ddf-a1d9-270bd06eed6f"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-5d83eccd381d
correlation: qa-83d943c8-ce76-4326-b669-7faf24b9cf4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83d943c8-ce76-4326-b669-7faf24b9cf4b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83d943c8-ce76-4326-b669-7faf24b9cf4b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-5d83eccd381d","correlationId":"qa-83d943c8-ce76-4326-b669-7faf24b9cf4b"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-92100717-c655-402d-abb5-3b6c1276acce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92100717-c655-402d-abb5-3b6c1276acce
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5d83eccd381d","subject":"Probe","message":"Hi"}

--- response: 429 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92100717-c655-402d-abb5-3b6c1276acce
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-92100717-c655-402d-abb5-3b6c1276acce"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-ecd5d4bf-fe6e-431f-8cce-b09e378c2d86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecd5d4bf-fe6e-431f-8cce-b09e378c2d86
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ecd5d4bf-fe6e-431f-8cce-b09e378c2d86
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-ecd5d4bf-fe6e-431f-8cce-b09e378c2d86"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_0b75a497-dbe4-42f4-8885-e519e2700729
correlation: qa-7f036e34-87a2-42d8-a38c-ce952b66e2ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f036e34-87a2-42d8-a38c-ce952b66e2ab
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f036e34-87a2-42d8-a38c-ce952b66e2ab
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
Content-Length: 284

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_0b75a497-dbe4-42f4-8885-e519e2700729","correlationId":"qa-7f036e34-87a2-42d8-a38c-ce952b66e2ab"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_0b75a497-dbe4-42f4-8885-e519e2700729/messages
correlation: qa-3f9612fb-3297-4a2c-a1c1-0dee257620aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f9612fb-3297-4a2c-a1c1-0dee257620aa
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f9612fb-3297-4a2c-a1c1-0dee257620aa
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
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_0b75a497-dbe4-42f4-8885-e519e2700729/messages","correlationId":"qa-3f9612fb-3297-4a2c-a1c1-0dee257620aa"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_0b75a497-dbe4-42f4-8885-e519e2700729/messages
correlation: qa-e1947d63-77fa-48b6-ad26-26343159b645

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1947d63-77fa-48b6-ad26-26343159b645
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1947d63-77fa-48b6-ad26-26343159b645
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
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_0b75a497-dbe4-42f4-8885-e519e2700729/messages","correlationId":"qa-e1947d63-77fa-48b6-ad26-26343159b645"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_0b75a497-dbe4-42f4-8885-e519e2700729/read
correlation: qa-8d87113c-9ead-4d76-8504-69fb7a4d16cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d87113c-9ead-4d76-8504-69fb7a4d16cb
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d87113c-9ead-4d76-8504-69fb7a4d16cb
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
Content-Length: 289

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_0b75a497-dbe4-42f4-8885-e519e2700729/read","correlationId":"qa-8d87113c-9ead-4d76-8504-69fb7a4d16cb"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_0b75a497-dbe4-42f4-8885-e519e2700729/close
correlation: qa-be1da99c-81cc-4fc1-bc57-b69f3e4b2c0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be1da99c-81cc-4fc1-bc57-b69f3e4b2c0f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be1da99c-81cc-4fc1-bc57-b69f3e4b2c0f
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
Content-Length: 290

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_0b75a497-dbe4-42f4-8885-e519e2700729/close","correlationId":"qa-be1da99c-81cc-4fc1-bc57-b69f3e4b2c0f"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-01a8dbf2-6bb9-48cd-93b6-8a17c0aa4ab6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01a8dbf2-6bb9-48cd-93b6-8a17c0aa4ab6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01a8dbf2-6bb9-48cd-93b6-8a17c0aa4ab6
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
Content-Length: 245

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-01a8dbf2-6bb9-48cd-93b6-8a17c0aa4ab6"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-4e0b932f-e9fc-4ebe-a98e-f7cb95f9f77c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e0b932f-e9fc-4ebe-a98e-f7cb95f9f77c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e0b932f-e9fc-4ebe-a98e-f7cb95f9f77c
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
Content-Length: 244

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-4e0b932f-e9fc-4ebe-a98e-f7cb95f9f77c"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d6d91a51-84bf-4cc3-9c98-c807bc63a4e7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-af4b620a175d4010a452fdc1a4b0bf93
X-Correlation-Id: qa-d6d91a51-84bf-4cc3-9c98-c807bc63a4e7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6d91a51-84bf-4cc3-9c98-c807bc63a4e7
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
Content-Length: 247

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-d6d91a51-84bf-4cc3-9c98-c807bc63a4e7"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-6d2d5014-0e8c-46d3-a3a6-d5141eecaf9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d2d5014-0e8c-46d3-a3a6-d5141eecaf9e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d2d5014-0e8c-46d3-a3a6-d5141eecaf9e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-6d2d5014-0e8c-46d3-a3a6-d5141eecaf9e"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-f0b46ee6-e449-4017-b4a2-018d81408535

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0b46ee6-e449-4017-b4a2-018d81408535
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0b46ee6-e449-4017-b4a2-018d81408535
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f0b46ee6-e449-4017-b4a2-018d81408535"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ac0bdb1-c015-499c-97f5-b7d8a91f0141

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ac0bdb1-c015-499c-97f5-b7d8a91f0141
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 27 Nov 2026 11:00:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ac0bdb1-c015-499c-97f5-b7d8a91f0141
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9ac0bdb1-c015-499c-97f5-b7d8a91f0141"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e4b11e9-f3ac-427a-928d-0a8282e46b79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e4b11e9-f3ac-427a-928d-0a8282e46b79
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e4b11e9-f3ac-427a-928d-0a8282e46b79
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7e4b11e9-f3ac-427a-928d-0a8282e46b79"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b9920c0-0155-44c1-8768-a24c94ed4095

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b9920c0-0155-44c1-8768-a24c94ed4095
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 27 Nov 2026 11:00:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b9920c0-0155-44c1-8768-a24c94ed4095
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5b9920c0-0155-44c1-8768-a24c94ed4095"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-9f89cb11-1f1a-4ba0-b8f7-01ffcae11d0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f89cb11-1f1a-4ba0-b8f7-01ffcae11d0c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f89cb11-1f1a-4ba0-b8f7-01ffcae11d0c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9f89cb11-1f1a-4ba0-b8f7-01ffcae11d0c"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-fb9a9cc1-4999-46e6-8a4c-da0cff6be11b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb9a9cc1-4999-46e6-8a4c-da0cff6be11b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 27 Nov 2026 11:00:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb9a9cc1-4999-46e6-8a4c-da0cff6be11b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fb9a9cc1-4999-46e6-8a4c-da0cff6be11b"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1bd74c5-4ea1-4a28-a215-d9744ebcda44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1bd74c5-4ea1-4a28-a215-d9744ebcda44
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 27 Nov 2026 11:00:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1bd74c5-4ea1-4a28-a215-d9744ebcda44
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d1bd74c5-4ea1-4a28-a215-d9744ebcda44"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-77068cd5-78de-409c-96d8-dac8ccc8c7e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77068cd5-78de-409c-96d8-dac8ccc8c7e6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77068cd5-78de-409c-96d8-dac8ccc8c7e6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-77068cd5-78de-409c-96d8-dac8ccc8c7e6"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-7464b7fb-9e02-463b-8e62-036a22a9f508

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7464b7fb-9e02-463b-8e62-036a22a9f508
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7464b7fb-9e02-463b-8e62-036a22a9f508
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7464b7fb-9e02-463b-8e62-036a22a9f508"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-35d1aa5a-07d1-40a6-af0f-1772f036b04e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35d1aa5a-07d1-40a6-af0f-1772f036b04e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35d1aa5a-07d1-40a6-af0f-1772f036b04e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-35d1aa5a-07d1-40a6-af0f-1772f036b04e"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-88cc07c7-3e50-4129-8714-456bf8ede899

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88cc07c7-3e50-4129-8714-456bf8ede899
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-88cc07c7-3e50-4129-8714-456bf8ede899
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-88cc07c7-3e50-4129-8714-456bf8ede899"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-495a822f-3fb2-4e8d-9382-db635e334db5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-495a822f-3fb2-4e8d-9382-db635e334db5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-495a822f-3fb2-4e8d-9382-db635e334db5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-495a822f-3fb2-4e8d-9382-db635e334db5"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-690ac629-09b1-4835-87fb-4c67824ff341

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-690ac629-09b1-4835-87fb-4c67824ff341
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 27 Nov 2026 11:00:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-690ac629-09b1-4835-87fb-4c67824ff341
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-690ac629-09b1-4835-87fb-4c67824ff341"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0f7c44f-07e5-4b53-bf4c-68a6bd25462c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0f7c44f-07e5-4b53-bf4c-68a6bd25462c
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Fri, 27 Nov 2026 11:00:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0f7c44f-07e5-4b53-bf4c-68a6bd25462c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d0f7c44f-07e5-4b53-bf4c-68a6bd25462c"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2feef0e-6f3c-4f8a-b44b-7d2f0ef3e0a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2feef0e-6f3c-4f8a-b44b-7d2f0ef3e0a0
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Fri, 27 Nov 2026 11:00:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2feef0e-6f3c-4f8a-b44b-7d2f0ef3e0a0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d2feef0e-6f3c-4f8a-b44b-7d2f0ef3e0a0"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-fea8bfcb-1cc9-4313-821f-125d298d3285

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fea8bfcb-1cc9-4313-821f-125d298d3285
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-fea8bfcb-1cc9-4313-821f-125d298d3285
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

{"id":"acc_3356baa2-27cf-498f-86b0-bc02492b3ef8","handle":"qa-5d83eccd381d","displayName":"QA 5d83eccd381d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.907917866Z"}
```

## 98. POST /v1/auth/token

```text
#98 POST http://localhost:7070/v1/auth/token
correlation: qa-6f6c1403-5ffe-4970-bc99-4fa6356b8325

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f6c1403-5ffe-4970-bc99-4fa6356b8325
Content-Type: application/json

--- request body ---
{"handle":"qa-21451678bfcd","password":"****"}

--- response: 200 in 11 ms ---
Date: Fri, 27 Nov 2026 11:00:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f6c1403-5ffe-4970-bc99-4fa6356b8325
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c407a747-fcd0-4602-890b-5eef7b828a06"}
```

## 99. DELETE /v1/accounts/me

```text
#99 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-75923dd4-8bcb-408e-80c1-ba94119e40dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75923dd4-8bcb-408e-80c1-ba94119e40dc
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-75923dd4-8bcb-408e-80c1-ba94119e40dc
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

## 100. POST /v1/auth/token

```text
#100 POST http://localhost:7070/v1/auth/token
correlation: qa-96c1d233-fdf3-4b47-89e3-dd2cb73b7a8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96c1d233-fdf3-4b47-89e3-dd2cb73b7a8e
Content-Type: application/json

--- request body ---
{"handle":"qa-21451678bfcd","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96c1d233-fdf3-4b47-89e3-dd2cb73b7a8e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-96c1d233-fdf3-4b47-89e3-dd2cb73b7a8e"}
```

## 101. DELETE /v1/accounts/me

```text
#101 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dea031bb-d564-4e6f-aa97-2b273b638345

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dea031bb-d564-4e6f-aa97-2b273b638345
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dea031bb-d564-4e6f-aa97-2b273b638345
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

## 102. POST /v1/auth/token

```text
#102 POST http://localhost:7070/v1/auth/token
correlation: qa-b15603a6-f786-4380-bfca-e8108664fe76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b15603a6-f786-4380-bfca-e8108664fe76
Content-Type: application/json

--- request body ---
{"handle":"qa-5d83eccd381d","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b15603a6-f786-4380-bfca-e8108664fe76
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b15603a6-f786-4380-bfca-e8108664fe76"}
```
