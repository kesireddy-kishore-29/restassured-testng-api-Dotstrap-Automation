# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-486ea89d-e3b0-4bf7-b1ef-dc6e89764954` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-30f628b5-6ae0-44f4-a74e-c702e932bf2e` |
| 3 | `POST /v1/auth/token` | 200 | 68 | `qa-4c44e71f-bcdb-41c0-8aac-77c3104e56e3` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-3389ae34-acf1-4f74-a3d5-5dcadacb999e` |
| 5 | `GET /v1/conversations` | 503 | 30 | `qa-a3f8f14d-c40d-4fe8-85bb-9544922a8d7a` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-82e6bea8-ceb1-4e4b-b9a1-59a2a69ec535` |
| 7 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-0fbfe918-5a70-4806-bea2-77194a09a845` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-e4f2707f-c485-4b70-a487-87302821b319` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-413ea8ff-4503-47ed-9267-08d82b1180ff` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-0f5bae54-e3fd-4c63-930c-0e9e8792cca8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-486ea89d-e3b0-4bf7-b1ef-dc6e89764954

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-486ea89d-e3b0-4bf7-b1ef-dc6e89764954
Content-Type: application/json

--- request body ---
{"handle":"qa-bf82e9c85056","displayName":"QA bf82e9c85056","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-486ea89d-e3b0-4bf7-b1ef-dc6e89764954
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-bf82e9c85056
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2d014b3d-f5e8-452a-8a6a-f9b10fda6129","handle":"qa-bf82e9c85056","displayName":"QA bf82e9c85056","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.849372049Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-30f628b5-6ae0-44f4-a74e-c702e932bf2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30f628b5-6ae0-44f4-a74e-c702e932bf2e
Content-Type: application/json

--- request body ---
{"handle":"qa-dce2d15a682f","displayName":"QA dce2d15a682f","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-30f628b5-6ae0-44f4-a74e-c702e932bf2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 7
Location: /v1/accounts/qa-dce2d15a682f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c1768bdc-1d5b-482f-a0ed-50da05cad097","handle":"qa-dce2d15a682f","displayName":"QA dce2d15a682f","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.923999739Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4c44e71f-bcdb-41c0-8aac-77c3104e56e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c44e71f-bcdb-41c0-8aac-77c3104e56e3
Content-Type: application/json

--- request body ---
{"handle":"qa-bf82e9c85056","password":"****"}

--- response: 200 in 68 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c44e71f-bcdb-41c0-8aac-77c3104e56e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d014b3d-f5e8-452a-8a6a-f9b10fda6129"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3389ae34-acf1-4f74-a3d5-5dcadacb999e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3389ae34-acf1-4f74-a3d5-5dcadacb999e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dce2d15a682f","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-3389ae34-acf1-4f74-a3d5-5dcadacb999e
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
Location: /v1/conversations/cnv_fc8afb50-bce8-492e-b58a-cfc4d29c17a0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fc8afb50-bce8-492e-b58a-cfc4d29c17a0","subject":"Error contract","status":"open","region":"eu","participants":["qa-bf82e9c85056","qa-dce2d15a682f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.066583867Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-a3f8f14d-c40d-4fe8-85bb-9544922a8d7a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ffc88e6d-2b1e-4d34-b9cd-3a71690145ec
X-Correlation-Id: qa-a3f8f14d-c40d-4fe8-85bb-9544922a8d7a
Content-Type: application/json

--- response: 503 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a3f8f14d-c40d-4fe8-85bb-9544922a8d7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-a3f8f14d-c40d-4fe8-85bb-9544922a8d7a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-82e6bea8-ceb1-4e4b-b9a1-59a2a69ec535

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82e6bea8-ceb1-4e4b-b9a1-59a2a69ec535
Content-Type: application/json

--- request body ---
{"handle":"qa-dce2d15a682f","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-82e6bea8-ceb1-4e4b-b9a1-59a2a69ec535
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c1768bdc-1d5b-482f-a0ed-50da05cad097"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0fbfe918-5a70-4806-bea2-77194a09a845

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fbfe918-5a70-4806-bea2-77194a09a845
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0fbfe918-5a70-4806-bea2-77194a09a845
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
correlation: qa-e4f2707f-c485-4b70-a487-87302821b319

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4f2707f-c485-4b70-a487-87302821b319
Content-Type: application/json

--- request body ---
{"handle":"qa-dce2d15a682f","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4f2707f-c485-4b70-a487-87302821b319
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e4f2707f-c485-4b70-a487-87302821b319"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-413ea8ff-4503-47ed-9267-08d82b1180ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-413ea8ff-4503-47ed-9267-08d82b1180ff
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-413ea8ff-4503-47ed-9267-08d82b1180ff
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-0f5bae54-e3fd-4c63-930c-0e9e8792cca8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f5bae54-e3fd-4c63-930c-0e9e8792cca8
Content-Type: application/json

--- request body ---
{"handle":"qa-bf82e9c85056","password":"****"}

--- response: 401 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f5bae54-e3fd-4c63-930c-0e9e8792cca8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f5bae54-e3fd-4c63-930c-0e9e8792cca8"}
```
