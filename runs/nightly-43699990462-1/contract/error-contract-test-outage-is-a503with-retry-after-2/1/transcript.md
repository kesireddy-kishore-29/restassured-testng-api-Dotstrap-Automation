# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-2be4807c-f23a-4ec3-9c2b-4d4335bfaf30` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-fdc46bd9-1ef2-4d70-89af-1c396f66a594` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-3966a778-6df6-405c-8ee2-0c6ccc445cf7` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-3249ca21-9bbc-4c49-99e0-da2b0ae3066d` |
| 5 | `GET /v1/accounts/me` | 503 | 14 | `qa-1f2d2e87-e23c-4855-ae5b-24bf477c9c28` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-9e3f7cec-fdb5-4d93-ba4e-c57320702bdb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-33f6d324-a8f0-4db7-ae0e-91164e761d34` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-da2c9142-4869-4bfd-a9f1-474da87017b8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-8e3301ed-1911-4c1a-aa93-d1af624049e6` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-ec021dbb-fe91-419f-9368-f270616e081f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2be4807c-f23a-4ec3-9c2b-4d4335bfaf30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2be4807c-f23a-4ec3-9c2b-4d4335bfaf30
Content-Type: application/json

--- request body ---
{"handle":"qa-3a84d1e20503","displayName":"QA 3a84d1e20503","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-2be4807c-f23a-4ec3-9c2b-4d4335bfaf30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-3a84d1e20503
X-Served-Region: eu
Content-Length: 181

{"id":"acc_75420ac2-d325-46c6-9d36-b40f5d8d3927","handle":"qa-3a84d1e20503","displayName":"QA 3a84d1e20503","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.064337422Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fdc46bd9-1ef2-4d70-89af-1c396f66a594

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdc46bd9-1ef2-4d70-89af-1c396f66a594
Content-Type: application/json

--- request body ---
{"handle":"qa-57c93b82c9f6","displayName":"QA 57c93b82c9f6","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdc46bd9-1ef2-4d70-89af-1c396f66a594
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-57c93b82c9f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_540af924-b9d4-4a67-b5c9-89298e433ea1","handle":"qa-57c93b82c9f6","displayName":"QA 57c93b82c9f6","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.106523989Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3966a778-6df6-405c-8ee2-0c6ccc445cf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3966a778-6df6-405c-8ee2-0c6ccc445cf7
Content-Type: application/json

--- request body ---
{"handle":"qa-3a84d1e20503","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3966a778-6df6-405c-8ee2-0c6ccc445cf7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_75420ac2-d325-46c6-9d36-b40f5d8d3927"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3249ca21-9bbc-4c49-99e0-da2b0ae3066d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3249ca21-9bbc-4c49-99e0-da2b0ae3066d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-57c93b82c9f6","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3249ca21-9bbc-4c49-99e0-da2b0ae3066d
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
Location: /v1/conversations/cnv_7dbba14b-2a9f-42f3-9cee-71de2a8c10f8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7dbba14b-2a9f-42f3-9cee-71de2a8c10f8","subject":"Error contract","status":"open","region":"eu","participants":["qa-3a84d1e20503","qa-57c93b82c9f6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:08.162523053Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f2d2e87-e23c-4855-ae5b-24bf477c9c28

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ca205b69-fd49-4179-9f45-22dc1ca6398c
X-Correlation-Id: qa-1f2d2e87-e23c-4855-ae5b-24bf477c9c28
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f2d2e87-e23c-4855-ae5b-24bf477c9c28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-1f2d2e87-e23c-4855-ae5b-24bf477c9c28"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9e3f7cec-fdb5-4d93-ba4e-c57320702bdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e3f7cec-fdb5-4d93-ba4e-c57320702bdb
Content-Type: application/json

--- request body ---
{"handle":"qa-57c93b82c9f6","password":"****"}

--- response: 200 in 40 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e3f7cec-fdb5-4d93-ba4e-c57320702bdb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_540af924-b9d4-4a67-b5c9-89298e433ea1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-33f6d324-a8f0-4db7-ae0e-91164e761d34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33f6d324-a8f0-4db7-ae0e-91164e761d34
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-33f6d324-a8f0-4db7-ae0e-91164e761d34
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
correlation: qa-da2c9142-4869-4bfd-a9f1-474da87017b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da2c9142-4869-4bfd-a9f1-474da87017b8
Content-Type: application/json

--- request body ---
{"handle":"qa-57c93b82c9f6","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da2c9142-4869-4bfd-a9f1-474da87017b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-da2c9142-4869-4bfd-a9f1-474da87017b8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e3301ed-1911-4c1a-aa93-d1af624049e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e3301ed-1911-4c1a-aa93-d1af624049e6
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e3301ed-1911-4c1a-aa93-d1af624049e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ec021dbb-fe91-419f-9368-f270616e081f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec021dbb-fe91-419f-9368-f270616e081f
Content-Type: application/json

--- request body ---
{"handle":"qa-3a84d1e20503","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec021dbb-fe91-419f-9368-f270616e081f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ec021dbb-fe91-419f-9368-f270616e081f"}
```
