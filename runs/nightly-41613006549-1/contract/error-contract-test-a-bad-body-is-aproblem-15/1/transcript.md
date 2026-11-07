# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-695c9544-f7e7-4484-a034-cbb024dd736a` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-b92ec654-61c6-4baa-be25-871a5fc6799e` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-fa01c331-d7af-40ee-9ecc-f9d56a2c80ea` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-c15c406d-f408-45d9-9223-7d3ce790110d` |
| 5 | `POST /v1/credits/purchases` | 400 | 38 | `qa-3f409ac3-8637-4fa0-a718-47decdf9566f` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-db5ba681-eb4a-4db0-b84c-1093216ca594` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-9b47de01-6bf5-4653-8315-4286cc63c651` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-1bebc37f-b0d4-48d2-92d1-07abd06692fd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-0f93b13f-bd25-4420-956c-239c2f671fba` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-40f46bff-2efa-4d18-98dd-13330286b303` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-695c9544-f7e7-4484-a034-cbb024dd736a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-695c9544-f7e7-4484-a034-cbb024dd736a
Content-Type: application/json

--- request body ---
{"handle":"qa-e2e8bdf4ca17","displayName":"QA e2e8bdf4ca17","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-695c9544-f7e7-4484-a034-cbb024dd736a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 8
Location: /v1/accounts/qa-e2e8bdf4ca17
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b617e59e-d1aa-430d-acb2-e4907bf3c627","handle":"qa-e2e8bdf4ca17","displayName":"QA e2e8bdf4ca17","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.251407187Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b92ec654-61c6-4baa-be25-871a5fc6799e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b92ec654-61c6-4baa-be25-871a5fc6799e
Content-Type: application/json

--- request body ---
{"handle":"qa-0472d7efbcd7","displayName":"QA 0472d7efbcd7","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b92ec654-61c6-4baa-be25-871a5fc6799e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 8
Location: /v1/accounts/qa-0472d7efbcd7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0cb67cdb-6637-46d4-9b84-ea107bd88cc7","handle":"qa-0472d7efbcd7","displayName":"QA 0472d7efbcd7","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.293501541Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fa01c331-d7af-40ee-9ecc-f9d56a2c80ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa01c331-d7af-40ee-9ecc-f9d56a2c80ea
Content-Type: application/json

--- request body ---
{"handle":"qa-e2e8bdf4ca17","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa01c331-d7af-40ee-9ecc-f9d56a2c80ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b617e59e-d1aa-430d-acb2-e4907bf3c627"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c15c406d-f408-45d9-9223-7d3ce790110d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c15c406d-f408-45d9-9223-7d3ce790110d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0472d7efbcd7","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c15c406d-f408-45d9-9223-7d3ce790110d
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
Location: /v1/conversations/cnv_d396b794-a895-445b-938e-08dba5afffce
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d396b794-a895-445b-938e-08dba5afffce","subject":"Error contract","status":"open","region":"eu","participants":["qa-e2e8bdf4ca17","qa-0472d7efbcd7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.343095097Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3f409ac3-8637-4fa0-a718-47decdf9566f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f60aa6e0dc614bf9a3765e7b9c185891
X-Correlation-Id: qa-3f409ac3-8637-4fa0-a718-47decdf9566f
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 38 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f409ac3-8637-4fa0-a718-47decdf9566f
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-3f409ac3-8637-4fa0-a718-47decdf9566f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-db5ba681-eb4a-4db0-b84c-1093216ca594

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db5ba681-eb4a-4db0-b84c-1093216ca594
Content-Type: application/json

--- request body ---
{"handle":"qa-0472d7efbcd7","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-db5ba681-eb4a-4db0-b84c-1093216ca594
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0cb67cdb-6637-46d4-9b84-ea107bd88cc7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9b47de01-6bf5-4653-8315-4286cc63c651

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b47de01-6bf5-4653-8315-4286cc63c651
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9b47de01-6bf5-4653-8315-4286cc63c651
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-1bebc37f-b0d4-48d2-92d1-07abd06692fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bebc37f-b0d4-48d2-92d1-07abd06692fd
Content-Type: application/json

--- request body ---
{"handle":"qa-0472d7efbcd7","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1bebc37f-b0d4-48d2-92d1-07abd06692fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1bebc37f-b0d4-48d2-92d1-07abd06692fd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f93b13f-bd25-4420-956c-239c2f671fba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f93b13f-bd25-4420-956c-239c2f671fba
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f93b13f-bd25-4420-956c-239c2f671fba
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-40f46bff-2efa-4d18-98dd-13330286b303

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40f46bff-2efa-4d18-98dd-13330286b303
Content-Type: application/json

--- request body ---
{"handle":"qa-e2e8bdf4ca17","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40f46bff-2efa-4d18-98dd-13330286b303
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-40f46bff-2efa-4d18-98dd-13330286b303"}
```
