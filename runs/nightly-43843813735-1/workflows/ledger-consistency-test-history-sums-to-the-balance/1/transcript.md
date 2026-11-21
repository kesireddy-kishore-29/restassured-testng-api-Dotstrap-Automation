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
| 1 | `POST /v1/accounts` | 201 | 398 | `qa-57e838e5-9763-45cc-8bb5-467d84f68e03` |
| 2 | `POST /v1/accounts` | 201 | 69 | `qa-26358bef-bf9b-4130-a977-0fca87318047` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-7dd46947-a1cf-40f2-a18f-727acc562f27` |
| 4 | `POST /v1/credits/purchases` | 201 | 112 | `qa-b4601fc2-6810-4edd-b427-649ded06c909` |
| 5 | `POST /v1/credits/purchases` | 201 | 30 | `qa-c0903153-b6aa-4b8c-8824-4918aab1ec49` |
| 6 | `POST /v1/conversations` | 201 | 16 | `qa-f1dd7b90-47b7-4b11-8a15-23539ac88684` |
| 7 | `GET /v1/credits/ledger` | 200 | 48 | `qa-4a176351-5c69-41b8-9900-5a343f4c74d9` |
| 8 | `GET /v1/credits/balance` | 200 | 17 | `qa-94cc5b53-bc44-4f9c-8ffc-827159f73960` |
| 9 | `POST /v1/auth/token` | 200 | 31 | `qa-67bfacfe-8a79-4d58-b72a-8e76ac49ed56` |
| 10 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-f0ea31a8-d3fc-4f0e-9402-493a3b538253` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-8255ae2e-3be4-4ded-8be9-e975c143ff32` |
| 12 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-9d7290f6-38bc-4cd5-a88f-c1da11044c0f` |
| 13 | `POST /v1/auth/token` | 401 | 12 | `qa-f09d6096-e996-4d61-aac0-0be5153d67b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-57e838e5-9763-45cc-8bb5-467d84f68e03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57e838e5-9763-45cc-8bb5-467d84f68e03
Content-Type: application/json

--- request body ---
{"handle":"qa-ad12ca737df7","displayName":"QA ad12ca737df7","password":"****","region":"eu"}

--- response: 201 in 398 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-57e838e5-9763-45cc-8bb5-467d84f68e03
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
Location: /v1/accounts/qa-ad12ca737df7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_44ee9a7e-88d5-40d1-97b3-176fa9a0f74a","handle":"qa-ad12ca737df7","displayName":"QA ad12ca737df7","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.960924759Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-26358bef-bf9b-4130-a977-0fca87318047

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26358bef-bf9b-4130-a977-0fca87318047
Content-Type: application/json

--- request body ---
{"handle":"qa-a1a719c3ee30","displayName":"QA a1a719c3ee30","password":"****","region":"eu"}

--- response: 201 in 69 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-26358bef-bf9b-4130-a977-0fca87318047
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-a1a719c3ee30
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e25581a2-2ff3-4108-9ec7-3158dfab1e88","handle":"qa-a1a719c3ee30","displayName":"QA a1a719c3ee30","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.407751767Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7dd46947-a1cf-40f2-a18f-727acc562f27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dd46947-a1cf-40f2-a18f-727acc562f27
Content-Type: application/json

--- request body ---
{"handle":"qa-ad12ca737df7","password":"****"}

--- response: 200 in 37 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dd46947-a1cf-40f2-a18f-727acc562f27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_44ee9a7e-88d5-40d1-97b3-176fa9a0f74a"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b4601fc2-6810-4edd-b427-649ded06c909

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ed42467465084725a4b670f7b6aad100
X-Correlation-Id: qa-b4601fc2-6810-4edd-b427-649ded06c909
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 112 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4601fc2-6810-4edd-b427-649ded06c909
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
Location: /v1/credits/purchases/pur_defe0f6f-05ea-4c68-a008-fa0cc041ac46
Content-Length: 144

{"id":"pur_defe0f6f-05ea-4c68-a008-fa0cc041ac46","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-16T09:53:54.660234808Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c0903153-b6aa-4b8c-8824-4918aab1ec49

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fc6573d03d6e409d9e532550b5a48865
X-Correlation-Id: qa-c0903153-b6aa-4b8c-8824-4918aab1ec49
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0903153-b6aa-4b8c-8824-4918aab1ec49
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
Location: /v1/credits/purchases/pur_9caef5cd-fc6b-4115-a2ca-e74e6b6d3735
Content-Length: 144

{"id":"pur_9caef5cd-fc6b-4115-a2ca-e74e6b6d3735","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-16T09:53:54.736879893Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-f1dd7b90-47b7-4b11-8a15-23539ac88684

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1dd7b90-47b7-4b11-8a15-23539ac88684
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a1a719c3ee30","subject":"Paid message","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1dd7b90-47b7-4b11-8a15-23539ac88684
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
Location: /v1/conversations/cnv_cbbc38e3-2994-4fbb-afaf-afbedf6ea950
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_cbbc38e3-2994-4fbb-afaf-afbedf6ea950","subject":"Paid message","status":"open","region":"eu","participants":["qa-ad12ca737df7","qa-a1a719c3ee30"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.776530022Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-4a176351-5c69-41b8-9900-5a343f4c74d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a176351-5c69-41b8-9900-5a343f4c74d9
Content-Type: application/json

--- response: 200 in 48 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a176351-5c69-41b8-9900-5a343f4c74d9
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

{"items":[{"id":"led_9274ae6c-960c-433d-acd4-260f442145f2","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-16T09:53:53.960937944Z"},{"id":"led_71a1f8df-f2d5-414d-9e4c-8eaf6283ffee","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_defe0f6f-05ea-4c68-a008-fa0cc041ac46","createdAt":"2026-11-16T09:53:54.660234808Z"},{"id":"led_b1fd66f9-e956-4428-9143-0bb2bbe3d8e4","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_9caef5cd-fc6b-4115-a2ca-e74e6b6d3735","createdAt":"2026-11-16T09:53:54.736879893Z"},{"id":"led_579d486e-0a0f-476d-84c7-6be7c95c3b2b","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_cbbc38e3-2994-4fbb-afaf-afbedf6ea950","createdAt":"2026-11-16T09:53:54.776488433Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-94cc5b53-bc44-4f9c-8ffc-827159f73960

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94cc5b53-bc44-4f9c-8ffc-827159f73960
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-94cc5b53-bc44-4f9c-8ffc-827159f73960
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

{"balance":64,"currency":"credits","accountId":"acc_44ee9a7e-88d5-40d1-97b3-176fa9a0f74a"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-67bfacfe-8a79-4d58-b72a-8e76ac49ed56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67bfacfe-8a79-4d58-b72a-8e76ac49ed56
Content-Type: application/json

--- request body ---
{"handle":"qa-a1a719c3ee30","password":"****"}

--- response: 200 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-67bfacfe-8a79-4d58-b72a-8e76ac49ed56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e25581a2-2ff3-4108-9ec7-3158dfab1e88"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f0ea31a8-d3fc-4f0e-9402-493a3b538253

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0ea31a8-d3fc-4f0e-9402-493a3b538253
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f0ea31a8-d3fc-4f0e-9402-493a3b538253
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
correlation: qa-8255ae2e-3be4-4ded-8be9-e975c143ff32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8255ae2e-3be4-4ded-8be9-e975c143ff32
Content-Type: application/json

--- request body ---
{"handle":"qa-a1a719c3ee30","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8255ae2e-3be4-4ded-8be9-e975c143ff32
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8255ae2e-3be4-4ded-8be9-e975c143ff32"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9d7290f6-38bc-4cd5-a88f-c1da11044c0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d7290f6-38bc-4cd5-a88f-c1da11044c0f
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9d7290f6-38bc-4cd5-a88f-c1da11044c0f
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
correlation: qa-f09d6096-e996-4d61-aac0-0be5153d67b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f09d6096-e996-4d61-aac0-0be5153d67b2
Content-Type: application/json

--- request body ---
{"handle":"qa-ad12ca737df7","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f09d6096-e996-4d61-aac0-0be5153d67b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f09d6096-e996-4d61-aac0-0be5153d67b2"}
```
