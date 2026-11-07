# Transcript: Grants, purchases and spends sum to the balance

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.LedgerConsistencyTest#historySumsToTheBalance` |
| Features | FEAT-LEDGER-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 514 | `qa-25975cb8-48e2-4ee6-a067-7d2f8fd6b09a` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-4fd82c9d-4b41-4c0e-84fc-5ceb59690f36` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-f15184ae-db34-478a-85cc-ba7946bb11d5` |
| 4 | `POST /v1/credits/purchases` | 201 | 53 | `qa-1e3f71f4-9a0d-4ef0-81cf-af8dea41c9ad` |
| 5 | `POST /v1/credits/purchases` | 201 | 28 | `qa-572c0911-9a95-4f88-b154-b00a1258bc4a` |
| 6 | `POST /v1/conversations` | 201 | 20 | `qa-12999e33-ad65-47a8-872b-a9e993699250` |
| 7 | `GET /v1/credits/ledger` | 200 | 47 | `qa-542d40e6-c203-4880-9d32-2dd17c3f5485` |
| 8 | `GET /v1/credits/balance` | 200 | 17 | `qa-1d447b1f-e946-4aa7-b416-68046f8c6193` |
| 9 | `POST /v1/auth/token` | 200 | 30 | `qa-96df5a41-5cd0-496c-bf54-fb3b5bfe6889` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-40819202-fe74-4b5c-98f1-177422f9622e` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-82e223f3-ae01-46ff-aed0-31ddab65b916` |
| 12 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-a70919f5-4f74-487d-bdf1-708e5313ae31` |
| 13 | `POST /v1/auth/token` | 401 | 17 | `qa-db0d08b3-f9eb-45d7-a117-33bbbead0fad` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-25975cb8-48e2-4ee6-a067-7d2f8fd6b09a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25975cb8-48e2-4ee6-a067-7d2f8fd6b09a
Content-Type: application/json

--- request body ---
{"handle":"qa-bdbc4b573815","displayName":"QA bdbc4b573815","password":"****","region":"eu"}

--- response: 201 in 514 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-25975cb8-48e2-4ee6-a067-7d2f8fd6b09a
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
Location: /v1/accounts/qa-bdbc4b573815
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d704b1a2-db2c-4f3e-a6ab-fdfc1528e858","handle":"qa-bdbc4b573815","displayName":"QA bdbc4b573815","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.212652408Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4fd82c9d-4b41-4c0e-84fc-5ceb59690f36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fd82c9d-4b41-4c0e-84fc-5ceb59690f36
Content-Type: application/json

--- request body ---
{"handle":"qa-d5c9a9faefcf","displayName":"QA d5c9a9faefcf","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fd82c9d-4b41-4c0e-84fc-5ceb59690f36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Location: /v1/accounts/qa-d5c9a9faefcf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fccf0263-517b-41d9-b9c2-b11bea40951a","handle":"qa-d5c9a9faefcf","displayName":"QA d5c9a9faefcf","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.811395888Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f15184ae-db34-478a-85cc-ba7946bb11d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f15184ae-db34-478a-85cc-ba7946bb11d5
Content-Type: application/json

--- request body ---
{"handle":"qa-bdbc4b573815","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f15184ae-db34-478a-85cc-ba7946bb11d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d704b1a2-db2c-4f3e-a6ab-fdfc1528e858"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1e3f71f4-9a0d-4ef0-81cf-af8dea41c9ad

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a5291ae2340f457bb3db3b41dab0b23f
X-Correlation-Id: qa-1e3f71f4-9a0d-4ef0-81cf-af8dea41c9ad
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 53 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e3f71f4-9a0d-4ef0-81cf-af8dea41c9ad
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
Location: /v1/credits/purchases/pur_79823e26-b99b-4aed-8aa3-b8d3d9d17440
Content-Length: 144

{"id":"pur_79823e26-b99b-4aed-8aa3-b8d3d9d17440","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:56.979765818Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-572c0911-9a95-4f88-b154-b00a1258bc4a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-eb4ff29d626a402c99577e7a6b5b387a
X-Correlation-Id: qa-572c0911-9a95-4f88-b154-b00a1258bc4a
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-572c0911-9a95-4f88-b154-b00a1258bc4a
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
Location: /v1/credits/purchases/pur_b068452b-ad14-4522-b30e-5d9ec1d55be3
Content-Length: 144

{"id":"pur_b068452b-ad14-4522-b30e-5d9ec1d55be3","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-05T09:37:57.073110800Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-12999e33-ad65-47a8-872b-a9e993699250

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12999e33-ad65-47a8-872b-a9e993699250
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d5c9a9faefcf","subject":"Paid message","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-12999e33-ad65-47a8-872b-a9e993699250
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
Location: /v1/conversations/cnv_60614263-c1f1-44b7-a400-dcc3a5000508
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_60614263-c1f1-44b7-a400-dcc3a5000508","subject":"Paid message","status":"open","region":"eu","participants":["qa-bdbc4b573815","qa-d5c9a9faefcf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:57.110219086Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-542d40e6-c203-4880-9d32-2dd17c3f5485

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-542d40e6-c203-4880-9d32-2dd17c3f5485
Content-Type: application/json

--- response: 200 in 47 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-542d40e6-c203-4880-9d32-2dd17c3f5485
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
Content-Length: 791

{"items":[{"id":"led_6c655a81-ca5f-4be4-aca6-30689c745323","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-05T09:37:56.212670582Z"},{"id":"led_4ba0ac32-7d7f-479d-942f-1a3e461c4d86","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_79823e26-b99b-4aed-8aa3-b8d3d9d17440","createdAt":"2026-11-05T09:37:56.979765818Z"},{"id":"led_d40cb3f9-0010-4956-80cc-7bd294302451","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_b068452b-ad14-4522-b30e-5d9ec1d55be3","createdAt":"2026-11-05T09:37:57.073110800Z"},{"id":"led_21a36ad5-57d7-46de-9708-6d521c47af11","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_60614263-c1f1-44b7-a400-dcc3a5000508","createdAt":"2026-11-05T09:37:57.110198027Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-1d447b1f-e946-4aa7-b416-68046f8c6193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d447b1f-e946-4aa7-b416-68046f8c6193
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d447b1f-e946-4aa7-b416-68046f8c6193
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
Content-Length: 90

{"balance":64,"currency":"credits","accountId":"acc_d704b1a2-db2c-4f3e-a6ab-fdfc1528e858"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-96df5a41-5cd0-496c-bf54-fb3b5bfe6889

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96df5a41-5cd0-496c-bf54-fb3b5bfe6889
Content-Type: application/json

--- request body ---
{"handle":"qa-d5c9a9faefcf","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-96df5a41-5cd0-496c-bf54-fb3b5bfe6889
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fccf0263-517b-41d9-b9c2-b11bea40951a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-40819202-fe74-4b5c-98f1-177422f9622e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40819202-fe74-4b5c-98f1-177422f9622e
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-40819202-fe74-4b5c-98f1-177422f9622e
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-82e223f3-ae01-46ff-aed0-31ddab65b916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82e223f3-ae01-46ff-aed0-31ddab65b916
Content-Type: application/json

--- request body ---
{"handle":"qa-d5c9a9faefcf","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82e223f3-ae01-46ff-aed0-31ddab65b916
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-82e223f3-ae01-46ff-aed0-31ddab65b916"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a70919f5-4f74-487d-bdf1-708e5313ae31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a70919f5-4f74-487d-bdf1-708e5313ae31
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a70919f5-4f74-487d-bdf1-708e5313ae31
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
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-db0d08b3-f9eb-45d7-a117-33bbbead0fad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db0d08b3-f9eb-45d7-a117-33bbbead0fad
Content-Type: application/json

--- request body ---
{"handle":"qa-bdbc4b573815","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db0d08b3-f9eb-45d7-a117-33bbbead0fad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db0d08b3-f9eb-45d7-a117-33bbbead0fad"}
```
